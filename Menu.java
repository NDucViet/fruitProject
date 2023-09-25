import java.util.Scanner;

public class Menu {
    FruitController fruitController = new FruitController();
    UserManger userManger = new UserManger();
    Scanner sc = new Scanner(System.in);

    public void main() {
        System.out.println("-----------MENU---------\n"
                + "1.Create Fruit\n"
                + "2.View orders\n"
                + "3.Shopping\n"
                + "4.exit");
        int choice = Integer.parseInt(sc.nextLine());
        getchoice(choice);

    }

    public void getchoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Enter Fruit ID");
                int idFruit = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Fruit Name");
                String name = sc.nextLine();
                System.out.println("Enter price");
                int price = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Quality");
                int quality = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Origin");
                String origin = sc.nextLine();
                Fruit newFruit = new Fruit(idFruit, name, price, quality, origin);
                fruitController.addNew(newFruit);
                System.out.println("Do you want to countinue? (Y/N)");
                String choose = sc.nextLine();
                if(choose.equals("Y")){
                    getchoice(1);
                } else{
                    System.out.println(fruitController.showAll());
                }
                break;
            case 2:
                System.out.println(userManger.showAll());
                break;
            case 3:
                System.out.println(fruitController.showAll());

                break;
            
            default:
                break;
        }
    }
}
