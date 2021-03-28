/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.specialists;

import java.util.LinkedList;
import java.util.List;

/**
 * Singleton class, which is responsible for operations over list of all specialists
 * @author Admin
 */
public class SpecialistManager {
    
    
    private static SpecialistManager instanceOfSM = null;
    private final List<Specialist> specialists;

    public static SpecialistManager getSpecialistManager() {
        if(instanceOfSM == null)
            SpecialistManager.instanceOfSM = new SpecialistManager();
        return instanceOfSM;
    }

    private SpecialistManager() {
        this.specialists = new LinkedList<>();
        loadDefaultSpecialists();
    }
    
    private void loadDefaultSpecialists(){
        Programmer objProgrammer = Programmer.getProgrammer("Peter Poriadny", 55, 10, "FIIT", null, "python");
        SecuritySpecialist objSecuritySpecialist = SecuritySpecialist.getSecuritySpecialist("Branislav Bezpecny", 90, 12, "FIIT", null, false);
        Administrator objAdministrator = Administrator.getAdministrator("Adam ...", 34, 6, "FIIT", null, "SAP", "platforma");
        this.specialists.add(objProgrammer);
        this.specialists.add(objSecuritySpecialist);
        this.specialists.add(objAdministrator);     
    }  
        
    public void addSpecialist(Specialist specialist){
        this.specialists.add(specialist);
    }

    public List<Specialist> getSpecialists() {
        return specialists;
    }

    public Specialist getSpecificSpecialist(int specialistIndex) {
        return specialists.get(specialistIndex);
    }

    public boolean isHired(int specialistIndex) {
        return this.specialists.get(specialistIndex).isHired();
    }

}
