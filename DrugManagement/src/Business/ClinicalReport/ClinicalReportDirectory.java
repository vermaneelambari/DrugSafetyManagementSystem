/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClinicalReport;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class ClinicalReportDirectory {
    public ArrayList<ClinicalReport> clinicalReportDirectory;
    
    public ClinicalReportDirectory(){
        clinicalReportDirectory = new ArrayList();
    }

    public ArrayList<ClinicalReport> getClinicalReportDirectory() {
        return clinicalReportDirectory;
    }

    public void setClinicalReportDirectory(ArrayList<ClinicalReport> clinicalReportDirectory) {
        this.clinicalReportDirectory = clinicalReportDirectory;
    }
    
    public ClinicalReport addClinicalReport(){
        ClinicalReport c = new ClinicalReport();
        clinicalReportDirectory.add(c);
        return c;
    }

}
