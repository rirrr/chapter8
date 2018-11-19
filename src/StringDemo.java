public class StringDemo {
    public static void main(String[] args) {
        //public String() 空构造
        String s1 = new String();
        System.out.println("s1:" + s1);
        System.out.println("s1.length" + s1.length());
        System.out.println("-----------------------");

        //public String(byte[] bytes) 把字节数组转成字符串
        byte[] bytes = {97, 98, 99, 100, 101};
        String s2 = new String(bytes);
        System.out.println("s2:" + s2);
        System.out.println("s2.length:" + s2.length());
        System.out.println("-----------------------");

        //public String(byte[] bytes,int index,int length) 把字节数组的一部分转成字符串
        String s3 = new String(bytes, 1, 3);
        System.out.println("s3:" + s3);
        System.out.println("s3.length:" + s3.length());
        System.out.println("-----------------------");

        //public String(char[] value) 把字符数组转成字符串
        char[] chars = {'a', 'r', 'd', 'e', 'y'};
        String s4 = new String(chars);
        System.out.println("s4:" + s4);
        System.out.println("s4.length:" + s4.length());
        System.out.println("------------------------");

        //public String(char[] value,int index,int length) 把字符数组的一部分转成字符串
        String s5 = new String(chars, 1, 3);
        System.out.println("s5:" + s5);
        System.out.println("s5.length:" + s5.length());
        System.out.println("-----------------------");

        //public String(String original() 把字符串常量值转成字符串
        String s6 = new String("abcde");
        System.out.println("s6:" + s6);
        System.out.println("s6.length:"+ s6.length());
        System.out.println("-----------------------");

        String s7 = "abcde";
        System.out.println("s7:" + s7);
        System.out.println("s7.length:"+ s7.length());
        System.out.println("-----------------------");
    }
}