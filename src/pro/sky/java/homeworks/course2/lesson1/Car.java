package pro.sky.java.homeworks.course2.lesson1;

public class Car extends TransportWithEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Автомомбиль " + getModelName() + ". Количесво колёс: " + getWheelsCount();
    }
}
