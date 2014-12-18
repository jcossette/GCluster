package code.brain.Data;

import java.util.ArrayList;

/**
 * This is the data class of an information packet. This item contains a list of information bits.
 * Created by Julien Cossette on 12/15/2014.
 */
public class InformationPackage{
    private ArrayList<InformationBit> myInformationBits;

    public InformationPackage(){
        setInformation(new ArrayList<InformationBit>());
    }

    public ArrayList<InformationBit> getInformation(){
        return myInformationBits;
    }

    public void setInformation(ArrayList<InformationBit> myInformationBits){
        this.myInformationBits = myInformationBits;
    }
}
