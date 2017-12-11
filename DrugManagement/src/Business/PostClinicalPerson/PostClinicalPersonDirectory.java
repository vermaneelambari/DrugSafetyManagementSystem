/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PostClinicalPerson;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class PostClinicalPersonDirectory {
    private ArrayList<PostClinicalPerson> postClinicalPersonList;

    public PostClinicalPersonDirectory() {
        postClinicalPersonList = new ArrayList();
    }

    public ArrayList<PostClinicalPerson> getPostClinicalPersonList() {
        return postClinicalPersonList;
    }

    public void setPostClinicalPersonList(ArrayList<PostClinicalPerson> postClinicalPersonList) {
        this.postClinicalPersonList = postClinicalPersonList;
    }

    
    public PostClinicalPerson addPerson(){
        PostClinicalPerson p = new PostClinicalPerson();
        postClinicalPersonList.add(p);
        return p;
    }
    
    public void deletePerson(PostClinicalPerson p){
        postClinicalPersonList.remove(p);
    }
    
    public PostClinicalPerson searchPerson(String name){
        for(PostClinicalPerson p : postClinicalPersonList){
            if(p.getName()== name){
                return p;
            }
        } 
        return null; 
    }
}
