/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityb_groupi;

import java.util.Collection;

/**
 *
 * @author alexj
 */
public class WriteInterface {
    
    private Collection <SensorNetwork> networks;
    private Collection <SensorStation> station;
    private Sensor sensor;
    
    public WriteInterface(){
        
    }
    
    public Collection<SensorStation> getStations(){
        return station;
    }
    
    public void setStations(Collection<SensorStation> station){
        
    }
    
    public void addSensor(Sensor sensor){
        
    }
    
    public Sensor createSensor(double longitude, double latitude, DateTime interval, Boolean status, String type){
        
    }
    
    public void addSensor(SensorStation station){
        
    }
    
    public void createSensorNetwork(String type){
        
    }
    
    public void removeSensorNetwork(SensorNetwork sensorNetwork){
        
    }
    
    public void editSensor(Boolean status){
        
    }
    
}
