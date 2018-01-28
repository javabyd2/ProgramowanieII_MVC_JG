package com.sda.mvc.view;

import com.sda.mvc.model.GiantModel;

public class GiantView {

    public GiantView() {
    }

    public void dispalayGiant(GiantModel giantModel) {
       System.out.print(giantModel.toString());
    }
}
