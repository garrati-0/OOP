package it.enrico.classes;

public class Car {
    public boolean isOn;        //attributi dove public indica la visibilità di questi
    public String brand;
    public String color;

   /*
   public Car(boolean isOn,String brand,String color){
       this.isOn=isOn;
       this.brand=brand;
       this.color=color;
   }
*/
    public String getColor() {    //metodi
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn(){
       //...
    }
    public void turnOff(){
       //...
    }

    public String toString() {
        return "This is a car!";
    }

}
