package pro.sky.java.homeworks.course2.lesson1;

public abstract class TransportWithEngine extends Transport {
    public TransportWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
