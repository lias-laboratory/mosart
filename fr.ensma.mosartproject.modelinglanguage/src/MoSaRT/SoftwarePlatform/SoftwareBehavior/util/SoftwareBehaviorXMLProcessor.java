/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.util;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareBehaviorXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SoftwareBehaviorPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SoftwareBehaviorResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SoftwareBehaviorResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SoftwareBehaviorResourceFactoryImpl());
		}
		return registrations;
	}

} //SoftwareBehaviorXMLProcessor
