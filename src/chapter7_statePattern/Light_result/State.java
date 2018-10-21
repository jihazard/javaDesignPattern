package chapter7_statePattern.Light_result;

public interface State {
    public void on_button_pushed(Light light);
    public void off_button_pushed(Light light);
}
