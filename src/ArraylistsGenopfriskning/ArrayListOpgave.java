package ArraylistsGenopfriskning;

import java.util.ArrayList;

public class ArrayListOpgave {
    private ArrayList<String> listOfNames = new ArrayList();
    private String name;

    public boolean doesArraylistContainString(ArrayList listOfNames, String name){

        for (int i = 0; i < listOfNames.size(); i++){

            if (listOfNames.get(i).equals(name)){
                System.out.println("The String has been found");
                return true;
            }

        }
        listOfNames.add(name);
        System.out.println(name + " has been added to the list.");
        return false;
    }

    public ArrayList<String> getListOfNames() {
        return listOfNames;
    }

    public String getName() {
        return name;
    }
}
