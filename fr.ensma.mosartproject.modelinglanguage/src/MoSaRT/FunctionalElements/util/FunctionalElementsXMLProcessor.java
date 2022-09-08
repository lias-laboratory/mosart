/**
 */
package MoSaRT.FunctionalElements.util;

import MoSaRT.FunctionalElements.FunctionalElementsPackage;

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
public class FunctionalElementsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalElementsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		FunctionalElementsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the FunctionalElementsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new FunctionalElementsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new FunctionalElementsResourceFactoryImpl());
		}
		return registrations;
	}

} //FunctionalElementsXMLProcessor
