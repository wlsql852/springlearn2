package ioc.looseCoupling;

public class ElectricEngine implements Engine{
    //엔진 동작
    @Override
    public void run() {
        System.out.println("looseCoupling : 전기 엔진이 동작합니다.");
    }
}
