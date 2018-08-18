package chapter3_Solid.autoplayMp3.result_Code.domain;

import chapter3_Solid.autoplayMp3.result_Code.domain.TimeProvider;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {

    private Calendar cal;


    public FakeTimeProvider() {
        cal = Calendar.getInstance();

    }

    public FakeTimeProvider(int hours) {
        this.cal = Calendar.getInstance();
        setHours(hours);
    }

    @Override
    public void setHours(int hours) {
        cal.set(Calendar.HOUR_OF_DAY, hours); //주어진 시간으로 시간 설정
        System.out.println("설정된 시간 : " + Calendar.HOUR_OF_DAY);
    }

    @Override
    public int getTime() {
        System.out.println("호출된 시간 : " + Calendar.HOUR_OF_DAY);
        return cal.get(Calendar.HOUR_OF_DAY);
    }
}
