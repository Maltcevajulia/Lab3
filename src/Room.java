import java.util.ArrayList;

public class Room {

    public void openDoor(){
     String name = "дверь";
     String action = "открылась";
     AbleToOpen opened = new AbleToOpen() {
         @Override
         public void open(String name, String action) {
             System.out.println(name + " "+ action);
         }
     };
     opened.open(name, action);
 }
 public void closeDoor(){
     String name = "дверь";
     String action = "закрылась";
     AbleToClose closed = new AbleToClose(){
         @Override
         public void close(String name, String action) {
             System.out.println(name +" "+ action);
         }
     };
     closed.close(name, action);
 }

    private String name;
    private int amountOfPeople;
    private ArrayList<String> guests = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addPerson(String nameOfPerson) {
        guests.add(amountOfPeople, nameOfPerson);
        amountOfPeople++;
    }
    public void loosePerson() {
        int a = guests.size() - 1;
        while(guests.size() > 0) {
            System.out.println(guests.get(a) + " покинул " + name);
            guests.remove(a);
            a--;
        }
    }
}
