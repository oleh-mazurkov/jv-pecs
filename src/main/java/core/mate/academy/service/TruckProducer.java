package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck num1 = new Truck("Truck_TvU", "Magenta", 8, 140, "onboard");
        Truck num2 = new Truck("Truck-TDA", "Sean", 12, 180, "van");
        List<Truck> truckList = new ArrayList<>();
        truckList.add(num1);
        truckList.add(num2);
        return truckList;
    }
}