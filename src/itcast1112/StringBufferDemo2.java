package itcast1112;

//删除
//public StringBuffer deleteCharAt(int index):删除指定位置的字符并返回本身
//public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容，并返回本身
public class StringBufferDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        sb.append("hello").append("world").append("java");

        //删除e字符
        //sb.deleteCharAt(1);
        //删第一个l
        //sb.deleteCharAt(1);

        //删world
        //sb.delete(5,10);
        //public StringBuffer delete(int start,int end) 包左不包右

        //删所有数据
        //sb.delete(0,14);
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
}
