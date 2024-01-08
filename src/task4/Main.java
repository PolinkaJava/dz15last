package task4;

public class Main {
    public static void main(String[] args) {

        Storage<Integer> storage1 = new Storage<>(10);
        Storage<String> storage2 = new Storage<>("Hello");


        System.out.println(storage1.getItem());
        System.out.println(storage2.getItem());

        storage1.setItem(20);
        storage2.setItem("World");

        System.out.println(storage1.getItem());
        System.out.println(storage2.getItem());
    }
}
