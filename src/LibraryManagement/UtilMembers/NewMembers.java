package LibraryManagement.UtilMembers;

public interface NewMembers {

    void registerNewMember(String nameMember, long cpfMember, String phoneMember, String emailMember, String addressMember);

    void updateInformationMember(String nameMember, long cpfMember, String phoneMember, String emailMember, String addressMember);

    void removeMember(long cpfMember);

    void generateTicketId(long cpfMember);

    void printMembers();

}
