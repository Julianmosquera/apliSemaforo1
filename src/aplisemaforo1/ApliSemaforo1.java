
package aplisemaforo1;

/**
 *
 * @author julianlinux
 */
public class ApliSemaforo1 {

   
    public static void main(String[] args) {
        Semaforo semaforo1=new Semaforo();
        System.out.println("cor inicial:"+semaforo1.darCor());
        semaforo1.porCor("Verde");
        String resp = semaforo1.darCor();
        System.out.println("cor= "+resp);
        //tamen 
        System.out.println("cores:"+semaforo1.darCor());
        //instanciamos un semafor cor azul
        Semaforo semaforoAzul= new Semaforo("Azul");
        System.out.println("cores :"+semaforoAzul.darCor());
        semaforoAzul.porCor("branco");
        System.out.println("nova cor semaforoAzul :"+semaforoAzul.darCor());
        
    }
    
}
