package com.company;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lope on 3/30/2015.
 */
public class CallForService {

    // address
   private String address;
    //date service request
    private Date serviceRequestDate;
DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");

    //description of problem
   private String probDescrip;
    // age of the water heater
private     int ageOfwaterHeater;

    // resolve ticket properties
    private Date resolveDate;

    // discription of resolution
    private String resolutionDescrip;

    // handles fees charged
    private double feeCharged;
    private double feeChargedWithExtra = feeCharged + 20.00;

    // add the boolean value of the checkboxes and return the string for the type of call

    private String serviceTypeCheck; // if the checkbox is checked return true and return the type of service call.


    public CallForService(String address, Date serviceRequestDate, String probDescrip, int ageOfwaterHeater){
        this.address = address;
        this.serviceRequestDate = serviceRequestDate;
        this.probDescrip = probDescrip ;
        this.ageOfwaterHeater = ageOfwaterHeater;
    }

    // once resolved it needs to have
    // 1. resolve date 2. description of resolution 3. and fee charged to the customer. + ($20)
public CallForService(Date resolveDate, String resolutionDescrip, double feeCharged, double feeChargedWithExtra){
    this.resolveDate = resolveDate;
    this.resolutionDescrip = resolutionDescrip;
    this.feeCharged = feeCharged;
    this.feeChargedWithExtra = feeChargedWithExtra;
}

    @Override
    public String toString(){

        return (" Service call Address: " + this.address + " Date of Service Call : " + this.serviceRequestDate +
                " Problem Description: " + this.probDescrip + " Water heater age: " + this.ageOfwaterHeater);
    }








}
