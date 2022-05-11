package homework1;

import org.junit.jupiter.api.Test;

public class TrainsAndCars {
    @Test
    public void TrainsAndCars() {


        double km100 = 100;
        double liters1 = 0.5;
        double consPer100 = km100 * liters1;
        System.out.println(consPer100);
        System.out.println("Расход топлива на 100 км для грузовика: " + consPer100 + " литров");

        double km1000 = 1000;
        double liters2 = 0.5;
        double consPer1000 = km1000 * liters2;
        System.out.println(consPer1000);
        System.out.println("Расход топлива на 1000 км для грузовика: " + consPer1000 + " литров");


        double costPerKm = 0.9;
        double distance = 1000;
        double pricePer24 = costPerKm * distance;
        System.out.println(pricePer24);
        System.out.println("Стоимость транспортировки 24 тонн груза на грузовике: " + pricePer24 + " EUR");

        double totalCost = 900;
        double totalWeight = 24;
        double pricePer1ton = totalCost / totalWeight;
        System.out.println(pricePer1ton);
        System.out.println("Стоимость транспортировки 1 тонны груза на грузовике: " + pricePer1ton + " EUR");


        double km100Train = 100;
        double litresTrain = 10;
        double consPer100Train = km100Train * litresTrain;
        System.out.println(consPer100Train);
        System.out.println("Расход топлива на 100 км для поезда: " + consPer100Train + " литров");

        double km1000Train = 1000;
        double litres2Train = 10;
        double costPer1000Train = km1000Train * litres2Train;
        System.out.println(costPer1000Train);
        System.out.println("Расход топлива на 1000 км для поезда: " + costPer1000Train + " литров");

        double costPerKmTrain = 0.9;
        double distanceTrain = 10000;
        double pricePer500 = costPerKmTrain * distanceTrain;
        System.out.println(pricePer500);
        System.out.println("Стоимость транспортировки 500 тонн груза на поезде: " + pricePer500 + " EUR");

        double totalCostTrain = 9000;
        double totalWeightTrain = 500;
        double pricePer1TonTrain = totalCostTrain / totalWeightTrain;
        System.out.println(pricePer1TonTrain);
        System.out.println("Стоимость транспортировки 1 тонны груза на поезде: " + pricePer1TonTrain + " EUR");

    }

    @Test
    public void trains() {

        Trains train1 = new Trains();
        train1.setTypeOfVehicle("train1");
        train1.setColorOfVehicle("blue");
        train1.setNumber(1);
        train1.setModelOfVehicle("LUX");


        Trains train2 = new Trains();
        train2.setTypeOfVehicle("train2");
        train2.setColorOfVehicle("green");
        train2.setNumber(2);
        train2.setModelOfVehicle("GOOD");

        System.out.println(train1.getTypeOfVehicle() + " " + train1.getModelOfVehicle());
        System.out.println(train2.getTypeOfVehicle() + " " + train2.getModelOfVehicle());

    }

    @Test
    public void cars() {

        Cars car1 = new Cars();
        car1.setTypeOfVehicle("car1");
        car1.setColorOfVehicle("white");
        car1.setNumber(1);
        car1.setModelOfVehicle("Scania");

        Cars car2 = new Cars();
        car2.setTypeOfVehicle("car2");
        car2.setColorOfVehicle("black");
        car2.setNumber(2);
        car2.setModelOfVehicle("Volvo");

        Cars car3 = new Cars();
        car3.setTypeOfVehicle("car3");
        car3.setColorOfVehicle("grey");
        car3.setNumber(3);
        car3.setModelOfVehicle("Iveco");

        System.out.println(car1.getTypeOfVehicle() + " " + car1.getModelOfVehicle());
        System.out.println(car2.getTypeOfVehicle() + " " + car2.getModelOfVehicle());
        System.out.println(car3.getTypeOfVehicle() + " " + car3.getModelOfVehicle());
    }
}
