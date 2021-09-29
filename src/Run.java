import ArraylistsGenopfriskning.ArrayListOpgave;
import Kvadrater.Kvadrat;

public class Run {

    public static void main(String[] args) {
    ArrayListOpgave arrayListOpgave = new ArrayListOpgave();

        System.out.println(arrayListOpgave.getListOfNames());
    arrayListOpgave.doesArraylistContainString(arrayListOpgave.getListOfNames(),"Peter" );
    arrayListOpgave.doesArraylistContainString(arrayListOpgave.getListOfNames(),"Peter" );
    arrayListOpgave.doesArraylistContainString(arrayListOpgave.getListOfNames(),"Michael" );
    // arrayListOpgave.doesArraylistContainString(arrayListOpgave.getListOfNames(),"Peter" );
        System.out.println(arrayListOpgave.getListOfNames());

    }
}
