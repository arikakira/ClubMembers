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

    public String toString() {
        String s = "\nName: " + name + "\n";
        s += "Year: " + gradYear + "\n";
        return s + "Good Standing: " + goodStanding + "\n";
    }


    /** Returns the graduation year of the club member. */
    public int getGradYear() {
        return gradYear;
    }


    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding() {
        return goodStanding;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
