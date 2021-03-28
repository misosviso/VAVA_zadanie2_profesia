/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.hirings;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import sk.stu.fiit.models.employers.Employer;
import sk.stu.fiit.models.specialists.Specialist;

/**
 *
 * @author Admin
 */
public class HiringManager {
    
    private static HiringManager instanceOfHM;
    private final List<Hiring> hirings;

    public static HiringManager getHiringManager() {
        if(HiringManager.instanceOfHM == null){
            return new HiringManager();
        }
        return instanceOfHM;
    }

    private HiringManager() {
        this.hirings = new LinkedList<>();
    }
    
    public void createHiring(Specialist hiredSpecialist, Employer hiringCompany, Date hiringDate){
        Hiring newHiring = Hiring.createHiring(hiredSpecialist, hiringCompany, hiringDate);
        this.hirings.add(newHiring);
    }
    
    public void cancelHiring(int index){
        this.hirings.get(index).cancel();
        this.hirings.remove(index);
    }

    public List<Hiring> getHirings() {
        return hirings;
    }
    
    public Hiring getSpecificHiring(int index){
        return this.hirings.get(index);
    }
    
    
    
    
}
