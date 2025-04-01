import java.util.Scanner;

public abstract class pokemonsuper {
    private String name;
    private int level;
    private int hp;
    private String food;


    public pokemonsuper(String name, int level, int hp, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
    }

    public pokemonsuper() {
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

    public void pokemonLevel() {
        System.out.println("Your pokemon's level is" + " " + getLevel());
    }

    public void levelUp() {
        this.level++;
        System.out.println("Your" + " " + name + " " + "leveled up! New level is:" + level);
    }

    public void pokemonName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name your new pokémon!");
        name = sc.nextLine();
        System.out.println("New name =" + " " + getName());
    }

    public abstract void food();
}
