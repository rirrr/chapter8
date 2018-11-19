package itcast1113;

//1.String、StringBuffer、StringBuilder的区别
//A：String是内容不可变的，StringBuffer、StringBuilder是内容可变的
//B：StringBuffer是同步的，数据安全，效率低；StringBuilder是不同步，数据不安全的效率高。
//
//2.StringBuffer和数组的区别？
//二者都可以看作是一个容器装其他的数据，StringBuffer的数据最终是一个字符串数据，而数组可以是多种同类数据
//
//3.作为形式参数问题
//String作为参数传递
//StringBuffer作为参数传递
//形式参数：
//  基本类型：形式参数的改变不影响实际参数
//  引用类型：形式参数的改变直接影响实际参数
public class StringBufferDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);
        change(s1,s2);
    }

    public static void change(String s1, String s2) {

    }
}
