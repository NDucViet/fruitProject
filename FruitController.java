import java.util.ArrayList;

public class FruitController {
    ArrayList<Fruit> fruitList = new ArrayList<>();

    public ArrayList<Fruit> showAll() {
        return fruitList;
    }

    public boolean addNew(Fruit fruit){
        fruitList.add(fruit);
        return true;
    }
}