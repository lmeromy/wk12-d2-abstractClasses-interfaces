import behaviors.IAttack;
import behaviors.IDamage;

public abstract class Vehicle implements IAttack, IDamage {


    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void takeDamage(int damage) {
        int currentHealth = this.getHealthValue();
        this.setHealthValue(currentHealth -= damage);
    }

    public void attack(IDamage victim) {
        // should take in an entity to be attacked
        // then in the body here, we will call entity.takeDamage()
        victim.takeDamage(this.attackValue);
        // and pass in the attack value of the attacker!
    }




}
