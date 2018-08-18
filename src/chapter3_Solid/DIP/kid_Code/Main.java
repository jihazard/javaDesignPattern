package chapter3_Solid.DIP.kid_Code;

import chapter3_Solid.DIP.kid_Code.domain.Lego;
import chapter3_Solid.DIP.kid_Code.domain.Robot;
import chapter3_Solid.DIP.kid_Code.domain.Toy;

public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid();
        Toy toy = new Robot();

        kid.setToy(toy);
        kid.play();
        
        kid.setToy(new Lego());
        kid.play();
    }
}
