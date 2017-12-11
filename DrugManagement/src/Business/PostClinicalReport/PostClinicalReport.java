/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PostClinicalReport;

import Business.PostClinicalPerson.PostClinicalPerson;

/**
 *
 * @author Sumanth
 */
public class PostClinicalReport {
    PostClinicalPerson postClinicalPerson;
    int finalReportValue;
    String status;

    public PostClinicalPerson getPostClinicalPerson() {
        return postClinicalPerson;
    }

    public void setPostClinicalPerson(PostClinicalPerson postClinicalPerson) {
        this.postClinicalPerson = postClinicalPerson;
    }

    public int getFinalReportValue() {
        return finalReportValue;
    }

    public void setFinalReportValue(int finalReportValue) {
        this.finalReportValue = finalReportValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
