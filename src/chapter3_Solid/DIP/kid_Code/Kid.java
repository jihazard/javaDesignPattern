package chapter3_Solid.DIP.kid_Code;

import chapter3_Solid.DIP.kid_Code.domain.Toy;

public class Kid {
    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public void play(){
        System.out.println(toy.toString());
    }
}

