/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PostClinicalReport;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class PostClinicalTrialDataEntry {
    ArrayList<String> question;
    ArrayList<String> reportValue;

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
