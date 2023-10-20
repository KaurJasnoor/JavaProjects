package Java_Assignments.Assignment4.Prob2;

public class Soccer extends Sports{
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    String getNumberOfTeamMembers() {
        return "Each team has 11 players in " +getName();
    }

}
