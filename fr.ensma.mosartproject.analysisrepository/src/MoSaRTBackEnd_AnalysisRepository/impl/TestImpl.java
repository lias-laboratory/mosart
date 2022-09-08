/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.Test;
import MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType;
import MoSaRTBackEnd_AnalysisRepository.TestFamily;
import MoSaRTBackEnd_AnalysisRepository.Tool;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getId <em>Id</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getReferences <em>References</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getItsTestFamily <em>Its Test Family</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getToolsToApply <em>Tools To Apply</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends EObjectImpl implements Test {
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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

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
	 * The cached value of the '{@link #getItsTestFamily() <em>Its Test Family</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsTestFamily()
	 * @generated
	 * @ordered
	 */
	protected TestFamily itsTestFamily;

	/**
	 * The cached value of the '{@link #getToolsToApply() <em>Tools To Apply</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolsToApply()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> toolsToApply;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCharacteristicType> characteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.TEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__REFERENCES);
		}
		return references;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFamily getItsTestFamily() {
		if (itsTestFamily != null && itsTestFamily.eIsProxy()) {
			InternalEObject oldItsTestFamily = (InternalEObject)itsTestFamily;
			itsTestFamily = (TestFamily)eResolveProxy(oldItsTestFamily);
			if (itsTestFamily != oldItsTestFamily) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY, oldItsTestFamily, itsTestFamily));
			}
		}
		return itsTestFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFamily basicGetItsTestFamily() {
		return itsTestFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsTestFamily(TestFamily newItsTestFamily, NotificationChain msgs) {
		TestFamily oldItsTestFamily = itsTestFamily;
		itsTestFamily = newItsTestFamily;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY, oldItsTestFamily, newItsTestFamily);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsTestFamily(TestFamily newItsTestFamily) {
		if (newItsTestFamily != itsTestFamily) {
			NotificationChain msgs = null;
			if (itsTestFamily != null)
				msgs = ((InternalEObject)itsTestFamily).eInverseRemove(this, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST_FAMILY__CONTAINED_TESTS, TestFamily.class, msgs);
			if (newItsTestFamily != null)
				msgs = ((InternalEObject)newItsTestFamily).eInverseAdd(this, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST_FAMILY__CONTAINED_TESTS, TestFamily.class, msgs);
			msgs = basicSetItsTestFamily(newItsTestFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY, newItsTestFamily, newItsTestFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getToolsToApply() {
		if (toolsToApply == null) {
			toolsToApply = new EObjectResolvingEList<Tool>(Tool.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__TOOLS_TO_APPLY);
		}
		return toolsToApply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCharacteristicType> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<TestCharacteristicType>(TestCharacteristicType.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY:
				if (itsTestFamily != null)
					msgs = ((InternalEObject)itsTestFamily).eInverseRemove(this, MoSaRTBackEnd_AnalysisRepositoryPackage.TEST_FAMILY__CONTAINED_TESTS, TestFamily.class, msgs);
				return basicSetItsTestFamily((TestFamily)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY:
				return basicSetItsTestFamily(null, msgs);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__CHARACTERISTICS:
				return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ID:
				return getId();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__NAME:
				return getName();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__REFERENCES:
				return getReferences();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__DESCRIPTION:
				return getDescription();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY:
				if (resolve) return getItsTestFamily();
				return basicGetItsTestFamily();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__TOOLS_TO_APPLY:
				return getToolsToApply();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__CHARACTERISTICS:
				return getCharacteristics();
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ID:
				setId((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__NAME:
				setName((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY:
				setItsTestFamily((TestFamily)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__TOOLS_TO_APPLY:
				getToolsToApply().clear();
				getToolsToApply().addAll((Collection<? extends Tool>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends TestCharacteristicType>)newValue);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ID:
				setId(ID_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__REFERENCES:
				getReferences().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY:
				setItsTestFamily((TestFamily)null);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__TOOLS_TO_APPLY:
				getToolsToApply().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__CHARACTERISTICS:
				getCharacteristics().clear();
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__REFERENCES:
				return references != null && !references.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__ITS_TEST_FAMILY:
				return itsTestFamily != null;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__TOOLS_TO_APPLY:
				return toolsToApply != null && !toolsToApply.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", references: ");
		result.append(references);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TestImpl
