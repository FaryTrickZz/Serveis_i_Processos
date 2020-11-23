class HelloThread implements Runnable {
    Thread t;
    HelloThread () {
        t = new Thread(this, "nou Thread");
        System.out.println("Creat fil: " + t);
        t.start();
    }

    public void run() {
        System.out.println("Hola des del fil creat!");
        System.out.println("Fil finalitzant.");
    }

}

class RunThread {
    public static void main(String args[]) {
        new HelloThread();
        System.out.println("Hola des de el fil principal");
        System.out.println("Proces acabant");
    }
}
