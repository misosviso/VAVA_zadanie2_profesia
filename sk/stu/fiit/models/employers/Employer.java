/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employers;

import java.awt.image.BufferedImage;

/**
 *
 * @author Admin
 */
public class Employer {

    public static Employer getEmployer(String name, String sector, int numberOfEmployees, BufferedImage logo) {
        return new Employer(name, sector, numberOfEmployees, logo);
    }
    
    private String name;
    private String sector;
    private int numberOfEmployees;
    private BufferedImage logo;

    private Employer(String name, String sector, int numberOfEmployees, BufferedImage logo) {
        this.name = name;
        this.sector = sector;
        this.numberOfEmployees = numberOfEmployees;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public BufferedImage getLogo() {
        return logo;
    }

    public void setLogo(BufferedImage logo) {
        this.logo = logo;
    }
    
    public String getInformation(){
        StringBuilder information = new StringBuilder();
        information.append("Meno spoločnosti: " + this.name);
        information.append("Sektor: " + this.sector);
        information.append("Počet zamestnancov: " + this.numberOfEmployees);
        
        return information.toString();
    }
    
    
}
