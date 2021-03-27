/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import sk.stu.fiit.models.employers.Employer;
import sk.stu.fiit.models.employers.EmployerManager;

/**
 *
 * @author Admin
 */
public class EmployerManagerController {
    
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
    
}
