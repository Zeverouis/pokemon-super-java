public class main {
    public static void main(String[] args) {
        WaterPokemon Blastoise = new WaterPokemon(50, false, "Henk", 1, 20, "Carrots");
        GrassPokemon Venusaur = new GrassPokemon(50, false, "Venusaur", 6, 60, "Duck");
        ElectricPokemon Raichu = new ElectricPokemon(0, true, "Raichu", 8, 150, "Socket");
        FirePokemon Charizard = new FirePokemon(200, true, "Mary", 50, 100, "potato");

        System.out.println();
        Charizard.bigFire();
        Charizard.status();
        Charizard.pokemonName();

        System.out.println();
        Blastoise.food();
        Blastoise.bigWater();
        Blastoise.status();

        System.out.println();
        Raichu.food();
        Raichu.status();
        Raichu.pokemonLevel();
        Raichu.bigElectric();

        System.out.println();
        Venusaur.food();
        Venusaur.levelUp();
        Venusaur.status();
        Venusaur.bigLeaves();
    }
}
