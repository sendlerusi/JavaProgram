package com.omt.main;
 
public class RunBatchMain {
    //This is Example that display how to run batch using java
    public static void main(String args[])
    {
        //Run batch file using java
        String filePath = "C:/omtlab/omtbat.bat";
        try {
             
            Runtime.getRuntime().exec(filePath);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}