import java.util.Scanner;

/*
1.定义用户名和密码（已存在）
2.键盘录入用户名和密码
3.比较用户名和密码（相同则登录成功；否则失败）
4.给三次机会（用循环改进）
 */
public class StringTest {
    public static void main(String[] args){
        //定义用户名和密码
        String username = "admin";
        String password = "admin";

        //三次机会
        for(int x = 0; x<3 ; x++) {
            //0，1，2
            //键盘录入用户名和密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            //比较用户名和密码
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                GuessNumberGame.start();
                break;
            } else {
                //2，1，0
                if((2-x) ==0){
                    System.out.println("账号会锁定");
                }else {
                    System.out.println("登录失败！你还有" + (2 - x) + "次机会");
                }
            }
        }
    }
}
