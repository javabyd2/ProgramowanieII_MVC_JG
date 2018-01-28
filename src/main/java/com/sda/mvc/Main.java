package com.sda.mvc;

import com.sda.mvc.controler.GiantControler;
import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Norishment;
import com.sda.mvc.view.GiantView;

public class Main {

    public static void main(String[] args) {

        GiantModel giant1 = new GiantModel(Health.HEALTHY,Norishment.HUNGRY,Fatigue.YES );

        GiantView view = new GiantView();
        GiantControler controler = new GiantControler(giant1, view);

       controler.updateView();

       controler.setHealt(Health.DEAD);
       controler.updateView();


       GiantModel giant2 = new GiantModel(Health.DEAD, Norishment.NOTHUNGRY, Fatigue.NO);
       GiantView view1 = new GiantView();
       GiantControler controler1 =new GiantControler(giant2, view1);
       controler.updateView();
    }

}
