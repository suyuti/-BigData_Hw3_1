/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author hakdogan
 */

@ManagedBean(name="customizedBean")
@ViewScoped
public class CustomizedBean {
    
    private String girdiMetni;
    private String yansima;

    public String getGirdiMetni() {
        return girdiMetni;
    }

    public String getYansima() {
        return yansima;
    }

    public void setGirdiMetni(String girdiMetni) {
        this.girdiMetni = girdiMetni;
    }

    public void setYansima(String yansima) {
        this.yansima = yansima;
    }

}
