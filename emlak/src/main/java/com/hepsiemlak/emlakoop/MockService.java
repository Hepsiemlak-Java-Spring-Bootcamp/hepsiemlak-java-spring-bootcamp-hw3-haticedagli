package com.hepsiemlak.emlakoop;

import com.hepsiemlak.emlakoop.enums.*;
import com.hepsiemlak.emlakoop.model.*;
import com.hepsiemlak.emlakoop.model.estate.*;
import com.hepsiemlak.emlakoop.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MockService {

    EstateFactory estateFactory = new EstateFactory();
    private final AddressRepository addressRepository;
    private final AdvertRepository advertRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;
    private final ImageRepository imageRepository;
    private final EstateRepository estateRepository;
    private final MessageRepository messageRepository;
    private final AttributeRepository attributeRepository;
    private final SearchRepository searchRepository;

    public void generateMockData(){
        generateAttributes();
        generateCategories();
        generateAddresses();
        generateUsers();
        generateImages();
        generateEstates();
        generateAdverts();
        generateMessages();
        generateFavoriteEstates();
    }

    public void generateAddresses(){
        addressRepository.add(
                new Address(
                        "İstanbul",
                        "Eyüp",
                        "Alibeyköy Mahallesi",
                        "Alibeyköy Mah. Ceylan Sk. No:8 D:6 Kat:3"
                )
        );
        addressRepository.add(
                new Address(
                        "İzmir",
                        "Buca",
                        "Cumhuriyet Mahallesi",
                        "1100/1 sk. No:4 D:1"
                )
        );
        addressRepository.add(
                new Address(
                        "İstanbul",
                        "Beşiktaş",
                        "Sinanpaşa Mahallesi",
                        "Abbasağa sk. No:6 D:4 Akay Apartmanı"
                )
        );
        addressRepository.add(
                new Address(
                        "İstanbul",
                        "Beşiktaş",
                        "Sinanpaşa Mahallesi",
                        "Abbasağa sk. No:5 D:3"
                )
        );
        addressRepository.add(
                new Address(
                        "İstanbul",
                        "Beşiktaş",
                        "Sinanpaşa Mahallesi",
                        "Abbasağa sk. No:4 D:2"
                )
        );
    }

    public void generateUsers(){
        userRepository.add(
                new User(
                        "Hatice",
                        "Dağlı",
                        "haticeetoglu03@gmail.com",
                        addressRepository.getAll().get(0),
                        "05349642224",
                        true
                )
        );
        userRepository.add(
                new User(
                        "Ayşe",
                        "Sarı",
                        "ayse.sari@gmail.com",
                        addressRepository.getAll().get(1),
                        "05349642225",
                        false
                )
        );
    }

    public void generateAttributes(){
        attributeRepository.add(
                new Attribute(
                        AttributeType.INTERNAL_FEATURES,
                        "Halı Kaplama"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.INTERNAL_FEATURES,
                        "Hazır Mutfak"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.EXTERNAL_FEATURES,
                        "Asansör"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.EXTERNAL_FEATURES,
                        "Bahçeli"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.LOCATION,
                        "Arka Cepheli"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.LOCATION,
                        "Denize Sıfır"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.INFRASTRUCTURE,
                        "Doğalgaz Mevcut"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.INFRASTRUCTURE,
                        "Sanayi Elektriği"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.PURPOSE_OF_USAGE,
                        "Atölye"
                )
        );
        attributeRepository.add(
                new Attribute(
                        AttributeType.PURPOSE_OF_USAGE,
                        "Depo"
                )
        );
    }

    public void generateCategories(){
        categoryRepository.add(
                new Category(
                        EstateType.HOUSE,
                        "Daire"
                )
        );
        categoryRepository.add(
                new Category(
                        EstateType.HOUSE,
                        "Villa"
                )
        );
        categoryRepository.add(
                new Category(
                        EstateType.WORKPLACE,
                        "Dükkan & Mağaza"
                )
        );
        categoryRepository.add(
                new Category(
                        EstateType.WORKPLACE,
                        "Ofis"
                )
        );
        categoryRepository.add(
                new Category(
                        EstateType.PLOT,
                        "Bağ"
                )
        );
        categoryRepository.add(
                new Category(
                        EstateType.PLOT,
                        "Bahçe"
                )
        );
    }

    public void generateImages(){
        imageRepository.add(
                new Image(
                        "ev1",
                        ".jpeg",
                        123
                )
        );
        imageRepository.add(
                new Image(
                        "işyeri2",
                        ".jpeg",
                        120
                )
        );
        imageRepository.add(
                new Image(
                        "arsa3",
                        ".jpeg",
                        98
                )
        );
    }

    public void generateSearches(){
        searchRepository.add(
                new Search(
                        userRepository.getUsers().get(0),
                        "il: İstanbul, Oda sayisi: 1",
                        true
                )
        );
        searchRepository.add(
                new Search(
                        userRepository.getUsers().get(1),
                        "il: İzmir, Fiyat aralığı: [1000-5000]",
                        false
                )
        );
    }

    public void generateEstates(){
        House estate1 = (House) estateFactory.createEstate(EstateType.HOUSE);
        estate1.setCategory(categoryRepository.getCategories().get(0));
        estate1.setAddress(addressRepository.getAll().get(2));
        estate1.setNavigableByVideoCall(true);
        estate1.setAvailableForLoan(true);
        estate1.setSwap(false);
        estate1.setRentalIncome(new Price(6000, Currency.TL));
        estate1.setReleaseType(ReleaseType.SALE);
        estate1.setNumberOfRooms(3);
        estate1.setNumberOfHalls(1);
        estate1.setNumberOfBathrooms(1);
        estate1.setGrossSquareMeter(120);
        estate1.setNetSquareMeter(110);
        estate1.setWarmingType(WarmingType.GAS_STOVE);
        estate1.setAge(5);
        estate1.setFloor(3);
        estate1.setNumberOfFloors(8);
        estate1.setHousingShape(HousingShape.APARTMENT);
        estate1.setFurnished(false);
        estate1.setFuelType(FuelType.NATURAL_GAS);
        estate1.setStructureType(StructureType.STEEL);
        estate1.setState(State.SECOND_HAND);
        estate1.setUsingStatus(UsingStatus.EMPTY);
        estate1.setDues(new Price(200, Currency.TL));
        estate1.setOnSite(true);
        estate1.setFacades(new ArrayList<>(List.of(Facade.WEST, Facade.SOUTH)));
        estate1.setDeedStatus(DeedStatus.PLOT);

        estateRepository.add(estate1);

        House estate2 = (House) estateFactory.createEstate(EstateType.HOUSE);
        estate2.setCategory(categoryRepository.getCategories().get(1));
        estate2.setAddress(addressRepository.getAll().get(3));
        estate2.setNavigableByVideoCall(true);
        estate2.setAvailableForLoan(true);
        estate2.setSwap(false);
        estate2.setRentalIncome(new Price(4000, Currency.TL));
        estate2.setReleaseType(ReleaseType.RENT);
        estate2.setNumberOfRooms(2);
        estate2.setNumberOfHalls(1);
        estate2.setNumberOfBathrooms(1);
        estate2.setGrossSquareMeter(90);
        estate2.setNetSquareMeter(80);
        estate2.setWarmingType(WarmingType.CENTRAL);
        estate2.setAge(1);
        estate2.setFloor(1);
        estate2.setNumberOfFloors(3);
        estate2.setHousingShape(HousingShape.DUPLEX);
        estate2.setFurnished(false);
        estate2.setFuelType(FuelType.LIQUID_FUEL);
        estate2.setStructureType(StructureType.PREFABRICATED);
        estate2.setState(State.FIRST_HAND);
        estate2.setUsingStatus(UsingStatus.EMPTY);
        estate2.setDues(new Price(400, Currency.TL));
        estate2.setOnSite(true);
        estate2.setFacades(new ArrayList<>(List.of(Facade.EAST, Facade.SOUTH)));
        estate2.setDeedStatus(DeedStatus.CONDOMINIUM);

        estateRepository.add(estate2);

        Plot estate3 = (Plot) estateFactory.createEstate(EstateType.PLOT);
        estate3.setCategory(categoryRepository.getCategories().get(4));
        estate3.setAddress(addressRepository.getAll().get(4));
        estate3.setNavigableByVideoCall(true);
        estate3.setAvailableForLoan(true);
        estate3.setSwap(false);
        estate3.setRentalIncome(new Price(3000, Currency.TL));
        estate3.setReleaseType(ReleaseType.SALE);
        estate3.setImages(new ArrayList<>(List.of(imageRepository.getImages().get(2))));
        estate3.setSquareMeters(300);
        estate3.setSquareMeterUnitPrice(new Price(1000, Currency.TL));
        estate3.setRelevantMunicipality("Beşiktaş Belediyesi");
        estate3.setIslandNumber(4);
        estate3.setParcelNumber(143);
        estate3.setKaks(1);
        estate3.setGabari(1);

        estateRepository.add(estate3);

        Workplace estate4 = (Workplace) estateFactory.createEstate(EstateType.WORKPLACE);
        estate4.setCategory(categoryRepository.getCategories().get(2));
        estate4.setAddress(addressRepository.getAll().get(3));
        estate4.setNavigableByVideoCall(true);
        estate4.setAvailableForLoan(true);
        estate4.setSwap(true);
        estate4.setRentalIncome(new Price(9000, Currency.TL));
        estate4.setReleaseType(ReleaseType.SALE);
        estate4.setNumberOfRooms(5);
        estate4.setGrossSquareMeter(200);
        estate4.setNetSquareMeter(190);
        estate4.setSquareMeterOfOpenSpace(30);
        estate4.setSquareMeterOfIndoorArea(160);
        estate4.setNumberOfBuildings(1);
        estate4.setEntranceHeight(2);
        estate4.setYourTransfer(true);
        estate4.setWarmingType(WarmingType.NONE);
        estate4.setAge(8);
        estate4.setFloor(3);
        estate4.setNumberOfFloors(4);
        estate4.setFurnished(false);
        estate4.setFuelType(FuelType.ELECTRIC);
        estate4.setState(State.SECOND_HAND);
        estate4.setUsingStatus(UsingStatus.UNSPECIFIED);
        estate4.setDues(new Price(1000, Currency.TL));
        estate4.setGroundSurvey(true);
        estate4.setDeedStatus(DeedStatus.PLOT);

        estateRepository.add(estate4);
    }

    public void generateAdverts(){
        advertRepository.add(
                new Advert(
                        "Öğretmenden Satılık 3+1",
                        "Kelepir fiyata aciliyetten satıyorum",
                        estateRepository.getEstates().get(0),
                        userRepository.getUsers().get(0),
                        new Price(600000, Currency.TL),
                        true
                )
        );
        advertRepository.add(
                new Advert(
                        "Beşiktaşta 2+1 Manzaralı",
                        "Borcum var acil satıyorum",
                        estateRepository.getEstates().get(1),
                        userRepository.getUsers().get(0),
                        new Price(4000, Currency.TL),
                        true
                )
        );
        advertRepository.add(
                new Advert(
                        "Abbasağada 300 m2 inşaata uygun",
                        "Konumu merkezidir. 10dk yürüme mesafesinde beşiktaş çarşıya.",
                        estateRepository.getEstates().get(2),
                        userRepository.getUsers().get(0),
                        new Price(1000000, Currency.TL),
                        true
                )
        );
        advertRepository.add(
                new Advert(
                        "Barbarosta satılık dükkan",
                        "İşlek caddede, yüksek kazanç sağlayan merkezi bir dükkan.",
                        estateRepository.getEstates().get(3),
                        userRepository.getUsers().get(0),
                        new Price(2000000, Currency.TL),
                        true
                )
        );
    }

    public void generateMessages(){
        messageRepository.addMessage(
                new Message(
                        advertRepository.getAll().get(0),
                        userRepository.getUsers().get(0),
                        userRepository.getUsers().get(1),
                        "İndirim olur mu?"
                )
        );
        messageRepository.addMessage(
                new Message(
                        advertRepository.getAll().get(0),
                        userRepository.getUsers().get(1),
                        userRepository.getUsers().get(0),
                        "Son fiyat"
                )
        );
    }

    public void generateFavoriteEstates(){
        userRepository.getUsers().get(0).getFavoriteAdverts().add(advertRepository.getAll().get(0));
        //advertRepository.getAll().get(0).getFavoriteBy().add(userRepository.getUsers().get(0));
        userRepository.getUsers().get(1).getFavoriteAdverts().add(advertRepository.getAll().get(1));
        //advertRepository.getAll().get(1).getFavoriteBy().add(userRepository.getUsers().get(1));
    }
}
