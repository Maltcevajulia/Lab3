public class Main {
    public static void main (String args[]) throws PositionException, AmountOfPeople, AmountOfPeople.AmountOfPeopleException {
        Kissable kissable = new Kissable() {
            @Override
            public void kiss() {
                System.out.println("девочка подставила лобик");
            }
        };


        Girl girl = new Girl("Девочка", "в коротком платье");
        Forestier forestier = new Forestier("г-жа Форестье", "жена Шарля");
        Marel marel = new Marel("г-жа де Марель", "подруга и дальняя родственница г-жи Форестье");
        Dyurua dyurua = new Dyurua("господин Жорж Дюруа", "старый товарищ Шарля");
        Walter walter = new Walter("г-н Вальтер",  "депутат, финансист, богач и делец, еврей-южанин, издатель французской жизни");
        Walter.Wife wife = new Walter.Wife("жена, урожденная Базиль-Равало", "дочь банкира");
        Rivale rivale = new Rivale("Жак Риваль",  "одетый весьма элегантно");
        Varen varen = new Varen("Норбер де Варен",  "небрежно одетый, с кокетливостью былого красавца");
        Room room = new Room("Комната");
        Varen.tailCoat tailCoat = new Varen.tailCoat("блестел", "Его фрак");
        Forrestier forrestier = new Forrestier("Форестье",  "");
        Morel morel = new Morel("Морель", "депутат-радикал",  false);
        Servants servant = new Servants("Cлуга");
        Canteen canteen = new Canteen("столовая");
        Canteen glass1 = new Canteen("3 прозрачных стакана");
        Canteen glass2 = new Canteen("1 голубоватый стакан");


        room.openDoor();
        girl.goTo();
        room.addPerson(girl.getName());
        forestier.goTo();
        forestier.compare(forrestier.equals(forestier));
        room.addPerson(forestier.getName());
        forestier.sayPhrase();
        marel.sayPhrase();
        room.addPerson(marel.getName());
        forestier.kiss(marel.getName(), forestier.getName());
        girl.sayPhrase();
        kissable.kiss();
        forestier.introduceForrestier();
        dyurua.bowDown();
        room.addPerson(dyurua.getName());
        walter.goTo();
        room.addPerson(walter.getName());
        Walter.Wife.followWalter();
        room.addPerson(wife.getName());
        rivale.goTo();
        room.addPerson(rivale.getName());
        varen.enterRoom();
        room.addPerson(varen.getName());
        tailCoat.shine();
        varen.goTo();
        varen.bend();
        varen.kiss(varen.getName(), forestier.getName());
        morel.makeAnnouncement();
        forrestier.beLate(morel.isAsked());
        room.addPerson(forrestier.getName());
        servant.serveMasters(servant.getName());
        room.addPerson(servant.getName());
        room.loosePerson();
        room.closeDoor();



        canteen.addPerson(dyurua.getName());
        canteen.addPerson(forestier.getName());
        canteen.addPerson(forrestier.getName());
        canteen.addPerson(girl.getName());
        canteen.addPerson(marel.getName());
        canteen.addPerson(rivale.getName());
        canteen.addPerson(servant.getName());
        canteen.addPerson(varen.getName());
        canteen.addPerson(walter.getName());
        canteen.addPerson(wife.getName());

        canteen.checkAmount();
        servant.placePersonOn(girl.getName(),0);
        servant.placePersonOn(dyurua.getName(),1);
        servant.placePersonOn(marel.getName(),2);
        servant.checkPositions();
        dyurua.beAfraid();
        canteen.checkAmountofGlasses(Canteen.getNumberOfBlueGlasses()*Canteen.getBlueGlasses().hashCode() + Canteen.getNumberOfGreenGlasses()*Canteen.getGreenGlasses().hashCode());
        servant.put(Canteen.getTable(), Canteen.getGlasses(), Canteen.getNumberOfGlasses());
        varen.askQuestion();



        Narrator Narrator = new Narrator();
        Narrator.addPhrase(forrestier.getPhrase());
        Narrator.addPhrase(dyurua.getPhrase());
        Narrator.addPhrase(girl.getPhrase());
        Narrator.addPhrase(marel.getPhrase());
        Narrator.addPhrase(rivale.getPhrase());
        Narrator.addPhrase(varen.getPhrase());
        Narrator.addPhrase(forestier.getPhrase());
        Narrator.addPhrase(walter.getPhrase());
        Narrator.addPhrase(wife.getPhrase());
        Narrator.sayPhrase(1);
        Narrator.sayPhrase(2);
        Narrator.sayPhrase(4);
        Narrator.sayPhrase(5);
        Narrator.sayPhrase(0);
        Narrator.sayPhrase(7);
    }
}
