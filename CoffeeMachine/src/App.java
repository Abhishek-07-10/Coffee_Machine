import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ingredients {
    static int milk = Integer.MAX_VALUE;
    static int water = Integer.MAX_VALUE;
    static int beans = Integer.MAX_VALUE;
}

class IngredientsUsed {
    String name;
    int price;
    int milk = 0;
    int water = 0;
    int beans = 0;

    public IngredientsUsed(int milk, int water, int beans, String name, int price) {
        this.milk = milk;
        this.water = water;
        this.beans = beans;
        this.name = name;
        this.price = price;
    }
}

class CoffeeMaking {
    String coffeeName;
    static HashMap<LocalDateTime, IngredientsUsed> history = new HashMap<>();

    CoffeeMaking(String name) {
        this.coffeeName = name;
    }

    public void makecoffee() {
        if (coffeeName.equals("Espresso")) {
            Ingredients.water -= 250;
            Ingredients.beans -= 16;
            App.price += 4;
            IngredientsUsed use = new IngredientsUsed(0, 250, 16, "Espresso", 4);
            history.put(LocalDateTime.now(), use);

        } else if (coffeeName.equals("Latte")) {
            Ingredients.water -= 350;
            Ingredients.milk -= 75;
            Ingredients.beans -= 20;
            App.price += 7;
            IngredientsUsed use = new IngredientsUsed(75, 350, 20, "Latte", 7);
            history.put(LocalDateTime.now(), use);

        } else if (coffeeName.equals("Cappuccino")) {
            Ingredients.water -= 200;
            Ingredients.milk -= 100;
            Ingredients.beans -= 12;
            App.price += 6;
            IngredientsUsed use = new IngredientsUsed(100, 200, 12, "Cappuccino", 6);
            history.put(LocalDateTime.now(), use);

        }
    }

    void printHistory() {
        System.out.printf("%-28s %8s %8s %8s %8s %8s%n","Date Time", "Name", "Milk", "Water", "Beans", "Price");
        
        for (Map.Entry<LocalDateTime, IngredientsUsed> itr : history.entrySet()) {
            System.out.printf("%-10s %8s %8s %8s %8s %8s%n", itr.getKey(), (itr.getValue().name),
                    (itr.getValue().milk + "ml"), (itr.getValue().water + "ml"), (itr.getValue().beans + "cup"),
                    (itr.getValue().price + "Rs"));
        }
    }
}

public class App {
    static int price = 0;
    public static void main(String[] args) throws Exception {
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Coffe Available :\nCappuccino\nLatte\nEspresso\n");
            while (true) {
                System.out.println("Enter the coffee type you want");
                String coffee = sc.next();

                System.out.println("\n1.To Buy\n2.To cancel\n");
                int num = sc.nextInt();
                CoffeeMaking t = new CoffeeMaking(coffee);

                if (num == 1) {
                    System.out.println("Making Coffee please wait...");
                    t.makecoffee();
                    System.out.println("Thanks for using please collect your coffee...\n");
                } else if (num == 2) {
                    continue;
                } else {
                    int pin = 1234;
                    System.out.println("Enter admin pin");
                    int inputPin = sc.nextInt();
                    if (inputPin == pin) {
                        System.out.println("1.To print history\n2.To collect money\n3.To close simulation");
                        int further = sc.nextInt();
                        if (further == 1) {
                            t.printHistory();
                        } else if (further == 2) {
                            System.out.println(price);
                            price = 0;
                        } else if (further == 3) {
                            System.out.println("Closing simulation");
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Enter correct pin");

                    }
                }
            }
        }
    }
}
