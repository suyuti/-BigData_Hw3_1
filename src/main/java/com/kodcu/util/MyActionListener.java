/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.util;

import com.kodcu.bean.CustomizedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author hakdogan
 */

public class MyActionListener implements ActionListener {

    @Override
    public void processAction(ActionEvent event) {
        
        UIComponent uiComponent1 = FacesContext.getCurrentInstance().getViewRoot()
                                   .findComponent("valueChangeListenerForm:girdiAlani");

        UIComponent uiComponent2 = FacesContext.getCurrentInstance().getViewRoot()
                                   .findComponent("actionListenerForm:kilit");
        
        
        HtmlInputText girdiAlani = (HtmlInputText) uiComponent1;
        HtmlCommandButton  kilit = (HtmlCommandButton) uiComponent2;
        
        if(girdiAlani.isDisabled()) {
            girdiAlani.setDisabled(false);
            kilit.setValue("Kilitle");
        } else {
            girdiAlani.setDisabled(true);
            kilit.setValue("Kilit Aç");
        }
        
    }
    
}
