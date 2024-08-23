package LibraryManagement.UtilMembers;

import java.util.Scanner;

public class MembersTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MembersManagement membersManagement = new MembersManagement();

        while (true) {
            System.out.println("1. Register new member");
            System.out.println("2. Update member information");
            System.out.println("3. Remove member");
            System.out.println("4. Print members");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter CPF: ");
                    long cpf = scanner.nextLong();
                    System.out.print("Enter phone: ");
                    String phone = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    System.out.print("Enter address: ");
                    String address = scanner.next();

                    //register for new member
                    membersManagement.registerNewMember(name, cpf, phone, email, address);

                    //question the user a crate new ticket ID
                    System.out.println("Do you want to generate a ticket id for this member? (yes/no): ");
                    String generateTicketResponse = scanner.next();
                    if (generateTicketResponse.equalsIgnoreCase("yes")){
                        membersManagement.generateTicketId(cpf);
                    }
                    break;
                case 2:
                    System.out.print("Enter CPF: ");
                    long cpfUpdate = scanner.nextLong();
                    System.out.print("Enter new name: ");
                    String nameUpdate = scanner.next();
                    System.out.print("Enter new phone: ");
                    String phoneUpdate = scanner.next();
                    System.out.print("Enter new email: ");
                    String emailUpdate = scanner.next();
                    System.out.print("Enter new address: ");
                    String addressUpdate = scanner.next();
                    membersManagement.updateInformationMember(nameUpdate, cpfUpdate, phoneUpdate, emailUpdate, addressUpdate);
                    break;
                case 3:
                    System.out.print("Enter CPF: ");
                    long cpfRemove = scanner.nextLong();
                    membersManagement.removeMember(cpfRemove);
                    break;
                case 4:
                    membersManagement.printMembers();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}