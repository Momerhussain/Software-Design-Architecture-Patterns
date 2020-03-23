/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;


public class CarBuilder2 {
    private String manufacturer, model, cylinder;
    private int horsePower, numOfSeats;
    private Color color;
    private double length, width, price;
 
    private CarBuilder2() {
    }
    public static CarBuilder2 create() {
        return new CarBuilder2();
    }
    public Car build() {
        return new Car(manufacturer, model, horsePower, numOfSeats, color
                , cylinder, length, width, price);
    }
    public CarBuilder2 manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public CarBuilder2 model(String model) {
        this.model = model;
        return this;
    }
    public CarBuilder2 horsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }
    public CarBuilder2 numOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
        return this;
    }
    public CarBuilder2 color(Color color) {
        this.color = color;
        return this;
    }
    public CarBuilder2 cylinder(String cylinder) {
        this.cylinder = cylinder;
        return this;
    }
    public CarBuilder2 length(double length) {
        this.length = length;
        return this;
    }
    public CarBuilder2 width(double width) {
        this.width = width;
        return this;
    }
    public CarBuilder2 price(double price) {
        this.price = price;
        return this;
    }
}