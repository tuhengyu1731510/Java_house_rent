package dean;

public class rentInf {
    private int rentInfoID;
    private String rentInfoNo;
    private String empName;
    private int houseID;
    private int rentID;
    private String rentName;
    private String rentPhone;
    private int hireID;
    private String hireName;
    private String hirePhone;
    private float payMoney;
    private int rentTime;
    private String rentStartDate;
    private String rentEndDate;
    private String PayDate;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPayDate() {
        return PayDate;
    }

    public void setPayDate(String payDate) {
        PayDate = payDate;
    }

    public String getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(String rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public String getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(String rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public int getRentTime() {
        return rentTime;
    }

    public void setRentTime(int rentTime) {
        this.rentTime = rentTime;
    }

    public float getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(float payMoney) {
        this.payMoney = payMoney;
    }

    public String getHirePhone() {
        return hirePhone;
    }

    public void setHirePhone(String hirePhone) {
        this.hirePhone = hirePhone;
    }

    public String getHireName() {
        return hireName;
    }

    public void setHireName(String hireName) {
        this.hireName = hireName;
    }

    public int getHireID() {
        return hireID;
    }

    public void setHireID(int hireID) {
        this.hireID = hireID;
    }

    public String getRentPhone() {
        return rentPhone;
    }

    public void setRentPhone(String rentPhone) {
        this.rentPhone = rentPhone;
    }

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName;
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

    public int getHouseID() {
        return houseID;
    }

    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getRentInfoNo() {
        return rentInfoNo;
    }

    public void setRentInfoNo(String rentInfoNo) {
        this.rentInfoNo = rentInfoNo;
    }

    public int getRentInfoID() {
        return rentInfoID;
    }

    public void setRentInfoID(int rentInfoID) {
        this.rentInfoID = rentInfoID;
    }
}
