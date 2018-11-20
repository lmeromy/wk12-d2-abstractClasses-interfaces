import behaviors.IAttack;
import behaviors.IDamage;

public abstract class Kaiju implements IDamage, IAttack {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
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

    public String roar(){
        return "ROAR!";
    }

    public void takeDamage(int damage) {
        int currentHealth = this.getHealthValue();
        this.setHealthValue(currentHealth -= damage);
    }

    public void attack(IDamage victim) {
        victim.takeDamage(this.attackValue);
    }

    public abstract String fly();

}
