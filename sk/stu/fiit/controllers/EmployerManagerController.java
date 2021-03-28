/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import sk.stu.fiit.models.employers.Employer;
import sk.stu.fiit.models.employers.EmployerManager;
import sk.stu.fiit.models.specialists.Specialist;

/**
 *
 * @author Admin
 */
public class EmployerManagerController implements ListModels{
    
    private final EmployerManager manager = EmployerManager.getEmployerManager();
    
    private BufferedImage createLogo(String pathToImage) throws IOException{
        if(pathToImage.equals("")){
            return null;
        }
        return ImageIO.read(new File(pathToImage));
    }
    
    public ImageIcon getLogo(int index, int width, int height){
        BufferedImage companyLogo = this.manager.getSpecificEmployer(index).getLogo();
        if(companyLogo == null){
            try {
                companyLogo = ImageIO.read(new File("data\\defaultLogo.png"));
            } catch (IOException ex) {
                Logger.getLogger(EmployerManagerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            companyLogo = resizeImage(companyLogo, width, height);
        } catch (IOException ex) {
            Logger.getLogger(EmployerManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon displayedLogo = new ImageIcon(companyLogo);
        return displayedLogo;
    }
    
    private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }
    
    public void addEmployer(String name, String sector, int NOE, String pathToImage) throws IOException{
        BufferedImage logo = createLogo(pathToImage);
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
                    " sektor: " + employer.getSector() +
                    " počet zamestnancov: " + employer.getNumberOfEmployees()
                );
            }); 
        }
        return specialistsModel;
    }
    
    public DefaultListModel getHiredSpecialists(int employerIndex){
        List<Specialist> specialists = this.manager.getHiredSpecialists(employerIndex);
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
    
    public String getCompanyName(int index){
        return this.manager.getSpecificEmployer(index).getName();
    }
    
    public String getCompanySector(int index){
        return this.manager.getSpecificEmployer(index).getSector();               
    }
    
    public int getNOP(int index){
        return this.manager.getSpecificEmployer(index).getNumberOfEmployees();
    }
    
    public void unhireSpecialist(int employerIndex, int specialistIndex){
        this.manager.unhireSpecialist(employerIndex, specialistIndex);
    }

}
