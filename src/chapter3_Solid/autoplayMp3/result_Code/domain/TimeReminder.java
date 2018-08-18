package chapter3_Solid.autoplayMp3.result_Code.domain;

public class TimeReminder {
    TimeProvider tPro;
    MP3 m = new MP3();

    public void setTimeProvider(TimeProvider tPro){
        this.tPro = tPro;
    }
    public void reminder(){
        int hours = tPro.getTime();
        System.out.println("최종 호출시간 : " + hours);
        if(hours>= 22) m.playSong();
        else System.out.println("22시가 안됐음");
    }
}
