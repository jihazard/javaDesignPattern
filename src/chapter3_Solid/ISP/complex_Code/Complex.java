package chapter3_Solid.ISP.complex_Code;

public class Complex implements Copy,Fax,Printer {


    @Override
    public void copy() {
        System.out.println("카피가 완료되었습니다.");
    }

    @Override
    public void fax() {
        System.out.println("팩스가 발송되었습니다.");
    }

    @Override
    public void print() {
        System.out.println("프린트가 완료되었습니다.");
    }
}
