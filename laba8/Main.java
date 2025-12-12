public class Main {
    public static void main(String[] args) {
        DataManager person = new DataManager();
        person.registerDataProcessor(new Filter());
        person. registerDataProcessor(new Transform());
        person.loadData("input.txt");
        person.processData();
        person.saveData("output.txt");
        person.shutdown();
    }
}