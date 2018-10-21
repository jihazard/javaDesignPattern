package chapter7_statePattern.Light_result;

import chapter7_statePattern.Ligth.Ligth;

public class Client {
    public static void main(String[] args) {
        Ligth ligth = new Ligth();
        ligth.off_button_pushed();
        ligth.on_button_pushed();
        ligth.off_button_pushed();
    }
}
