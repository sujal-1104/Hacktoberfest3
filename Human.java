public class Human
{
    private int no_of_vehicle;
    private String name ;
    private Car car;
    private Bike bike;

    public Human(int no_of_vehicle, String name, Car car, Bike bike) {
        this.no_of_vehicle = no_of_vehicle;
        this.name = name;
        this.car = car;
        this.bike = bike;
    }

    public int getNo_of_vehicle() {
        return no_of_vehicle;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public Bike getBike() {
        return bike;
    }

    public void setNo_of_vehicle(int no_of_vehicle) {
        this.no_of_vehicle = no_of_vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Human{" +
                "no_of_vehicle=" + no_of_vehicle +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", bike=" + bike +
                '}';
    }
}
