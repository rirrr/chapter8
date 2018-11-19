package itcast1112;

//截取功能的不同：返回值类型是String类型，本身没有发生改变
//public String substring(int start)
//public String sbustring(int start,int end)
public class StringBufferDemo4 {
    public static void main(String[] args) {
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");

        //截取功能
        //public String substring(int start)
        String s = sb.substring(5);
        System.out.println(s);
        System.out.println(sb);

        //public String sbustring(int start,int end)
        String s1 = sb.substring(5,10);
        System.out.println(s1);
        System.out.println(sb);
    }
}
