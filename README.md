# Coffee Machine
# About project

This project is a simulation of a coffee making machine. It uses the 
Ingredients
 and 
IngredientsUsed
 classes to track the ingredients and the price of the coffee. The 
CoffeeMaking
 class is used to make the coffee and track the history of the coffee. The 
App
 class is used to run the simulation and print out the history and the price of the coffee.

To use the simulation, enter the type of coffee you want to make (Cappuccino, Latte, or Espresso). Then enter 1 to buy the coffee, or 2 to cancel. If you enter a number other than 1 or 2, you will be asked for an admin pin. Entering the correct admin pin will allow you to print the history of the coffee, collect money, or close the simulation.
: An integer variable that holds the user's input for further admin actions.
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
# Classes
## IngredientsUsed class
The IngredientsUsed class is used to store information about ingredients used in a recipe. It stores the number of each ingredient used, the name of the recipe, and the price.

### Constructor
The constructor takes five parameters:

- `milk`
The number of milliliters of milk used.
- `water`
The number of milliliters of water used.
- `beans`
The number of cup of beans used.
- `name`
The name of the coffee.
- `price`
The price of the recipe.
## CoffeeMaking Class
The 
CoffeeMaking
 class is used to make coffee and store the ingredients used for each coffee in a 
HashMap
.

### Constructor
The constructor takes one argument, 
name
 which is the name of the coffee to be made.

### makeCoffee Method
This method is used to make coffee and deduct the required ingredients from the 
Ingredients
 class. It also adds the price of the coffee to the 
App
 class.

### printHistory Method
This method is used to print the history of coffee made and the ingredients used for each coffee. It prints the date and time, coffee name, milk, water, beans and price used for each coffee in the 
HashMap
 to the console.

## Driver class
This app allows the user to purchase different types of coffee.
App
: The main class. Contains the 
main()
 method, which runs the program.

### Variables
- `price`
: A static variable that holds the total amount of money collected.
- `coffee`
: A string variable that holds the type of coffee to be made.
- `pin`
: An integer variable that holds the admin pin.
- `inputPin`
: An integer variable that holds the user's input for the admin pin.
- `num`
: An integer variable that holds the user's input for buying or canceling.
- `further` :An integer variable that holds the user's input for further admin actions.


