/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.specialists;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Programmer extends Specialist{

    public static Programmer getProgrammer(String name, double MDcost, int experience, String highestEducation, List<String> certificates, String type) {
        return new Programmer(name, MDcost, experience, highestEducation, certificates, type);
    }
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Constructor
     * @param name name of programmer
     * @param MDcost cost per Man-Day
     * @param experience years of experience
     * @param highestEducation highest reached education
     * @param certificates
     * @param type (python, C++, Ruby, iOS...)
     */
    private Programmer(String name, double MDcost, int experience, String highestEducation, List<String> certificates, String type) {
        super(name, MDcost, experience, highestEducation, certificates);
        this.type = type;
    }
    
    @Override
    public String getInformation() {
        StringBuilder information = new StringBuilder();
        information.append(getBasicInformation());
        information.append("\nZaradenie: " + type);
        return information.toString();
        
    }
        
}
