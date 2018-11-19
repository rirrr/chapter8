package cn.cn.itcast102202;

public class StringTest {
    public static void main(String[] main) {
        int[] arr = {1,2,3};
        //定义一个字符串内容为空的字符串对象
        String s = "";
        s = s + '[';  //先给字符串拼接一个‘[’
        //遍历int数组 得到每一个元素
        for(int x = 0 ; x < arr.length ; x++){
            if(x == arr.length-1){
                //就直接拼接 最后一个和‘]’
                s = s + arr[x];
                s = s + ']';
            }else{
                //就拼接 元素和 逗号空格
                s = s + arr[x];
                s = s + ", ";
            }
        }
        System.out.println(s);
    }
}
