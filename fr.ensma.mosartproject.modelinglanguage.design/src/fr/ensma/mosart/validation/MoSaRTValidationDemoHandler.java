package fr.ensma.mosart.validation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import MoSaRT.GlobalSystem;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpCommunicationRouter;
import MoSaRT.HardwarePlatform.HpNetworkPort;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.SystemHardwareSide;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;
import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;

public class MoSaRTValidationDemoHandler extends AbstractHandler  
	{
	ReusedMethod rm = new ReusedMethod();
	public Object execute(ExecutionEvent event) throws ExecutionException 
		{
		MoSaRTValidate();
		return null;
		}

	public boolean isEnabled() 
		{
		return true;
		}
	
/************************************* get RootResource *****************************************/ 
	protected Resource getResource()
		{
 		String URIPath = rm.getMoSaRTPath(); 		
		Resource.Factory.Registry regGLS = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = regGLS.getExtensionToFactoryMap();
		m.put("MoSaRT", new XMIResourceFactoryImpl());
		ResourceSet resSetGLS = new ResourceSetImpl();
		Resource resourceGLS = resSetGLS.getResource(URI.createURI(URIPath), true); 
		try {
			resourceGLS.load(null);
			} 
		catch (IOException e) 
			{
			e.printStackTrace();
			}
		return resourceGLS;
		}
	
/**************************** validateElement(EObject, IResource, IMarker) ****************************/
	protected void validateElement(EObject element, IResource resource,IMarker[] marker)
		{
		/************************** Validation rule 2 SystemSoftwareSide *****************************/
		if (element instanceof SystemSoftwareSide)
			{
			//self.systemBehaviour.sequencingRelations->select(r | r.oclIsTypeOf(SoftwareBehaviour::SbCommunicationRelation))->size() = SoTransmittedData.allInstances()->collect(td : SoTransmittedData | td.targetTasks)->size()->sum() + SoLocalCommResource.allInstances()->collect(rsc : SoLocalCommResource | rsc.readerTasks)->size()->sum()
			SystemSoftwareSide sss = (SystemSoftwareSide) element;
			int numberOfCommunicationRelations = 0;
			int numberOfTargetTasks = 0;
			int numberOfReaderTasks = 0;
			try
				{
				EList<SbSequencingRelation> sqr= sss.getSystemBehavior().getSequencingRelations();
				for (SbSequencingRelation i : sqr)
					{
					if (i instanceof SbCommunicationRelation) numberOfCommunicationRelations++;
					}
				}			
			catch (NullPointerException e){}
			try 
				{
				GlobalSystem gls = getGlobalSystem();
				EList<SoInteractionResource> sir = gls.getSoftwareSide().getInteractionResources();
				EList<SoRemoteCommResource>  src = new BasicEList<SoRemoteCommResource>();
				EList<SoTransmittedData>  	 std = new BasicEList<SoTransmittedData>();
				for (SoInteractionResource i : sir)
					{
					if (i instanceof SoRemoteCommResource) src.add((SoRemoteCommResource) i);
					}
				for (SoRemoteCommResource i : src)
					{
					for (SoTransmittedData j : i.getTransmittedData())
						{
						std.add(j);
						}
					}
				for (SoTransmittedData i : std)
					{
					numberOfTargetTasks += i.getTargetTasks().size();
					}
				}
			catch (NullPointerException e) {}
			try 
				{
				GlobalSystem gls = getGlobalSystem();
				EList<SoInteractionResource> sir = gls.getSoftwareSide().getInteractionResources();
				EList<SoCommunicationResource>  scr = new BasicEList<SoCommunicationResource>();
				for (SoInteractionResource i : sir)
					{
					if (i instanceof SoCommunicationResource) scr.add((SoCommunicationResource) i);
					}
				for (SoCommunicationResource i : scr)
					{
					numberOfReaderTasks += i.getReaderTasks().size();
					}
				}
			catch (NullPointerException e) {}
			
				// handle violation
			if (numberOfCommunicationRelations != numberOfReaderTasks + numberOfTargetTasks)
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"2", "SystemSoftwareSide rule 1 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"2","SystemSoftwareSide rule 1 violation");
				}
			else 
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"2");
				}
			}
			
		/********************************* Validation rule 3 SoSchedulableTask1   ) ***************************/
		if (element instanceof SoSchedulableTask)
			{
			// self.rtpMutualExclusionResourceUtilization->size() = ( SoLocalCommResource.allInstances()->select(r : SoLocalCommResource | (self.commWritingResources->includes(r) or self.commReadingResources->includes(r) ) and r.rtpProtectProtocol->notEmpty())->size() + self.mutualExclusionResources->size() )
			SoSchedulableTask sst = (SoSchedulableTask) element;	
			int numberOfMutualExclusionResourceUtilization = sst.getMutualExclusionResourceUtilization().size();
			EList<SoCommunicationResource> scr1 = sst.getCommWritingResources();
			EList<SoCommunicationResource> scr2 = sst.getCommReadingResources();
			for (SoCommunicationResource i : scr1)
				{
				if (!(i instanceof SoLocalCommResource)) scr1.remove(i);
				else
					{
					SoLocalCommResource slc = (SoLocalCommResource)i;
					if (slc.getRtpProtectProtocol() == null) scr1.remove(i);
					}
				}
			for (SoCommunicationResource i : scr2)
				{
				if (!(i instanceof SoLocalCommResource)) scr2.remove(i);
				else 
					{
					SoLocalCommResource slc = (SoLocalCommResource) i;
					if (slc.getRtpProtectProtocol() == null) scr2.remove(i);
					}
				}
			int numberOfLocalCommResourceValide = scr1.size() + scr2.size() + sst.getMutualExclusionResources().size();
				
				//handle violation
			if (numberOfMutualExclusionResourceUtilization != numberOfLocalCommResourceValide)
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"3", "SoSchedulableTask rule 1 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"3","SoSchedulableTask rule 1 violation");
				}
			else 
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"3");
				}
			
			/************************************** Validation rule 4 SoSchedulableTask2*********************************/
			//self.rtpMutualExclusionResourceUtilization->size() = self.mutualExclusionResources->size() + self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty() )->size() + self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty())->size() 
			int numberOfMutualExclusionResourceUtilizations 	= sst.getMutualExclusionResourceUtilization().size();
			int numberOfMutualExclusionResources				= sst.getMutualExclusionResources().size();		
			EList<SoCommunicationResource> scr3 = sst.getCommWritingResources();
			for (SoCommunicationResource i : scr3)
				{
				if (!(i instanceof SoLocalCommResource)) scr3.remove(i);
				else 
					{
					SoLocalCommResource slc3 = (SoLocalCommResource)i;
					if (slc3.getRtpProtectProtocol() == null) scr3.remove(i);
					}					
				}
			int numberOfCommWritingResources = scr3.size();			
			scr3 = sst.getCommReadingResources();
			for (SoCommunicationResource i : scr3)
				{
				if (!(i instanceof SoLocalCommResource)) scr3.remove(i);
				else 
					{
					SoLocalCommResource slc3 = (SoLocalCommResource)i;
					if (slc3.getRtpProtectProtocol() == null) scr3.remove(i);
					}					
				}
			int numberOfCommReadingResources = scr3.size();
			
				//handle violation
			if (numberOfMutualExclusionResourceUtilizations != numberOfMutualExclusionResources+numberOfCommWritingResources+numberOfCommReadingResources)
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "4", "SoSchedulableTask rule 2 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"4","SoSchedulableTask rule 2 violation");
				}
			else 
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"4");
				}
			
			/****************************** Validation Rule 5 SoSchedulableTask3 *******************************/
				//self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoMutualExclusionResource))->includesAll(self.mutualExclusionResources)
			EList<RtpMutuExcluResourceUtilizationType> meru5 = sst.getMutualExclusionResourceUtilization();
			EList<SoInteractionResource> sir5 = new BasicEList<SoInteractionResource>();
			for (RtpMutuExcluResourceUtilizationType i : meru5)
				{
				sir5.add(i.getResource());
				}
			EList<SoMutualExclusionResource> mer = new BasicEList<SoMutualExclusionResource>();
			for (SoInteractionResource i : sir5)
				{
				if (i instanceof SoMutualExclusionResource) mer.add((SoMutualExclusionResource)i); 
				}
			
				// handle violation
			if (!mer.containsAll(sst.getMutualExclusionResources()))
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"5", "SoSchedulableTask rule 3 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"5","SoSchedulableTask rule 3 violation");
				}
			else
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"5");
				}
			
			/******************************* Validation Rule 6 SoSchedulableTask4 *****************************/
				// self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))
			EList<RtpMutuExcluResourceUtilizationType> meru6 = sst.getMutualExclusionResourceUtilization();
			EList<SoInteractionResource> sir6 = new BasicEList<SoInteractionResource>();
			for (RtpMutuExcluResourceUtilizationType i : meru6)
				{
				sir6.add(i.getResource());
				}
			EList<SoCommunicationResource>  scr6 = new BasicEList<SoCommunicationResource>();
			for (SoInteractionResource i : sir6)
				{
				if (i instanceof SoCommunicationResource) scr6.add((SoCommunicationResource)i); 
				}			
				//(self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty())
			EList<SoCommunicationResource> swr6 = sst.getCommWritingResources();
			for (SoCommunicationResource i : swr6)
				{
				if (!(i instanceof SoLocalCommResource)) swr6.remove(i);
				else 
					{
					SoLocalCommResource slcr6 = (SoLocalCommResource)i;
					if (slcr6.getRtpProtectProtocol() == null) swr6.remove(i);
					}
				}
				// handle violation
			if (!(meru6.containsAll(swr6)))
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"6", "SoSchedulableTask rule 4 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"6","SoSchedulableTask rule 4 violation");
				}
			else
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"6");
				}
			
			/********************************* Validation Rule 7 SoSchedulable5 ****************************************/
				// self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))
			EList<RtpMutuExcluResourceUtilizationType> meru7 = sst.getMutualExclusionResourceUtilization();
			EList<SoInteractionResource> sir7 = new BasicEList<SoInteractionResource>();
			for (RtpMutuExcluResourceUtilizationType i : meru7)
				{
				sir7.add(i.getResource());
				}
			EList<SoCommunicationResource> scr7 = new BasicEList<SoCommunicationResource>();
			for (SoInteractionResource i : sir7)
				{
				if ((i instanceof SoCommunicationResource)) scr7.add((SoCommunicationResource)i);
				}
			EList<SoCommunicationResource> srr7 = sst.getCommReadingResources();
			for (SoCommunicationResource i : srr7)
				{
				if (!(i instanceof SoLocalCommResource)) srr7.remove(i);
				else
					{
					SoLocalCommResource slcr7 = (SoLocalCommResource)i;
					if (slcr7.getRtpProtectProtocol() == null) srr7.remove(i);
					}
				}
				//handle violation
			if (!(scr7.containsAll(srr7)))
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "7", "SoSchedulableTask rule 5 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"7","SoSchedulableTask rule 5 violation");
				}
			else
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"7");
				}
			}
		
		/************************************** Validation SoSpaceProcess ***************************************/
		if (element instanceof SoSpaceProcess)
			{
			SoSpaceProcess ssp = (SoSpaceProcess) element;

			/****************************** Validation Rule 8 SoSpaceProcess 1 **************************/
			// (self.spaceProcessChildren->notEmpty() implies self.spaceProcessChildren->excludes(self)) and (self.spaceProcessParent->notEmpty() implies self.spaceProcessParent <> self)
			Boolean result1 = false;
			Boolean result2 = false;
			EList<SoSpaceProcess> spc8 = ssp.getSpaceProcessChildren();
			if (!(spc8.isEmpty()))
				{
				spc8.remove(ssp);
				if (!(spc8.isEmpty()))	result1 = true; // or spc.size() >= 2
				}			
			SoSpaceProcess spp = ssp.getSpaceProcessParent();
			if (ssp.getSpaceProcessParent() != null)
				{
				if (!ssp.equals(spp)) result2 = true;
				}
				// handle violation
			if (!(result1&&result2))
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "8", "SoSpaceProcess rule 1 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"8","SoSpaceProcess rule 1 violation");
				}
			else 
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"8");
				}
			
			/********************************* Validation Rule 9 SoSpaceProcess2 ************************************/
			// self.allSpaceProcessParents->excludesAll(self.spaceProcessChildren)
			// handle violation
			try
				{
				EList<SoSpaceProcess> spaceProcessChildren = ssp.getSpaceProcessChildren();
				EList<SoSpaceProcess> spaceProcessParents  = ssp.getAllSpaceProcessParents();
				int k=0;
				for (SoSpaceProcess i : spaceProcessChildren)
					{
					// handle violation
					if (spaceProcessParents.contains(i))
						{
						k++;
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "9", "SoSpaceProcess rule 2 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"9","SoSpaceProcess rule 2 violation");
						}
					}
				if (k == 0) 
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"2");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 9 SoSpaceProcess 2: "+e.getMessage(),"Error");
				}
			
			/********************************* Validation Rule 10 SoSpaceProcess 3 **********************************/
			// self.processingUnit->size()>1 implies self.processingUnit->forAll(pr1,pr2 | pr1<>pr2 implies  pr1.processorInterconnector->notEmpty() and pr1.processorInterconnector = pr2.processorInterconnector)
			try 
				{
				boolean bl1 = ssp.getProcessingUnit().size() > 1;
				boolean bl2 = true;
				EList<HpProcessingUnit> processingUnits = ssp.getProcessingUnit();
				for (HpProcessingUnit i : processingUnits)
					{
					for (HpProcessingUnit j : processingUnits)
						{
						if (!i.equals(j))
							{
							if ((i.getProcessorInterconnector() != null) && (i.getProcessorInterconnector().equals(j.getProcessorInterconnector()))) {}
							else bl2 = false;
							}
						}
					}
				// handle violation
				if((bl1 == true) && (bl2 == false))
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "10", "SoSpaceProcess rule 3 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"10","SoSpaceProcess rule 3 violation");
					}
				else 
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "10");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 10 SoSpaceProcess 3: "+e.getMessage(),"Error");
				}
			
			/********************************* Validation Rule 11 SoSpaceProcess 4 **********************************/
			// (self.spaceProcessChildren->isEmpty() or self.spaceProcessParent->isEmpty()) implies self.processingUnit->notEmpty()
			// handle violation
			if (ssp.getSpaceProcessChildren().isEmpty() || ssp.getSpaceProcessParent() == null)
				{
				if (ssp.getProcessingUnit().isEmpty())
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "11", "SoSpaceProcess rule 3 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"11","SoSpaceProcess rule 3 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"11");
					}
				}
			}
		
		/********************************** Validation SoMutualExclusionResource **********************************/
		if (element instanceof SoMutualExclusionResource)
			{
			SoMutualExclusionResource smer = (SoMutualExclusionResource) element;
			
			/****************************** Validation rule 12 SoMutualExclusionResource 1**************************/
			//self.tasks->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)
			EList<SoSchedulableTask> sst12 = smer.getTasks();
			try
				{	
				for (Iterator i = sst12.iterator(); i.hasNext() ; )
					{
					for (Iterator j = sst12.iterator(); j.hasNext() ;)
						{
						//handle violation
						if (i != j)
							{
							SoSchedulableTask t1 = (SoSchedulableTask) i;
							SoSchedulableTask t2 = (SoSchedulableTask) j;
							if (!t1.getProcess().equals(t2.getProcess()))
								{
								if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "12", "SoSChedulable rule 1 violation");
								else SolutionWithProblemWhenMarkerNotExist(resource, marker,"12","SoSchedulable rule 1 violation");
								}
							else
								{
								if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "12");
								}
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 12 SoMutualExclusionResource 1: "+e.getMessage(), "Error");
				}
			}
		
		/********************************* Validation SoLocalCommResource ************************************/
		if (element instanceof SoLocalCommResource)
			{
			SoLocalCommResource lcr = (SoLocalCommResource) element;
			/************************* Validation Rule 13 SoLocalCommResource 1 *************************/
				//(self.oclAsType(SoCommunicationResource).writerTasks->union(self.oclAsType(SoCommunicationResource).readerTasks))->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)
			EList<SoSchedulableTask> sst13 = lcr.getReaderTasks();
			sst13.addAll(lcr.getWriterTasks());
			try
				{
				for (SoSchedulableTask i :sst13)
					{
					for (SoSchedulableTask j : sst13)
						{
							// handle violation
						if (i != j)
							{
							SoSchedulableTask t1 = (SoSchedulableTask)i;
							SoSchedulableTask t2 = (SoSchedulableTask)j;
							if (!t1.getProcess().equals(t2.getProcess()))
								{
								if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "13", "SoLocalCommResource rule 1 violation");
								else SolutionWithProblemWhenMarkerNotExist(resource, marker,"13","SoLocalCommResource rule 1 violation");
								}
							else
								{
								if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "13");
								}
							}
						}
					}
				}
			catch (Exception e) { rm.setErrorBox("problem in Validation Rule 13 SoLocalCommResource 1: "+e.getMessage(),"Error");}
			}
		
		/********************************** Validation SoTransmittedData ************************************/
		if (element instanceof SoTransmittedData)
			{
			SoTransmittedData std = (SoTransmittedData) element;
			/**************************** Validation Rule 14 SoTransmittedData 1 **************************/
				// self.targetTasks->excludes(self.sourceTask)
				// handle violation
			if (std.getTargetTasks().contains(std.getSourceTask()))
				{
				if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "14", "SoTransmittedData rule 1 violation");
				else SolutionWithProblemWhenMarkerNotExist(resource, marker,"14","SoTransmittedData rule 1 violation");
				}
			else
				{
				if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "14");
				}
			/**************************** Validation Rule 15 SoTransmittedData 2 *************************/
				//SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).readerTasks -> includesAll(self.targetTasks))
			try
				{
				GlobalSystem gls = getGlobalSystem();
				EList<SoInteractionResource> sir15 = gls.getSoftwareSide().getInteractionResources();
				EList<SoRemoteCommResource>  srcr15 = new BasicEList<SoRemoteCommResource>();
				for (SoInteractionResource i : sir15)
					{
					if (i instanceof SoRemoteCommResource) srcr15.add((SoRemoteCommResource)i);
					}
				for (SoRemoteCommResource i : srcr15)
					{
					if (i.getTransmittedData().contains(std))
						{
							// handle violation
						if (!i.getReaderTasks().containsAll(std.getTargetTasks()))
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "15", "SoTransmittedData rule 2 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"15","SoTransmittedData rule 2 violation");
							}
						else
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "15");
							}
						}
					}
				}
			catch (Exception e) 
				{
				rm.setErrorBox("Problem in Validation rule 15 SoTransmittedData 2: "+e.getMessage(), "Error");
				}
			
			/************************** Validation rule 16 SoTransmittedData 3 *************************/
				//SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).writerTasks -> includes(self.sourceTask))
			try
				{
				GlobalSystem gls = getGlobalSystem();
				EList<SoInteractionResource> sir16 = gls.getSoftwareSide().getInteractionResources();
				EList<SoRemoteCommResource>  srcr16 = new BasicEList<SoRemoteCommResource>();
				for (SoInteractionResource i : sir16)
					{
					if (i instanceof SoRemoteCommResource) srcr16.add((SoRemoteCommResource)i);
					}
				for (SoRemoteCommResource i : srcr16)
					{
					if (i.getTransmittedData().contains(std))
						{
							// handle violation
						if (!i.getWriterTasks().contains(std.getSourceTask()))
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "16", "SoTransmittedData rule 3 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"16","SoTransmittedData rule 3 violation");
							}
						else
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "16");
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation rule 16 SoTransmittedData 3: "+e.getMessage(),"Error");
				}
			
			/************************** Validation rule 17 SoTransmittedData 4 *****************************/
				//self.targetTasks->forAll( t : SoSchedulableTask | t.process->notEmpty() implies t.process <> self.sourceTask.process)
			try
				{
				EList<SoSchedulableTask> sst17 = std.getTargetTasks();
				for (SoSchedulableTask i : sst17)
					{	
					if (i.getProcess() != null)
						{
							// handle violation
						if (i.getProcess().equals(std.getSourceTask().getProcess()))
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "17", "SoTransmittedData rule 4 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"17","SoTransmittedData rule 4 violation");
							}
						else 
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"17");
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation rule 17 SoTransmittedData 4: "+e.getMessage(), "Error");
				}
			}
		
		/********************************* Validation GlobalBehavior ********************************/
		if (element instanceof GlobalBehavior)
			{
			GlobalBehavior gbh = (GlobalBehavior) element;
			/*********************** Validation rule 18 GlobalBehavior 1 ***********************/
				// self.triggers->notEmpty() implies rootTrigger.oclAsSet()->notEmpty()
			try
				{
				if (!gbh.getTriggers().isEmpty())
					{
					// handle violation
					if (gbh.getRootTrigger() == null)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "18", "GlobalBehaviour rule 1 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"18","GlobalBehaviour rule 1 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"18");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation rule 18 GlobalBehaviour 1: "+e.getMessage(),"Error");
				}
			/****************************** Validation rule 19 GlobalBehaviour 2 *****************************/
				//self.sequencingRelations->select(r | r.oclIsTypeOf(SbPrecedenceRelation))->forAll(pr1,pr2 | pr1 <> pr2 and pr1.targetSchedulingActivity = pr2.sourceSchedulingActivity implies pr1.sourceSchedulingActivity <> pr2. targetSchedulingActivity)
			try
				{
				EList<SbSequencingRelation> ssr19 = gbh.getSequencingRelations();
				EList<SbPrecedenceRelation> spr19 = new BasicEList<SbPrecedenceRelation>();
				for (SbSequencingRelation i : ssr19)
					{
					if (i instanceof SbPrecedenceRelation)
						{
						spr19.add((SbPrecedenceRelation)i);
						}
					}
				for (SbPrecedenceRelation pr1 : spr19)
					{
					for (SbPrecedenceRelation pr2 : spr19)
						{
						if ((!pr1.equals(pr2))&&(pr1.getTargetSchedulingActivity().equals(pr2.getSourceSchedulingActivity())))
							{
								// handle violation
							if (pr1.getSourceSchedulingActivity().equals(pr2.getTargetSchedulingActivity()))
								{
								if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "19", "GlobalBehaviour rule 2 violation");
								else SolutionWithProblemWhenMarkerNotExist(resource, marker,"19","GlobalBehaviour rule 2 violation");
								}
							else 
								{
								if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"19");
								}
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation rule 19 GlobalBehavior 2: "+e.getMessage(),"Error");
				}
			}
		/********************************** Validation SbTimeTrigger ************************************/
		if (element instanceof SbTimeTrigger)
			{
			SbTimeTrigger stt = (SbTimeTrigger) element;
			
			/*************************** Validation rule 20 SbTimeTrigger 1 ******************************/
				//GlobalBehaviour.allInstances()->forAll(gb | gb.rootTrigger = self implies self.rtpStartTime->isEmpty())
			try
				{
				GlobalSystem gls = getGlobalSystem();
				GlobalBehavior gbh = gls.getSoftwareSide().getSystemBehavior();
				if (gbh.getRootTrigger().equals(stt))
					{
						// handle violation
					if (stt.getStartTime() != null)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "20", "SbTimeTrigger rule 1 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"20","SbTimeTrigger rule 1 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "20");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation rule 20 SbTrigger 1: "+e.getMessage(),"Error");
				}
			
			/***************************** Validation Rule 21 SbTrigger 2 **********************************/
			// SbTimeTrigger.allInstances()->forAll(tt1 : SbTimeTrigger, tt2 : SbTimeTrigger | tt1.schedulingActivities->notEmpty() and tt1.rtpStartTime->notEmpty() and tt1.rtpStartTime.referring->notEmpty() and tt1.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and tt1.rtpStartTime.referring.oclAsType (RealTimeProperties ::RtpHelperTypes::RtpTimeReferenceType).timeLink->notEmpty() and tt2.rtpStartTime ->notEmpty() and tt2.rtpStartTime.referring->notEmpty() and tt2.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and  tt2.rtpStartTime. referring.oclAsType(RealTimeProperties::RtpHelperTypes:: RtpTimeReferenceType).timeLink->notEmpty() and tt1. schedulingActivities ->includes (tt2.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity) implies tt2.schedulingActivities->excludes(tt1.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity))
		try
			{
				// SbTimeTrigger.allInstances()
			GlobalSystem gls = getGlobalSystem();
			EList<SbTrigger> st = gls.getSoftwareSide().getSystemBehavior().getTriggers();
			EList<SbTimeTrigger> stt21 =  new BasicEList<SbTimeTrigger>();
			for (SbTrigger i : st)
				{
				if (i  instanceof SbTimeTrigger)
					{
					stt21.add((SbTimeTrigger)i);
					}
				}
			for (SbTimeTrigger tt1 : stt21)
				{
				for (SbTimeTrigger tt2 : stt21)
					{
						//tt1.schedulingActivities->notEmpty()    	
					if (!(tt1.getSchedulingActivities().isEmpty()))
						{
						//and tt1.rtpStartTime.referring->notEmpty()
						RtpReleaseTimeType startTime1 = tt1.getStartTime();
						if (startTime1!=null)
							{
							//and tt1.rtpStartTime.referring->notEmpty()
							RtpReferenceType referring1 = startTime1.getReferring();
							if (referring1!=null)
								{
								//and tt1.rtpStartTime.referring.oclIsTypeOf(RtpTimeReferenceType)
								if (referring1 instanceof RtpTimeReferenceType);
									{
									RtpTimeReferenceType referringTimeType1 = (RtpTimeReferenceType) referring1;
									RtpTimeLinkType timeLink1 = referringTimeType1.getTimeLink();
									//and tt1.rtpStartTime.referring.oclAsType (RealTimeProperties ::RtpHelperTypes::RtpTimeReferenceType).timeLink->notEmpty()
									if (timeLink1 != null)
										{
										RtpReleaseTimeType startTime2 = tt2.getStartTime();
										//and tt2.rtpStartTime ->notEmpty()
										if (startTime2 != null)
											{
											RtpReferenceType referring2 = startTime2.getReferring();
											//and tt2.rtpStartTime.referring->notEmpty()
											if (referring2 != null)
												{
												//and tt2.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType)
												if (referring2 instanceof RtpTimeReferenceType)
													{
													RtpTimeReferenceType referringTimeType2 = (RtpTimeReferenceType) referring2;
													RtpTimeLinkType timeLink2 = referringTimeType2.getTimeLink();
													// and  tt2.rtpStartTime. referring.oclAsType(RealTimeProperties::RtpHelperTypes:: RtpTimeReferenceType).timeLink->notEmpty()
													if (timeLink2 != null)
														{
														//and tt1. schedulingActivities ->includes (tt2.rtpStartTime.referring.oclAsType(RtpTimeReferenceType).timeLink.referenceActivity)
														if (tt1.getSchedulingActivities().contains(timeLink2.getReferenceActivity()))
															{
																// handle violation
															//tt2.schedulingActivities->excludes(tt1.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity))
															if (tt2.getSchedulingActivities().contains(timeLink1.getReferenceActivity()))
																{
																if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "21", "SbTimeTrigger rule 2 violation");
																else SolutionWithProblemWhenMarkerNotExist(resource, marker,"21","SbTimeTrigger rule 2 violation");
																}
															else
																{
																if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"21");
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}		
			}
		catch (Exception e)
			{
			rm.setErrorBox("Problem in Validation Rule 21 SbTrigger 2; "+e.getMessage(),"Error");
			}
		}
			/************************************* Validation SbTaskActivity ************************************/
		if (element instanceof SbTaskActivity)
			{
			SbTaskActivity sta = (SbTaskActivity) element;
			/****************************** Validation Rule 22 SbTaskActivity 1**************************/
				//self.oclAsType(SbSchedulingActivity).trigger->isEmpty() implies self.oclAsType(SbSchedulingActivity).inputSquencingRelation->notEmpty()
			if (sta.getTrigger() == null)
				{
					// handle violation
				if (sta.getInputSquencingRelation() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "22", "SbTaskActivity rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"22","SbTaskActivity rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "22");
					}
				}
			
			/***************************** Validation Rule 23 SbTaskActivity 2****************************/
				// (self.actionSteps->notEmpty() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep) or s.oclIsTypeOf(SbAcquireStep)) )-> size()>0)  implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))->size() = (self.actionSteps->select(s| s.oclIsTypeOf(SbAcquireStep)))->size() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))-> size() <= self.representedTask.rtpMutualExclusionResourceUtilization->size())
			EList<SbStep> st23 = sta.getActionSteps();
			int numberOfReleaseSteps = 0;
			int numberOfAcquireSteps = 0;
			if (!st23.isEmpty())
				{
				for (SbStep step : st23)
					{
					if (step instanceof SbReleaseStep) numberOfReleaseSteps++;
					if (step instanceof SbAcquireStep) numberOfAcquireSteps++;
					}
				int numberOfActionSteps = numberOfReleaseSteps + numberOfAcquireSteps;
				if (numberOfActionSteps > 0)
					{
					// handle violation
					if (!((numberOfReleaseSteps == numberOfAcquireSteps)&&(numberOfReleaseSteps <= sta.getRepresentedTask().getMutualExclusionResourceUtilization().size())))
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "23", "SbTaskActivity rule 2 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"23","SbTaskActivity rule 2 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "23");
						}
					}
				}
			
			/******************************* Validation rule 24 SbTaskActivity 3 ***********************************/
			//(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size() <= (self.representedTask.commWritingResources->select(wr | wr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())
			EList<SbStep> st24 = sta.getActionSteps();
			if (st24.size() > 0)
				{
				EList<SbWriteStep> sws = new BasicEList<SbWriteStep>();
				for (SbStep step : st24)
					{
					if (step instanceof SbWriteStep)
						{
						sws.add((SbWriteStep) step);
						}
					}
				if (sws.size() > 0)
					{
					int numberOfSoLocalCommResource = 0;
					for (SoCommunicationResource res : sta.getRepresentedTask().getCommWritingResources())
						{
						if (res instanceof SoLocalCommResource) numberOfSoLocalCommResource ++;
						}
					// handle violation
					if (sws.size()>numberOfSoLocalCommResource)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "24", "SbTaskActivity rule 3 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"24","SbTaskActivity rule 3 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "24");
						}
					}
				}
			
			/******************************* Validation rule 25 SbTaskActivity 4 ***********************************/
			//(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size() <= (self.representedTask.commReadingResources->select(rr :SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())
			EList<SbStep> st25 = sta.getActionSteps();
			if (st25.size() > 0)
				{
				EList<SbReadStep> srs = new BasicEList<SbReadStep>();
				for (SbStep step : st25)
					{
					if (step instanceof SbReadStep)
						{
						srs.add((SbReadStep) step);
						}
					}
				if (srs.size() > 0)
					{
					int numberOfSoLocalCommResource = 0;
					for (SoCommunicationResource res : sta.getRepresentedTask().getCommReadingResources())
						{
						if (res instanceof SoLocalCommResource) numberOfSoLocalCommResource ++;
						}
					// handle violation
					if (srs.size()>numberOfSoLocalCommResource)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "25", "SbTaskActivity rule 4 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"25","SbTaskActivity rule 4 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"25");
						}
					}
				}
			
			/******************************* Validation rule 26 SbTaskActivity 5 ***********************************/
			//(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size()>0) implies ( (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size() <= (self.representedTask.commWritingResources->select(wr : SoftwareOperators::SoCommunicationResource| wr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())
			EList<SbStep> st26 = sta.getActionSteps();
			if (st26.size() > 0)
				{
				EList<SbSendStep> sss = new BasicEList<SbSendStep>();
				for (SbStep step : st26)
					{
					if (step instanceof SbSendStep)
						{
						sss.add((SbSendStep) step);
						}
					}
				if (sss.size() > 0)
					{
					int numberOfSoRemoteCommResource = 0;
					for (SoCommunicationResource res : sta.getRepresentedTask().getCommWritingResources())
						{
						if (res instanceof SoRemoteCommResource) numberOfSoRemoteCommResource ++;
						}
					// handle violation
					if (sss.size()>numberOfSoRemoteCommResource)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "26", "SbTaskActivity rule 5 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"26","SbTaskActivity rule 5 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "26");
						}
					}
				}
			
			/******************************* Validation rule 27 SbTaskActivity 6 ***********************************/
			//( self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep | s.oclIsTypeOf(SbReceiveStep)))->size()>0 ) implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReceiveStep)))->size() <= (self.representedTask.commReadingResources->select(rr:SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())
			EList<SbStep> st27 = sta.getActionSteps();
			if (st27.size() > 0)
				{
				EList<SbReceiveStep> ssc = new BasicEList<SbReceiveStep>();
				for (SbStep step : st26)
					{
					if (step instanceof SbReceiveStep)
						{
						ssc.add((SbReceiveStep) step);
						}
					}
				if (ssc.size() > 0)
					{
					int numberOfSoRemoteCommResource = 0;
					for (SoCommunicationResource res : sta.getRepresentedTask().getCommReadingResources())
						{
						if (res instanceof SoRemoteCommResource) numberOfSoRemoteCommResource ++;
						}
					// handle violation
					if (ssc.size() > numberOfSoRemoteCommResource)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "27", "SbTaskActivity rule 6 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"27","SbTaskActivity rule 6 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "27");
						}
					}
				}
			
			/******************************** Validation Rule 28 SbActivity 7 **********************************/
			// self.actionSteps->notEmpty() implies ((self.actionSteps->select(gr : SbStep| gr.interactionResource->notEmpty())->collect(s : SbStep | s.interactionResource))->forAll(rsc:SoftwareOperators::SoInteractionResource | rsc.oclIsKindOf (SoftwareOperators::SoInteractionResource) implies self.representedTask.mutualExclusionResources->includes(rsc) or ( self.representedTask. commWritingResources->includes(rsc) or self.representedTask.commReadingResources->includes(rsc))) )
			try
				{
				// self.actionSteps->notEmpty()
				EList<SbStep> actionSteps = sta.getActionSteps();
				boolean bl1 = !actionSteps.isEmpty();
				// ((self.actionSteps->select(gr : SbStep| gr.interactionResource->notEmpty())->collect(s : SbStep | s.interactionResource))->forAll(rsc:SoftwareOperators::SoInteractionResource | rsc.oclIsKindOf (SoftwareOperators::SoInteractionResource) implies self.representedTask.mutualExclusionResources->includes(rsc) or ( self.representedTask. commWritingResources->includes(rsc) or self.representedTask.commReadingResources->includes(rsc))))
				EList<SoInteractionResource> interactionResources = new BasicEList<SoInteractionResource>();
				for (SbStep i : actionSteps)
					{
					if (i.getInteractionResource() != null) interactionResources.add(i.getInteractionResource());
					}
				boolean bl2 = true;
				// self.representedTask.mutualExclusionResources->includes(rsc) or ( self.representedTask. commWritingResources->includes(rsc) or self.representedTask.commReadingResources->includes(rsc)))
				for (SoInteractionResource j : interactionResources)
					{
					if (!((sta.getRepresentedTask().getMutualExclusionResources().contains(j))||(sta.getRepresentedTask().getCommWritingResources().contains(j))||(sta.getRepresentedTask().getCommReadingResources().contains(j))))
						{
						bl2 = false;
						}
					}
				// handle violation
				if (bl1 == true && bl2 == false)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "28", "SbTaskActivity rule 7 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"28","SbTaskActivity rule 7 violation");
					}
				else 
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"28");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 28 SbActivity 7: "+e.getMessage(),"Error");
				}
			
			/******************************** Validation Rule 29 SbActivity 8 **********************************/
			// self.actionSteps->select(s | s.oclIsTypeOf(SbAcquireStep) or s.oclIsTypeOf(SbReleaseStep))->forAll(a , b | a.oclIsTypeOf(SbAcquireStep) and b.oclIsTypeOf(SbReleaseStep) and a.oclAsType(SbStep).interactionResource = b.oclAsType(SbStep).interactionResource implies a.oclAsType(SbStep).stepPredecessors->excludes(b))
			try 
				{
				EList<SbStep> actionSteps = sta.getActionSteps();
				for (SbStep i : actionSteps)
					{
					if (!(i instanceof SbAcquireStep)&&!(i instanceof SbReleaseStep)) actionSteps.remove(i);
					}
				for (SbStep a : actionSteps)
					{
					for (SbStep b : actionSteps)
						{
						if ((a instanceof SbActionStep)&&(b instanceof SbReleaseStep)&&(a.getInteractionResource().equals(b.getInteractionResource())))
							// handle violation
							{
							if (a.getStepPredecessors().contains(b))
								{
								if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "29", "SbTaskActivity rule 8 violation");
								else SolutionWithProblemWhenMarkerNotExist(resource, marker,"29","SbTaskActivity rule 8 violation");
								}
							else
								{
								if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "29");
								}
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 29 SbActivity 8: "+e.getMessage(),"Error");
				}
			}
		
		/************************************ Validation SbPrecedenceRelation ***************************************/
		if (element instanceof SbPrecedenceRelation)
			{
			SbPrecedenceRelation spr = (SbPrecedenceRelation) element;
			/***************************** Validation Rule 30 SbPrecedenceRelation 1 ***************************/
			//self.targetSchedulingActivity <> self.sourceSchedulingActivity
				// handle violation
			try
				{
				if (spr.getTargetSchedulingActivity().equals(spr.getSourceSchedulingActivity()))
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "30", "SbPrecedenceRelation rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"30","SbPrecedenceRelation rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "30");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in validation Rule 30 SbPrecedenceRelation 1: "+e.getMessage(),"Error");
				}
			}
		
		/*********************************** Validation SbCommunicationRelation ************************************/
		if (element instanceof SbCommunicationRelation)
			{
			SbCommunicationRelation scr = (SbCommunicationRelation) element;
			/*************************** Validation Rule 31 SoCommunicationRelation 1 *************************/
			// self.targetSchedulingActivity <> self.sourceSchedulingActivity
				// handle violation
			try
				{
				if (scr.getSourceSchedulingActivity().equals(scr.getTargetSchedulingActivity()))
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"31", "SbCommunicationRelation rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"31","SbCommunicationRelation rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"31");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 31 SbCommunication 1: "+e.getMessage(),"Error");
				}
			
			/************************** Validation Rule 32 SbCommunicationRelation 2 **************************/
			//(self.commResource.writerTasks-> includes (self.oclAsType(SbSequencingRelation). sourceSchedulingActivity.oclAsType(SbTaskActivity).representedTask)) and (self.commResource.readerTasks->includes(self.oclAsType(SbSequencingRelation). targetSchedulingActivity.oclAsType(SbTaskActivity).representedTask))
			try
				{
				SbTaskActivity sourceSchedulingActivity = (SbTaskActivity) scr.getSourceSchedulingActivity();
				SoSchedulableTask sourceRepresentedTask = sourceSchedulingActivity.getRepresentedTask();
				SbTaskActivity targetSchedulingActivity = (SbTaskActivity) scr.getTargetSchedulingActivity();
				SoSchedulableTask targetRepresentedTask = targetSchedulingActivity.getRepresentedTask();
				// handle violation
				if (!(scr.getCommResource().getWriterTasks().contains(sourceRepresentedTask) && scr.getCommResource().getReaderTasks().contains(targetRepresentedTask)))
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "32", "SbCommunicationRelation rule 2 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"32","SbCommunicationRelation rule 2 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"32");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 32 SbCommunication 2", "Error");
				}
			}
		
		/*************************************** Validation  SbAcquireStep ***************************************/
		if (element instanceof SbAcquireStep)
			{
			SbAcquireStep sas = (SbAcquireStep) element;
			/******************************* Validation Rule 33 SbAcquireStep 1 *****************************/
			//self.oclAsType(SbStep).interactionResource->notEmpty()
			// handle violation
			try
				{
				if (sas.getInteractionResource() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"33", "SbAcquireStep rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"33","SbAcquireStep rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "33");
					/****************************** Validation Rule 34 SbAcquireStep 2 ******************************/
					//self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource)or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource .oclAsType(SoftwareOperators:: SoLocalCommResource). rtpProtectProtocol-> notEmpty())
					try
						{
						SoMutualExclusionResource smer34 = (SoMutualExclusionResource) sas.getInteractionResource();
						SoLocalCommResource 	  slcr34 = (SoLocalCommResource) sas.getInteractionResource();
						if (smer34 != null||((slcr34 != null)&&(slcr34.getRtpProtectProtocol()!=null)))
							{
							if (marker != null)SolutionWithoutProblemWhenMarkerExist(marker,"34");
							}
						// handle violation
						else
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"34", "SbAcquireStep rule 2 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"34","SbAcquireStep rule 2 violation");
							}
						}
					catch (Exception e)
						{
						rm.setErrorBox("Problem in Validation Rule 34 SbAcquireStep 2: "+e.getMessage(),"Error");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 33 SbAcquireStep 1: "+e.getMessage(),"Error");
				}
			}
		
		/************************************** Validation SbSendStep *************************************/
		if (element instanceof SbSendStep)
			{
			SbSendStep sendStep = (SbSendStep) element;
			/******************************* Validation Rule 35 SbSendStep 1 ******************************/
			//self.oclAsType(SbStep).interactionResource->notEmpty()
				// handle violation
			try
				{
				if (sendStep.getInteractionResource() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"35", "SbSendStep rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"35","SbSendStep rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"35");
			/******************************* Validation Rule 36 SbSendStep 2 ********************************/
					//self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)
					try 
						{
						SoInteractionResource sir36 = sendStep.getInteractionResource();
						if (!(sir36 instanceof SoRemoteCommResource))
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"36", "SbSendStep rule 2 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"36","SbSendStep rule 2 violation");
							}
						else
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"36");
							}
						}
					catch (Exception e)
						{
						rm.setErrorBox("Problem in Validation Rule 36 SbSendStep 2: "+e.getMessage(),"Error");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 35 SbSendStep 1: "+e.getMessage(),"Error");
				}
			}
		
		/************************************ Validation SbReceiveStep ******************************************/
		if (element instanceof SbReceiveStep)
			{
			SbReceiveStep srs = (SbReceiveStep) element;
			/**************************** Validation Rule 37 SbReceiveStep 1 ****************************/
				//self.oclAsType(SbStep).interactionResource->notEmpty()
			try
				{
				if (srs.getInteractionResource() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker,"37", "SbReceiveStep rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"37","SbReceiveStep rule 1 violation");
					}
				else 
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"37");
			/**************************** Validation Rule 38 SbReceiveStep 2 ****************************/
					//self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)
					try
						{
						if (!(srs.getInteractionResource() instanceof SoRemoteCommResource))
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "38", "SbReceiveStep rule 2 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"38","SbReceiveStep rule 2 violation");
							}
						else
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "38");
							}
						}
					catch (Exception e)
						{
						rm.setErrorBox("Problem in Validation Rule 38 SbReceiveStep 2: "+e.getMessage(),"Error");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 37 SbReceiveStep: "+e.getMessage(), "Error");
				}
			}
		
		/********************************* Validation SbWriteStep ************************************/
		if (element instanceof SbWriteStep)
			{
			SbWriteStep writeStep = (SbWriteStep) element;
			/************************** Validation Rule 39 SbWriteStep 1 *************************/
			//self.oclAsType(SbStep).interactionResource->notEmpty()
			try
				{
				if (writeStep.getInteractionResource() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "39", "SbWriteStep rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"39","SbWrite Step rule 1 violation");
					}
				else 
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "39");
					/************************* Validation Rule 40 SbWriteStep 2 *************************/
					//self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)
					try {
						if (!(writeStep.getInteractionResource() instanceof SoLocalCommResource))
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "40", "SbWriteStep rule 2 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"40","SbWriteStep rule 2 violation");
							}
						else
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "40");
							}
						}
					catch (Exception e)
						{
						rm.setErrorBox("Problem in Validation Rule 40 SbWriteStep 2: "+e.getMessage(),"Error"); 
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 39 SbWriteStep 1: "+e.getMessage(),"Error");
				}
			}
		
		/******************************* Validation SbReleaseStep **************************************/
		if (element instanceof SbReleaseStep)
			{
			SbReleaseStep releaseStep = (SbReleaseStep) element;
			/************************* Validation Rule 41 SbReleaseStep 1 *************************/
			//self.oclAsType(SbStep).interactionResource->notEmpty()
			try 
				{
				if (releaseStep.getInteractionResource() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "41", "SbReleaseStep rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"41","SbReleaseStep rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"41");
					/*************************** Validation Rule 42 SbReleaseStep 2 *****************************/
					//self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource) or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource.oclAsType(SoftwareOperators::SoLocalCommResource). rtpProtectProtocol -> notEmpty())
					SoInteractionResource interactionResource = releaseStep.getInteractionResource();
					SoLocalCommResource localCommResource = (SoLocalCommResource) interactionResource;
					if ((interactionResource instanceof SoMutualExclusionResource)||((interactionResource instanceof SoLocalCommResource) && (localCommResource.getRtpProtectProtocol()!=null)))
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "42");
						}
					else
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "42", "SbReleaseStep rule 2 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"42","SbReleaseStep rule 2 violation");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule SbReleaseStep: "+e.getMessage(),"Error");
				}
			}
		/******************************* Validation SbReadStep *************************************/
		if (element instanceof SbReadStep)
			{
			SbReadStep readStep = (SbReadStep) element;
			/************************** Validation Rule 43 SbReadStep 1 ***********************/
			//self.oclAsType(SbStep).interactionResource->notEmpty()
			try
				{
				if (readStep.getInteractionResource() == null)
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "43", "SbReadStep rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"43","SbReadStep rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "43");
					/************************ Validation Rule 44 SbReadStep 2 **********************/
					// self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)
					if (!(readStep.getInteractionResource() instanceof SoLocalCommResource))
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "44", "SbReadStep rule 2 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"44","SbReadStep rule 2 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "44");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation SbReadStep: "+e.getMessage(),"Error");
				}
			}
		/****************************** Validation SbStepPrecedenceRelation ******************************/
		if (element instanceof SbStepPrecedenceRelation)
			{
			SbStepPrecedenceRelation stepPrecedenceRelation = (SbStepPrecedenceRelation) element;
			/********************** Validation Rule 45 SbStepPrecedenceRelation 1 *******************/
			// self.sourceStep.oclIsTypeOf(SbAcquireStep) implies not self.targetStep.oclIsTypeOf(SbAcquireStep)
			try
				{
				if (stepPrecedenceRelation.getSourceStep() instanceof SbAcquireStep)
					{
					if (stepPrecedenceRelation.getTargetStep() instanceof SbAcquireStep)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "45", "SbStepPrecedenceRelation rule 1 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"45","SbStepPrecedenceRelation rule 1 violation");
						}
					else 
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "45");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 45 SbStepPrecedenceRelation 1: "+e.getMessage(),"Error");
				}
			/*********************** Validation Rule 46 StepPrecedenceRelation 2 **********************/
			// self.sourceStep.oclIsTypeOf(SbReleaseStep) implies not self.targetStep.oclIsTypeOf(SbReleaseStep)
			try
				{
				if (stepPrecedenceRelation.getSourceStep() instanceof SbReleaseStep)
					{
					if (stepPrecedenceRelation.getTargetStep() instanceof SbReleaseStep)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "46", "SbStepPrecedenceRelation rule 2 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"46","SbStepPrecedenceRelation rule 2 violation");
						}
					else 
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "46");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 46 SbStepPrecedenceRelation 2: "+e.getMessage(),"Error");
				}
			}
		/******************************* Validation SystemHardwareSide ******************************/
		if (element instanceof SystemHardwareSide)
			{
			SystemHardwareSide systemHardware = (SystemHardwareSide) element;
			/*********************** Validation Rule 47 SystemHardwareSide 1 ***********************/
			// self.processingUnits->size()>1 implies self.processingUnits->select(pr : HpProcessingUnit | pr.commChannel->isEmpty() and pr.processorInterconnector->isEmpty())->size()=0
			try
				{
				if (systemHardware.getProcessingUnits().size()>1)
					{
					EList<HpProcessingUnit> hpProcessingUnits = systemHardware.getProcessingUnits();
					for (HpProcessingUnit i : hpProcessingUnits)
						{
						if ((i.getCommChannel() == null)&&(i.getProcessorInterconnector() == null)) hpProcessingUnits.remove(i);
						}
					// handle violation
					if (hpProcessingUnits.size() > 0)
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "47", "SystemHardwareSide rule 1 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"47","SystemHardwareSide rule 1 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "47");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rul 47 SystemHardwareSide: "+e.getMessage(),"Error");
				}
			}
		/****************************** Validation HpProcessingUnit ******************************/
		if (element instanceof HpProcessingUnit)
			{
			HpProcessingUnit hpProcessingUnit = (HpProcessingUnit) element;
			/********************** Validation Rule 48 HpProcessingUnit 1 **********************/
			// (self.commChannel->notEmpty() and self.processorInterconnector->notEmpty()) implies  self.commChannel<>self.processorInterconnector.commChannel
			try
				{
				if ((hpProcessingUnit.getCommChannel() != null)&&(hpProcessingUnit.getProcessorInterconnector() != null))
					{
					// handle violation
					if (hpProcessingUnit.getCommChannel().equals(hpProcessingUnit.getProcessorInterconnector().getCommChannel()))
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "48", "HpProcessingUnit rule 1 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"48","HpProcessingUnit rule 1 violation");
						}
					else
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "48");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 48 HpProcessingUnit 1: "+e.getMessage(), "Error");
				}
			
			/*********************** Validation Rule 49 HpProcessingUnit 2 ***********************/
			// self.candidateTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.candidateTasks)
			try
				{
				if (!hpProcessingUnit.getCandidateTasks().isEmpty())
					{
					EList<SoSpaceProcess> spaceProcesses = hpProcessingUnit.getSpaceProcesses();
					EList<SoSchedulableTask> schedulableTasks = new BasicEList<SoSchedulableTask>();
					for (SoSpaceProcess i : spaceProcesses)
						{
						schedulableTasks.addAll(i.getSchedulableTasks());
						}
					// handle violation
					if (!schedulableTasks.containsAll(hpProcessingUnit.getCandidateTasks()))
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "49", "HpProcessingUnit rule 2 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"49","HpProcessingUnit rule 2 violation");
						}
					else
						{
						if(marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "49");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 49 HpProcessingUnit 2: "+e.getMessage(), "Error");
				}
			
			/*********************** Validation Rule 50 HpProcessingUnit 3 ***********************/
			// self.schedulableTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.schedulableTasks)
			try
				{
				if (!hpProcessingUnit.getSchedulableTasks().isEmpty())
					{
					EList<SoSpaceProcess> spaceProcesses = hpProcessingUnit.getSpaceProcesses();
					EList<SoSchedulableTask> schedulableTasks = new BasicEList<SoSchedulableTask>();
					for (SoSpaceProcess i : spaceProcesses)
						{
						schedulableTasks.addAll(i.getSchedulableTasks());
						}
					// handle violation
					if (!schedulableTasks.containsAll(hpProcessingUnit.getSchedulableTasks()))
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "50", "HpProcessingUnit rule 3 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"50","HpProcessingUnit rule 3 violation");
						}
					else
						{
						if(marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "50");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 50 HpProcessingUnit 3: "+e.getMessage(), "Error");
				}
			}
		
		/**************************** Validation HpCommunicationRouter ********************************/
		if (element instanceof HpCommunicationRouter)
			{
			HpCommunicationRouter hpCommunicationRouter = (HpCommunicationRouter) element;
			/********************* Validation Rule 51 HpCommunication 1 *********************/
			// self.networkPorts->forAll(np1,np2 | np1 <> np2 implies np1.commChannel <> np2.commChannel)
			try
				{
				EList<HpNetworkPort> networkPorts = hpCommunicationRouter.getNetworkPorts();
				if (!networkPorts.isEmpty())
					{
					for (HpNetworkPort i : networkPorts)
						{
						for (HpNetworkPort j : networkPorts)
							{
							if (!i.equals(j))
								{
								// handle Violation
								if (i.getCommChannel().equals(j.getCommChannel()))
									{
									if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "51", "HpCommunicationRouter rule 1 violation");
									else SolutionWithProblemWhenMarkerNotExist(resource, marker,"51","HpCommunicationRouter rule 1 violation");
									}
								else
									{
									if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "51");
									}
								}
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 51 HpCommunicationRouter 1: "+e.getMessage(), "Error");
				}
			}
		/********************************** Validation HpCommunicationChannel **********************************/
		if (element instanceof HpCommunicationChannel)
			{
			HpCommunicationChannel hpCommunicationChannel = (HpCommunicationChannel) element;
			/********************** Validation Rule 52 HpCommunicationChannel 1 ********************/
			// self.processingUnits->isEmpty() implies (self.processingUnitSet->notEmpty() or self.networkPort->size()>=2)
			try 
				{
				if (hpCommunicationChannel.getProcessingUnits().isEmpty())
					{
					if ((!hpCommunicationChannel.getProcessingUnitSet().isEmpty())||(hpCommunicationChannel.getNetworkPort().size()>=2))
						{
						if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "52");
						}
					// handle violation
					else
						{
						if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "52", "HpCommunicationChannel rule 1 violation");
						else SolutionWithProblemWhenMarkerNotExist(resource, marker,"52","HpCommunicationChannel rule 1 violation");
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 52 HpcommunicationChannel: "+e.getMessage(),"Error");
				}
			}
		/***************************** Validation IntergerMatrix *******************************/
		if (element instanceof IntegerMatrix)
			{
			IntegerMatrix integerMatrix = (IntegerMatrix) element;
			/********************* Validation Rule 53 IntegerMatrix 1 *******************/
			// self.matrixElements->forAll(el1 : IntegerVector, el2 : IntegerVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())
			try
				{
				EList<IntegerVector> integerVectors = integerMatrix.getMatrixElements();
				for (IntegerVector i : integerVectors)
					{
					for (IntegerVector j : integerVectors)
						{
						// handle violation :el1.oclAsSet()->size() va recevoir 1 ou 0; contrainte voulait dire que: si vector1 == null, il faut que vector2 = null et inversement; si vector1 != null, il faut que vector2 != null
						if (i == null)
							{
							if (j != null)
								{
								if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "53", "IntegerMatrix rule 1 violation");
								else SolutionWithProblemWhenMarkerNotExist(resource, marker,"53","IntegerMatrix rule 1 violation");	
								}
							else 
								{
								if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "53");
								}
							}
						}
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 53 IntegerMatrix 1: "+e.getMessage(),"Error");
				}
			}
		/********************************* Validation RealMatrix **************************************/
		if (element instanceof RealMatrix)
		{
		RealMatrix realMatrix = (RealMatrix) element;
		/********************* Validation Rule 54 RealMatrix 1 *******************/
		// self.matrixElements->forAll(el1 : RealVector, el2 : RealVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())
		try
			{
			EList<RealVector> realVectors = realMatrix.getMatrixElements();
			for (RealVector i : realVectors)
				{
				for (RealVector j : realVectors)
					{
					// handle violation :el1.oclAsSet()->size() va recevoir 1 ou 0; contrainte voulait dire que: si vector1 == null, il faut que vector2 = null et inversement; si vector1 != null, il faut que vector2 != null
					if (i == null)
						{
						if (j != null)
							{
							if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "54", "RealMatrix rule 1 violation");
							else SolutionWithProblemWhenMarkerNotExist(resource, marker,"54","RealMatrix rule 1 violation");	
							}
						else 
							{
							if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "54");
							}
						}
					}
				}
			}
		catch (Exception e)
			{
			rm.setErrorBox("Problem in Validation Rule 54 RealMatrix 1: "+e.getMessage(),"Error");
			}
		}
		
		/********************************* Validation IntegerInterval *********************************/
		if (element instanceof IntegerInterval)
			{
			IntegerInterval integerInterval = (IntegerInterval) element;
			/********************** Validation Rule 55 IntegerInterval 1 **********************/
			// self.boundMin < self.boundMax
			try
				{
				// handle violation
				if (integerInterval.getBoundMax() < integerInterval.getBoundMin())
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "55", "IntegerInterval rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"55","IntegerInterval rule 1 violation");
					}
				else
					{
					if(marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "55");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 55 IntegerInterval 1: "+e.getMessage(),"Error");
				}
			}
		
		/******************************** Validation RealInterval ***********************************/
		if (element instanceof RealInterval)
			{
			RealInterval realInterval = (RealInterval) element;
			/********************* Validation Rule 56 RealInterval 1 ********************/
			// self.boundMin < self.boundMax
			try
				{
				// handle violation
				if (realInterval.getBoundMax()<realInterval.getBoundMin())
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "56", "RealInterval rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"56","RealInterval rule 1 violation");
					}
				else
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker, "56");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 56 Interval 1: "+e.getMessage(),"Error");
				}
			}
		/******************************** Validation MaxMinAvgReal ********************************/
		if (element instanceof MaxMinAvgReal)
			{
			MaxMinAvgReal avgReal = (MaxMinAvgReal) element;
			/********************* Validation Rule 57 MaxMinAvgReal 1 ********************/
			// self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()
			try 
				{
				Double avgValue = avgReal.getAvgValue();
				Double maxValue = avgReal.getMaxValue();
				Double minValue = avgReal.getMinValue();
				if(!(avgValue == null)||!(maxValue == null)||!(minValue == null))
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"57");
					}
				// handle violation
				else
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "57", "MaxMinAvgReal rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"57","MaxMinAvgReal rule 1 violation");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 57 MaxMinAvgReal 1: "+e.getMessage(),"Error");
				}
			}
		
		/******************************** Validation MaxMinAvgInteger ********************************/
		if (element instanceof MaxMinAvgInteger)
			{
			MaxMinAvgInteger avgInteger = (MaxMinAvgInteger) element;
			/********************* Validation Rule 58 MaxMinAvgReal 1 ********************/
			// self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()
			try 
				{
				Integer avgValue = avgInteger.getAvgValue();
				Integer maxValue = avgInteger.getMaxValue();
				Integer minValue = avgInteger.getMinValue();
				if(!(avgValue == null)||!(maxValue == null)||!(minValue == null))
					{
					if (marker != null) SolutionWithoutProblemWhenMarkerExist(marker,"58");
					}
				// handle violation
				else
					{
					if (marker != null) SolutionWithProblemWhenMarkerExist(resource, marker, "58", "MaxMinAvgInteger rule 1 violation");
					else SolutionWithProblemWhenMarkerNotExist(resource, marker,"58","MaxMinAvgInteger rule 1 violation");
					}
				}
			catch (Exception e)
				{
				rm.setErrorBox("Problem in Validation Rule 58 MaxMinAvgInteger 1: "+e.getMessage(),"Error");
				}
			}
		}
	
/*************************************** MoSaRTValidate() *********************************************/
	protected void MoSaRTValidate()
		{
		EObject element = getSelectedElements();
		if (element == null) 
			{
			rm.setInfoBox("Fail Selected, Please Select a EObject to Validate","Info");
			return;
			}
		IResource resource = getResourceFromEObject(element);
		IMarker[] markers;
		try {
			markers = resource.findMarkers("fr.ensma.mosartproject.modelinglanguage.perspective.mosartproblemmarker", true, IResource.DEPTH_ZERO);
			if (element instanceof GlobalSystem)
				{
				GlobalSystem gls = (GlobalSystem) element;
				/************************** Validation rule 1 : GlobalSystem **************************/
				//handle violation
				if (gls.getName() == null)
					{
					if (markers == null) 
						{
						SolutionWithProblemWhenMarkerNotExist(resource,markers,"1","GlobalSystem rule 1 violation");
						}
					else 
						{
						SolutionWithProblemWhenMarkerExist(resource,markers,"1","GlobalSystem rule 1 violation");
						}
					}
				else
					{
					if (markers != null) SolutionWithoutProblemWhenMarkerExist(markers,"1");
					}
				/************************** Validation the other elements******************************/
				Resource rootResource = getResource();
				TreeIterator<EObject> tree = rootResource.getAllContents();
				while (tree.hasNext())
					{
					EObject elementToValidate = tree.next();
					IResource resourceOfElement = getResourceFromEObject(elementToValidate);
					IMarker[] markersOfElement;
					try 
						{
						markersOfElement = resourceOfElement.findMarkers("fr.ensma.mosartproject.modelinglanguage.perspective.mosartproblemmarker",false,IResource.DEPTH_ZERO);
						validateElement(elementToValidate, resourceOfElement, markersOfElement);
						} 
					catch (CoreException e) 
						{
						rm.setErrorBox(e.getMessage(),"Error");
						}
					}
				}
			else	
				{
				validateElement(element, resource, markers);
				}
			} 	
		catch (CoreException e1) 
			{
			e1.printStackTrace();
			}
		}
	
/************************** getSelectedElements() **************************/
	protected EObject getSelectedElements() 
	 	{
		List<Object> listObjects;
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = page.getSelection();
		if(selection instanceof IStructuredSelection) 
			{
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			listObjects = structuredSelection.toList();
		    }
		else if( selection instanceof TreeSelection) 
			{
			TreeSelection treeSelection = (TreeSelection)selection;
			listObjects = treeSelection.toList();
			}
		else 
			{
			listObjects = null;
			}
		try
			{
			return adapteUmlObject(listObjects).get(0); 
			}
		catch (Exception e)
			{
			return null;
			}
		}
	
/************************** adapteUmlObject() ****************************/
	 protected List<EObject> adapteUmlObject(List<Object> selections) 
	 	{
		List<EObject> results = new ArrayList<EObject>();
		for( Object object : selections) 
			{
			EList<EObject> diagramMember = new BasicEList<EObject>();
			EObject element = null;
			if (object instanceof GraphicalEditPart) 
            	{
	            element= ((GraphicalEditPart) object).resolveSemanticElement();
	            if (element instanceof org.eclipse.sirius.diagram.DNode)
                	{
	                org.eclipse.sirius.diagram.DNode dNode = (org.eclipse.sirius.diagram.DNode) element;
	                diagramMember = dNode.getSemanticElements();        
	                }
	            else if (element instanceof org.eclipse.sirius.diagram.DNodeContainer)
	            	{
	            	org.eclipse.sirius.diagram.DNodeContainer dNodeContainer = (org.eclipse.sirius.diagram.DNodeContainer) element;
	            	diagramMember = dNodeContainer.getSemanticElements();
	           		}
	           	else if (element instanceof org.eclipse.sirius.diagram.DNodeListElement)
	           		{
	           		org.eclipse.sirius.diagram.DNodeListElement dNodeListElement = (org.eclipse.sirius.diagram.DNodeListElement) element;
	           		diagramMember = dNodeListElement.getSemanticElements();
	           		}
	           	else if (element instanceof org.eclipse.sirius.diagram.DNodeList)
	           		{
	           		org.eclipse.sirius.diagram.DNodeList dNodeList = (org.eclipse.sirius.diagram.DNodeList) element;
	           		diagramMember = dNodeList.getSemanticElements();
	           		}
	            results.addAll(diagramMember);
            	}
			else if (object instanceof ConnectionEditPart) 
            	{
				element = ((Edge) ((ConnectionEditPart) object).getModel()).getElement();
				if (element instanceof org.eclipse.sirius.diagram.DEdge)
	           		{
					org.eclipse.sirius.diagram.DEdge dEdge = (org.eclipse.sirius.diagram.DEdge) element;
	            	diagramMember = dEdge.getSemanticElements();
	            	}
	            results.addAll(diagramMember);
            	} 
				
					/***********/
			else
				{
				if( object instanceof IAdaptable ) 
			    	{
			    	element = (EObject)((IAdaptable)object).getAdapter(EObject.class);
			    	}
			    if(element == null) 
			    	{
			    	element = (EObject)Platform.getAdapterManager().getAdapter(object, EObject.class);
			    	}		
			    if(element != null) 
			    	{
			    	results.add(element);
			    	}
				}
			}
		return results;
		}
	
/********************************* createMoSaRTMarker *************************************/
	   public IMarker createMoSaRTMarker(IResource resource,String message) 
	   		{
		    try 
		    	{
		        IMarker marker = resource.createMarker("fr.ensma.mosartproject.modelinglanguage.perspective.mosartproblemmarker");
		        marker.setAttribute(IMarker.SEVERITY,IMarker.SEVERITY_ERROR);
		        marker.setAttribute(IMarker.MESSAGE, message);
		        marker.setAttribute(IMarker.LOCATION, resource.getLocation().toOSString());
		        return marker;
		    	} 
		    catch (CoreException e) 
		    	{
		    	rm.setErrorBox("Problem with marker: "+e.getMessage(),"Error");
		    	}
		    return null;
	   		}
	   
/********************************* createMoSaRTMarker *************************************/
	   public IMarker createMoSaRTMarker(IResource resource,String message,String mosart_rule_number) 
	   		{	   	 
		    try 
		    	{
		        IMarker marker = resource.createMarker("fr.ensma.mosartproject.modelinglanguage.perspective.mosartproblemmarker");
		        marker.setAttribute(IMarker.SEVERITY,IMarker.SEVERITY_ERROR);
		        marker.setAttribute(IMarker.MESSAGE, message);
		        marker.setAttribute(IMarker.LOCATION, resource.getLocation().toOSString());
		        marker.setAttribute("mosart_rule_number", mosart_rule_number);
		        return marker;
		    	} 
		    catch (CoreException e) 
		    	{
		    	rm.setInfoBox("Problem with method createMosartMarker(IResource,String,String): "+e.getMessage(),"Info");
		      	}
		    return null;
	   		}
	  
/************************* SolutionWithProblemWhenMarkerExist  *****************************/
	   public void SolutionWithProblemWhenMarkerExist(IResource resource,IMarker[] markers,String mosart_rule_number,String message)
	   		{
		   	try 
		   		{
		   		int i;
		   		boolean AllareIncompatible = true;
		   		for (i = 0;i < markers.length;i++)
		   			{
		   			IMarker marker = markers[i];
		   			if (((String)marker.getAttribute("mosart_rule_number")).equals(mosart_rule_number)) AllareIncompatible = false;
		   			}
				if (AllareIncompatible == true)
					{
					createMoSaRTMarker(resource, message, mosart_rule_number);
					}
		   		} 
		   	catch (CoreException e) 
		   		{
				rm.setInfoBox("Problem in method SolutionWithProblemWhenMarkerExist "+e.getMessage(),"info");
				e.printStackTrace();
		   		}
	   		}
	   
/************************* SolutionWithProblemWhenMarkerNotExist  *****************************/
	   public void SolutionWithProblemWhenMarkerNotExist(IResource resource,IMarker[] markers,String mosart_rule_number,String message)
	   		{
		   	createMoSaRTMarker(resource, message, mosart_rule_number);
	   		}
	   
/************************* SolutionWithoutProblemWhenMarkerExist  *****************************/
	   public void SolutionWithoutProblemWhenMarkerExist(IMarker[] markers,String mosart_rule_number)
	   		{
		   	try 
		   		{
		   		int i;
		   		for (i = 0;i < markers.length;i ++)
		   			{
		   			IMarker marker = markers[i];
		   			if (marker.getAttribute("mosart_rule_number").equals(mosart_rule_number)) marker.delete();
		   			}
		   		} 
		   	catch (CoreException e) 
		   		{
				rm.setInfoBox("Problem in SolutionWithoutProblemWhenMarkerExist "+e.getMessage(),"info");
				e.printStackTrace();
		   		}
	   		}
	   
/********************************* getResourceFromEObject **********************************/
	   public IResource getResourceFromEObject(EObject obj) 
	   		{
			URI uri = obj.eResource().getURI();
		        // assuming platform://resource/project/path/to/file
			String project = uri.segment(1);
			IPath path = new Path(uri.path()).removeFirstSegments(2);
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			return workspace.getRoot().getProject(project).findMember(path);
	   		}
	   
/*****************************find file *.mosart from root Location*************************/		
	   protected GlobalSystem getGlobalSystem()
	  		{  	
	  		String URIPath = rm.getMoSaRTPath();
			Resource.Factory.Registry regGLS = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = regGLS.getExtensionToFactoryMap();
			m.put("MoSaRT", new XMIResourceFactoryImpl());
			ResourceSet resSetGLS = new ResourceSetImpl();
			Resource resourceGLS = resSetGLS.getResource(URI.createURI(URIPath), true); 
			try {
				resourceGLS.load(null);
				} 
			catch (IOException e) 
				{
				e.printStackTrace();
				}
			GlobalSystem gls = (GlobalSystem) resourceGLS.getContents().get(0);
			return gls;
	  		}  	
	}
