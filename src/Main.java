
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRMSystem crm = new CRMSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- CRM MENU ---");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Search Customer");
            System.out.println("4. Update Customer");
            System.out.println("5. Delete Customer");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    crm.addCustomer(new Customer(id, name, email, phone, address));
                    break;

                case 2:
                    crm.viewCustomers();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    Customer found = crm.searchCustomer(sid);
                    System.out.println(found != null ? "✅ " + found.getDetails() : "❌ Customer not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    crm.updateCustomer(uid, newName);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    crm.deleteCustomer(did);
                    break;

                case 6:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("❗ Invalid option.");
            }
        }
    }
}
