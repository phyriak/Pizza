import java.util.*;

public class Pizzeria {

    private Integer sum = 0;


    public void choosePizza() {

        List<Pizza> listofpizza = new ArrayList<>();
        listofpizza.add(new Pizza("Margherita", 20));
        listofpizza.add(new Pizza("Vesuvio", 22));
        listofpizza.add(new Pizza("Siciliana", 24));


        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Witaj w Pizzeri. Wybierz Pizze \n" +
                    "0.Margherita\n" +
                    "1.Vesuvio\n" +
                    "2.Siciliana\n");


            int nextInt = scan.nextInt();

            if (nextInt > listofpizza.size())
                break;
            else {
                Pizza chosenPizza = listofpizza.get(nextInt);
                int price = chosenPizza.getPrice();
                sum += price;
                String selectedPizza = chosenPizza.getName();


                System.out.println("W koszyku: " + selectedPizza);


            }


            System.out.println("Całkowita suma: " + sum);
            System.out.println("");
        }

    }


}
