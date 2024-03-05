public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) {
        try {
            if (val<0) throw new NombreNegatifException("Nombre negatif");
                this.val = val;
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        try {
            if (val<0) throw new NombreNegatifException("Nombre negatif");
            this.val = val;
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
    }
    public void decrementer(){
        try {
            if (val<0) throw new NombreNegatifException("Nombre negatif");
            val+=1;
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
    }
    public void affichage(){
        try {
            if (val<0) throw new NombreNegatifException("Nombre negatif");
            System.out.println("val: "+val);
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
    }
}
