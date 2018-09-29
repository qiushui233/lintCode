package JavaBase;

/**
 * 线程创建的方法一
 */
public class Thread_1st {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.start();
        dog.start();
    }
}

class Cat extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Cat "+ i);
        }


    }
}

class Dog extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Dog "+ i);
        }


    }
}