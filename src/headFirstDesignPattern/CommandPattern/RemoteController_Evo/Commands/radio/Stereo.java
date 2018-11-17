package headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.radio;

public class Stereo {
    private int vol;
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void off(){
        System.out.println(name + "스트레오 오디오가 종료됩니다");
    }


    public void on() {
        System.out.println(name + "스트레오 오디오가 켜집니다.");
    }

    public void setCd() {
        System.out.println(name + "Cd가 설정됩니다.");
    }

    public void setVol(int i) {
        this.vol =i;
        System.out.println(name + "오디오 소리가 " +i +"//로 설정됐습니다. ");
    }

    public void setDvd(){
        System.out.println(name + "DVD를 설정합니다.");
    }

}
