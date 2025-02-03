class BankAccount{
    private static String bankName = "State Bank Of India";
    private static int totalCount = 0;
    private final int accountNo;
    private String accountHolder;

    public BankAccount(int accountNo,String accountHolder){
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        totalCount++;
    }
    public static void getTotalAccounts(){
        System.out.println("Total Accounts: "+totalCount);
    }

    public void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank: "+bankName);
            System.out.println("Account Number: "+accountNo);
            System.out.println("Account Holder: "+accountHolder);
        }
    }

    public static void main(String[] args){
        BankAccount b1 = new BankAccount(123456,"Prashant");
        BankAccount b2 = new BankAccount(789012,"Shivangi");
        b1.displayDetails();
        b2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}