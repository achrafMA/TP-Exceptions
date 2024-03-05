public class App {
    public static void main(String[] args) {
        EntierNaturel e1=new EntierNaturel(4);
        e1.setVal(5);
        e1.affichage();
        e1.decrementer();
        e1.affichage();
        e1.setVal(-5);
        e1.affichage();
    }
}
