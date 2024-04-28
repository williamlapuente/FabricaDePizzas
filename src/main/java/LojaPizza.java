public class LojaPizza {
    public PizzaFactory2 factory;

    public LojaPizza(PizzaFactory2 pizzaFactory2) {
        this.factory = factory;
    }

    public Pizza pedidoPizza() {
        Pizza pizza = factory.createPizza();
        pizza.prepararando();
        pizza.assando();
        pizza.cortando();
        pizza.embalando();

        return pizza;
    }
}
