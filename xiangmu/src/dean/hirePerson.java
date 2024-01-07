package dean;

public class hirePerson {
    private int userID;
    private String hirePersonNo;
    private String userName;
    private String sex;
    private String phone;
    private String homePhone;
    private String email;
    private String qq;
    private String cardID;
    private String recordDate;
    public hirePerson (){

    }
    public hirePerson( int userID,
     String hirePersonNo, String userName, String sex, String phone, String homePhone, 
                       String email,String qq, String cardID, String recordDate)
    {
        this.userID=userID;
        this.hirePersonNo=hirePersonNo;
        this.userName=userName;
        this.sex=sex;
        this.phone=phone;
        this.homePhone=homePhone;
        this.email=email;
        this.qq=qq;
        this.cardID=cardID;
        this.recordDate=recordDate;
        
    }
    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHirePersonNo() {
        return hirePersonNo;
    }

    public void setHirePersonNo(String hirePersonNo) {
        this.hirePersonNo = hirePersonNo;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String[] toStringRow(){
        String[] arr={""+userID,
                 hirePersonNo, userName, sex,  phone,  homePhone,
                 email, qq,  cardID,  recordDate};
        return arr;
    }
}
