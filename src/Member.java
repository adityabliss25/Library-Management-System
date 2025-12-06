public class Member {

    // Added 'final' as these attributes are set only once in the constructor
    private final String name;
    private final int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    // Method that was previously flagged as unused
    public int getMemberId() {
        return memberId;
    }

    public void displayMemberInfo() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");
    }
}