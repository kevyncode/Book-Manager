// src/LibraryManagement/UtilMembers/Members.java
package LibraryManagement.UtilMembers;

public class Members {

    private String nameMember;
    private long cpfMember;
    private String emailMember;
    private String phoneMember;
    private String addressMember;
    private int ticketId;

    public Members(String nameMember, long cpfMember, String phoneMember, String emailMember, String addressMember) {
        this.nameMember = nameMember;
        this.cpfMember = cpfMember;
        this.phoneMember = phoneMember;
        this.emailMember = emailMember;
        this.addressMember = addressMember;
        this.ticketId = 0;
    }

    // Getters e setters
    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public long getCpfMember() {
        return cpfMember;
    }

    public void setCpfMember(long cpfMember) {
        this.cpfMember = cpfMember;
    }

    public String getEmailMember() {
        return emailMember;
    }

    public void setEmailMember(String emailMember) {
        this.emailMember = emailMember;
    }

    public String getPhoneMember() {
        return phoneMember;
    }

    public void setPhoneMember(String phoneMember) {
        this.phoneMember = phoneMember;
    }

    public String getAddressMember() {
        return addressMember;
    }

    public void setAddressMember(String addressMember) {
        this.addressMember = addressMember;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}