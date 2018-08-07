public abstract class Stalls {
    String name;
    String ownerName;
    int parkingSpot;


    public Stalls(String name, String OwnerName, String ParkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot  parkingSpot;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSpot(){
        return this.parkingSpot;
    }
}