public class ElectricPokemon extends pokemonsuper{
    private int electricCharge;
    private boolean alive;

    public ElectricPokemon(int electricCharge, boolean alive, String name, int level, int hp, String food) {
        super(name, level, hp, food);
        this.electricCharge = electricCharge;
        this.alive = alive;
    }

    public int getelectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(int electricCharge) {
        this.electricCharge = electricCharge;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void bigElectric(){
        if (electricCharge > 100) {
            System.out.println(getName() + " " + "stop it right now!");
        } else if (electricCharge == 100) {
            System.out.println("You can charge a computer for sure!");
        } else {
            System.out.println("a little static");
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
        System.out.println(super.getName() + " " + "eats hamburg!");
    }
}
