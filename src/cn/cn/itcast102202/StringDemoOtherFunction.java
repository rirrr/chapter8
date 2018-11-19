package cn.cn.itcast102202;

public class StringDemoOtherFunction {
    public static void main(String[] args){
        String s1 = "helloworld";
        String s2 = s1.replace('l','k');
        String s3 = s1.replace("owo","hfksjdh");
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);
        System.out.println("---------");

        String s4 = "  hello  world  ";
        String s5 = s4.trim();
        System.out.println("s4:" + s4);
        System.out.println("s5:" + s5);
        System.out.println("s4:" + s4 + "---");
        System.out.println("s5:" + s5 + "---");
        System.out.println("---------");

        String s6 = "hello";
        String s7 = "hello";
        String s8 = "sbc";
        String s9 = "Sbc";
        String s10 = "abc";
        System.out.println(s6.compareTo(s7));  //0   一样
        System.out.println(s6.compareTo(s8));  //-11 前面减后面
        System.out.println(s6.compareTo(s9));  //21
        System.out.println(s9.compareToIgnoreCase(s8));  //0
    }
}
