package actividad;
/**
 *
 * @author alfre
 */
public class cuentaMain {
    public static void main(String[] args) {
        new cuenta("acceso 1").start();
        new cuenta("acceso 2").start();
        new cuenta("deposito 1").start();
        new cuenta("deposito 2").start();
        System.out.println("termina hilo principal");
    }
}
