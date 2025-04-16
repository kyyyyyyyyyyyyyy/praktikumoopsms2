package praktikum2;

public class Circle {
    double radius;

    Circle () {
        radius = 7.0;
    }

    double area() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle lingkaran = new Circle();

        System.out.println("Luas lingkran dengan radius default = " + lingkaran.area());
        lingkaran.radius = 3.0;
        System.out.println("Luas lingkran dengan radius default = " + lingkaran.area());
    }
}

