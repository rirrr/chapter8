package cn.cn.itcast102801;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class MathUtil {
    public static void main(String[] args){
        System.out.println("30°的正弦值：" + Math.sin(Math.PI/6));
        System.out.println("30°的余弦值：" + Math.cos(Math.PI/6));
        System.out.println("30°的正切值：" + Math.tan(Math.PI/6));
        System.out.println("0.5的反正弦值：" + Math.asin(0.5));
        System.out.println("0.866的反余弦值：" + Math.acos(0.866));
        System.out.println("0.5774的反正切值：" + Math.atan(0.5774));
        System.out.println("30的双曲正弦值：" + Math.sinh(30));
        System.out.println("30的双曲余弦值：" + Math.cosh(30));
        System.out.println("30的双曲正切值：" + Math.tanh(30));
        System.out.println("--------------------------------");
        System.out.println("8的立方根：" + Math.cbrt(8));
        System.out.println("e的8次方是：" + Math.exp(8));
        System.out.println("e的9次方是：" + Math.expm1(8));
        System.out.println("8的自然对数是：" + Math.log(8));
        System.out.println("8的10为底的对数是：" + Math.log10(8));
        System.out.println("9的自然对数是：" + Math.log1p(9));
        System.out.println("2的3次方是：" + Math.pow(2,3));
        System.out.println("8的平方根是：" + Math.sqrt(8));
        System.out.println("--------------------------------");
        BigInteger number1 = new BigInteger("12345");
        BigInteger number2 = new BigInteger("54321");
        BigInteger addition = number1.add(number2);
        BigInteger subtraction = number1.subtract(number2);
        BigInteger multiplication = number1.multiply(number2);
        BigInteger division = number1.divide(number2);
        System.out.println("高精度整数number1:" + number1);
        System.out.println("高精度整数number2:" + number2);
        System.out.println("高精度整数加法：" + addition);
        System.out.println("高精度整数减法：" + subtraction);
        System.out.println("高精度整数乘法：" + multiplication);
        System.out.println("高精度整数除法：" + division);
        System.out.println("----------------------------");
        BigDecimal number3 = new BigDecimal(1.2345);
        BigDecimal number4 = new BigDecimal(5.4321);
        BigDecimal addition1 = number3.add(number4);
        BigDecimal subtraction1 = number3.subtract(number4);
        BigDecimal multiplication1 = number3.multiply(number4);
        //以四舍五入的方式获得高精度除法的运算结果
        BigDecimal division1 = number3.divide(number4, RoundingMode.HALF_UP);

        System.out.println("高精度浮点数number3：" + number3);
        System.out.println("高精度浮点数number4：" + number4);
        System.out.println("高精度浮点数加法：" + addition1);
        System.out.println("高精度浮点数减法：" + subtraction1);
        System.out.println("高精度浮点数乘法：" + multiplication1);
        System.out.println("高精度浮点数除法：" + division1);
    }
}
