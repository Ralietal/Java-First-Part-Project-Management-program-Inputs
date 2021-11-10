public class Contractor {
    // Attributes fof client
    String name;
    int contacts;
    String email;
    String address;
    // Methods
    public Contractor(String name,int contacts,String email,String address){
        this.name = name;
        this.contacts = contacts;
        this.email = email;
        this.address = address;
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
    public String getAddress(){
        return address;
    }
    public String toString(){
        String output = " Contractor name: " + name;
        output+= "\n Contractor contacts: " + contacts;
        output+= "\n Contractor email: " + email;
        output+= "\n Contractor address: " + address;
        return output;
    }
}
