public class Money {
    private String name;
    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Money(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public void withdraw (Double a){
        if(this.getAmount() >= a){
            this.setAmount(this.getAmount() - a);
            System.out.println(this.amount);
        }else
        System.out.println("NOT ENOUGH MONEY");
    }
    
    
}
