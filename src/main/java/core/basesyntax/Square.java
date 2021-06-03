package core.basesyntax;

public class Square extends Figure implements Drow {
    private double side;

    public Square(String color, double side) { //RED, 3
        super(color);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public String getInfo() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor();
    }
}
