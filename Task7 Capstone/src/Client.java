public class Client {
    // Attributes fof client
    String name;
    int contacts;
    String email;
    String physicaladress;
    // Methods for use
    public Client(String name,int contacts,String email,String physicaladress){
        this.name = name;
        this.contacts = contacts;
        this.email = email;
        this.physicaladress = physicaladress;
    }
    public String getName(){
        return name;
    }
    public int getContacts(){
        return contacts;
    }
    public String getEmail(){
        return email;
    }
    public String getPhysicaladress(){
        return physicaladress;
    }
    public String toString(){
        String output = " Client name: " + name;
        output+= "\n Client contacts: " + contacts;
        output+= "\n Client email: " + email;
        output+= "\n Client physical address: " + physicaladress;
        return output;
        }
}
