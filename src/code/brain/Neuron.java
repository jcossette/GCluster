package code.brain;

/**
 * The neuron is a thread which holds a certain amount of information, tasks or behaviors. This is an actor. It can
 * receive information and interacts with other neurons trough their respective interfaces.
 * Created by Julien Cossette on 12/15/2014.
 */

public class Neuron implements Runnable{
    private Thread myThread;

    public Neuron(){
        myThread = new Thread(this);
        myThread.start();
    }

    @Override
    public void run(){

    }
}
