package cn.cn.itcast102801;

public class ClassNotFoundE {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
