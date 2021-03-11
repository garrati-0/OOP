package enrico.prove;

public class BiciclettaDemo {
    public static void main(String[] args) {
        // Create two different
        // Bicycle objects
        Bicicletta bike1 = new Bicicletta();
        Bicicletta bike2 = new Bicicletta();

        //esempio di ereditarità
        BiciElettrica bike3 = new BiciElettrica();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

        //esempio di ereditarietà
        bike3.printsucces();
        bike3.changeCadence(24);
        bike3.printStates();
    }
}
