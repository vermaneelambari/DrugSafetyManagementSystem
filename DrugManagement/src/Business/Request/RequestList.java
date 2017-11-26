/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class RequestList {
    private ArrayList<Request> requestList;

    public RequestList() {
        requestList = new ArrayList<>();
    }

    public ArrayList<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<Request> requestList) {
        this.requestList = requestList;
    }
}
