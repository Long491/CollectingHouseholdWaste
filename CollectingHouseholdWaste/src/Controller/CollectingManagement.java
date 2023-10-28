/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Truck;
import Resipority.CollectingRepository;
import Resipority.ICollectingRepository;
import View.Menu;

/**
 *
 * @author Asus
 */
public class CollectingManagement extends Menu<String>{
    private ICollectingRepository garbageRepository;
    static String[] options = {"Input", "Print", "Exit"};
    Truck t;
    public CollectingManagement() {
        super("COLLECTING GARBAGE MANAGEMENT", options);
        garbageRepository = new CollectingRepository();
        t = new Truck();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> garbageRepository.getInput(t);
            case 2 -> garbageRepository.printTheCost(t);
            case 3 -> System.exit(0);
        }
    }
  
}
