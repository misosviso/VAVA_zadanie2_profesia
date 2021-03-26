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
public class Programmer extends Specialist{
    
    private String type;

    /**
     *
     * @param name
     * @param MDcost
     * @param experience
     * @param highestEducation
     * @param certificates
     * @param type
     */
    public Programmer(String name, double MDcost, int experience, String highestEducation, List<String> certificates, String type) {
        super(name, MDcost, experience, highestEducation, certificates);
        this.type = type;
    }


    
    
    
}
