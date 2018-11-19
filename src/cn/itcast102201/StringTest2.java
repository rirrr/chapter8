package cn.itcast102201;
/*
 *需求：统计大写字母个数 小写字母个数 数字个数
 *“Hello123World”
 * 大写：2
 * 小写：8
 * 数字：
 *
 * 1.定义3个统计变量
 * 2.遍历字符串得到每一个字符
 * 3.判断该字符属于哪种 ++
 *
 */
public class StringTest2 {
    public static void main(String[] args){
        String s = "Hello123World";
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                smallCount++;
            }else if(ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }else if(ch >= '0' && ch <= '9'){
                numberCount++;
            }
        }
        System.out.println("大写字母的数量：" + bigCount);
        System.out.println("小写字母的数量：" + smallCount);
        System.out.println("数字的数量：" + numberCount);
    }
}
