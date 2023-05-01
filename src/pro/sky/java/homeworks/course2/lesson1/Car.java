package pro.sky.java.homeworks.course2.lesson1;

public class Car extends TransportWithEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
