public class StringTest4 {
    public static void main(String[] args){
        //定义大小串
        String maxString = "woaijavawozhenaijavawozendeaijava";
        String minString = "java";

        //写功能实现
        int count = getCount(maxString,minString);
        System.out.println(count);
    }
    //明确返回值类型（int） 明确列表（两个字符串）
    public static int getCount(String maxString,String minString){
        int count = 0;
        //先在大串中查找一次小串出现的位置
//        int index = maxString.indexOf(minString);
//        while(index != -1){
//            count++;
//            int startIndex = index + minString.length();
//            maxString = maxString.substring(startIndex);
//            index = maxString.indexOf(minString);
        int index;
        while ((index = maxString.indexOf(minString)) != -1){
            count++;
            maxString = maxString.substring(index + minString.length());
        }

        return count;
    }
}
