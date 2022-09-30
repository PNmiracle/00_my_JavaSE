package service;
/**
 * @Author mapKey
 * @Date 7/10/2022 5:00 PM
 * @Description 表示员工的状态
 * @Since version-1.0
 */
//public class Status {
//   private final String NAME;
//   public static final Status FREE = new Status("FREE");
//   public static final Status BUSY = new Status("BUSY");
//   public static final Status VOCATION = new Status("VACATION");
//   //private Status() {
//   //
//   //}
//    private Status(String name) {
//        this.NAME = name;
//    }
//
//    public String getNAME() {
//        return NAME;
//    }
//    public String toString() {
//        return NAME;
//    }
//}
public enum Status {
    FREE,BUSY,VOCATION;
}