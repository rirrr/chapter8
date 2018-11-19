package cn.itcast102201;
/*
 * 需求：遍历获取字符串中的每一个字符
 * 用 char charAt(int index) 获取每一个字符
 * 用 int length() 获取字符串长度
 */

public class StringTest {
    public static void main(String[] args){
        String s = "helloworld";
        //System.out.println(s.charAt(0));
        for(int i = 0; i<s.length() ; i++){
            System.out.print(s.charAt(i));
        }
    }
}
