package com.rxn1d.courses.service;

import com.rxn1d.courses.model.Car;
import com.rxn1d.courses.model.CarParking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 06.03.2016.
 */
public class DeserializerXML implements CarParkingDeserializer {
    @Override
    public CarParking deserialize(String serializedCarParking) {
        String regex = "\\s*(<|>|\n)\\s*";
        String[] xml = serializedCarParking.split(regex);
        List<Car> cars = new ArrayList<>();
        CarParking carParking = new CarParking();
        for (int i = 0; i < xml.length; i++) {
            if (xml[i].equals("address")) {
                carParking.setAddress(xml[i + 1]);
            }
            if (xml[i].equals("parkingName")) {
                carParking.setParkingName(xml[i + 1]);
            }
            if (xml[i].equals("manufacturer")) {
                Car car = new Car(xml[i + 1], xml[i + 5], xml[i + 9], Integer.valueOf(xml[i + 13]),
                        Integer.valueOf(xml[i + 17]));
                cars.add(car);
            }
            carParking.setCars(cars.toArray(new Car[cars.size()]));
        }
        return carParking;
    }
}