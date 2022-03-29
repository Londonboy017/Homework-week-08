package hwweek08.carpet_cost_calculator;

public class Calculator {
    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;

    }

    public double getTotalCost() {

        return this.floor.getArea() * this.carpet.getCost();
    }
}
