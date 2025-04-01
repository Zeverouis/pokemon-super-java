public class GrassPokemon extends pokemonsuper{
    private int leaves;
    private boolean alive;

    public GrassPokemon(int leaves, boolean alive, String name, int level, int hp, String food) {
        super(name, level, hp, food);
        this.leaves = leaves;
        this.alive = alive;
    }

    public int getleaves() {
        return leaves;
    }

    public void setleaves(int leaves) {
        this.leaves = leaves;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void bigLeaves(){
        if (leaves > 100) {
            System.out.println(getName() + " " + "stop it right now!");
        } else if (leaves == 100) {
            System.out.println("a whole garden of em!");
        } else {
            System.out.println("at least you tried.");
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
        System.out.println(super.getName() + " " + "eats carrots!");
    }
}
