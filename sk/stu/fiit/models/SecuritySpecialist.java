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
public class SecuritySpecialist extends Specialist{
    
    private boolean NBU;

    public SecuritySpecialist(String name, double MDcost, int experience, String highestEducation, List<String> certificates, boolean NBU) {
        super(name, MDcost, experience, highestEducation, certificates);
        this.NBU = NBU;
    }
    
}
