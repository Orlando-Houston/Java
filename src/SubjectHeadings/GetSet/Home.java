package SubjectHeadings.GetSet;

public class Home {
    private int furniturNumber;
    private String televisionBand;
    private int roomNumber;
    private String wares;

    public int getFurniturNumber() {
        return furniturNumber;
    }

    public void setFurniturNumber(int furniturNumber) {
        this.furniturNumber = furniturNumber;
    }

    public String getTelevisionBand() {
        return televisionBand;
    }

    public void setTelevisionBand(String televisionBand) {
        this.televisionBand = televisionBand;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getWares() {
        return wares;
    }

    public void setWares(String wares) {
        this.wares = wares;
    }


    public static void main(String[] args) {
        Home h = new Home();
        h.setFurniturNumber(10);
        h.setRoomNumber(5);
        h.setTelevisionBand("sony");
        h.setWares("stove");

        System.out.println("Print");
        System.out.println(h.getFurniturNumber());
        System.out.println(h.getTelevisionBand());
        System.out.println(h.getRoomNumber());
        System.out.println(h.getWares());
    }


    }
