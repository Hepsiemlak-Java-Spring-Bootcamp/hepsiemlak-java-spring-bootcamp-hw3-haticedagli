package com.hepsiemlak.client.model.estate;

import com.hepsiemlak.client.enums.EstateType;
import com.hepsiemlak.client.enums.ReleaseType;
import com.hepsiemlak.client.model.Address;
import com.hepsiemlak.client.model.Category;
import com.hepsiemlak.client.model.Image;
import com.hepsiemlak.client.model.Price;

import java.util.List;

public class Plot extends Estate {
    private Integer squareMeters;
    private Price squareMeterUnitPrice;
    private String relevantMunicipality;
    private Integer islandNumber;
    private Integer parcelNumber;
    private Integer kaks;
    private Integer gabari;

    public Plot() {
        this.estateType = EstateType.PLOT;
    }

    public Plot(
            Category category,
            Address address,
            boolean navigableByVideoCall,
            boolean availableForLoan,
            boolean swap,
            Price rentalIncome,
            ReleaseType releaseType,
            List<Image> images,
            Integer squareMeters,
            Price squareMeterUnitPrice,
            String relevantMunicipality,
            Integer islandNumber,
            Integer parcelNumber,
            Integer kaks,
            Integer gabari
    ) {
        super(EstateType.PLOT, category, address, navigableByVideoCall, availableForLoan, swap, rentalIncome, releaseType, images);
        this.squareMeters = squareMeters;
        this.squareMeterUnitPrice = squareMeterUnitPrice;
        this.relevantMunicipality = relevantMunicipality;
        this.islandNumber = islandNumber;
        this.parcelNumber = parcelNumber;
        this.kaks = kaks;
        this.gabari = gabari;
    }

    public Integer getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Integer squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Price getSquareMeterUnitPrice() {
        return squareMeterUnitPrice;
    }

    public void setSquareMeterUnitPrice(Price squareMeterUnitPrice) {
        this.squareMeterUnitPrice = squareMeterUnitPrice;
    }

    public String getRelevantMunicipality() {
        return relevantMunicipality;
    }

    public void setRelevantMunicipality(String relevantMunicipality) {
        this.relevantMunicipality = relevantMunicipality;
    }

    public Integer getIslandNumber() {
        return islandNumber;
    }

    public void setIslandNumber(Integer islandNumber) {
        this.islandNumber = islandNumber;
    }

    public Integer getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelNumber(Integer parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public Integer getKaks() {
        return kaks;
    }

    public void setKaks(Integer kaks) {
        this.kaks = kaks;
    }

    public Integer getGabari() {
        return gabari;
    }

    public void setGabari(Integer gabari) {
        this.gabari = gabari;
    }
}
