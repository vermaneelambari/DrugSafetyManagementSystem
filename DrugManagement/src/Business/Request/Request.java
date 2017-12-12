/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.ClinicalReport.ClinicalReport;
import Business.ClinicalReport.ClinicalReportDirectory;
import Business.Disease.Disease;
import Business.Person.Person;
import Business.PostClinicalReport.PostClinicalReportDirectory;
import Business.PostClinicalReport.PostClinicalTrialDataEntry;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import java.util.Date;

/**
 *
 * @author Sumanth
 */
public abstract class Request {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount pharmaAcc;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String result;
    private Disease disease;
    private Vaccine vaccine;
    private ClinicalReportDirectory clinicalReportDirectory; 
    private Person person;
    private float interpretationScore;
    private PostClinicalReportDirectory postClinicalReportDirectory;
    private float postCtInterpretationScore;
    private PostClinicalTrialDataEntry postClinicalTrialDataEntry;
    
    public Request(){
        requestDate = new Date();
        clinicalReportDirectory = new ClinicalReportDirectory();
        postClinicalReportDirectory = new PostClinicalReportDirectory();
        postClinicalTrialDataEntry = new PostClinicalTrialDataEntry();
    }

    public UserAccount getPharmaAcc() {
        return pharmaAcc;
    }

    public void setPharmaAcc(UserAccount pharmaAcc) {
        this.pharmaAcc = pharmaAcc;
    }

    public PostClinicalTrialDataEntry getPostClinicalTrialDataEntry() {
        return postClinicalTrialDataEntry;
    }

    public void setPostClinicalTrialDataEntry(PostClinicalTrialDataEntry postClinicalTrialDataEntry) {
        this.postClinicalTrialDataEntry = postClinicalTrialDataEntry;
    }

    public PostClinicalReportDirectory getPostClinicalReportDirectory() {
        return postClinicalReportDirectory;
    }

    public void setPostClinicalReportDirectory(PostClinicalReportDirectory postClinicalReportDirectory) {
        this.postClinicalReportDirectory = postClinicalReportDirectory;
    }

    public float getPostCtInterpretationScore() {
        return postCtInterpretationScore;
    }

    public void setPostCtInterpretationScore(float postCtInterpretationScore) {
        this.postCtInterpretationScore = postCtInterpretationScore;
    }
    

    public float getInterpretationScore() {
        return interpretationScore;
    }

    public void setInterpretationScore(float interpretationScore) {
        this.interpretationScore = interpretationScore;
    }

    public ClinicalReportDirectory getClinicalReportDirectory() {
        return clinicalReportDirectory;
    }

    public void setClinicalReportDirectory(ClinicalReportDirectory clinicalReportDirectory) {
        this.clinicalReportDirectory = clinicalReportDirectory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString(){
        return message;
    }
}
