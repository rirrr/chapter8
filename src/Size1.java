public enum Size1 {
    SMALL1("我是小号披萨"),MEDIUM1("我是中号披萨"),LARGE1("我是大号披萨");
    private String description;  //定义一个字符串保存描述信息
    private Size1(String description){
        //定义一个私有的构造方法来使枚举元素具有指定描述信息的能力
        this.description = description;
    }
    public String getDescription(){ //获得枚举元素指定的描述信息
        return description;
    }
    public static void main(String[] args){
        for (Size size : Size.values()){
            System.out.println(size + ":" + size.getDeclaringClass());  //输出所有枚举元素的信息
        }
    }
}
