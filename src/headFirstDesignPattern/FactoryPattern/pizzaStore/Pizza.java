package headFirstDesignPattern.FactoryPattern.pizzaStore;

import java.util.ArrayList;

public abstract  class Pizza {

    String name;
    String dough;
    String souce;

    ArrayList<String> toppings  = new ArrayList();

    void prepare() {
        System.out.println("prepare  :" + name);
        System.out.println("tossing dough  :" + name);
        System.out.println("add source  :" + name);
        System.out.println("add topping  :" + name);

        for (String topping : toppings
             ) {
            System.out.println(" 토핑 추가 : " + topping);
        }
    }

    void bake(){
        System.out.println("bake 25 minu  :: " + name);
    }

    void cut(){
        System.out.println("cutting ");
    }

    void box(){
        System.out.println("boxing ::" );
    }

    public String getName() {
        return name;
    }


}
