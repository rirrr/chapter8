import java.util.Arrays;

public class BinSearch {
    public static <T extends Comparable<? super T>> int search(T[] array, T key) {
        int low = 0;  //利用整型变量low保存数组的最小索引
        int mid = 0;
        int high = array.length;
        System.out.println("查找的中间值：");
        while (low <= high) {
            mid = (low + high)/2;  //获得中间索引
            System.out.println(mid + "");
            if (key.compareTo(array[mid]) > 0){  //如果key大于中间元素，则比较右边
                low = mid + 1;
            }else if(key.compareTo(array[mid]) < 0) {
                high = mid - 1;
            }else{
                System.out.println();
                return mid;  //获得对应元素的索引
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Integer[] ints = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("数据集合：");
        System.out.println(Arrays.toString(ints));
        System.out.println("元素3所对应的索引序号：" + search(ints,3));
    }
}
