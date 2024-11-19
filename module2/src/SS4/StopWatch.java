package SS4;

public class StopWatch {
    private long startTime, endTime;
    StopWatch(){
        startTime= System.currentTimeMillis();
    }
    void start() {
        startTime = System.currentTimeMillis();
    }
    void stop(){
        endTime= System.currentTimeMillis();
    }
    long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args){
        StopWatch sw= new StopWatch();
        sw.start();

        for(int i=0; i < 1000000; i++){
            System.out.print("");
        }
        sw.stop();
        System.out.println("Elapsed time: "+ sw.getElapsedTime()+ "millseconds");
    }
}
