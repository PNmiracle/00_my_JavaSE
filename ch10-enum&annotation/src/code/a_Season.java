package code;

public class a_Season {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println("autumn = " + autumn);
    }

}

class Season {
    //声明Season对象的属性 private final;
    private final String seasonName;
    private final String seasonDesc;
    //2.私有化构造器, 给对象属性赋值
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.提供当前枚举类的多实例对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","春暖花开");
    public static final Season AUTUMN = new Season("秋天","春暖花开");
    public static final Season WITTER = new Season("冬天","春暖花开");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
