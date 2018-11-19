package cn.cn.itcast102801;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundE {
    public static void main(String[] args){
        FileInputStream fis = null;
        try{
            File file = new File("e:\\kria.txt");
            fis = new FileInputStream(file);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
               fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
