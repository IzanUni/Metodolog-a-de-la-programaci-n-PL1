package es.uah.matcomp.mp.e2.ejerciciosclases.Customer;

public class Invoice {
    private int Id;
    private es.uah.matcomp.mp.e2.ejerciciosclases.Customer.Customer customers;
    private double amount;

    public Invoice(int id, es.uah.matcomp.mp.e2.ejerciciosclases.Customer.Customer customer, double amount) {
        Id = id;
        this.customers = customer;
        this.amount = amount;
    }
    public int getId() {
        return Id;
    }
    public es.uah.matcomp.mp.e2.ejerciciosclases.Customer.Customer getCustomer() {
        return customers;
    }
    public void setCustomer(es.uah.matcomp.mp.e2.ejerciciosclases.Customer.Customer customer) {
        this.customers = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customers.getId();
    }
    public String getCustomerName() {
        return customers.getName();
    }
    public int getCustomerDiscount(){
        return customers.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return amount - (amount * customers.getDiscount()/100);
    }
    public String toString(){
        return "Invoice[id= " + Id + ", customer= " + customers.toString() + ", amount= " + amount + "]";
    }
}
