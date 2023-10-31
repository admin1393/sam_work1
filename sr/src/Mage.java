public class Mage extends Unit {

    private int mana;
    public Mage(int hp, String name, int mana) {
        super(hp, name);
        this.mana = mana;
    }

    public Mage(int hp, int mana) {
        super(hp);
        this.mana = mana;
    }

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    public Mage(int mana) {
        this.mana = mana;
    }

    public Mage(Unit unit, int mana) {
        super(unit);
        this.mana = mana;
    }

    @Override
    public void prInfo(){
        super.prInfo();
        System.out.println("Mana: "+mana);
    }
}
