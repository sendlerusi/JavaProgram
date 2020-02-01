package com.omt.main;
 
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
 
public class GetResponseMain {
    //This is Example that display how to get response using java
    public static void main(String args[])
    {
        String filePath = "C:/omtlab/omt_echo_bat.bat";
        try {
             
            Process p = Runtime.getRuntime().exec(filePath);
            p.waitFor();
            InputStream in = p.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
             
            int c = -1;
            while((c = in.read()) != -1)
            {
                baos.write(c);
            }
             
            String response = new String(baos.toByteArray());
            System.out.println("Response From Exe : "+response);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
}