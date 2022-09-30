package interfaceTest;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);

        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("手机开始");
            }

            @Override
            public void stop() {
                System.out.println("手机结束");
            }
        });
    }
}
interface USB {


    void start();
    void stop();
}


class Computer {
    public void transferData(USB usb) {
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();

    }
}
class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}