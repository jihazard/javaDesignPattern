package chapter3_Solid.autoplayMp3.result_Code.view;

import chapter3_Solid.autoplayMp3.result_Code.domain.FakeTimeProvider;
import chapter3_Solid.autoplayMp3.result_Code.domain.TimeProvider;
import chapter3_Solid.autoplayMp3.result_Code.domain.TimeReminder;

public class Main {
    public static void main(String[] args) {

        TimeReminder sut = new TimeReminder();
        TimeProvider pro ;
        pro = new FakeTimeProvider();
        pro.setHours(10);
        sut.setTimeProvider(pro);

        sut.reminder();
    }
}
