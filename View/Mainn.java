/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StringCounterController;
import Model.StringCounterModel;

/**
 *
 * @author PC
 */
public class Mainn {
    
    public static void main(String[] args) {
        StringCounterModel model = new StringCounterModel();
        StringCounterView view = new StringCounterView();
        StringCounterController controller = new StringCounterController(model, view);
        controller.run();
    }
}