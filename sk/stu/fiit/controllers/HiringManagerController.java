/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.util.Date;
import sk.stu.fiit.models.employers.Employer;
import sk.stu.fiit.models.employers.EmployerManager;
import sk.stu.fiit.models.hirings.HiringManager;
import sk.stu.fiit.models.specialists.Specialist;
import sk.stu.fiit.models.specialists.SpecialistManager;

/**
 *
 * @author Admin
 */
public class HiringManagerController {
    
    private final HiringManager manager = HiringManager.getHiringManager();
    private final EmployerManager empManager = EmployerManager.getEmployerManager();
    private final SpecialistManager specManager = SpecialistManager.getSpecialistManager();
    
    public void createHiring(int specialistIndex, int employerIndex){
        Date hiringDate = new Date();
        Specialist hiredSpecialist = specManager.getSpecificSpecialist(specialistIndex);
        Employer hiringCompany = empManager.getSpecificEmployer(employerIndex);
        this.manager.createHiring(hiredSpecialist, hiringCompany, hiringDate);
    }
    
}
