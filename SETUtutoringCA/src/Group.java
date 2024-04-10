public class Group {

    private int members;

    public Group(int members) {
        this.members = members;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        if (members <= 10 && members >= 1){
            this.members = members;
        }
    }

    public String invalidMembers(int members) {
        if (members < 0) {
            return "Can't have negative group members!";
        } else if (members >= 10) {
            return "Groups can't exceed 10 members";
        }
        else{
            return "Group created";
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "Members" + members +
                '}';
    }
}
