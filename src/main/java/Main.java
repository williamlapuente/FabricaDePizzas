public class Main {
    public static void main(String[] args) {




        //Criando uma fabrica de Pizza de Queijo
        PizzaFactory2 pizzaQueijo = new QueijoPizzafactory();
        LojaPizza queijoPizzaLoja = new LojaPizza(pizzaQueijo);
        System.out.println("Cliente 1 pede uma pizza de queijo: ");

        // criando uma fabrica de pizzas
        PizzaFactory2 pizzaCoracao = new CoracaoPizzaFactory();
        LojaPizza coracaoPizza = new LojaPizza(pizzaCoracao);
        System.out.println("Cliente 2 pede uma pizza de Coração: ");




    }
}
