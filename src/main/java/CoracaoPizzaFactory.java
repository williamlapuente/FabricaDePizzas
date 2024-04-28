public class CoracaoPizzaFactory implements PizzaFactory2 {

    public Pizza createPizza(){
        return new PizzaCoracao();
    }
}
