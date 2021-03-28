/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.hirings;

import java.util.Date;
import sk.stu.fiit.models.employers.Employer;
import sk.stu.fiit.models.specialists.Specialist;

/**
 *
 * @author Admin
 */
public class Hiring {

    public static Hiring createHiring(Specialist hiredSpecialist, Employer hiringCompany, Date hiringDate) {
        return new Hiring(hiredSpecialist, hiringCompany, hiringDate);
    }
    
    private final Specialist hiredSpecialist;
    private final Employer hiringCompany;
    private final Date hiringDate;

    private Hiring(Specialist hiredSpecialist, Employer hiringCompany, Date hiringDate) {
        this.hiredSpecialist = hiredSpecialist;
        this.hiredSpecialist.setHired(true);
        this.hiringCompany = hiringCompany;
        this.hiringDate = hiringDate;
    }
    
    public void cancel(){
        this.hiredSpecialist.setHired(false);
    }

    public Specialist getHiredSpecialist() {
        return hiredSpecialist;
    }

    public Employer getHiringCompany() {
        return hiringCompany;
    }

    public Date getHiringDate() {
        return hiringDate;
    }
    
}
