package com.saxisdzvali.toko.listview.model;

import java.io.Serializable;

/**
 * Created by ToKo on 12/7/2016.
 */

public class MwerlebiCharacter implements Serializable{

    private String name, description, image;

    public MwerlebiCharacter(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "MwerlebiCharacter{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
