class Car {
    // Fields
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Object methods
    public void brake() {
        System.out.println("Braked!");
    }

    public void accelerate() {
        System.out.println("Sped Up!");
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    // Setter method
    public void setColor(String newColor) {
        color = newColor;
    }

    // to String!
    public String toString() {
        return "This car is " + color;
    }
}


// Car car = new Car();
// car.brake();
// car.accelerate();
// car.setColor("red");