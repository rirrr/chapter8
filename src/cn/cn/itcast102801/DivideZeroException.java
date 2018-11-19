package cn.cn.itcast102801;

public class DivideZeroException extends ArithmeticException {
    public DivideZeroException(){
    }
    public DivideZeroException(String msg){
        super(msg);
    }
}
