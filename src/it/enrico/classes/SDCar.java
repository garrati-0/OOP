package it.enrico.classes;

public class SDCar extends Car{
    boolean isSelfDriving;

    @Override
    public void turnOn() { //esempio di ovverride ho preso un metodo esistente e ne
        turnSDoff();       //ridefinisco il corpo
        super.turnOn();//dopo che abbiamo spento la guida autonoma fa quello
    }                  //che turnOn dovrebbe fare quindi richiama il metodo originale

    @Override
    public void turnOff() {//esempio di ovverride
        turnSDoff();
        super.turnOff();
    }

    public void turnSDon(){
        //...
    }
    public void turnSDoff(){
        //...
    }
}
