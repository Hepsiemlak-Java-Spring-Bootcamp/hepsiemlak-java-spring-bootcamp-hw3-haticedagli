package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Image;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ImageRepository {

    List<Image> images = new ArrayList<>();

    public void add(Image image){
        images.add(image);
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Image getImage(String id){
        for(Image image : images){
            if(Objects.equals(image.getId(), id)){
                return image;
            }
        }
        return null;
    }
}
