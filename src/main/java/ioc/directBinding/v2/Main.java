package ioc.directBinding.v2;

public class Main {
    public static void main(String[] args) {
        //프로그램 시작점
        Car gasCar = new Car("gas");

        //자동차 주행
        gasCar.drive();

        Car electricCar = new Car("electric");

        //자동차 주행
        electricCar.drive();

        //수정이 많이 일어남


    }
}
