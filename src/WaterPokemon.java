public class WaterPokemon extends pokemonsuper {
    private int waterHeight;
    private boolean alive;

    public WaterPokemon(int waterHeight, boolean alive, String name, int level, int hp, String food) {
        super(name, level, hp, food);
        this.waterHeight = waterHeight;
        this.alive = alive;
    }

    public int getWaterHeight() {
        return waterHeight;
    }

    public void setWaterHeight(int waterHeight) {
        this.waterHeight = waterHeight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void bigWater(){
        if (waterHeight > 100) {
            System.out.println(getName() + " " + "stop it right now!");
        } else if (waterHeight == 100) {
            System.out.println("is a firehose");
        } else {
            System.out.println("nice kiddypool");
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
        System.out.println(super.getName() + " " +  "eats dolphin!");
    }
}
