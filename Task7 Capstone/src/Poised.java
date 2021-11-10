// Import java util package
import java.util.*;

public class Poised {
    public static void main(String[] args) {
        Scanner userI = new Scanner(System.in);

// Project inputs

        System.out.println(" Enter the project name: ");
        String  projectname = userI.nextLine();
        System.out.println("Enter the project number: ");
        int projectnumber = Integer.parseInt(userI.nextLine());
        System.out.println("Enter the project erfnumber: ");
        int projecterfnumber = Integer.parseInt(userI.nextLine());
        System.out.println("Enter the project type: ");
        String projecttype = userI.nextLine();
        System.out.println("Enter the project address as: street number-street name-town-province");
        String projectaddress = userI.nextLine();
        System.out.println("Enter the project cost");
        int projectcost = Integer.parseInt(userI.nextLine());
        System.out.println("Enter the cost paid to date");
        int paidtodate = Integer.parseInt(userI.nextLine());
        System.out.println("Enter the project deadline as: yyy-MM-dd");
        String projectdeadline = userI.nextLine();

// Client inputs
        System.out.println("Enter client's name ");
        String clientname = userI.nextLine();
        System.out.println("Enter clients's contact number:");
        int clientcontacts = Integer.parseInt(userI.nextLine());
        System.out.println("Enter client email address:");
        String clientemail = userI.nextLine();
        System.out.println("Enter client physical address:street number-street name-town-province");
        String clientaddress = userI.nextLine();

// Architect inputs
        System.out.println("Enter architect name ");
        String architectname = userI.nextLine();
        System.out.println("Enter architect contact number:");
        int architectcontacts = Integer.parseInt(userI.nextLine());
        System.out.println("Enter architect email address:");
        String architectemail = userI.nextLine();
        System.out.println("Enter architect physical address:street number-street name-town-province");
        String architectaddress = userI.nextLine();

// Contractor inputs
        System.out.println("Enter contractor's name ");
        String contractorname = userI.nextLine();
        System.out.println("Enter contractor's contact number:");
        int contractorcontacts = Integer.parseInt(userI.nextLine());
        System.out.println("Enter contractor email address:");
        String contractoremail = userI.nextLine();
        System.out.println("Enter contractor physical address:street number-street name-town-province");
        String contractoraddress = userI.nextLine();

// Poised company objects

        System.out.println("Project Information \n");
// Project object
        Project sam = new Project(projectname,projectnumber,projecterfnumber,projecttype,
                projectaddress,projectcost,paidtodate,projectdeadline);
        System.out.println(sam);
// Client object
        System.out.println("\n Client Information \n");

        Client nkaki = new Client(clientname,clientcontacts,clientemail,clientaddress);
        System.out.println(nkaki);
// Architect object
        System.out.println("\n Architect Information \n");

        Client ralieta = new Client(architectname,architectcontacts,architectemail,architectaddress  );
        System.out.println(ralieta);

// Contractor object

        System.out.println("\n Contractor Information \n");

        Client tom = new Client(contractorname,contractorcontacts,contractoremail,contractoraddress );
        System.out.println(tom);

    }

}
