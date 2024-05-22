package lambdas;

public class RunnableInterfaceEx {

public static void main(String[] args) {
    Runnable run=new Runnable() {
        @Override
        public void run() {
            System.out.println("in runnable interface prior to java 8");

        }
    };
    new Thread(run).start();

    Runnable runlambda=()->{
        System.out.println("in runnable lambda");
    };
    new Thread(runlambda).start();

}


}
