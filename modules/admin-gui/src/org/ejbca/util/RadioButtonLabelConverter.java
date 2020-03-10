/*************************************************************************
 *                                                                       *
 *  EJBCA Community: The OpenSource Certificate Authority                *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package org.ejbca.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.cesecore.util.ui.DynamicUiProperty;
import org.cesecore.util.ui.RadioButton;

/**
 * Handles conversions of radio button labels, mainly for display reasons. 
 * 
 * @version $Id: RadioButtonLabelConverter.java 23995 2016-07-25 12:40:08Z mikekushner $
 *
 */
@FacesConverter("radioButtonLabelConverter")
public class RadioButtonLabelConverter implements Converter{
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return new RadioButton(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
        if (value == null) {
            return null;
        }
        return ((RadioButton) DynamicUiProperty.getAsObject((String) value)).toString();
    }

}
