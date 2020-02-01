package com.omt.main;
 
public class RunWithParamMain {
 
     
    //This is Example that display how to run exe and pass parameter using java
    public static void main(String args[])
    {
        //Here i passed txt file path that i want to open in notepad. The file 
        //omt.txt is in E drive omtlab folder
        String filePath = "C:/Windows/Notepad.exe C:/omtlab/omt.txt";
        try {
             
            Runtime.getRuntime().exec(filePath);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
}