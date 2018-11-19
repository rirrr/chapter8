package cn.cn.itcast102801;

public class CatchExcertion {
    public static void main(String[] args){
        try{
            System.out.println("进入try语句块");
            @SuppressWarnings("unused")
            Class<?> clazz = Class.forName(""); //得到一个空的class对象
            System.out.println("离开try语句块");
        }catch(ClassNotFoundException e){
            System.out.println("进入catch语句块");
            e.printStackTrace();
            System.out.println("离开catch语句块");
        }finally {
            System.out.println("进入finally语句块");
        }
    }
}
