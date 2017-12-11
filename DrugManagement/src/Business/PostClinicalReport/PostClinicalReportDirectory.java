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
public class PostClinicalReportDirectory {

    private ArrayList<PostClinicalReport> postClinicalReportDirectory;

    public PostClinicalReportDirectory() {
        postClinicalReportDirectory = new ArrayList();
    }

    public ArrayList<PostClinicalReport> getPostClinicalReportDirectory() {
        return postClinicalReportDirectory;
    }

    public void setPostClinicalReportDirectory(ArrayList<PostClinicalReport> postClinicalReportDirectory) {
        this.postClinicalReportDirectory = postClinicalReportDirectory;
    }
    
    public PostClinicalReport addClinicalReport(){
        PostClinicalReport c = new PostClinicalReport();
        postClinicalReportDirectory.add(c);
        return c;
    }
}
