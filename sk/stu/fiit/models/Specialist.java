/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models;

import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class Specialist {
    
    private String name;
    private double MDcost;
    private int experience;
    private String highestEducation;
    private boolean hired;
    private List<String> certificates;

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMDcost() {
        return MDcost;
    }

    public void setMDcost(double MDcost) {
        this.MDcost = MDcost;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }
    
}
