package laba2;
class Dragon extends Monster{

    protected String sizeOfDragon;
    protected int widthOfWings ;
    protected String name;

    public Dragon() {
        super();
    }
    public Dragon(int age, String typeOfCreature, int power, String sizeOfDragon, int widthOfWings, String name) {
        super(age, typeOfCreature,power);
        this.sizeOfDragon = sizeOfDragon;
        this.widthOfWings = widthOfWings;
        this.name = name;
    }
    public String getSizeOfDragon(){
        return sizeOfDragon;
    }
    public void setSizeOfDragon(String sizeOfDragon){
            this.sizeOfDragon = sizeOfDragon;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
            this.name = name;
    }
    public int getWidthOfWings(){
        return widthOfWings;
    }
    public void setWidthOfWings(int widthOfWings){
            this.widthOfWings = widthOfWings;
    }

    @Override
    public void infoOfMonster(){
        System.out.println( "Dragon's size is: " + sizeOfDragon +  " them width of wings is " + widthOfWings + " and the name  is " + name);
    }
    
    @Override
    public void makeMagic(){
        System.out.println("Dragon's magic power is fire");
    }

    
}

