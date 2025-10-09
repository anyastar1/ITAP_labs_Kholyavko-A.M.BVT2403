package laba2;

class Siren extends Mermaid{
    protected String song;
    protected  float mana;
    protected int numOfVictim;

public Siren(){
    super();
}
public Siren(int age, String typeOfCreature, int power, String colorOfTail, int levelOfDanger, String subclass, String song, float mana){
    super(age, typeOfCreature, power, colorOfTail, levelOfDanger, subclass);
    this.song = song;
    this.mana = mana;
}
public String getSong( ){
    return song;
}
public void setSong(String song){
        this.song = song;
}
public float getMana( ){
    return mana;
}
public void setMana(float mana){
        this.mana = mana;
}

@Override

public void makeMagic(){
    System.out.println("Siren sings " + song );
    mana-=2;
    numOfVictim++;
}
public void toDive(){
    System.out.println("Mermaid are diving");
}

@Override

public void infoOfMonster() {
    System.out.println("Sirens song: " + song + ", Mana: " + mana + ", Victims: " + numOfVictim + ", Tail: " + colorOfTail + ", has subclass: " + subclass + ", level of danger is " + levelOfDanger);
}

}