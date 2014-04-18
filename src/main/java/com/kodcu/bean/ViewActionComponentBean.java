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

@ManagedBean(name="viewActionComponentBean")
@RequestScoped
public class ViewActionComponentBean {

    private int musteriID;
    private String kullaniciAdi;
    private String sifre;
    private String test;

    private String yetki;

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    public int getMusteriID() {
        return musteriID;
    }

    public void setMusteriID(int musteriID) {
        this.musteriID = musteriID;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String kontrolEt(){
        System.out.println("Test");
        return yetki;
    }
}