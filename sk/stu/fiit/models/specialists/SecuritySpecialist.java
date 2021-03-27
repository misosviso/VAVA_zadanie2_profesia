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
public class SecuritySpecialist extends Specialist{

    public static SecuritySpecialist getSecuritySpecialist(String name, double MDcost, int experience, String highestEducation, List<String> certificates, boolean NBU) {
        return new SecuritySpecialist(name, MDcost, experience, highestEducation, certificates, NBU);
    }
    
    private boolean NBU;

    private SecuritySpecialist(String name, double MDcost, int experience, String highestEducation, List<String> certificates, boolean NBU) {
        super(name, MDcost, experience, highestEducation, certificates);
        this.NBU = NBU;
    }

    public boolean isNBU() {
        return NBU;
    }

    public void setNBU(boolean NBU) {
        this.NBU = NBU;
    }

    @Override
    public String getInformation() {
        StringBuilder information = new StringBuilder();
        information.append(getBasicInformation());
        if(isNBU()){
            information.append("\nNBU auditor: áno");
        } else{
            information.append("\nNBU auditor: nie");
        }
        
        return information.toString();
    }
    
}
