package code1.i_生产者消费者;



/**
 * @Author mapKey
 * @Date 2022-10-01-2:52 PM
 */
class Clerk {
    public int number;
}

class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Clerk.class) {
                clerk.number++;
                System.out.println("生产者生产一件产品, 目前clerk处还剩件数:" + clerk.number);
                // 生产了一件后, number必然 > 0, 可以唤醒消费者
                Clerk.class.notify();
                if (clerk.number == 20) {
                    try {
                        Clerk.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

class Customer implements Runnable {
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Clerk.class) {
                clerk.number--;
                System.out.println("消费者消费一件产品, 目前clerk处还剩件数:" + clerk.number);
                // 消费了一件后, number必然 < 20, 可以唤醒生产者

                Clerk.class.notify();
                if (clerk.number == 0) {
                    try {
                        Clerk.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

public class i_生产者消费者问题 {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Customer customer = new Customer(clerk);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);
        t1.setName("生产者:");
        t2.setName("消费者:");
        t1.start();
        t2.start();
    }
}
