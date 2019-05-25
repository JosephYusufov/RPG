public class Character{                                                         //hw3E#0

    //modified fields from public to protected
    protected int health;  //hw3C#1  //hw3C#2
    protected int strength;  //hw3C#1  //hw3C#2
    protected double attack;  //hw3C#1  //hw3C#2
    // public double attackNormal;
    protected int defense;  //hw3C#1  //hw3C#2
    // public int defenseNormal;

    public boolean isAlive(){  //hw3C#1  //hw3C#2
        return health > 0;
    }

    public int getDefense(){  //hw3C#1  //hw3C#2
        return defense;
    }

    public int getHealth(){  //hw3C#1  //hw3C#2
        return health;
    }

    protected void lowerHP(int dmg){  //hw3C#1  //hw3C#2
        health -= dmg;
    }

    protected int attack(Character target){  //hw3E#0ish  //hw3C#1  //hw3C#2
        int damage = (int)((strength * attack) - target.getDefense());
        target.lowerHP(damage);
        return damage;
    }
}
