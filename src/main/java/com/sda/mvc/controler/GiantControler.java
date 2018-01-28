package com.sda.mvc.controler;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Norishment;
import com.sda.mvc.view.GiantView;

public class GiantControler {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantControler(GiantModel giantModel, GiantView giantView) {

        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth() {
        return giantModel.getHealth();
    }

    public void setHealt(Health healt) {
        this.giantModel.setHealth(healt);
    }

    public Fatigue getFatigue(Fatigue fatigue) {
       return this.giantModel.getFatigue();
    }

    public void setNorishment(Norishment norishment) {
        this.giantModel.setNorishment(norishment);
    }

    public void updateView(){
        this.giantView.dispalayGiant(giantModel);
    }
}
