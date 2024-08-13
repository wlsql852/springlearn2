package ioc.directBinding.v2;

public class Car {
    String model;
    private GasEngine gasEngine;
    private  ElectricEngine electricEngine;

    public Car(String model) {
        this.model = model;
        if(model.equals("gas")) {
            gasEngine = new GasEngine();
        }else {
            electricEngine = new ElectricEngine();
        }
    }

    public void drive() {
        if(model.equals("gas")) {
            this.gasEngine.run();
        }else {
            this.electricEngine.run();
        }
    }
}
