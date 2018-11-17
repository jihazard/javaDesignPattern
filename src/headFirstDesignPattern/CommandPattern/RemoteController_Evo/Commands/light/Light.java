package headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.light;

public class Light {
    private String name ;
    public Light(String name) {
        this.name= name;
    }

    public void on() {
        System.out.println(name +"전등에 불이 켜집니다.");
    }
    public void off() {
        System.out.println(name + "전등에 불이 꺼집니다.");
    }
}
