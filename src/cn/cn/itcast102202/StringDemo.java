package cn.cn.itcast102202;

public class StringDemo {
    public static void main(String[] args){
        String s = "JavaSE";

       /* byte[] bytes = s.getBytes();
        for (int i=0 ; i<s.length() ; i++){
            System.out.println(bytes[i]);
        }*/

        /*char[] chars = s.toCharArray();
        for (int i=0 ; i<s.length() ; i++) {
            System.out.print(chars[i]);
        }*/

        char[] chars = s.toCharArray();
        String ss = String.valueOf(chars);
        System.out.println(ss);
        for (int i=0 ; i<s.length() ; i++) {
            System.out.print(chars[i]);
        }

        int i = 100;
        String sss = String.valueOf(i);
        System.out.println(sss);

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println("--------------");
        String s4 = s1.concat(s2);
        System.out.println(s4);
    }
}
