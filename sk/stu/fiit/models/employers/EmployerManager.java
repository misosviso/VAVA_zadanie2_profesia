/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employers;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class EmployerManager {
    
    private static EmployerManager instanceOfEM;
    private final List<Employer> employers;
    
    public static EmployerManager getEmployerManager() {
        if(instanceOfEM == null)
            EmployerManager.instanceOfEM = new EmployerManager();
        return instanceOfEM;
    }

    private EmployerManager() {
        this.employers = new LinkedList<>();
        loadDefaultEmployers();
    }
    
    private void loadDefaultEmployers(){
        
    }  
        
    public void addEmployer(Employer employer){
        this.employers.add(employer);
    }

    public List<Employer> getEmployers() {
        return employers;
    }

    public Employer getSpecificEmployer(int specialistIndex) {
        return employers.get(specialistIndex);
    }
    
    
    
}
