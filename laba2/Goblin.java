package laba2;

class Goblin extends Monster {
  
    protected String weapon;
    protected int health;
    protected String typeOfAttack;

    public Goblin() {
        super();
    }
    public Goblin(int age, String typeOfCreature, int power, String weapon , int health, String typeOfAttack) {
        super(age, typeOfCreature,power);
        this.weapon = weapon;
        this.health = health;
        this.typeOfAttack = typeOfAttack;
    }
    public String getWeapon(){
        return weapon;
    }
    public void setWeapon(String weapon){
            this.weapon = weapon;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
            this.health = health;
    }
    public String getTypeOfAttack(){
        return typeOfAttack;
    }
    public void setTypeOfAttack(String typeOfAttack){
            this.typeOfAttack = typeOfAttack;
    }
    
    @Override
    public void infoOfMonster(){
        System.out.println( " Goblin has weapon: " +  weapon +  " them health is " +  health + " type of attack is  " + typeOfAttack);
    }

    @Override
    public void makeMagic(){
        System.out.println("Goblin's magic power is doing gold swords");
    }

    
}


