/**
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.BehaviorKindType;
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getSpecificModel <em>Specific Model</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getGenericModel <em>Generic Model</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getBehaviorKind <em>Behavior Kind</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getGenericToSpecificPath <em>Generic To Specific Path</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl#getSpecificToGenericPath <em>Specific To Generic Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationRelationshipImpl extends EObjectImpl implements GeneralizationRelationship {
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
	 * The cached value of the '{@link #getSpecificModel() <em>Specific Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificModel()
	 * @generated
	 * @ordered
	 */
	protected ContextModel specificModel;

	/**
	 * The cached value of the '{@link #getGenericModel() <em>Generic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericModel()
	 * @generated
	 * @ordered
	 */
	protected ContextModel genericModel;

	/**
	 * The cached value of the '{@link #getBehaviorKind() <em>Behavior Kind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorKind()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorKindType> behaviorKind;

	/**
	 * The default value of the '{@link #getGenericToSpecificPath() <em>Generic To Specific Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericToSpecificPath()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_TO_SPECIFIC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericToSpecificPath() <em>Generic To Specific Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericToSpecificPath()
	 * @generated
	 * @ordered
	 */
	protected String genericToSpecificPath = GENERIC_TO_SPECIFIC_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificToGenericPath() <em>Specific To Generic Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificToGenericPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_TO_GENERIC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificToGenericPath() <em>Specific To Generic Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificToGenericPath()
	 * @generated
	 * @ordered
	 */
	protected String specificToGenericPath = SPECIFIC_TO_GENERIC_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getSpecificModel() {
		if (specificModel != null && specificModel.eIsProxy()) {
			InternalEObject oldSpecificModel = (InternalEObject)specificModel;
			specificModel = (ContextModel)eResolveProxy(oldSpecificModel);
			if (specificModel != oldSpecificModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL, oldSpecificModel, specificModel));
			}
		}
		return specificModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel basicGetSpecificModel() {
		return specificModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificModel(ContextModel newSpecificModel) {
		ContextModel oldSpecificModel = specificModel;
		specificModel = newSpecificModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL, oldSpecificModel, specificModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getGenericModel() {
		if (genericModel != null && genericModel.eIsProxy()) {
			InternalEObject oldGenericModel = (InternalEObject)genericModel;
			genericModel = (ContextModel)eResolveProxy(oldGenericModel);
			if (genericModel != oldGenericModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL, oldGenericModel, genericModel));
			}
		}
		return genericModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel basicGetGenericModel() {
		return genericModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericModel(ContextModel newGenericModel) {
		ContextModel oldGenericModel = genericModel;
		genericModel = newGenericModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL, oldGenericModel, genericModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorKindType> getBehaviorKind() {
		if (behaviorKind == null) {
			behaviorKind = new EDataTypeUniqueEList<BehaviorKindType>(BehaviorKindType.class, this, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND);
		}
		return behaviorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericToSpecificPath() {
		return genericToSpecificPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericToSpecificPath(String newGenericToSpecificPath) {
		String oldGenericToSpecificPath = genericToSpecificPath;
		genericToSpecificPath = newGenericToSpecificPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH, oldGenericToSpecificPath, genericToSpecificPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificToGenericPath() {
		return specificToGenericPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificToGenericPath(String newSpecificToGenericPath) {
		String oldSpecificToGenericPath = specificToGenericPath;
		specificToGenericPath = newSpecificToGenericPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH, oldSpecificToGenericPath, specificToGenericPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__NAME:
				return getName();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL:
				if (resolve) return getSpecificModel();
				return basicGetSpecificModel();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL:
				if (resolve) return getGenericModel();
				return basicGetGenericModel();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND:
				return getBehaviorKind();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH:
				return getGenericToSpecificPath();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH:
				return getSpecificToGenericPath();
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL:
				setSpecificModel((ContextModel)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL:
				setGenericModel((ContextModel)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND:
				getBehaviorKind().clear();
				getBehaviorKind().addAll((Collection<? extends BehaviorKindType>)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH:
				setGenericToSpecificPath((String)newValue);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH:
				setSpecificToGenericPath((String)newValue);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL:
				setSpecificModel((ContextModel)null);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL:
				setGenericModel((ContextModel)null);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND:
				getBehaviorKind().clear();
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH:
				setGenericToSpecificPath(GENERIC_TO_SPECIFIC_PATH_EDEFAULT);
				return;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH:
				setSpecificToGenericPath(SPECIFIC_TO_GENERIC_PATH_EDEFAULT);
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
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL:
				return specificModel != null;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL:
				return genericModel != null;
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND:
				return behaviorKind != null && !behaviorKind.isEmpty();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH:
				return GENERIC_TO_SPECIFIC_PATH_EDEFAULT == null ? genericToSpecificPath != null : !GENERIC_TO_SPECIFIC_PATH_EDEFAULT.equals(genericToSpecificPath);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH:
				return SPECIFIC_TO_GENERIC_PATH_EDEFAULT == null ? specificToGenericPath != null : !SPECIFIC_TO_GENERIC_PATH_EDEFAULT.equals(specificToGenericPath);
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
		result.append(", behaviorKind: ");
		result.append(behaviorKind);
		result.append(", genericToSpecificPath: ");
		result.append(genericToSpecificPath);
		result.append(", specificToGenericPath: ");
		result.append(specificToGenericPath);
		result.append(')');
		return result.toString();
	}

} //GeneralizationRelationshipImpl
