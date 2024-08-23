package LibraryManagement.UtilMembers;

public interface NewMembers {

    void registerNewMember(String nameMember, int cpfMember, String phoneMember, String emailMember, String addressMember, int ticketId);
    void updateInformationMember(String nameMember, int cpfMember, String phoneMember, String emailMember, String addressMember);
    void removeMember(int cpfMember);
    void generateTicketId(int cpfMember);
    void printMembers();

}
