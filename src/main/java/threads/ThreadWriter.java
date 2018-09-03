package threads;


import model.Storage;
import tools.Converter;

import java.util.Scanner;

public class ThreadWriter extends Thread {

    private ThreadReader threadReader;
    private Storage storage;

    public ThreadWriter(Storage storage, ThreadReader threadReader){
        this.storage = storage;
        this.threadReader = threadReader;
    }

    @Override
    public void run(){
        Converter converter = new Converter();
        System.out.println("Enter a number from one to nine thousand nine hundred ninety nine");
        System.out.println("for exit enter \"stop\"");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String in = scanner.nextLine();
            if(in.equals("stop")){
                break;
            }
            if(in == null){
                System.out.println("");
            }
            Integer number = converter.convertWordsToNumber(in);
            synchronized (storage){
                storage.getValueMap().put(number, in);
            }
        }
        threadReader.stopThread();
        try {
            threadReader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
