/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.util;

import com.kodcu.bean.CustomizedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 *
 * @author hakdogan
 */

public class MyValueChangeListener implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent event) {


        FacesContext context = FacesContext.getCurrentInstance();

        CustomizedBean myBean = (CustomizedBean) context.getApplication().evaluateExpressionGet(context, "#{customizedBean}", CustomizedBean.class);

        myBean.setYansima(event.getNewValue().toString());
        System.out.println("*********** " + event.getNewValue().toString() + " ***********");
                
    }
    
}
