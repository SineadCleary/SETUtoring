public class Capacity {
    public String verifyCapacity(Room room, Group group){

        if(room.getCapacity() >= group.getMembers()) {
            return "Class created";
        }
        else return "Class too big for room size";
    }
}
