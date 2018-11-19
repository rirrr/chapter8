package itcast1112;

//A类—>B类 是为了使用B类的功能
//B类—>A类 是为了使用A类的功能、要的结果是A类
//String和StringBuffer的相互转换
public class StringBufferTest {
    public static void main(String[] args) {
        String s = "hello";
        //不能把字符串的值直接赋值给StringBuffer
        //方式一：通过构造方法
        StringBuffer sb = new StringBuffer(s);
        //方式二：通过append方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println(sb);
        System.out.println(sb2);

        StringBuffer buffer = new StringBuffer("java");
        //String(StringBuffer buffer)
        //方式一：通过构造方法
        String str = new String(buffer);
        //方式二：通过toString方法
        //任何引用类型调用toString都可以转成字符串
        String str2 = buffer.toString();
        System.out.println(str);
        System.out.println(str2);
    }
}
