package com.hepsiemlak.emlakoop.model.estate;

import com.hepsiemlak.emlakoop.enums.*;
import com.hepsiemlak.emlakoop.model.Address;
import com.hepsiemlak.emlakoop.model.Category;
import com.hepsiemlak.emlakoop.model.Image;
import com.hepsiemlak.emlakoop.model.Price;

import java.util.List;

public class House extends Estate {
    private Integer numberOfRooms;
    private Integer numberOfHalls;
    private Integer numberOfBathrooms;
    private Integer grossSquareMeter;
    private Integer netSquareMeter;
    private WarmingType warmingType;
    private Integer age;
    private Integer floor;
    private Integer numberOfFloors;
    private HousingShape housingShape;
    private boolean furnished;
    private FuelType fuelType;
    private StructureType structureType;
    private State state;
    private UsingStatus usingStatus;
    private Price dues;
    private boolean onSite;
    private List<Facade> facades;
    private DeedStatus deedStatus;

    public House() {
        this.estateType = EstateType.HOUSE;
    }

    public House(
            Category category,
            Address address,
            boolean navigableByVideoCall,
            boolean availableForLoan,
            boolean swap,
            Price rentalIncome,
            ReleaseType releaseType,
            List<Image> images,
            Integer numberOfRooms,
            Integer numberOfHalls,
            Integer numberOfBathrooms,
            Integer grossSquareMeter,
            Integer netSquareMeter,
            WarmingType warmingType,
            Integer age,
            Integer floor,
            Integer numberOfFloors,
            HousingShape housingShape,
            boolean furnished,
            FuelType fuelType,
            StructureType structureType,
            State state,
            UsingStatus usingStatus,
            Price dues,
            boolean onSite,
            List<Facade> facades,
            DeedStatus deedStatus
    ) {
        super(EstateType.HOUSE, category, address, navigableByVideoCall, availableForLoan, swap, rentalIncome, releaseType, images);
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
        this.numberOfBathrooms = numberOfBathrooms;
        this.grossSquareMeter = grossSquareMeter;
        this.netSquareMeter = netSquareMeter;
        this.warmingType = warmingType;
        this.age = age;
        this.floor = floor;
        this.numberOfFloors = numberOfFloors;
        this.housingShape = housingShape;
        this.furnished = furnished;
        this.fuelType = fuelType;
        this.structureType = structureType;
        this.state = state;
        this.usingStatus = usingStatus;
        this.dues = dues;
        this.onSite = onSite;
        this.facades = facades;
        this.deedStatus = deedStatus;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(Integer numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public Integer getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(Integer numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
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

    public WarmingType getWarmingType() {
        return warmingType;
    }

    public void setWarmingType(WarmingType warmingType) {
        this.warmingType = warmingType;
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

    public HousingShape getHousingShape() {
        return housingShape;
    }

    public void setHousingShape(HousingShape housingShape) {
        this.housingShape = housingShape;
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

    public StructureType getStructureType() {
        return structureType;
    }

    public void setStructureType(StructureType structureType) {
        this.structureType = structureType;
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

    public Price getDues() {
        return dues;
    }

    public void setDues(Price dues) {
        this.dues = dues;
    }

    public boolean isOnSite() {
        return onSite;
    }

    public void setOnSite(boolean onSite) {
        this.onSite = onSite;
    }

    public List<Facade> getFacades() {
        return facades;
    }

    public void setFacades(List<Facade> facades) {
        this.facades = facades;
    }

    public DeedStatus getDeedStatus() {
        return deedStatus;
    }

    public void setDeedStatus(DeedStatus deedStatus) {
        this.deedStatus = deedStatus;
    }

    @Override
    public String toString() {
        return "House{" +
                ", category=" + category +
                ", address=" + address +
                ", navigableByVideoCall=" + navigableByVideoCall +
                ", availableForLoan=" + availableForLoan +
                ", swap=" + swap +
                ", rentalIncome=" + rentalIncome +
                ", releaseType=" + releaseType +
                ", images=" + images +
                ", video='" + video + '\'' +
                ", attributes=" + attributes +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfHalls=" + numberOfHalls +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", grossSquareMeter=" + grossSquareMeter +
                ", netSquareMeter=" + netSquareMeter +
                ", warmingType=" + warmingType +
                ", age=" + age +
                ", floor=" + floor +
                ", numberOfFloors=" + numberOfFloors +
                ", housingShape=" + housingShape +
                ", furnished=" + furnished +
                ", fuelType=" + fuelType +
                ", structureType=" + structureType +
                ", state=" + state +
                ", usingStatus=" + usingStatus +
                ", dues=" + dues +
                ", onSite=" + onSite +
                ", facades=" + facades +
                ", deedStatus=" + deedStatus +
                '}';
    }
}
