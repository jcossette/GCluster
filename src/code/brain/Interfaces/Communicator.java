package code.brain.Interfaces;

/**
 * This is the interface that neurons use to communicate information.
 * Created by Julien Cossette on 12/15/2014.
 */
public interface Communicator{

    /**
     * Trough this method we can send information packets to a Communicator
     * @return
     */
    public boolean takeInformation();

    /**
     * This method is used to make a Communicator aware of our presence and
     * receive a certain amount of information about him.
     * @return
     */
    public boolean poke();
}
