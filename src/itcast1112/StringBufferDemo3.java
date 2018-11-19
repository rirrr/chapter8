package itcast1112;

public class StringBufferDemo3 {
    public static void main(String[] args) {
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");

        //public StringBuffer replace(int start,int end,String str):从start开始到end用str替换，包左不包右
        //world替换为“节日快乐”
        //sb.replace(5,10,"节日快乐");
        //System.out.println(sb);

        System.out.println(sb);
        //public StringBuffer reverse():反转功能
        sb.reverse();
        System.out.println(sb);
    }
}
