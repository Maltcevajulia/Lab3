enum Feelings {
    EMBARRASED("почувствовал себя неловко"),

    BEAFRAID("боялся нарушить этикет");
    private String title;
Feelings (String title){
    this.title = title;
}
@Override
    public String toString() {
    return title;
}

}
