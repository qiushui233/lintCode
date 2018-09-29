package JavaBase;

/**
 * 线程创建的方法一
 */
public class Thread_2nd {
    public static void main(String[] args) {
        Programmer pro = new Programmer();

        Thread th = new Thread(pro);

        th.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("狗输出 " + i);
        }
    }
}

class Programmer implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("猫输出 " + i);
        }
    }
}

