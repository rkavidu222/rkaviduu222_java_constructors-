public class Sun {
    int i;
    int j;

    Sun(){
        i=10;
        j=20;
        System.out.println("Constructor called first!");
    }

    public static void main(String[] args) {
        Sun s= new Sun();
        System.out.println("Addition:-" +(s.i+ s.j));
    }
}
