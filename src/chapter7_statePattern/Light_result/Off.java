package chapter7_statePattern.Light_result;

public class Off implements State {
    private static Off off = new Off();
    public Off(){}

    public static Off getInstance() {
        return off;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println(" 라이트 온");
        light.setState(On.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println(" 반응 없음");
    }
}
