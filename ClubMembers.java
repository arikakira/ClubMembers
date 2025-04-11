import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }


    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        for(String x : names) {
            memberList.add(new MemberInfo(x, gradYear, true));
        }
    }


    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        /* to be implemented in part (b) */ }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}