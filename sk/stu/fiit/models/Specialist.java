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
    
    protected String name;
    protected double MDcost;
    protected int experience;
    protected String highestEducation;
    protected boolean hired;
    protected List<String> certificates;

    protected Specialist(String name, double MDcost, int experience, String highestEducation, List<String> certificates){
        this.name = name;
        this.MDcost = MDcost;
        this.experience = experience;
        this.highestEducation = highestEducation;
        this.hired = false;
        this.certificates = certificates;
    }
    
    public static void main(String[] args) {
        
        // Programmer objProgrammer = new Programmer("Meno", 1.47, 10, "FIIT", false, null, "python");
        
    }

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
