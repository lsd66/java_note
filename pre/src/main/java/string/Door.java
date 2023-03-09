package string;

public class Door {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String name;
    public void OpenDoor(Person p) {
        System.out.println(p.getName() + " has been open " + this.getName());
    }
}
