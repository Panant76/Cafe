package menu;

public class Desert extends Menu {
    float weight;

    public Desert(String name, float coast, float weight) {
        super(name, coast);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  super.toString()+"Десерт: "+"вес - "
                 + weight ;

    }
}
