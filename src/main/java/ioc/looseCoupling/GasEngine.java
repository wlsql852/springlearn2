package ioc.looseCoupling;

public class GasEngine implements Engine{

    //엔진 동작
    @Override
    public void run() {
        System.out.println("가솔린 엔진이 동작합니다.");
    }
}
