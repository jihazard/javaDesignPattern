package chapter7_statePattern.Ligth;

public class Ligth {
    private static int ON = 0; //형광등이 켜진 상태
    private static int OFF = 1; //형광등이 꺼진 상태
    private static int SLEEPING =  2 ;
    private int state; //형광등 상태

    public Ligth() {
        state = OFF;
    }

    public void on_button_pushed() {
        if (state == ON) {
            System.out.println("취침등 상태");
            state = SLEEPING;
        }else if(state == SLEEPING){
            System.out.println("라이트 온!");
            state = ON;
        }
        else {
            System.out.println("라이트 온!");
            state = ON;
        }
    }

    public void off_button_pushed() {
        if (state == OFF) {
            System.out.println("반응 없음");
        }else if(state == SLEEPING) {
            System.out.println("라이트 오프");
            state = OFF;
        }
        else {
            System.out.println(" 라이트 오프");
            state = OFF;
        }
    }
}

