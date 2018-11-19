package cn.cn.itcast102202;

public class StringTest3 {
    public static void main(String[] args){
        String s = "helloWORLD";

        String s1 = s.substring(0,1);
        String s2 = s.substring(1);

        System.out.print(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String s3 = s1.toUpperCase().concat(s2.toLowerCase());
        System.out.println(s3);

        String s4 = s1.toUpperCase() + s2.toLowerCase();
        System.out.println(s4);

        //链式编程
        String result = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(result);
    }
}
