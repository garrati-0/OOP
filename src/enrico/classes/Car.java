package enrico.classes;

public class Car {
    public boolean isOn;        //attributi dove public indica la visibilità di questi
    public String brand;
    public String color;

    public String getColor() {    //metodi
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "This is a car!";
    }
}
