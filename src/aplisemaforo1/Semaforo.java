package aplisemaforo1;



/**
 *
 * @author julianlinux
 */
public class Semaforo {
    //atributos
    private String cor;
    //métodos:
    //Constructores
    public Semaforo(){
        
    }
    public Semaforo(String c){
        cor=c;
    }
    public void porCor(String c){
        cor=c;
    }
    public String darCor (){
        return cor;
    } 
}
