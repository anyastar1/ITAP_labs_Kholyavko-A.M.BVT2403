package laba2;

class Troll extends Goblin{
    protected String contrAttack ;
    protected  int HP;
    protected int countOfNewSword ;

public Troll(){
    super();
}
public Troll(int age, String typeOfCreature, int power, String weapon, int health, String typeOfAttack, String contrAttack, int HP){
    super(age, typeOfCreature, power, weapon, health, typeOfAttack);
    this.contrAttack = contrAttack;
    this.HP = HP;
}
public String getContrAttack( ){
    return contrAttack;
}
public void setContrAttack(String contrAttack){
        this.contrAttack = contrAttack;
}
public int getHP( ){
    return HP;
}
public void setHP(int HP){
        this.HP = HP;
}
@Override
public void makeMagic(){
    System.out.println(" Troll made a sword ");
    countOfNewSword++;
}

@Override
public void infoOfMonster() {
    System.out.println("Trolls weapon: " + getWeapon() + ", HP: " + HP + ", Counter attack: " + contrAttack + ", Swords made: " + countOfNewSword +  " them health is " +  health + " type of attack is  " + typeOfAttack);
}

public void Damage(){
    System.out.println("Troll is wounded");
    HP-=1;
}

}
