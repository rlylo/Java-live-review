package week07.custom_classes;

public class Recipe {
    public String name;
    public String ingredients;
    public int servingSize;
    public double cost;

    //instance methods
    public double costPerPerson() {
        return cost / servingSize;
    }

    public String toString() {
        return "Recipe for " + name + " will require these ingredients:\n" +
                "\t\t\t\t" + ingredients + "\n" +
                "This dish will serve " + servingSize + " people and cost of a total of $" + cost;
    }
}
