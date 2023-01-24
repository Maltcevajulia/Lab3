import java.util.ArrayList;

public class Canteen {
    private static String glasses = "cтаканы";

    private static String greenGlasses = "зеленые стаканы";
    private static String blueGlasses = "голубоватые стаканы";
    private static int numberOfGreenGlasses = 2;
    private static int numberOfBlueGlasses = 2;
    private static int numberOfGlasses = 4;
    private String name;
    private int amountOfPeople;
    private static String table = "стол";


    @Override
    public int hashCode(){
        int result;
        result = numberOfBlueGlasses * blueGlasses.hashCode() + numberOfGreenGlasses* greenGlasses.hashCode();
        return result;
    }


    private ArrayList<String> guests = new ArrayList<>();

    public void addPerson(String nameOfPerson) {
        guests.add(amountOfPeople, nameOfPerson);
        amountOfPeople++;
    }
    public void checkAmount() throws AmountOfPeople, AmountOfPeople.AmountOfPeopleException {
        try {
            AmountOfPeople.checkAmountofPeople(amountOfPeople);
            System.out.println("Все перешли в столовую!");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void checkAmountofGlasses(int parameter){
       if(parameter == hashCode()) {
           System.out.println("Слуга взял" +" "+ getNumberOfBlueGlasses() +" "+  getBlueGlasses()+ " " + "и" + " "+ getNumberOfGreenGlasses() +" "+  getGreenGlasses());
       } else {
           System.out.println("Не хватает стаканов");
       }
    }

    public Canteen(String name) {
        this.name = name;
    }

    public static String getGlasses() {
        return glasses;
    }
    public static String getGreenGlasses(){
        return  greenGlasses;
    }
    public static String getBlueGlasses(){
        return blueGlasses;
    }
    public static int getNumberOfGreenGlasses(){
        return numberOfGreenGlasses;
    }
    public static int getNumberOfBlueGlasses(){
        return numberOfBlueGlasses;
    }
    public static int getNumberOfGlasses() {
        return numberOfGlasses;
    }
public static String getTable(){
        return table;
}


}
