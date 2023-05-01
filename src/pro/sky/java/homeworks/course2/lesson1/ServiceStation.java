package pro.sky.java.homeworks.course2.lesson1;

public class ServiceStation {
    public void check(Serviceable serviceable){
        serviceable.service();
    }
    public void  checkAll(Serviceable[] serviceables) {
        for (Serviceable serviceable : serviceables) {
            System.out.println("Обслуживаем "+serviceable.toString());
            serviceable.service();
        }
    }
}
