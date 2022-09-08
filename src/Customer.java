public class Customer {
    private int id;
    private String secondName;
    private String name;
    private String fatherName;
    private String address;
    private int numberCard;
    private int balance;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String toString(){
        return "Id: "+id+" Name: "+name+ " " +secondName+ " "+ fatherName
        +" \nAddress: "+address+" \nNumber card: "+numberCard+" ,Balance: "+balance+"\n";
    }

}
