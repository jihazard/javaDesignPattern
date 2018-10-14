package chapter6_printManager_SingleTon.basicCode;

public class Printer {
    private static Printer printer = null;
    private Printer(){}

    public static Printer getPrinter(){
        if(printer == null){
            printer = new Printer(); // 인스턴스 메소드
        }
        return printer;
    }

    public void print(String str){
        System.out.println("프린트 내용 : " + str);
    }
}
