import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Bank {
    // Customer details
    static Vector<String> CustomerName = new Vector<String>();
    static Vector<Integer> CustomerID = new Vector<Integer>();
    static Vector<Integer> AccountNumber = new Vector<Integer>();
    static Vector<Integer> AccountType = new Vector<Integer>();
    static Vector<Float> balance = new Vector<Float>();
    int custID;

    // Input from user (String)
    String getUserInputString() {
        Scanner s = new Scanner(System.in);
        String u = s.next();
        return u;
    }

    // Input from user (Int)
    int getUserInputInteger() {
        Scanner s = new Scanner(System.in);
        int u = s.nextInt();
        return u;
    }

    // Input from user (Float)
    float getUserInputFloat() {
        Scanner s = new Scanner(System.in);
        float u = s.nextFloat();
        return u;
    }

    public String getAccountType(int t) {
        String s;
        switch (t) {
            case 1:
                s = "Current";
                break;
            case 2:
                s = "DMat";
                break;
            case 3:
                s = "Savings";
                break;
            default:
                s = "invalid Account Type";
                break;
        }
        return s;

    }

    public void setCustomerDetails() {
        System.out.println("\nEnter the name: ");
        CustomerName.add(getUserInputString());
        System.out.println("\nEnter the account number: ");
        AccountNumber.add(getUserInputInteger());
        System.out.println("\nEnter the account type: \n1.Current     2.DMat     3.Savings");
        int actype = getUserInputInteger();
        // Validate account type and take
        if ((actype > 3) || (actype < 1)) {
            System.out.println(
                    "\nEntered account type is not valid Please enter any 1 option from below \n1.Current     2.DMat     3.Savings");
            actype = getUserInputInteger();
        }
        AccountType.add(actype);
        System.out.println("\nEnter the account balance: ");
        balance.add(getUserInputFloat());
        Random r = new Random();
        int cid = r.nextInt(9948938);
        CustomerID.add(cid);

        System.out.println("\nThe Customer ID is " + cid);
        custID = cid;

        getOneCustomerDetails(getIndexFromCID());

    }

    public void openAccount() {
        System.out.println("\nEnter your name: ");
        CustomerName.add(getUserInputString());
        System.out.println("\nEnter which account type you wanted to open: \n1.Current     2.DMat     3.Savings");
        int actype = getUserInputInteger();
        // Validate account type and take
        if ((actype > 3) || (actype < 1)) {
            System.out.println(
                    "\nEntered account type is not valid Please enter any 1 option from below \n1.Current     2.DMat     3.Savings");
            actype = getUserInputInteger();
        }
        AccountType.add(actype);
        System.out.println("\nEnter your opening account balance: ");
        balance.add(getUserInputFloat());
        Random r = new Random();
        int acn = r.nextInt(848584858);
        AccountNumber.add(acn);
        int cid = r.nextInt(9948938);
        CustomerID.add(cid);

        System.out.println("\nYour Customer ID is " + cid);
        custID = cid;

        getOneCustomerDetails(getIndexFromCID());

    }

    public void getAllCustomerDetails() {
        System.out.println(
                "\nCustomer Details\n---------------------------------------------------------------\nCust ID  |  A/C No   |  Name  |   A/C Type  |  Balance\n---------------------------------------------------------------");
        for (int i = 0; i < CustomerName.size(); i++) {

            System.out.println(
                    CustomerID.get(i) + "    " + AccountNumber.get(i) + "      " + CustomerName.get(i) + "       "
                            + getAccountType(AccountType.get(i)) + "         " + balance.get(i) + "    ");

        }

        System.out.println(
                "\n---------------------------------------------------------------");
    }

    public void getOneCustomerDetails(int i) {
        System.out.println(
                "\nCustomer Detail\n---------------------------------\nName :  " + CustomerName.get(i)
                        + "\nCustomer ID :" + CustomerID.get(i)
                        + "\nAccount No : " + AccountNumber.get(i)
                        + "\nAccount Type : " + getAccountType(AccountType.get(i))
                        + "\nBalance: " + balance.get(i) + "\n---------------------------------\n");

    }

    public int getIndexFromCID() {
        int index = 0;
        for (int i = 0; i < CustomerID.size(); i++) {
            if (custID == CustomerID.get(i)) {
                index = i;
            }
        }
        return index;

    }

    public float getCurrentBalance() {

        int i = getIndexFromCID();
        float currentBal = balance.get(i);
        return currentBal;
    }

    public void WithdrawAmount() {
        if (getCustomerID()) {
            System.out.println("\nEnter the amount to be withdrawn: ");
            float amt = getUserInputFloat();
            if (getCurrentBalance() >= amt) {
                balance.set(getIndexFromCID(), getCurrentBalance() - amt);
            } else {
                System.out.println("\nLow Balance! ");
            }
        }
    }

    public void DepositAmount() {

        if (getCustomerID()) {
            System.out.println("\nEnter the amount to be deposited: ");
            float amt = getUserInputFloat();
            balance.set(getIndexFromCID(), getCurrentBalance() + amt);
        }

    }

    public void CheckBalance() {

        System.out.println("\nBalance for the Customer ID " + custID + " : " + getCurrentBalance());
    }

    public Boolean validateCustomerID(int c) {

        boolean valid = false;
        for (int i = 0; i < CustomerID.size(); i++) {
            if (c == CustomerID.get(i)) {
                valid = true;
            }
        }
        return valid;
    }

    public Boolean getCustomerID() {

        boolean valid = true;
        System.out.println("\nEnter your Customer ID ");
        int c = getUserInputInteger();
        if (!validateCustomerID(c)) {
            valid = false;
            System.out.println("\nInvalid Customer ID!");
        } else {
            custID = c;// enter valid customer id = custID
        }
        return valid;
    }

    public void setCustomerAction(int t) {
        switch (t) {
            case 1:// Open Account
                openAccount();
                break;
            case 2:// Withdraw amount
                WithdrawAmount();
                break;
            case 3:// Check Balance
                CheckBalance();
                break;
            case 4:// Deposit
                DepositAmount();
                break;
            case 5:// Enter Customer details
                System.out.println("\nPlease enter no. of customer details would you enter: ");
                int n = getUserInputInteger();
                for (int i = 0; i < n; i++) {
                    setCustomerDetails();
                }
                if (n > 1) {
                    System.out.println("\nWould you like to view all customer details y/n?");
                    String u = getUserInputString();
                    Boolean isyes = (u.equals("y") || u.equals("Y")) ? true : false;
                    if (isyes) {
                        getAllCustomerDetails();
                    }
                }
                break;
            case 6:// Get my account details

                if (getCustomerID()) {
                    getOneCustomerDetails(custID);
                }
                break;
            default:
                break;
        }

    }

    public void init() {
        System.out.println(
                "\n__________________________________________\nChoose your action: \n1. Open Account\n2. Withdraw amount\n3. Check Balance\n4. Deposit\n5. Enter Customer Details\n6. Get my account details\n__________________________________________");
        int choice = getUserInputInteger();

        setCustomerAction(choice);
        System.out.println(
                "\nWould you wish to continue : y/n?");
        String u = getUserInputString();
        Boolean isyes = (u.equals("y") || u.equals("Y")) ? true : false;
        if (isyes) {
            init();
        }

    }

    public static void main(String args[]) {

        Bank b = new Bank();
        System.out.println(
                "\n__________________________________________\n           BANK APPLICATION ");
        b.init();

    }
}