public class Dancer extends Person {
    private String groupName;


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;

    }

    public void dansing() {
        System.out.println("She is dansing");

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String toString() {
        return super.getName() + " " + super.getDesignation() + " " + groupName;
    }
}
