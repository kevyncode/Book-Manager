package LibraryManagement.UtilMembers;

public class Members {

    private String nameMember;
    private int cpfMember;
    private String emailMember;
    private String phoneMember;
    private String addressMember;

    public Members(String nameMember, int cpfMember, String phoneMember, String emailMember, String addressMember) {
        this.nameMember = nameMember;
        this.cpfMember = cpfMember;
        this.phoneMember = phoneMember;
        this.emailMember = emailMember;
        this.addressMember = addressMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public int getCpfMember() {
        return cpfMember;
    }

    public void setCpfMember(int cpfMember) {
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
}
