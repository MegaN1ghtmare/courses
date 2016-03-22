package com.rxn1d.courses.service;


import com.rxn1d.courses.model.Car;
import com.rxn1d.courses.model.CarParking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 06.03.2016.
 */
public class DeserializerJSON implements CarParkingDeserializer {
    @Override
    public CarParking deserialize(String serializedCarParking) {
        CarParking carParking = new CarParking();
        String regex = "\\s*(\"|:|,|\\{|\\}|\\[|\\])\\s*";
        String[] json = serializedCarParking.split(regex);
        List<String> jsonList = new ArrayList<>();
        for(String s : json){
            if(!s.equals("")){
                jsonList.add(s);
            }
        }
        List<Car> carsList = new ArrayList<>();
        int index = 0;
        for(String s : jsonList){
            if(s.equals("address")){
                carParking.setAddress(jsonList.get(index + 1));
            }
            if(s.equals("parkingName")){
                carParking.setParkingName(jsonList.get(index + 1));
            }
            if(s.equals("manufacturer")){
                Car car = new Car(jsonList.get(index+1),jsonList.get(index+3),jsonList.get(index+5),
                        Integer.valueOf(jsonList.get(index+7)),(Integer.valueOf(jsonList.get(index+9))));
                carsList.add(car);
            }
            index++;
        }
        carParking.setCars(carsList.toArray(new Car[carsList.size()]));
        return carParking;
    }
}