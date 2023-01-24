public class AmountOfPeople extends Throwable {
    public static void checkAmountofPeople(int amountOfPeople) throws AmountOfPeopleException, AmountOfPeople {
        if (amountOfPeople < 10) {
            throw new AmountOfPeopleException(amountOfPeople);
        } else {
            System.out.println("Из комнаты ушли" + " " + amountOfPeople + " " + "человек");
        }
    }

    static class AmountOfPeopleException extends RuntimeException {
        public AmountOfPeopleException(int amountOfPeople) {
            System.out.println("В комнате кто-то отсался");
        }
    }
}
