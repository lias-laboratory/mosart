/**
 */
package MoSaRT.FunctionalElements.impl;

import MoSaRT.FunctionalElements.FunctionalElementsPackage;
import MoSaRT.FunctionalElements.SystemFunctionalSide;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Functional Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.FunctionalElements.impl.SystemFunctionalSideImpl#getUmlModel <em>Uml Model</em>}</li>
 *   <li>{@link MoSaRT.FunctionalElements.impl.SystemFunctionalSideImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemFunctionalSideImpl extends EObjectImpl implements SystemFunctionalSide {
	/**
	 * The cached value of the '{@link #getUmlModel() <em>Uml Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlModel()
	 * @generated
	 * @ordered
	 */
	protected Model umlModel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFunctionalSideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalElementsPackage.Literals.SYSTEM_FUNCTIONAL_SIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getUmlModel() {
		return umlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlModel(Model newUmlModel, NotificationChain msgs) {
		Model oldUmlModel = umlModel;
		umlModel = newUmlModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL, oldUmlModel, newUmlModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlModel(Model newUmlModel) {
		if (newUmlModel != umlModel) {
			NotificationChain msgs = null;
			if (umlModel != null)
				msgs = ((InternalEObject)umlModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL, null, msgs);
			if (newUmlModel != null)
				msgs = ((InternalEObject)newUmlModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL, null, msgs);
			msgs = basicSetUmlModel(newUmlModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL, newUmlModel, newUmlModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean importUmlModel(Model importedModel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL:
				return basicSetUmlModel(null, msgs);
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
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL:
				return getUmlModel();
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__NAME:
				return getName();
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
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL:
				setUmlModel((Model)newValue);
				return;
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__NAME:
				setName((String)newValue);
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
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL:
				setUmlModel((Model)null);
				return;
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__NAME:
				setName(NAME_EDEFAULT);
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
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__UML_MODEL:
				return umlModel != null;
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE___IMPORT_UML_MODEL__MODEL:
				return importUmlModel((Model)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //SystemFunctionalSideImpl
