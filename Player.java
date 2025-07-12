public class Player {
    public double health = 100;
    public double attackDamage = 10;
    public String playerName = "Player";
    public String playerClass = "NONE";

    public void printStats() {
        System.out.println(playerName + "'s STATS");
        System.out.println("CLASS: " + playerClass);
        System.out.println("Player Health: " + health);
        System.out.println("Player Attack Damage: " + attackDamage);
    }
}