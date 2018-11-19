package cn.cn.itcast102801;

public class ThrowException1 {
    public static void throwsException() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
    }
    public static void main(String[] args){
        try{
            ThrowException1.throwsException();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
