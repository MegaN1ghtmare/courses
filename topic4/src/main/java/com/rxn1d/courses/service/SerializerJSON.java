package com.rxn1d.courses.service;

import com.rxn1d.courses.model.Car;
import com.rxn1d.courses.model.CarParking;

/**
 * Created by Администратор on 06.03.2016.
 */
public class SerializerJSON implements CarParkingSerializer {
    @Override
    public String serialize(CarParking carParking) {
        StringBuilder json = new StringBuilder();

        json.append("{\n");
        json.append("  \"address\": \"");
        json.append(carParking.getAddress());
        json.append("\",\n");

        json.append("  \"parkingName\": \"");
        json.append(carParking.getParkingName());
        json.append("\",\n");

        json.append("  \"cars\": [");
        for (Car car : carParking.getCars()) {
            json.append("\n    {\n");
            json.append("      \"manufacturer\": \"").append(car.getManufacturer()).append("\",\n");
            json.append("      \"modelName\": \"").append(car.getModelName()).append("\",\n");
            json.append("      \"vin\": \"").append(car.getVin()).append("\",\n");
            json.append("      \"lengthMillimeters\": ").append(car.getLengthMillimeters()).append(",\n");
            json.append("      \"heightMillimeters\": ").append(car.getHeightMillimeters()).append("\n    },");
        }
        json.deleteCharAt(json.length() - 1);
        json.append("\n  ]\n}");
        return json.toString();
    }
}