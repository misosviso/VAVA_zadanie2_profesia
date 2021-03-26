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
public class Administrator extends Specialist{

    public static Administrator getAdministrator(String name, double MDcost, int experience, String highestEducation, List<String> certificates, String type, String platform) {
        return new Administrator(name, MDcost, experience, highestEducation, certificates, type, platform);
    }
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    private String platform;

    private Administrator(String name, double MDcost, int experience, String highestEducation, List<String> certificates, String type, String platform) {
        super(name, MDcost, experience, highestEducation, certificates);
        this.type = type;
        this.platform = platform;               
    }
    
}
