import java.util.Random;

public class Item {
    protected double health;
    protected double gender;
    protected double age;
    protected double burden;
    protected double speed;
    protected double strength;
    protected double shield;
    protected double hostility;
    protected double reach;
    protected double diameter;
    protected double x;
    protected double y;
    protected Entity type;

    // All of our getter functions.
    public double getHealth()    { return health;    }
    public double getGender()    { return gender;    }
    public double getAge()       { return age;       }
    public double getBurden()    { return burden;    }
    public double getSpeed()     { return speed;     }
    public double getStrength()  { return strength;  }
    public double getShield()    { return shield;    }
    public double getHostility() { return hostility; }
    public double getReach()     { return reach;     }
    public double getDiameter()  { return diameter;  }
    public double getX()         { return x;         }
    public double getY()         { return y;         }
    public Entity getType()      { return type;      }

    // Consturctor
    public Item(Entity type) {
        this.type = type;
    }

    // The Globally Used Random Number Generator
    public static double rand() {
        return (new Random()).nextDouble();
    }
}
