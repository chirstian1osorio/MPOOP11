package grupos;
/**
 *
 * @author alfre
 */
public class GruposMain {
    public static void main(String[] args) {
        ThreadGroup grupoHilos=new ThreadGroup("grupo de hilos");
        Thread hilo1=new HiloDeGrupos(grupoHilos,"hilo 1 con prioridad normal");
        Thread hilo2=new HiloDeGrupos(grupoHilos,"hilo 2 con prioridad normal");
        Thread hilo3=new HiloDeGrupos(grupoHilos,"hilo 3 con prioridad maxima");
        Thread hilo4=new HiloDeGrupos(grupoHilos,"hilo 4 con prioridad normal");
        Thread hilo5=new HiloDeGrupos(grupoHilos,"hilo 5 con prioridad normal");
        
        hilo3.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
       
        System.out.println(" prioridad del hilo 1"+hilo1.getPriority());
        System.out.println(" prioridad del hilo 2"+hilo2.getPriority());
        System.out.println(" prioridad del hilo 3"+hilo3.getPriority());
        System.out.println(" prioridad del hilo 4"+hilo4.getPriority());
        System.out.println(" prioridad del hilo 5"+hilo5.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listarHilos(grupoHilos);
    }

    private static void listarHilos(ThreadGroup grupoHilos) {
        int numHilos;
        Thread[] listaDeHilos;
        numHilos=grupoHilos.activeCount();
        listaDeHilos= new Thread[numHilos];
        grupoHilos.enumerate(listaDeHilos);
        System.out.println("el numero de hilos"
                + " activos: "+numHilos);
        for (int i = 0; i < numHilos; i++) {
            System.out.println("soy el hilo "
                    +listaDeHilos[i].getName()+"en pos "+1);
        }
    }
    
}
