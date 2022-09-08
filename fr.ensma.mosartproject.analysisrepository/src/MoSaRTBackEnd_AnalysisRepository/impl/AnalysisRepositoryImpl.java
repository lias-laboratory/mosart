/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.AnalysisRepository;
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.EvaluationResultType;
import MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.Test;
import MoSaRTBackEnd_AnalysisRepository.TestFamily;
import MoSaRTBackEnd_AnalysisRepository.Tool;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.helper.OCLHelper;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Analysis Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getAllGeneralizationRelationships <em>All Generalization Relationships</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getAllContextModels <em>All Context Models</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getAllRules <em>All Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getAllTests <em>All Tests</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getAllTools <em>All Tools</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getAllTestFamilies <em>All Test Families</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl#getMosartMetamodel <em>Mosart Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisRepositoryImpl extends EObjectImpl implements
		AnalysisRepository {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllGeneralizationRelationships() <em>All Generalization Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllGeneralizationRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationRelationship> allGeneralizationRelationships;

	/**
	 * The cached value of the '{@link #getAllContextModels() <em>All Context Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllContextModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> allContextModels;

	/**
	 * The cached value of the '{@link #getAllRules() <em>All Rules</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> allRules;

	/**
	 * The cached value of the '{@link #getAllTests() <em>All Tests</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> allTests;

	/**
	 * The cached value of the '{@link #getAllTools() <em>All Tools</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> allTools;

	/**
	 * The cached value of the '{@link #getAllTestFamilies()
	 * <em>All Test Families</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllTestFamilies()
	 * @generated
	 * @ordered
	 */
	protected EList<TestFamily> allTestFamilies;

	/**
	 * The cached value of the '{@link #getMosartMetamodel() <em>Mosart Metamodel</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMosartMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EPackage mosartMetamodel;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.ANALYSIS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationRelationship> getAllGeneralizationRelationships() {
		if (allGeneralizationRelationships == null) {
			allGeneralizationRelationships = new EObjectContainmentEList<GeneralizationRelationship>(GeneralizationRelationship.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS);
		}
		return allGeneralizationRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getAllContextModels() {
		if (allContextModels == null) {
			allContextModels = new EObjectContainmentEList<ContextModel>(ContextModel.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS);
		}
		return allContextModels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getAllRules() {
		if (allRules == null) {
			allRules = new EObjectContainmentEList<IdentificationRule>(IdentificationRule.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_RULES);
		}
		return allRules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getAllTests() {
		if (allTests == null) {
			allTests = new EObjectContainmentEList<Test>(Test.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TESTS);
		}
		return allTests;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getAllTools() {
		if (allTools == null) {
			allTools = new EObjectContainmentEList<Tool>(Tool.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TOOLS);
		}
		return allTools;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestFamily> getAllTestFamilies() {
		if (allTestFamilies == null) {
			allTestFamilies = new EObjectContainmentEList<TestFamily>(TestFamily.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES);
		}
		return allTestFamilies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getMosartMetamodel() {
		if (mosartMetamodel != null && mosartMetamodel.eIsProxy()) {
			InternalEObject oldMosartMetamodel = (InternalEObject)mosartMetamodel;
			mosartMetamodel = (EPackage)eResolveProxy(oldMosartMetamodel);
			if (mosartMetamodel != oldMosartMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__MOSART_METAMODEL, oldMosartMetamodel, mosartMetamodel));
			}
		}
		return mosartMetamodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetMosartMetamodel() {
		return mosartMetamodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMosartMetamodel(EPackage newMosartMetamodel) {
		EPackage oldMosartMetamodel = mosartMetamodel;
		mosartMetamodel = newMosartMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__MOSART_METAMODEL, oldMosartMetamodel, mosartMetamodel));
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<IdentificationRule, EvaluationResultType> identificationRuleChecker(EObject originalRoot) {
		
		EObject root = originalRoot;
		
		Boolean result = null;

		Iterator<IdentificationRule> listOfRules = this.getAllRules().iterator();

		Hashtable<IdentificationRule, EvaluationResultType> results = new Hashtable<IdentificationRule, EvaluationResultType>();
		

		while (listOfRules.hasNext()) {

			IdentificationRule currentRule = (IdentificationRule) listOfRules.next();
			
			org.eclipse.ocl.ecore.delegate.OCLDelegateDomain  delegateDomain = new OCLDelegateDomain("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", root.eClass().getEPackage());
			//OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCL oclChecker = delegateDomain.getOCL();
			OCLHelper<EClassifier, ?, ?, Constraint> helper = oclChecker.createOCLHelper();

			try {	
				helper.setContext(root.eClass());
				org.eclipse.ocl.expressions.OCLExpression<EClassifier> query = helper.createQuery(currentRule.getRule().getValue());	
				result = (Boolean) oclChecker.evaluate(root, query);	
				if (result == true) {			
					results.put(currentRule, EvaluationResultType.TRUE);	
				} else if (result == false) {		
					results.put(currentRule, EvaluationResultType.FALSE);		
				}	
				} catch (Throwable throwable) {				
				results.put(currentRule, EvaluationResultType.UNDEFINED);	
			}
		}

		return results;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS:
				return ((InternalEList<?>)getAllGeneralizationRelationships()).basicRemove(otherEnd, msgs);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				return ((InternalEList<?>)getAllContextModels()).basicRemove(otherEnd, msgs);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				return ((InternalEList<?>)getAllRules()).basicRemove(otherEnd, msgs);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				return ((InternalEList<?>)getAllTests()).basicRemove(otherEnd, msgs);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TOOLS:
				return ((InternalEList<?>)getAllTools()).basicRemove(otherEnd, msgs);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES:
				return ((InternalEList<?>)getAllTestFamilies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__NAME:
				return getName();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				return getDescription();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS:
				return getAllGeneralizationRelationships();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				return getAllContextModels();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				return getAllRules();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				return getAllTests();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TOOLS:
				return getAllTools();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES:
				return getAllTestFamilies();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__MOSART_METAMODEL:
				if (resolve) return getMosartMetamodel();
				return basicGetMosartMetamodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS:
				getAllGeneralizationRelationships().clear();
				getAllGeneralizationRelationships().addAll((Collection<? extends GeneralizationRelationship>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				getAllContextModels().clear();
				getAllContextModels().addAll((Collection<? extends ContextModel>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				getAllRules().clear();
				getAllRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				getAllTests().clear();
				getAllTests().addAll((Collection<? extends Test>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TOOLS:
				getAllTools().clear();
				getAllTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES:
				getAllTestFamilies().clear();
				getAllTestFamilies().addAll((Collection<? extends TestFamily>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__MOSART_METAMODEL:
				setMosartMetamodel((EPackage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS:
				getAllGeneralizationRelationships().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				getAllContextModels().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				getAllRules().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				getAllTests().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TOOLS:
				getAllTools().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES:
				getAllTestFamilies().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__MOSART_METAMODEL:
				setMosartMetamodel((EPackage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS:
				return allGeneralizationRelationships != null && !allGeneralizationRelationships.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				return allContextModels != null && !allContextModels.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				return allRules != null && !allRules.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				return allTests != null && !allTests.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TOOLS:
				return allTools != null && !allTools.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES:
				return allTestFamilies != null && !allTestFamilies.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY__MOSART_METAMODEL:
				return mosartMetamodel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY___APPROPRIATE_MODELS_FINDER__MAP:
				return appropriateModelsFinder((Map<IdentificationRule, EvaluationResultType>)arguments.get(0));
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY___IDENTIFICATION_RULE_CHECKER__EOBJECT:
				return identificationRuleChecker((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public List<ContextModel> appropriateModelsFinder( Map<IdentificationRule, EvaluationResultType> resultSummary) {

		Iterator<IdentificationRule> keys = resultSummary.keySet().iterator();

		List<IdentificationRule> undefinedRules = new Vector<IdentificationRule>();
		List<IdentificationRule> falseRules = new Vector<IdentificationRule>();
		List<IdentificationRule> trueRules = new Vector<IdentificationRule>();

		while (keys.hasNext()) {

			IdentificationRule currentKey = (IdentificationRule) keys.next();

			if (resultSummary.get(currentKey).equals(EvaluationResultType.TRUE)) {

				trueRules.add(currentKey);
			}
			if (resultSummary.get(currentKey)
					.equals(EvaluationResultType.FALSE)) {

				falseRules.add(currentKey);
			}
			if (resultSummary.get(currentKey).equals(
					EvaluationResultType.UNDEFINED)) {

				undefinedRules.add(currentKey);
			}

		}

		Iterator<ContextModel> contextModels = this.allContextModels.iterator();

		List<ContextModel> selectedModels = new Vector<ContextModel>();
		
		ContextModel candidateModel =  null;

		while (contextModels.hasNext()) {

			ContextModel currentContextModel = contextModels.next();
			
			for (int i = 0; i < trueRules.size(); i++) {
				
				if (currentContextModel.getFalseValueRules().contains(trueRules.get(i))) {break; }
				if (trueRules.size()==i+1) 
				{candidateModel = currentContextModel; selectedModels.add(candidateModel);}
				
			}
			
			if(candidateModel!=null){
				
				
				for (int i = 0; i < falseRules.size(); i++) {
					
					if (candidateModel.getTrueValueRules().contains(falseRules.get(i))) {
						selectedModels.remove(candidateModel);
						candidateModel=null; break;}
					
					//if (falseRules.size()==i+1) selectedModels.add(candidateModel);
				}
			}
			
			//else {  selectedModels.add(candidateModel); }
			
		}
		return selectedModels;
	}

} // AnalysisRepositoryImpl
