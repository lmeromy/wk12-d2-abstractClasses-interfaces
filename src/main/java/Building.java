import behaviors.IDamage;

public class Building implements IDamage {

    int healthValue;

    public Building(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void takeDamage(int damage) {
        int currentHealth = this.getHealthValue();
        this.setHealthValue(currentHealth -= damage);

    }

}
