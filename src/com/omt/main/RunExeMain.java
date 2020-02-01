package com.omt.main;
 
import java.io.IOException;
 
@SuppressWarnings("unused")
public class RunExeMain {
 
    //This is Example that display how to run exe using java
    public static void main(String args[])
    {
        String filePath = "C:/Windows/Notepad.exe";
        try {
             
            Runtime.getRuntime().exec(filePath);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
}