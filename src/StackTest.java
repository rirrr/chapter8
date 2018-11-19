public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>(); //在创建栈对象时就指明该栈中只能保存字符串
        System.out.println("向栈中增加字符串：");
        System.out.println("视频学java");
        System.out.println("细说java");
        System.out.println("java从入门到精通(第2版)");
        stack.push("视频学java");
        stack.push("细说java");
        stack.push("java从入门到精通(第2版)");
        System.out.println("从栈中取出字符串：");
        while(!stack.empty()){
            System.out.println((String)stack.pop());  //删除栈中全部元素并进行输出
        }
    }
}
