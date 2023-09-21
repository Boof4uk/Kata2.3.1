package web.models;

public class Car {

    private String carModel;
    private int carPrice;
    private int id;

    public Car() {}

    public Car(String carModel, int carPrice, int id) {
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carPrice=" + carPrice +
                ", id=" + id +
                '}';
    }
}
