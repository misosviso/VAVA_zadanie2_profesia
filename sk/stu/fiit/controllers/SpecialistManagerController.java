/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.util.List;
import javax.swing.DefaultListModel;
import sk.stu.fiit.models.specialists.Administrator;
import sk.stu.fiit.models.specialists.Programmer;
import sk.stu.fiit.models.specialists.SecuritySpecialist;
import sk.stu.fiit.models.specialists.Specialist;
import sk.stu.fiit.models.specialists.SpecialistManager;

/**
 *
 * @author Admin
 */
public class SpecialistManagerController {
    
    private SpecialistManager manager = SpecialistManager.getSpecialistManager();
    
    public void addProgrammer(String name, double MDcost, int xp, String edu, List<String> certs, String type){
        Programmer newProgrammer = Programmer.getProgrammer(name, MDcost, xp, edu, certs, type);
        this.manager.addSpecialist(newProgrammer);
    }
    public void addSecuritySpecialist(String name, double MDcost, int xp, String edu, List<String> certs, boolean NBU){
        SecuritySpecialist newSecuritySpecialist = SecuritySpecialist.getSecuritySpecialist(name, MDcost, xp, edu, certs, NBU);
        this.manager.addSpecialist(newSecuritySpecialist);
    }
    public void addAdministrator(String name, double MDcost, int xp, String edu, List<String> certs, String type, String platform){
        Administrator newAdministrator = Administrator.getAdministrator(name, MDcost, xp, edu, certs, type, platform);
        this.manager.addSpecialist(newAdministrator);
    }
    
    public DefaultListModel getQuickModel(){
        List<Specialist> specialists = this.manager.getSpecialists();
        DefaultListModel specialistsModel = new DefaultListModel();
        if (!specialists.isEmpty()) {
            specialists.forEach((Specialist specialist) -> {
            specialistsModel.addElement(
                    specialist.getSpecialization() +
                    " " + specialist.getName() +
                    " cena za MD: " + specialist.getMDcost()
                );
            }); 
        }
        return specialistsModel;
    }
    
    
    
}
