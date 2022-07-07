import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        linkedlist for java
        LinkedList<String> cars = new LinkedList<>();
//        use add() method to add items
        cars.add("BMW");
        cars.add("Proton");
        cars.add("Perodua");
        cars.add("Toyota");
        cars.add("Honda");
//        System.out.println("The whole linked list: " + cars);

//        use addFirst() to add items at the beginning of the list
        cars.addFirst("Mercedes");
        cars.addFirst("Ford");
        System.out.println(cars);
    }
}
