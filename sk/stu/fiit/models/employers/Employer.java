/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employers;

import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;
import sk.stu.fiit.models.Hiring;
import sk.stu.fiit.models.specialists.Specialist;

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
    private final List<Hiring> hiredSpecialists;

    public List<Hiring> getHiredSpecialists() {
        return hiredSpecialists;
    }
    
    public void hireSpecialist(Hiring hiring){
        this.hiredSpecialists.add(hiring);
    }
    
    public void unhireSpecialist(int index){
        this.hiredSpecialists.remove(index);
    }

    private Employer(String name, String sector, int numberOfEmployees, BufferedImage logo) {
        this.name = name;
        this.sector = sector;
        this.numberOfEmployees = numberOfEmployees;
        this.logo = logo;
        this.hiredSpecialists = new LinkedList<>();
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
