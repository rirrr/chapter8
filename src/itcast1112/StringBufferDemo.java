package itcast1112;

public class StringBufferDemo {
    public static void main(String[] args) {
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        StringBuffer sb2 = sb.append("hello");  //追加数据

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb == sb2);

        //public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
        sb.append("hello");
        sb.append(true);
        sb.append(12 );
        System.out.println(sb);

        sb2.append("hello").append(true).append(12);
        System.out.println(sb2);
        System.out.println("--------------------");

        //public StringBuffer insert(int offset,String str): 在指定位置把任意类型的数据插入到字符串缓冲区里面并返回字符串缓冲区本身
        sb.insert(5,"world");
        System.out.println(sb);
    }
}
