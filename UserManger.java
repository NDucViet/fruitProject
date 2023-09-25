import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class UserManger {
    ArrayList<Fruit> fruitUser = new ArrayList<>();
    Hashtable<String, ArrayList<Fruit>> hashtable = new Hashtable<>();

    public void gioHang(String name){
        
        hashtable.put(name, fruitUser);
    }

    public String showAll(){
        String name="";
        ArrayList<Fruit> newList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Fruit>> entry : hashtable.entrySet()) {
            name = entry.getKey();
            newList = entry.getValue();
        }
        return "Customer: " + name +"\n"+ newList.toString();
    }

    public boolean addNew(Fruit fruit){
        fruitUser.add(fruit);
        return true;
    }
}
