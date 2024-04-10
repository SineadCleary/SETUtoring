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

    public int determineRoomCapacity(int roomNumber) {
        if (roomNumber < 1 || roomNumber > 5) {
            throw new IllegalArgumentException("Room does not exist");
        } else if (roomNumber == 1) {
            setCapacity(8);
        } else if (roomNumber == 2) {
            setCapacity(3);
        } else if (roomNumber == 3) {
            setCapacity(9);
        } else {
            setCapacity(2);
        }
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "capacity=" + capacity +
                ", number=" + number +
                '}';
    }
}

