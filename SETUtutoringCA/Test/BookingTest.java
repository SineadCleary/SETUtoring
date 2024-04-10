import org.junit.Before;

public class BookingTest {

    Group group1, group2, group3;
    Room room1, room2, room3;


    @Before
    void setup(){
        group1 = new Group(12);
        group2 = new Group(7);
        group3 = new Group(3);

        room1 = new Room(0,8);
        room2 = new Room(2,3);
        room3 = new Room(3,9);
    }

}
