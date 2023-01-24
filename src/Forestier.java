public class Forestier extends Human  {
    private String gender = "женщина";
    private String phrase = "-Да что вы говорите?";


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Forestier forestier = (Forestier) obj;
        return gender == forestier.gender;
    }

    public void compare(boolean parameter){
        if (parameter==true){
            System.out.println("Это не тот!");
        } else{
            System.out.println("Это верный персонаж!");
        }
    }


    public Forestier(String name, String status) {
        super(name, status);
    }
    public void sayPhrase(){
        System.out.println("-Здравствуй, Клотильда!");
    }

    public void goTo() {
        System.out.println("Навстречу бросилась"+ " " + getName());
    }

    public String getPhrase() {
        return phrase;
    }

    public void introduceForrestier(){
        System.out.println("Познакомьтесь, это Жорж Дюруа, старый товарищ Шарля" + "\n" + "Это г-жа де Марель, моя подруга" );
    }


    public void kiss(String object, String subject) {
        System.out.println(object + " " + "и " + " "+ subject + " " + "поцеловались");
    }


}

