/**
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.ComponentKindType;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.TimingKindType;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identification Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl#getTimingKind <em>Timing Kind</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl#getComponentKind <em>Component Kind</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl#getRuleContext <em>Rule Context</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentificationRuleImpl extends EObjectImpl implements IdentificationRule {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimingKind() <em>Timing Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingKind()
	 * @generated
	 * @ordered
	 */
	protected static final TimingKindType TIMING_KIND_EDEFAULT = TimingKindType.IMPROVING;

	/**
	 * The cached value of the '{@link #getTimingKind() <em>Timing Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingKind()
	 * @generated
	 * @ordered
	 */
	protected TimingKindType timingKind = TIMING_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentKind() <em>Component Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentKindType COMPONENT_KIND_EDEFAULT = ComponentKindType.HARDWARE;

	/**
	 * The cached value of the '{@link #getComponentKind() <em>Component Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentKindType componentKind = COMPONENT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> rule;

	/**
	 * The cached value of the '{@link #getRuleContext() <em>Rule Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleContext()
	 * @generated
	 * @ordered
	 */
	protected EClass ruleContext;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentificationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.IDENTIFICATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingKindType getTimingKind() {
		return timingKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingKind(TimingKindType newTimingKind) {
		TimingKindType oldTimingKind = timingKind;
		timingKind = newTimingKind == null ? TIMING_KIND_EDEFAULT : newTimingKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__TIMING_KIND, oldTimingKind, timingKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKindType getComponentKind() {
		return componentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentKind(ComponentKindType newComponentKind) {
		ComponentKindType oldComponentKind = componentKind;
		componentKind = newComponentKind == null ? COMPONENT_KIND_EDEFAULT : newComponentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__COMPONENT_KIND, oldComponentKind, componentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getRule() {
		if (rule != null && ((EObject)rule).eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (Map.Entry<String, String>)eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Map.Entry<String, String> newRule) {
		Map.Entry<String, String> oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleContext() {
		if (ruleContext != null && ruleContext.eIsProxy()) {
			InternalEObject oldRuleContext = (InternalEObject)ruleContext;
			ruleContext = (EClass)eResolveProxy(oldRuleContext);
			if (ruleContext != oldRuleContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE_CONTEXT, oldRuleContext, ruleContext));
			}
		}
		return ruleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRuleContext() {
		return ruleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleContext(EClass newRuleContext) {
		EClass oldRuleContext = ruleContext;
		ruleContext = newRuleContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE_CONTEXT, oldRuleContext, ruleContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__ID:
				return getId();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__TIMING_KIND:
				return getTimingKind();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__COMPONENT_KIND:
				return getComponentKind();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE:
				if (resolve) return getRule();
				return basicGetRule();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE_CONTEXT:
				if (resolve) return getRuleContext();
				return basicGetRuleContext();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__DESCRIPTION:
				return getDescription();
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__ID:
				setId((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__TIMING_KIND:
				setTimingKind((TimingKindType)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__COMPONENT_KIND:
				setComponentKind((ComponentKindType)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE:
				setRule((Map.Entry<String, String>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE_CONTEXT:
				setRuleContext((EClass)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__DESCRIPTION:
				setDescription((String)newValue);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__TIMING_KIND:
				setTimingKind(TIMING_KIND_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__COMPONENT_KIND:
				setComponentKind(COMPONENT_KIND_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE:
				setRule((Map.Entry<String, String>)null);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE_CONTEXT:
				setRuleContext((EClass)null);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__TIMING_KIND:
				return timingKind != TIMING_KIND_EDEFAULT;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__COMPONENT_KIND:
				return componentKind != COMPONENT_KIND_EDEFAULT;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE:
				return rule != null;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__RULE_CONTEXT:
				return ruleContext != null;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", timingKind: ");
		result.append(timingKind);
		result.append(", componentKind: ");
		result.append(componentKind);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IdentificationRuleImpl
