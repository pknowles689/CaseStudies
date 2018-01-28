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
public class ReadInterface {
    private Collection <SensorNetwork> networks;
    private Collection <SensorStation> stations;
    
    public ReadInterface(){
        
    }
    
    public Collection<SensorNetwork> getSensorNetworks(){
           return networks;
    }
    
    public Collection<Reading> getSensorReadings(SensorNetwork sensorNetwork){
        
    }
    
    public Collection<SensorStation> getSensorStation(){
        return stations;
    }
    
    public Collection<Reading> getCurrentSensorReadings(SensorNetwork sensorNetwork, DateTime now){
        
    }
    
}
