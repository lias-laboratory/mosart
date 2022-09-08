/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.providers;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpDataRateTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpDataSizeTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpDurationTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpExecutionTimeCalculatedValuePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpExecutionTimeIntervalPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpExecutionTimeListPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpExecutionTimeMmaPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpExecutionTimeSimplePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpFrequencyTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpInterArrivalTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpPowerTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpTimeLinkTypePropertiesEditionPartForm;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms.RtpTimeReferenceTypePropertiesEditionPartForm;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpDataRateTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpDataSizeTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpDurationTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpExecutionTimeCalculatedValuePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpExecutionTimeIntervalPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpExecutionTimeListPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpExecutionTimeMmaPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpExecutionTimeSimplePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpFrequencyTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpInterArrivalTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpPowerTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpTimeLinkTypePropertiesEditionPartImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl.RtpTimeReferenceTypePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class RtpHelperTypesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RtpHelperTypesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RtpHelperTypesViewsRepository.RtpDurationType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpDurationTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpDurationTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpInterArrivalType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpInterArrivalTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpInterArrivalTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpDataRateType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpDataRateTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpDataRateTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpPowerType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpPowerTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpPowerTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpDataSizeType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpDataSizeTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpDataSizeTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpFrequencyType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpFrequencyTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpFrequencyTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeList.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeListPropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeListPropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeSimple.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeSimplePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeSimplePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeMma.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeMmaPropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeMmaPropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeIntervalPropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeIntervalPropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpTimeLinkTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpTimeLinkTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpTimeReferenceType.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpTimeReferenceTypePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpTimeReferenceTypePropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm(component);
		}
		if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.class) {
			if (kind == RtpHelperTypesViewsRepository.SWT_KIND)
				return new RtpExecutionTimeCalculatedValuePropertiesEditionPartImpl(component);
			if (kind == RtpHelperTypesViewsRepository.FORM_KIND)
				return new RtpExecutionTimeCalculatedValuePropertiesEditionPartForm(component);
		}
		return null;
	}

}
