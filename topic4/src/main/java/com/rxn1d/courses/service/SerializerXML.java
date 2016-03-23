package com.rxn1d.courses.service;

import com.rxn1d.courses.model.Car;
import com.rxn1d.courses.model.CarParking;

/**
 * Created by Администратор on 07.03.2016.
 */
public class SerializerXML implements CarParkingSerializer {
    @Override
    public String serialize(CarParking carParking) {
        StringBuilder xml = new StringBuilder();
        
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<carParking>\n"); +
        xml.append("   <address>").append(carParking.getAddress()).append("</address>\n");
        xml.append("   <parkingName>").append(carParking.getParkingName()).append("</parkingName>\n");
        
        xml.append("   <cars>\n");
            for (Car car : carParking.getCars()) {
            xml.append("   <car>\n");
            xml.append("      <manufacturer>").append(car.getManufacturer()).append("</manufacturer>\n");
            xml.append("      <modelName>").append(car.getModelName()).append("</modelName>\n");
            xml.append("      <vin>").append(car.getVin()).append("</vin>\n");
            xml.append("      <lengthMillimeters>").append(car.getLengthMillimeters()).append("</lengthMillimeters>\n");
            xml.append("      <heightMillimeters>").append(car.getHeightMillimeters()).append("</heightMillimeters>\n");
            xml.append("   </car>\n");
        }
        xml.append("   </cars>\n");
        xml.append("</carParking>");
        return xml.toString();
    }
}
