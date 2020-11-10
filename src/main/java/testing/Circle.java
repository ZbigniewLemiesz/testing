package testing;

import lombok.Getter;

@Getter
public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Invalid radius : " + radius);
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.sqrt(radius);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void updateRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }

    }
}
