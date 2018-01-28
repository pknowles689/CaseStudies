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
public class SensorNetwork {
    
    private Collection<SensorStation> stations;
    
    public SensorNetwork(){
        
    }
    
    public void addSensorStation(SensorStation station){
        
    }
    
    public void removeSensorStation(SensorStation station){
        
    }
    
    public Collection<Reading> getReadings(){
        return readings;
    }
    
    public Collection<Reading> getCurrentReadings(DateTime now){
        return currentReadings;
    }
    
    
}
