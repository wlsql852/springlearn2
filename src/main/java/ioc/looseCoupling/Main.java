package ioc.looseCoupling;


public class Main {
    public static void main(String[] args) {
        //프로그램 시작점

        //1.객체의 생성을 외부로 위임
        GasEngine gasEngine = new GasEngine();
        Car car = new Car(gasEngine);
        //자동차 주행
        car.drive();

        ElectricEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.drive();

    }
}
