public enum JDBCInfo {
    DRIVER,URL,USERNAME,PASSEORD;
    public String getJDBCInfo(JDBCInfo info){ //定义方法来根据不同的枚举元素返回不同的字符串
        switch(info){
            case DRIVER:  //如果枚举元素是DRIVER，则返回数据库驱动
                return "com.mysql.jdbc.Driver";
            case URL:  //返回数据库URL
                return "jdbc:mysql://localhost:3306/db_database";
            case USERNAME:  //返回数据库用户名
                return "mr";
            case PASSEORD:  //返回数据库密码
                return "mingrisoft";
                default:
                    return null;
        }
    }
    public static void main(String[] args){
        for(JDBCInfo info : JDBCInfo.values()){
            //遍历输出枚举元素的名称和对应的字符串
            System.out.println(info + ":" + info.getJDBCInfo(info));
        }
    }
}
