public class Member {

    // 1. Private Attributes (Encapsulation)
    private String name;
    private int memberId;

    // 2. Parameterized Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // 3. Public Getters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    // Optional: A descriptive method demonstrating behavior
    public void displayMemberInfo() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");
    }
}