package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("children",new Wall("right"),new Wall("left"),
                new Wall("front"),new Wall("back"),new Ceiling(60,PaintColor.GREEN),
                new Bed("canopy",2,5,6,7),
                new Lamp(true,3, LampType.NORMAL),
                new Wardrobe(50,60,70),new Carpet(50,60,PaintColor.RED));
        System.out.println(bedroom.getLamp().getStyle());
    }
}