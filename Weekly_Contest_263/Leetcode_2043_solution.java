class Bank {
  long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;    
    }
    public boolean transfer(int account1, int account2, long money) {
        int n=balance.length;
        if(account1<=n && account2<=n && balance[account1-1]>=money )
        {
          balance[account1-1]=balance[account1-1]-money;
            balance[account2-1]=balance[account2-1]+money;
            return true;
        }
        else
            
            return false;
    }
    
    public boolean deposit(int account, long money) {
        int n=balance.length;
        if(account<=n){
        balance[account-1]=balance[account-1]+money;
        return true;
        }
        else 
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        int n=balance.length;
    if(account<=n && balance[account-1]>=money)
    {
     balance[account-1]=balance[account-1]-money;;
        return true;
    }
        return false;
    }
}
