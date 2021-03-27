/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import sk.stu.fiit.models.employers.Employer;
import sk.stu.fiit.models.employers.EmployerManager;

/**
 *
 * @author Admin
 */
public class EmployerManagerController implements ListModels{
    
    private final EmployerManager manager = EmployerManager.getEmployerManager();
    
    private BufferedImage getLogo(String pathToImage) throws IOException{
        BufferedImage logo = null;
        if(pathToImage.equals("")){
            logo = ImageIO.read(new File("data\\defaultLogo.png"));
        }
        return logo;
    }
    
    public void addEmployer(String name, String sector, int NOE, String pathToImage) throws IOException{
        BufferedImage logo = getLogo(pathToImage);
        Employer employer = Employer.getEmployer(name, sector, NOE, logo);
        this.manager.addEmployer(employer);
    }

    @Override
    public DefaultListModel getQuickModel() {
        List<Employer> specialists = this.manager.getEmployers();
        DefaultListModel specialistsModel = new DefaultListModel();
        if (!specialists.isEmpty()) {
            specialists.forEach((Employer employer) -> {
            specialistsModel.addElement(
                    employer.getName() +
                    "sektor: " + employer.getSector() +
                    "počet zamestnancov: " + employer.getNumberOfEmployees()
                );
            }); 
        }
        return specialistsModel;
    }
    
}
