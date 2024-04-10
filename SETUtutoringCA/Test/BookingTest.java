import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingTest {

    Group group1, group2, group3,group4;
    Room room1, room2, room3;
    Capacity capacity;


    @Before
    public void setup(){
        group1 = new Group(12);
        group2 = new Group(7);
        group3 = new Group(3);
        group4 = new Group(-2);

        room1 = new Room(0,8);
        room2 = new Room(2,3);
        room3 = new Room(3,9);

        capacity = new Capacity();
    }

    @Test
    public void invalidGroupNumberOver(){
        String notice = group1.invalidMembers(12);
        assertEquals("Groups can't exceed 10 members", notice);
    }

    @Test
    public void invalidGroupNumberUnder(){
        String notice = group1.invalidMembers(-2);
        assertEquals("Can't have negative group members!", notice);
    }

    @Test
    public void invalidRoom(){
        String notice = room1.RoomExists(0);
        assertEquals("Room does not exist", notice);
    }

    @Test
    public void GroupSessionSuccessful(){
        String message = capacity.verifyCapacity(room3,group3);
        assertEquals("Class created", message);
    }

    @Test
    public void InvalidDetails(){
        String message = capacity.verifyCapacity(room2,group2);
        assertEquals("Class too big for room size", message);
    }
}
