package com.hepsiemlak.emlakoop.model.estate;

import com.hepsiemlak.emlakoop.enums.*;
import com.hepsiemlak.emlakoop.model.Address;
import com.hepsiemlak.emlakoop.model.Category;
import com.hepsiemlak.emlakoop.model.Image;
import com.hepsiemlak.emlakoop.model.Price;

import java.util.List;

public class Workplace extends Estate {
    private Integer numberOfRooms;
    private Integer grossSquareMeter;
    private Integer netSquareMeter;
    private Integer squareMeterOfOpenSpace;
    private Integer squareMeterOfIndoorArea;
    private Integer numberOfBuildings;
    private Integer entranceHeight;
    private boolean yourTransfer;
    private Integer age;
    private Integer floor;
    private Integer numberOfFloors;
    private WarmingType warmingType;
    private boolean furnished;
    private FuelType fuelType;
    private State state;
    private UsingStatus usingStatus;
    private DeedStatus deedStatus;
    private boolean groundSurvey;
    private Price dues;

    public Workplace() {
        this.estateType = EstateType.WORKPLACE;
    }

    public Workplace(
            Category category,
            Address address,
            boolean navigableByVideoCall,
            boolean availableForLoan,
            boolean swap,
            Price rentalIncome,
            ReleaseType releaseType,
            List<Image> images,
            Integer numberOfRooms,
            Integer grossSquareMeter,
            Integer netSquareMeter,
            Integer squareMeterOfOpenSpace,
            Integer squareMeterOfIndoorArea,
            Integer numberOfBuildings,
            Integer entranceHeight,
            boolean yourTransfer,
            Integer age,
            Integer floor,
            Integer numberOfFloors,
            WarmingType warmingType,
            boolean furnished,
            FuelType fuelType,
            State state,
            UsingStatus usingStatus,
            DeedStatus deedStatus,
            boolean groundSurvey,
            Price dues
    ) {
        super(EstateType.WORKPLACE, category, address, navigableByVideoCall, availableForLoan, swap, rentalIncome, releaseType, images);
        this.numberOfRooms = numberOfRooms;
        this.grossSquareMeter = grossSquareMeter;
        this.netSquareMeter = netSquareMeter;
        this.squareMeterOfOpenSpace = squareMeterOfOpenSpace;
        this.squareMeterOfIndoorArea = squareMeterOfIndoorArea;
        this.numberOfBuildings = numberOfBuildings;
        this.entranceHeight = entranceHeight;
        this.yourTransfer = yourTransfer;
        this.age = age;
        this.floor = floor;
        this.numberOfFloors = numberOfFloors;
        this.warmingType = warmingType;
        this.furnished = furnished;
        this.fuelType = fuelType;
        this.state = state;
        this.usingStatus = usingStatus;
        this.deedStatus = deedStatus;
        this.groundSurvey = groundSurvey;
        this.dues = dues;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getGrossSquareMeter() {
        return grossSquareMeter;
    }

    public void setGrossSquareMeter(Integer grossSquareMeter) {
        this.grossSquareMeter = grossSquareMeter;
    }

    public Integer getNetSquareMeter() {
        return netSquareMeter;
    }

    public void setNetSquareMeter(Integer netSquareMeter) {
        this.netSquareMeter = netSquareMeter;
    }

    public Integer getSquareMeterOfOpenSpace() {
        return squareMeterOfOpenSpace;
    }

    public void setSquareMeterOfOpenSpace(Integer squareMeterOfOpenSpace) {
        this.squareMeterOfOpenSpace = squareMeterOfOpenSpace;
    }

    public Integer getSquareMeterOfIndoorArea() {
        return squareMeterOfIndoorArea;
    }

    public void setSquareMeterOfIndoorArea(Integer squareMeterOfIndoorArea) {
        this.squareMeterOfIndoorArea = squareMeterOfIndoorArea;
    }

    public Integer getNumberOfBuildings() {
        return numberOfBuildings;
    }

    public void setNumberOfBuildings(Integer numberOfBuildings) {
        this.numberOfBuildings = numberOfBuildings;
    }

    public Integer getEntranceHeight() {
        return entranceHeight;
    }

    public void setEntranceHeight(Integer entranceHeight) {
        this.entranceHeight = entranceHeight;
    }

    public boolean isYourTransfer() {
        return yourTransfer;
    }

    public void setYourTransfer(boolean yourTransfer) {
        this.yourTransfer = yourTransfer;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public WarmingType getWarmingType() {
        return warmingType;
    }

    public void setWarmingType(WarmingType warmingType) {
        this.warmingType = warmingType;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public UsingStatus getUsingStatus() {
        return usingStatus;
    }

    public void setUsingStatus(UsingStatus usingStatus) {
        this.usingStatus = usingStatus;
    }

    public DeedStatus getDeedStatus() {
        return deedStatus;
    }

    public void setDeedStatus(DeedStatus deedStatus) {
        this.deedStatus = deedStatus;
    }

    public boolean isGroundSurvey() {
        return groundSurvey;
    }

    public void setGroundSurvey(boolean groundSurvey) {
        this.groundSurvey = groundSurvey;
    }

    public Price getDues() {
        return dues;
    }

    public void setDues(Price dues) {
        this.dues = dues;
    }
}
