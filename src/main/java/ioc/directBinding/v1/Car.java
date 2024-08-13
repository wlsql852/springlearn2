package ioc.directBinding.v1;

public class Car {
    private GasEngine engine;

    public Car() {
        this.engine = new GasEngine();
    }

    public void drive() {this.engine.run();}
}
