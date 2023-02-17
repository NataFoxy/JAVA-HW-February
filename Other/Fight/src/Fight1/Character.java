package Fight1;

public abstract class Character {
    protected WeaponBehavior weapon;

    public abstract void fight();

    public void startFight(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w){

        this.weapon=w;
    }


}
