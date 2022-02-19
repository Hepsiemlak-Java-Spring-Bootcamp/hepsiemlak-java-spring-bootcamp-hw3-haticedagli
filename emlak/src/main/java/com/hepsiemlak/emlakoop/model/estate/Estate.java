package com.hepsiemlak.emlakoop.model.estate;

import com.hepsiemlak.emlakoop.enums.EstateType;
import com.hepsiemlak.emlakoop.enums.ReleaseType;
import com.hepsiemlak.emlakoop.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Estate {
    protected String id;
    protected EstateType estateType;
    protected Category category;
    protected Address address;
    protected boolean navigableByVideoCall;
    protected boolean availableForLoan;
    protected boolean swap;
    protected Price rentalIncome;
    protected ReleaseType releaseType;
    protected List<Image> images;
    protected String video;
    protected List<Attribute> attributes = new ArrayList<>();

    protected Estate() {
        this.id = UUID.randomUUID().toString();
    }

    protected Estate(
            EstateType estateType,
            Category category,
            Address address,
            boolean navigableByVideoCall,
            boolean availableForLoan,
            boolean swap,
            Price rentalIncome,
            ReleaseType releaseType,
            List<Image> images
    ) {
        this.id = UUID.randomUUID().toString();
        this.estateType = estateType;
        this.category = category;
        this.address = address;
        this.navigableByVideoCall = navigableByVideoCall;
        this.availableForLoan = availableForLoan;
        this.swap = swap;
        this.rentalIncome = rentalIncome;
        this.releaseType = releaseType;
        this.images = images;
    }

    public EstateType getEstateType() {
        return estateType;
    }

    public void setAdvertType(EstateType estateType) {
        this.estateType = estateType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isNavigableByVideoCall() {
        return navigableByVideoCall;
    }

    public void setNavigableByVideoCall(boolean navigableByVideoCall) {
        this.navigableByVideoCall = navigableByVideoCall;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailableForLoan() {
        return availableForLoan;
    }

    public void setAvailableForLoan(boolean availableForLoan) {
        this.availableForLoan = availableForLoan;
    }

    public boolean isSwap() {
        return swap;
    }

    public void setSwap(boolean swap) {
        this.swap = swap;
    }

    public Price getRentalIncome() {
        return rentalIncome;
    }

    public void setRentalIncome(Price rentalIncome) {
        this.rentalIncome = rentalIncome;
    }

    public ReleaseType getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(ReleaseType releaseType) {
        this.releaseType = releaseType;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "advertType=" + estateType +
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
                '}';
    }
}
