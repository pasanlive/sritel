package com.sritel.service.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maleen Chethiya
 */
public class VasList {

    private List<Vas> vasList;

    public VasList() {
        List<Vas> myVasList = new ArrayList<Vas>();
        Vas v = new Vas();
        myVasList.add(v);
        myVasList.add(v);
        this.vasList = myVasList;
    }

    public List<Vas> getVasList() {
        return vasList;
    }

    public void setVasList(List<Vas> vasList) {
        this.vasList = vasList;
    }
}
