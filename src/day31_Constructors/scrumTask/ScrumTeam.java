package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;

    public ArrayList<Tester> testersList = new ArrayList<>();

    public ArrayList<Developer> developersList = new ArrayList<>();

     public int daysofSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysofSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysofSprint = daysofSprint;
    }



    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers) );

    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }

    public void removeTester (int employeeID){
        testersList.removeIf(p-> p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID){
        developersList.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testersList=" + testersList.size() +
                ", developersList=" + developersList.size() +
                ", daysofSprint=" + daysofSprint +
                '}';
    }
}
