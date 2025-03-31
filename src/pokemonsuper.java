import java.util.Scanner;

public class pokemonsuper {
    private String name;
    private int level;
    private int xp;
    private int hp;
    private String food;


    public pokemonsuper(String name, int level, int hp, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void pokemonLevel(int level) {
        System.out.println("Your pokemon's level is" + getLevel());
    }

    public void pokemonName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name your new pokémon!");
        name = sc.nextLine();
        System.out.println("New name =" + " " + getName());
    }
}
