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
    private List<Specialist> specialists;

    public static SpecialistManager getSpecialistManager() {
        if(instanceOfSM == null)
            SpecialistManager.instanceOfSM = new SpecialistManager();
        return instanceOfSM;
    }

    private SpecialistManager() {
        this.specialists = new LinkedList<>();
    }
        
    public void addSpecialist(Specialist specialist){
        this.specialists.add(specialist);
    }

    public List<Specialist> getSpecialists() {
        return specialists;
    }
    
    
    
}
