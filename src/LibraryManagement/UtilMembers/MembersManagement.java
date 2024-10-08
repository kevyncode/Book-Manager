// src/LibraryManagement/UtilMembers/MembersManagement.java
package LibraryManagement.UtilMembers;

import java.util.ArrayList;

public class MembersManagement implements NewMembers {

    private final ArrayList<Members> members;

    public MembersManagement() {
        members = new ArrayList<>();
    }

    @Override
    public void registerNewMember(String nameMember, long cpfMember, String phoneMember, String emailMember, String addressMember) {
        Members member = new Members(nameMember, cpfMember, phoneMember, emailMember, addressMember);
        members.add(member);
        System.out.println("Added member: " + member.getNameMember());
    }

    @Override
    public void updateInformationMember(String nameMember, long cpfMember, String phoneMember, String emailMember, String addressMember) {
        for (Members member : members) {
            if (member.getCpfMember() == cpfMember) {
                member.setNameMember(nameMember);
                member.setPhoneMember(phoneMember);
                member.setEmailMember(emailMember);
                member.setAddressMember(addressMember);
                System.out.println("Updated member: " + member.getNameMember());
                return;
            }
        }
        System.out.println("Member with CPF " + cpfMember + " not found.");
    }

    @Override
    public void removeMember(long cpfMember) {
        for (Members member : members) {
            if (member.getCpfMember() == cpfMember) {
                members.remove(member);
                System.out.println("Removed member: " + member.getNameMember());
                return;
            }
        }
        System.out.println("Member with CPF " + cpfMember + " not found.");
    }

    @Override
    public void generateTicketId(long cpfMember) {
        for (Members member : members) {
            if (member.getCpfMember() == cpfMember) {
             long ticketId =cpfMember % 100000;
             member.setTicketId((int) ticketId);
             System.out.println("Generated ticket ID: " + ticketId);
             return;
            }
        }
        System.out.println("Member with CPF " + cpfMember + " not found.");
    }

    @Override
    public void printMembers() {
        if (members.isEmpty()) {
            System.out.println("No members available.");
        } else {
            for (Members member : members) {
                System.out.println("=====================================");
                System.out.println("Name: " + member.getNameMember());
                System.out.println("CPF: " + member.getCpfMember());
                System.out.println("Phone: " + member.getPhoneMember());
                System.out.println("Email: " + member.getEmailMember());
                System.out.println("Address: " + member.getAddressMember());
                System.out.println("Ticket ID: " + member.getTicketId());
                System.out.println("=====================================");
            }
        }
    }
}