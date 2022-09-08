/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.Period_Sustainability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period Sustainability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl#getTestValue <em>Test Value</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Period_SustainabilityImpl extends EObjectImpl implements Period_Sustainability {
	/**
	 * The default value of the '{@link #getTestValue() <em>Test Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestValue()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String TEST_VALUE_EDEFAULT = "Period Sustainability";

	/**
	 * The cached value of the '{@link #getTestValue() <em>Test Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestValue()
	 * @generated
	 * @ordered
	 */
	protected String testValue = TEST_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> contexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period_SustainabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.PERIOD_SUSTAINABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTestValue() {
		// TODO: implement this method to return the 'Test Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return TEST_VALUE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getContexts() {
		if (contexts == null) {
			contexts = new EObjectResolvingEList<ContextModel>(ContextModel.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__TEST_VALUE:
				return getTestValue();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__COMMENT:
				return getComment();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__CONTEXTS:
				return getContexts();
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__COMMENT:
				setComment((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends ContextModel>)newValue);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__CONTEXTS:
				getContexts().clear();
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__TEST_VALUE:
				return TEST_VALUE_EDEFAULT == null ? testValue != null : !TEST_VALUE_EDEFAULT.equals(testValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
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
		result.append(" (testValue: ");
		result.append(testValue);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //Period_SustainabilityImpl
