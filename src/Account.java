public class Account {

    // Zona de Atributos
    private String id; // Id de la cuenta del banco
    private String name; // Nombre del propietario del banco
    private int balance; // Bance de la cuenta del propietario

    // Zona de Métodos (Constructores)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance + amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeds balance");
        }
        return balance;
    }

    public int transferto(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeds balance");
        }
        return balance;
    }

    public String toString(){
        return "Account[Id = " + id + ", Name = " + name + ", Balance = " + balance + "]";
    }
}

