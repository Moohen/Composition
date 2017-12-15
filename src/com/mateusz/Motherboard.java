package com.mateusz;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlosts;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlosts, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlosts = cardSlosts;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlosts() {
        return cardSlosts;
    }

    public String getBios() {
        return bios;
    }
}
