public class Morel extends Human{
    private boolean isAsked;

    public Morel(String name, String status, boolean isAsked) {
        super(name, status);
        this.isAsked = isAsked;
    }
    public void makeAnnouncement() {
        System.out.println(getName() + " " + "сделал запрос министерству по поводу требования кредитов на колонизацию Алжира" );
        isAsked = true; ///если в методе форестье парметр тру то он опоздал
    }

    public boolean isAsked() {
        return isAsked;
    }
}
