public class MemberInfo {
    private int gradYear;
    private boolean goodStanding;
    private String name;
    /**
     * Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     */
    public MemberInfo(String n, int year, boolean gs) {
        gradYear = year;
        goodStanding = gs;
        name = n;
    }


    /** Returns the graduation year of the club member. */
    public int getGradYear() {
        /* implementation not shown */ }


    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding() {
        /* implementation not shown */ }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
