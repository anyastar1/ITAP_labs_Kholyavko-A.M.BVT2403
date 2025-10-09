package laba2;

public abstract class Monster {
    protected int age;
    protected String typeOfCreature;
    protected int power;
    
    private static int count = 0;

    public abstract void makeMagic();
    public abstract void infoOfMonster();

    public Monster( ){
        this.age = 0;
        this.typeOfCreature = "unknown";
        this.power = 100;
        count++;
    }
    public Monster(int age, String typeOfCreature, int power ){
        this.age = age;
        this.typeOfCreature = typeOfCreature;
        this.power = power;
        count++;
    }
    public static int сountOfMonsters(){
        return count;
    }
    public int getAge(){
         return age;
    }
    public void setAge(int age){
        if (age>=0){
            this.age = age;
        }
        else{
            System.out.println("wrong age, try again!");
        }
    }
    public String getTypeOfCreature(){
        return typeOfCreature;
   }
    public void setTypeOfCreature(String typeOfCreature){
           this.typeOfCreature = typeOfCreature;
   }
   public int getPower(){
    return power;
    }
    public void setPower(int power){
        this.power = power;
    }
    public static void main(String[] args) {
    
        Troll troll = new Troll(250, "Ogr", 200, "Club", 100, "Jump","Light of sun", 1);
        Siren siren = new Siren(80, "aqua monster", 300, "black", 12,"sea spirit", "Lampada", 1);
        Dragon dragon = new Dragon(300, "reptilia", 10, "huge", 25, "Bobik");
        Goblin newGoblin = new Goblin();
        Monster[] monsters = {troll, siren, dragon};
        
        for (Monster monster : monsters) {  
            monster.makeMagic(); 
        }
        
        System.out.println("Name of Dragon: " + dragon.getName());
        troll.setHealth(280);
        System.out.println("New health of Troll: " + troll.getHealth());
        
        troll.infoOfMonster();
        siren.infoOfMonster();
        dragon.infoOfMonster();
        newGoblin.infoOfMonster();
    
        
        System.out.println("Final number of monsters: " + Monster.сountOfMonsters());
        
        Dragon anotherDragon = new Dragon();
        System.out.println("After I maid a new dragon: " + Monster.сountOfMonsters());
        
    
    }
}


