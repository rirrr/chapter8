import java.time.MonthDay;
import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args){
        EnumSet<Weeks> week = EnumSet.noneOf(Weeks.class);  //创建一个Weeks类型的EnumSet
        week.add(Weeks.MONDAY);
        System.out.println("EnumSet中的元素；" + week);
        week.remove(Weeks.MONDAY);
        System.out.println("EnumSet中的元素：" + week);
        week.addAll(EnumSet.complementOf(week));  //向EnumSet中增加week中元素的补集
        System.out.println("EnumSet中的元素" + week);
        week.removeAll(EnumSet.range(Weeks.MONDAY,Weeks.THURSDAY));  //删除week中MONDAY、THURSDAY元素
        System.out.println("EnumSet中的元素：" + week);
    }
}
