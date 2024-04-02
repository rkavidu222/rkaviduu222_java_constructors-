public class ProgrammingLanguage {

    String name;
    ProgrammingLanguage(){
        this.name="java";
    }
    ProgrammingLanguage(String name){
        this.name=name;
    }

    public void getName() {
        System.out.println("Programmong languasge is :- "+name);
    }

    public static void main(String[] args) {
        ProgrammingLanguage pl=new ProgrammingLanguage();
        ProgrammingLanguage pl1=new ProgrammingLanguage("Python");
        pl.getName();
        pl1.getName();
    }
}
