/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.specialists;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class Specialist implements GetInformation{
    
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
        if(certificates == null){
            this.certificates = new LinkedList<>();
        } else{
            this.certificates = certificates;
        }      
    }
    
    public static void main(String[] args) {
        
        Programmer objProgrammer = Programmer.getProgrammer("Programator Peto", 1.47, 10, "FIIT", null, "python");
        SecuritySpecialist objSecuritySpecialist = SecuritySpecialist.getSecuritySpecialist("Bezpecak Brano", 1.47, 10, "FIIT", null, false);
        Administrator objAdministrator = Administrator.getAdministrator("Aministrator Adam", 1.47, 10, "FIIT", null, "SAP", "platforma");
        
        System.out.println("meno programatora = " + objProgrammer.getName());
        System.out.println("meno bezpecaka = " + objSecuritySpecialist.getName());
        System.out.println("meno administratora = " + objAdministrator.getName());
        
        SpecialistManager objManager = SpecialistManager.getSpecialistManager();
        System.out.println(objManager.getSpecialists());
        
        objManager.addSpecialist(objSecuritySpecialist);
        SpecialistManager objManager2 = SpecialistManager.getSpecialistManager();
        System.out.println(objManager.getSpecialists());
        
        
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
    
    public String getSpecialization(){
        if(this instanceof Programmer){
            return "Programátor";
        }
        else if(this instanceof SecuritySpecialist){
            return "Bezpečnostný špecialista/konzultant";
        }
        else {
            return "Administrátor";
        }
    }
    
    protected String getBasicInformation(){
        StringBuilder information = new StringBuilder();
        information.append("Špecializácia: " + this.getSpecialization());
        information.append("\nMeno: " + this.name);
        information.append("\nCena za Man-Day: " + MDcost);
        information.append("\nPrax: " + experience);
        information.append("\nVzdelanie: " + highestEducation);
        
        information.append("\nCertifikáty: ");
        
        if(certificates.isEmpty()){
            information.append("-");
        } else{
            certificates.forEach(cert -> {
                information.append("\n" + cert);
            });
        }
        
        return information.toString();
    }
    
}
