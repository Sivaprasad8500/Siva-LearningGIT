public class Account {

    String accNo;
    String accName;

    public Account(String accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType =  Bussiness;
        this.accbrach = NRI;
        this.branchPostCode = IG1 4AZ;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }
}
