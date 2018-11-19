package cn.cn.itcast102801;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleWriter {
    public static void main(String[] args){
        System.out.println("请输入要保存的字符串：");;
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        FileWriter writer = null;
        try{
            writer = new FileWriter("e://test.txt");
            writer.write(text);
            writer.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(writer != null){
                try{
                    writer.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
