package cn.cn.itcast102801;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] array = new int[5];
        Arrays.fill(array,5);
        for(int i = 4; i>-1 ; i--){
            if(i == 0) {
                throw new DivideZeroException("除零异常");
            }
            System.out.println("array[" + i + "]/" + i + "=" + array[i]/i);
        }
    }
}
