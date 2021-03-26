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
public class Administrator extends Specialist{
    
    private String type;
    private String platform;

    public Administrator(String name, double MDcost, int experience, String highestEducation, List<String> certificates, String type, String platform) {
        super(name, MDcost, experience, highestEducation, certificates);
        this.type = type;
        this.platform = platform;               
    }
    
}
