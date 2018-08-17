package com.sell.util;

import org.glassfish.jersey.server.model.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public  class JSONUtil {
    static public String  getJSONByFileName(String filename){
        String rootPath= JSONUtil.class.getResource("/jsonData/"+filename).getPath();
       StringBuilder jsonData=new StringBuilder();
       File file=new File(rootPath);
        FileInputStream inputStream=null;
        try {
             inputStream=new FileInputStream(file);
            byte[]buff=new byte[1000];
            int line=0;
            while((line=inputStream.read(buff))!=-1){
                jsonData.append(new String(buff,0,line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return jsonData.toString();
    }
}
