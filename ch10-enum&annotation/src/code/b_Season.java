package code;
interface info {
    void show();
}
enum b_Season implements info{
    SPRING("春天","春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里?");
        }
    },
    SUMMER("夏天","夏日炎炎") {
        @Override
        public void show() {
            System.out.println("夏天夏天夏天");
        }
    };

    //声明Season对象的属性 private final;
    private final String seasonName;
    private final String seasonDesc;
    //2.私有化构造器, 给对象属性赋值
    private b_Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

}


class SeasonTest {
    public static void main(String[] args) {
        b_Season summer = b_Season.SUMMER;
        System.out.println("summer = " + summer);

        System.out.println(b_Season.class.getSuperclass());

        b_Season[] values = b_Season.values();
        for (b_Season value : values) {
            System.out.println("value = " + value);
            value.show();
        }

        Thread.State[] values1 = Thread.State.values();
        for (Thread.State state : values1) {
            System.out.println("state = " + state);
        }

    }
}
