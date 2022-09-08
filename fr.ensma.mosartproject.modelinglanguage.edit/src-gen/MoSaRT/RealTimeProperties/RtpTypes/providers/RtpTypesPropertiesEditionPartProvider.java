/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.providers;

import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpBlockingTimeTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpComputingSpeedTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpCooperativeTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpCriticalityTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpDeadlineTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpExecutionTimeTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpFlowRateTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpOffsetTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpPeriodicTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpPreemptibleTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpPriorityTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpReleaseTimeTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpRepetitionTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpResponseTimeTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpSelfSuspendedTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpSporadicTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpTypes.parts.forms.RtpUtilizationFactorTypePropertiesEditionPartForm;

import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpBlockingTimeTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpComputingSpeedTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpCooperativeTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpCriticalityTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpDeadlineTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpExecutionTimeTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpFlowRateTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpOffsetTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpPeriodicTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpPreemptibleTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpPriorityTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpReleaseTimeTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpRepetitionTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpResponseTimeTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpSelfSuspendedTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpSporadicTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpTypes.parts.impl.RtpUtilizationFactorTypePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class RtpTypesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RtpTypesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RtpTypesViewsRepository.RtpPriorityType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpPriorityTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpPriorityTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpPeriodicType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpPeriodicTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpPeriodicTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpSporadicType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpSporadicTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpSporadicTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpReleaseTimeType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpReleaseTimeTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpReleaseTimeTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpOffsetType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpOffsetTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpOffsetTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpDeadlineType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpDeadlineTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpDeadlineTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpResponseTimeType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpResponseTimeTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpResponseTimeTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpBlockingTimeType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpBlockingTimeTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpBlockingTimeTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpRepetitionType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpRepetitionTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpRepetitionTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpFlowRateType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpFlowRateTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpFlowRateTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpUtilizationFactorType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpUtilizationFactorTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpUtilizationFactorTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpExecutionTimeType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpCriticalityType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpCriticalityTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpCriticalityTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpComputingSpeedType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpComputingSpeedTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpComputingSpeedTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpPreemptibleType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpPreemptibleTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpPreemptibleTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpCooperativeType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpCooperativeTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpCooperativeTypePropertiesEditionPartForm(component);
		}
		if (key == RtpTypesViewsRepository.RtpSelfSuspendedType.class) {
			if (kind == RtpTypesViewsRepository.SWT_KIND)
				return new RtpSelfSuspendedTypePropertiesEditionPartImpl(component);
			if (kind == RtpTypesViewsRepository.FORM_KIND)
				return new RtpSelfSuspendedTypePropertiesEditionPartForm(component);
		}
		return null;
	}

}
