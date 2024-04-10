public class Room {

    private int capacity;
    private int number;

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 1 && number <= 4) {
            this.number = number;
        }
    }

    public String RoomExists(int roomNumber) {
        if (roomNumber < 1 || roomNumber > 5) {
            return ("Room does not exist");
        } else return ("Valid room number entered");
    }

    @Override
    public String toString() {
        return "Room{" +
                "capacity=" + capacity +
                ", number=" + number +
                '}';
    }
}

