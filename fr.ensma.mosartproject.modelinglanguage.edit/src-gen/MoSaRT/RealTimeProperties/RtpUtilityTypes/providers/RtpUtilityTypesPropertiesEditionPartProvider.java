/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.providers;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.IntegerIntervalPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.IntegerListPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.IntegerMatrixPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.IntegerSetPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.IntegerVectorPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.MaxMinAvgIntegerPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.MaxMinAvgRealPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.MeasuredIntegerPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.MeasuredRealPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.RealIntervalPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.RealListPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.RealMatrixPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.RealSetPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.RealVectorPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.SimpleIntegerPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.SimpleRealPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.UnknownIntegerPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms.UnknownRealPropertiesEditionPartForm;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.IntegerIntervalPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.IntegerListPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.IntegerMatrixPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.IntegerSetPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.IntegerVectorPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.MaxMinAvgIntegerPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.MaxMinAvgRealPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.MeasuredIntegerPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.MeasuredRealPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.RealIntervalPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.RealListPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.RealMatrixPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.RealSetPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.RealVectorPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.SimpleIntegerPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.SimpleRealPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.UnknownIntegerPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl.UnknownRealPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class RtpUtilityTypesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RtpUtilityTypesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RtpUtilityTypesViewsRepository.IntegerMatrix.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new IntegerMatrixPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new IntegerMatrixPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.IntegerVector.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new IntegerVectorPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new IntegerVectorPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.RealVector.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new RealVectorPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new RealVectorPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.RealMatrix.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new RealMatrixPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new RealMatrixPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.IntegerSet.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new IntegerSetPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new IntegerSetPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.IntegerList.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new IntegerListPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new IntegerListPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.RealSet.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new RealSetPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new RealSetPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.RealList.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new RealListPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new RealListPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.IntegerInterval.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new IntegerIntervalPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new IntegerIntervalPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.RealInterval.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new RealIntervalPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new RealIntervalPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.MeasuredReal.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new MeasuredRealPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new MeasuredRealPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.UnknownReal.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new UnknownRealPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new UnknownRealPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.SimpleReal.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new SimpleRealPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new SimpleRealPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new MaxMinAvgRealPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new MaxMinAvgRealPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.MeasuredInteger.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new MeasuredIntegerPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new MeasuredIntegerPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.UnknownInteger.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new UnknownIntegerPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new UnknownIntegerPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.SimpleInteger.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new SimpleIntegerPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new SimpleIntegerPropertiesEditionPartForm(component);
		}
		if (key == RtpUtilityTypesViewsRepository.MaxMinAvgInteger.class) {
			if (kind == RtpUtilityTypesViewsRepository.SWT_KIND)
				return new MaxMinAvgIntegerPropertiesEditionPartImpl(component);
			if (kind == RtpUtilityTypesViewsRepository.FORM_KIND)
				return new MaxMinAvgIntegerPropertiesEditionPartForm(component);
		}
		return null;
	}

}
