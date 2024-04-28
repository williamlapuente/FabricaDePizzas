public class QueijoPizzafactory implements PizzaFactory2 {

    public Pizza createPizza(){
        return new PizzaDeQueijo();
    }
}
