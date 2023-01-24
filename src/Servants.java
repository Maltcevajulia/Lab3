import java.util.ArrayList;

public class Servants implements Serveable {

    private String name;

    public Servants(String name) {
        this.name = name;
    }

    private ArrayList<String> people = new ArrayList<>();

    public void placePersonOn(String name, int position) {
        people.add(position, name);
    }

    public void checkPositions() throws PositionException {
        if (people.get(1).equals("господин Жорж Дюруа")) {
            System.out.println("Все сидят на своих местах");
        } else {
            throw new PositionException("Извините, я ошибся");
        }
    }
    public String getName(){
        return name;
    }


    public void serveMasters(String name) {
        System.out.println(name +" " + "позвал всех обедать");
    }

    public void put(String table, String glasses, int numberOfGlasses){
            System.out.printf(getName() + " " + "поставил на" + " " +table + " " + "%d" +  " " + glasses + " "+ "\n", numberOfGlasses);
        }
    }
