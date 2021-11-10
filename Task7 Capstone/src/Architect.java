public class Architect {
// Attributes fof client
    String name;
    int contacts;
    String email;
    String address;
// Methods for use
    public Architect(String name,int contacts,String email,String address ){
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
        String output = " Architect name: " + name;
        output+= "\n Architect contacts: " + contacts;
        output+= "\n Architect email: " + email;
        output+= "\n Architect address: " + address;
        return output;
        }
}
