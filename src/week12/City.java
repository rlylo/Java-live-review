package week12;

public class City {

    private String name;
    private double growthRate;
    private int population;
    private String state;

    public City(String name, double growthRate, int population, String state) {
        setName(name);
        setGrowthRate(growthRate);
        setPopulation(population);
        setState(state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", growthRate=" + growthRate +
                ", population=" + population +
                ", state='" + state + '\'' +
                '}';
    }
}
