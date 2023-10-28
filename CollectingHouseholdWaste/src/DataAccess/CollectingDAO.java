/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Common.Library;
import Model.Station;
import Model.Truck;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class CollectingDAO {
    Library l = new Library();
    private static CollectingDAO instance = null;
    public static CollectingDAO Instance() {
        if (instance == null)
            synchronized (CollectingDAO.class) {
                if (instance == null)
                    instance = new CollectingDAO();
            }
        return instance;        
    }
    public void getAddInput(ArrayList<Station> garbageStations) {
        garbageStations.add(new Station(1, 1765));
        garbageStations.add(new Station(2, 2808));
        garbageStations.add(new Station(3, 952));
        garbageStations.add(new Station(4, 4206));
        garbageStations.add(new Station(5, 3102));
        garbageStations.add(new Station(6, 3902));
        garbageStations.add(new Station(7, 1292));
        garbageStations.add(new Station(8, 3985));
        garbageStations.add(new Station(9, 8324));
        garbageStations.add(new Station(10, 1928));
        garbageStations.add(new Station(11, 4426));
        garbageStations.add(new Station(12, 397));
        garbageStations.add(new Station(13, 3277));
    }
    public void getInput(Truck g) {
        getAddInput(g.getGarbageStations());
        System.out.println("Added successfully");
    }
    public void printTheCost(Truck g) {
        System.out.println(g);
    }


}
