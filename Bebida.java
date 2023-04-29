package tarea12023;

abstract class Bebida extends Producto{
    private int serie; //codigo bebida
    
    public Bebida(int serie){
        //this.serie = serie;
        super(serie);
    }
    public int getSerie(){
        return serie;
    }
    
    public abstract String sabor();
}