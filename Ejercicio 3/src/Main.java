public class Main {
    public static void main(String[]args){

        Thread hilo = new Thread(new PrintMe());
        Thread hilo2 = new Thread(new PrintMe());
        Thread hilo3 = new Thread(new PrintMe());

        hilo.start();
        hilo2.start();
        hilo3.start();
        try {
            Thread.currentThread().sleep( 2000 );
        }catch( InterruptedException e ){}
    }

    public static class PrintMe implements Runnable {
        @Override
        public void run() {
            for (int i =0; i <= 1; i++) {
                System.out.println("Numero 1");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 2");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 3");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 4");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 5");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 6");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 7");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 8");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 9");
            }
            for (int i=0; i<=1; i++){
                System.out.println("Numero 10");
            }
        }
    }
}
