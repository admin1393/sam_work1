public class Unit {
    private int hp;
    private String name;

    public Unit() {
    }

    public Unit(Unit unit) {
        name = unit.name;
        hp = unit.hp;
    }

    public Unit(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public Unit(int hp) {
        this.hp = hp;
    }

    public Unit(String name) {
        this.name = name;
    }

    public void prInfo(){
        System.out.println("Name: "+ name);
        System.out.println("HP: "+ hp);
    }
}
