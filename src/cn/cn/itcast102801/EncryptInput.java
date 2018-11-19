package cn.cn.itcast102801;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;

public class EncryptInput {
    @SuppressWarnings("unused")
    public static void fileLock(String file){
        FileOutputStream fous = null;
        FileLock lock = null;
        try{
            fous = new FileOutputStream(file);
            lock = fous.getChannel().tryLock();
            Thread.sleep(60*1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String file = "E://count.txt";
        fileLock(file);
    }
}
