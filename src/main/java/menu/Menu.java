package menu;

public class Menu {
    String name;
    float coast;

    public Menu(String name, float coast) {
        this.name = name;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "������� � ����{" +
                "'" + name + "'" +
                ", ���� - " + coast + " ���."+
                '}';
    }
}
