public class Weapon extends Item {
    // Constructor
    public Weapon() {
        super(Entity.WEAPON);
        this.strength = 0.5 + 0.5 * rand(); // The strength is always from 0.5 to 1
        this.x = rand();
        this.y = rand();
    }
}
