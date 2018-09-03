package threads;


import model.Storage;

import java.util.Collections;

public class ThreadReader extends Thread {
    private volatile  boolean isStop = false;
    private Storage storage;

    public ThreadReader(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run(){
        Integer minValue = 0;
        while(!isStop){
            try {
                Thread.sleep(5000);
                synchronized (storage){
                    if(!storage.getValueMap().isEmpty()) {
                        minValue = Collections.min(storage.getValueMap().keySet());
                        storage.getValueMap().remove(minValue);
                    }
                }
                if(minValue!= 0) {
                    System.out.println(minValue);
                    minValue = 0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread(){
        isStop = true;
    }
}
