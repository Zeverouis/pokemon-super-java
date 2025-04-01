public class FirePokemon extends pokemonsuper {
    private int fireHeight;
    private boolean alive;

    public FirePokemon(int fireHeight, boolean alive, String name, int level, int hp, String food) {
        super(name, level, hp, food);
        this.fireHeight = fireHeight;
        this.alive = alive;
    }

    public int getFireHeight() {
        return fireHeight;
    }

    public void setFireHeight(int fireHeight) {
        this.fireHeight = fireHeight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void bigFire(){
        if (fireHeight > 100) {
            System.out.println(getName() + " " + "stop it right now!");
        } else if (fireHeight == 100) {
            System.out.println("Burn baby burn!");
        } else {
            System.out.println("Nice campfire!");
        }
    }

    public void status(){
        if (getHp() <= 0) {
            setAlive(false);
            System.out.println("Better go see Nurse Joy!");
        } else if (getHp() > 50) {
            setAlive(true);
            System.out.println(getName() + " " + "can go another round.");
        } else {
            setAlive(true);
            System.out.println("It's but a fleshwound.");
        }
    }

    @Override
    public void food(){
        System.out.println(super.getName() + " " +  "eats steaks!");
    }
}
