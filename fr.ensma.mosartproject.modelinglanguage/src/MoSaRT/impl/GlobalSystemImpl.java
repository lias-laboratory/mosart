/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.impl;

import MoSaRT.FunctionalElements.SystemFunctionalSide;

import MoSaRT.GlobalSystem;

import MoSaRT.HardwarePlatform.SystemHardwareSide;

import MoSaRT.MoSaRTPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.impl.GlobalSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.impl.GlobalSystemImpl#getSoftwareSide <em>Software Side</em>}</li>
 *   <li>{@link MoSaRT.impl.GlobalSystemImpl#getHardwareSide <em>Hardware Side</em>}</li>
 *   <li>{@link MoSaRT.impl.GlobalSystemImpl#getFunctionalSide <em>Functional Side</em>}</li>
 *   <li>{@link MoSaRT.impl.GlobalSystemImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link MoSaRT.impl.GlobalSystemImpl#getAnalysisRepositoryLocation <em>Analysis Repository Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalSystemImpl extends EObjectImpl implements GlobalSystem {
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
	 * The cached value of the '{@link #getSoftwareSide() <em>Software Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSide()
	 * @generated
	 * @ordered
	 */
	protected SystemSoftwareSide softwareSide;

	/**
	 * The cached value of the '{@link #getHardwareSide() <em>Hardware Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareSide()
	 * @generated
	 * @ordered
	 */
	protected SystemHardwareSide hardwareSide;

	/**
	 * The cached value of the '{@link #getFunctionalSide() <em>Functional Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSide()
	 * @generated
	 * @ordered
	 */
	protected SystemFunctionalSide functionalSide;

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
	 * The default value of the '{@link #getAnalysisRepositoryLocation() <em>Analysis Repository Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisRepositoryLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANALYSIS_REPOSITORY_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnalysisRepositoryLocation() <em>Analysis Repository Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisRepositoryLocation()
	 * @generated
	 * @ordered
	 */
	protected String analysisRepositoryLocation = ANALYSIS_REPOSITORY_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTPackage.Literals.GLOBAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSoftwareSide getSoftwareSide() {
		return softwareSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareSide(SystemSoftwareSide newSoftwareSide, NotificationChain msgs) {
		SystemSoftwareSide oldSoftwareSide = softwareSide;
		softwareSide = newSoftwareSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE, oldSoftwareSide, newSoftwareSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareSide(SystemSoftwareSide newSoftwareSide) {
		if (newSoftwareSide != softwareSide) {
			NotificationChain msgs = null;
			if (softwareSide != null)
				msgs = ((InternalEObject)softwareSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE, null, msgs);
			if (newSoftwareSide != null)
				msgs = ((InternalEObject)newSoftwareSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE, null, msgs);
			msgs = basicSetSoftwareSide(newSoftwareSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE, newSoftwareSide, newSoftwareSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemHardwareSide getHardwareSide() {
		return hardwareSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardwareSide(SystemHardwareSide newHardwareSide, NotificationChain msgs) {
		SystemHardwareSide oldHardwareSide = hardwareSide;
		hardwareSide = newHardwareSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE, oldHardwareSide, newHardwareSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareSide(SystemHardwareSide newHardwareSide) {
		if (newHardwareSide != hardwareSide) {
			NotificationChain msgs = null;
			if (hardwareSide != null)
				msgs = ((InternalEObject)hardwareSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE, null, msgs);
			if (newHardwareSide != null)
				msgs = ((InternalEObject)newHardwareSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE, null, msgs);
			msgs = basicSetHardwareSide(newHardwareSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE, newHardwareSide, newHardwareSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionalSide getFunctionalSide() {
		return functionalSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalSide(SystemFunctionalSide newFunctionalSide, NotificationChain msgs) {
		SystemFunctionalSide oldFunctionalSide = functionalSide;
		functionalSide = newFunctionalSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE, oldFunctionalSide, newFunctionalSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalSide(SystemFunctionalSide newFunctionalSide) {
		if (newFunctionalSide != functionalSide) {
			NotificationChain msgs = null;
			if (functionalSide != null)
				msgs = ((InternalEObject)functionalSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE, null, msgs);
			if (newFunctionalSide != null)
				msgs = ((InternalEObject)newFunctionalSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE, null, msgs);
			msgs = basicSetFunctionalSide(newFunctionalSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE, newFunctionalSide, newFunctionalSide));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnalysisRepositoryLocation() {
		return analysisRepositoryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisRepositoryLocation(String newAnalysisRepositoryLocation) {
		String oldAnalysisRepositoryLocation = analysisRepositoryLocation;
		analysisRepositoryLocation = newAnalysisRepositoryLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTPackage.GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION, oldAnalysisRepositoryLocation, analysisRepositoryLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE:
				return basicSetSoftwareSide(null, msgs);
			case MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE:
				return basicSetHardwareSide(null, msgs);
			case MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE:
				return basicSetFunctionalSide(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoSaRTPackage.GLOBAL_SYSTEM__NAME:
				return getName();
			case MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE:
				return getSoftwareSide();
			case MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE:
				return getHardwareSide();
			case MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE:
				return getFunctionalSide();
			case MoSaRTPackage.GLOBAL_SYSTEM__COMMENT:
				return getComment();
			case MoSaRTPackage.GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION:
				return getAnalysisRepositoryLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MoSaRTPackage.GLOBAL_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE:
				setSoftwareSide((SystemSoftwareSide)newValue);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE:
				setHardwareSide((SystemHardwareSide)newValue);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE:
				setFunctionalSide((SystemFunctionalSide)newValue);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__COMMENT:
				setComment((String)newValue);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION:
				setAnalysisRepositoryLocation((String)newValue);
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
			case MoSaRTPackage.GLOBAL_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE:
				setSoftwareSide((SystemSoftwareSide)null);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE:
				setHardwareSide((SystemHardwareSide)null);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE:
				setFunctionalSide((SystemFunctionalSide)null);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case MoSaRTPackage.GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION:
				setAnalysisRepositoryLocation(ANALYSIS_REPOSITORY_LOCATION_EDEFAULT);
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
			case MoSaRTPackage.GLOBAL_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MoSaRTPackage.GLOBAL_SYSTEM__SOFTWARE_SIDE:
				return softwareSide != null;
			case MoSaRTPackage.GLOBAL_SYSTEM__HARDWARE_SIDE:
				return hardwareSide != null;
			case MoSaRTPackage.GLOBAL_SYSTEM__FUNCTIONAL_SIDE:
				return functionalSide != null;
			case MoSaRTPackage.GLOBAL_SYSTEM__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case MoSaRTPackage.GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION:
				return ANALYSIS_REPOSITORY_LOCATION_EDEFAULT == null ? analysisRepositoryLocation != null : !ANALYSIS_REPOSITORY_LOCATION_EDEFAULT.equals(analysisRepositoryLocation);
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
		result.append(", comment: ");
		result.append(comment);
		result.append(", analysisRepositoryLocation: ");
		result.append(analysisRepositoryLocation);
		result.append(')');
		return result.toString();
	}

} //GlobalSystemImpl
