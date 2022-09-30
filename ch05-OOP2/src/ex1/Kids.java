package ex1;

public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {
    }

    public Kids(int sex, int salary) {
        super(sex, salary);
    }

    public void printAge() {
        System.out.println("The age is :" + yearsOld);
    }

    @Override
    public void employed() {
        //super.employed();
        System.out.println("Kids should study and have no job!");
    }
}
