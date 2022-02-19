package com.hepsiemlak.emlakoop;

import com.hepsiemlak.emlakoop.enums.EstateType;
import com.hepsiemlak.emlakoop.model.estate.Estate;
import com.hepsiemlak.emlakoop.model.estate.House;
import com.hepsiemlak.emlakoop.model.estate.Plot;
import com.hepsiemlak.emlakoop.model.estate.Workplace;

public class EstateFactory {

    public Estate createEstate(EstateType estateType) {
        return switch (estateType) {
            case PLOT -> new Plot();
            case HOUSE -> new House();
            case WORKPLACE -> new Workplace();
        };
    }
}
