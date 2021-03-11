package enrico.prove;

public class Bicicletta {
    int cadence = 0;    //campo
    int speed = 0;      //campo
    int gear = 1;       //campo

    void changeCadence(int newValue) {     //metodo
        cadence = newValue;
    }

    void changeGear(int newValue) {       //metodo
        gear = newValue;
    }

    void speedUp(int increment) {         //metodo
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {     //metodo
        speed = speed - decrement;
    }

    void printStates() {                   //metodo
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
