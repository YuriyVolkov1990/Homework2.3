package pro.sky.java.homeworks.course2.lesson1;

public class Truck extends TransportWithEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
