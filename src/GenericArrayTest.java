public class GenericArrayTest {
    public static void main(String[] args){
        System.out.println("创建String类型的数组并向其添加元素：明日科技");
        GenericArray<String> stringGenericArray = new GenericArray<String>(String.class,10);
        stringGenericArray.put(0,"明日科技");
        System.out.println("String类型的数组元素：" + stringGenericArray.get(0));
        System.out.println("创建Integer类型的数组并向其添加元素：123456789");
        GenericArray<Integer> integerGenericArray = new GenericArray<Integer>(Integer.class,10);
        integerGenericArray.put(0,123456789);
        System.out.println("Integer类型的数组元素：" + integerGenericArray.get(0));
    }
}
