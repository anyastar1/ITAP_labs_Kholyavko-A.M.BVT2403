package laba2;

public class Mermaid extends Monster {
    protected String colorOfTail;
    protected int levelOfDanger;
    protected String subclass;

    public Mermaid() {
        super();
    }
    public Mermaid(int age, String typeOfCreature, int power, String colorOfTail, int levelOfDanger, String subclass) {
        super(age, typeOfCreature,power);
        this.colorOfTail = colorOfTail;
        this.levelOfDanger = levelOfDanger;
        this.subclass = subclass;
    }
    public String getColorOfTail(){
        return colorOfTail;
    }
    public void setColorOfTail(String colorOfTail){
            this.colorOfTail = colorOfTail;
    }
    public int getLevelOfDanger(){
        return levelOfDanger;
    }
    public void setLevelOfDanger(int levelOfDanger){
        this.levelOfDanger = levelOfDanger;
    }
    public String getSubclass(){
        return subclass;
    }
    public void setSubclass(String subclass){
            this.subclass = subclass;
    }
    
    @Override
    public void infoOfMonster(){
        System.out.println( " Mermaid has subclass: " + subclass +  " them tail is " + colorOfTail + " level of danger is " + levelOfDanger);
    }

    @Override
    public void makeMagic(){
        System.out.println("Mermaid's magic power is singing");
    }

    
}
