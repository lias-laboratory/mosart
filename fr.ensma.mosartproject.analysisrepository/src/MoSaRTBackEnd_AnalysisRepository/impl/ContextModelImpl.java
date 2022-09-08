/**
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.RuleToBeChecked;
import MoSaRTBackEnd_AnalysisRepository.Test;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getReferences <em>References</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getTrueValueRules <em>True Value Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getFalseValueRules <em>False Value Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getUndefinedValueRules <em>Undefined Value Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl#getAnalysisTests <em>Analysis Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextModelImpl extends EObjectImpl implements ContextModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

	/**
	 * The cached value of the '{@link #getTrueValueRules() <em>True Value Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueValueRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> trueValueRules;

	/**
	 * The cached value of the '{@link #getFalseValueRules() <em>False Value Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseValueRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> falseValueRules;

	/**
	 * The cached setting delegate for the '{@link #getUndefinedValueRules() <em>Undefined Value Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndefinedValueRules()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate UNDEFINED_VALUE_RULES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.CONTEXT_MODEL__UNDEFINED_VALUE_RULES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAnalysisTests() <em>Analysis Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> analysisTests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.CONTEXT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getTrueValueRules() {
		if (trueValueRules == null) {
			trueValueRules = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__TRUE_VALUE_RULES);
		}
		return trueValueRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getFalseValueRules() {
		if (falseValueRules == null) {
			falseValueRules = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__FALSE_VALUE_RULES);
		}
		return falseValueRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EList<IdentificationRule> getUndefinedValueRules() {
		//return (EList<RuleToBeChecked>)UNDEFINED_VALUE_RULES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
		
		EStructuralFeature eFeature = MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.CONTEXT_MODEL__UNDEFINED_VALUE_RULES;
		
		EList<RuleToBeChecked> allRules = (EList<RuleToBeChecked>)(this.eContainer()).eGet(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.ANALYSIS_REPOSITORY__ALL_RULES);
		
		Collection<RuleToBeChecked> result = new ArrayList<RuleToBeChecked>(allRules);
		
		result.removeAll(this.getTrueValueRules());
		 result.removeAll(this.getFalseValueRules());
		
		return new EcoreEList.UnmodifiableEList<IdentificationRule>(this, eFeature, result.size(), result.toArray());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getAnalysisTests() {
		if (analysisTests == null) {
			analysisTests = new EObjectResolvingEList<Test>(Test.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__ANALYSIS_TESTS);
		}
		return analysisTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__NAME:
				return getName();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__DESCRIPTION:
				return getDescription();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__REFERENCES:
				return getReferences();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__TRUE_VALUE_RULES:
				return getTrueValueRules();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__FALSE_VALUE_RULES:
				return getFalseValueRules();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__UNDEFINED_VALUE_RULES:
				return getUndefinedValueRules();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				return getAnalysisTests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__NAME:
				setName((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__TRUE_VALUE_RULES:
				getTrueValueRules().clear();
				getTrueValueRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__FALSE_VALUE_RULES:
				getFalseValueRules().clear();
				getFalseValueRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__UNDEFINED_VALUE_RULES:
				getUndefinedValueRules().clear();
				getUndefinedValueRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				getAnalysisTests().clear();
				getAnalysisTests().addAll((Collection<? extends Test>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__REFERENCES:
				getReferences().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__TRUE_VALUE_RULES:
				getTrueValueRules().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__FALSE_VALUE_RULES:
				getFalseValueRules().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__UNDEFINED_VALUE_RULES:
				getUndefinedValueRules().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				getAnalysisTests().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__REFERENCES:
				return references != null && !references.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__TRUE_VALUE_RULES:
				return trueValueRules != null && !trueValueRules.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__FALSE_VALUE_RULES:
				return falseValueRules != null && !falseValueRules.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__UNDEFINED_VALUE_RULES:
				return UNDEFINED_VALUE_RULES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				return analysisTests != null && !analysisTests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		result.append(", references: ");
		result.append(references);
		result.append(')');
		return result.toString();
	}

} //ContextModelImpl
