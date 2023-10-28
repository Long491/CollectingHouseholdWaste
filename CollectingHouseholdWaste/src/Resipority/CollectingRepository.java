/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resipority;

import DataAccess.CollectingDAO;
import Model.Truck;

/**
 *
 * @author Asus
 */
public class CollectingRepository implements ICollectingRepository{

    @Override
    public void getInput(Truck g) {
        CollectingDAO.Instance().getInput(g);
    }

    @Override
    public void printTheCost(Truck g) {
        CollectingDAO.Instance().printTheCost(g);
    }
    
}
