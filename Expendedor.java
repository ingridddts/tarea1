package tarea12023;

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoVuelto dv;
    private int precio;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    
    public Expendedor(int numBebidas, int precioBebidas){
        this.precio=precioBebidas;
        coca= new Deposito();
        sprite= new Deposito();
        dv= new DepositoVuelto();
        this.precio=precio;
              
        for (int i = 0; i < numBebidas; i++) { //rellenar máquina con bebidas
            CocaCola a= new CocaCola(100+i);
            coca.addBebida(a);
            Sprite b = new Sprite(200+i);
            sprite.addBebida(b);        
        }
    }
    
    public Bebida comprarBebida(Moneda moneda, int cual){
        /*Vuelto en multiplos de 100*/
        Bebida bebida = null;
        if( moneda == null ){
            return bebida;
         }
        if((cual != COCA && cual != SPRITE) || moneda.getValor() < precio){
            dv.addMoneda(moneda);
            return null;
        }
        if(cual==COCA){
            bebida= coca.getBebida();
        }
        if (cual==SPRITE){
            bebida = sprite.getBebida();
        }
        if(bebida != null){
           int vuelto= moneda.getValor()- precio;
                  
            while(vuelto > 0){
                dv.addMoneda(new Moneda100() );
                vuelto = vuelto - 100;
            }
            return bebida;
        }
              
        else{
            dv.addMoneda(moneda);
            return null;
        }    
    }
          
    public Moneda getVuelto(){
        return dv.getMoneda();    
    }     
}
