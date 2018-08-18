package chapter3_Solid.autoplayMp3.result_Code.domain;

import chapter3_Solid.autoplayMp3.result_Code.domain.TimeProvider;

import java.util.Calendar;

public class ReamTimeProvider implements TimeProvider {
    private Calendar cal;

    public ReamTimeProvider() {
        this.cal = Calendar.getInstance();    }

    @Override
    public void setHours(int hours) {

    }

    @Override
    public int getTime() {
        return 0;
    }
}
