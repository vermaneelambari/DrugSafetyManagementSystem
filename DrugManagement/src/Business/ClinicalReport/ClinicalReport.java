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
public class ClinicalReport {
    ArrayList<String> question;
    ArrayList<String> reportValue;
    float finalReportValue;

    public float getFinalReportValue() {
        return finalReportValue;
    }

    public void setFinalReportValue(float finalReportValue) {
        this.finalReportValue = finalReportValue;
    }

    public ArrayList<String> getQuestion() {
        return question;
    }

    public void setQuestion(ArrayList<String> question) {
        this.question = question;
    }

    public ArrayList<String> getReportValue() {
        return reportValue;
    }

    public void setReportValue(ArrayList<String> reportValue) {
        this.reportValue = reportValue;
    }

    
}
