package kaoshi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dean.hirePerson;

public class HirePersonDAOImpl implements HirePersonDAO{

    @Override
    public hirePerson getHirePersonByNo(String hirePersonNum) {
        return null;
    }

    @Override
    public void insertHirePerson(hirePerson hireperson) {
        System.out.println("萨达");
        DBCon dbCon=new DBCon();
        Connection conn=dbCon.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String sql="insert into tb_hireperson values(null,?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement=conn.prepareStatement(sql);
//            preparedStatement.setObject(1,hireperson.getUserID());
            preparedStatement.setString(1,hireperson.getHirePersonNo());
            preparedStatement.setString(2,hireperson.getUserName());
            preparedStatement.setString(3,hireperson.getSex());
            preparedStatement.setString(4,hireperson.getPhone());
            preparedStatement.setString(5,hireperson.getHomePhone());
            preparedStatement.setString(6,hireperson.getEmail());
            preparedStatement.setString(7,hireperson.getQq());
            preparedStatement.setString(8,hireperson.getCardID());
            preparedStatement.setString(9,hireperson.getRecordDate());
            int c=preparedStatement.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            DBCon.closeConnection(conn,preparedStatement,resultSet);
        }
    }

    @Override
    public List<hirePerson> getHirePerson() {
        List<hirePerson> list=new ArrayList<hirePerson>();
        DBCon dbc=new DBCon();
        Connection conn=dbc.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String sql="select  * from tb_hireperson";
        try {
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                hirePerson h=new hirePerson(rs.getInt(1),
                        rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),rs.getString(7),
                        rs.getString(8),rs.getString(9),rs.getString(10));
                list.add(h);

            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateAll(hirePerson h) {
        DBCon dbc=new DBCon();
        Connection conn= dbc.getConnection();
        PreparedStatement pstmt=null;
        String sql="update tb_hireperson set   hirePersonNo=? , userName=? , sex=? , phone=? , homePhone=? , email=? , qq=? , cardID=? , recordDate=? where userID=? ";
        ResultSet rs=null;
        int rc=0;
        try{
            pstmt=conn.prepareStatement(sql);
            pstmt.setObject(1,h.getHirePersonNo());
            pstmt.setObject(2,h.getUserName());
            pstmt.setObject(3,h.getSex());
            pstmt.setObject(4,h.getPhone());
            pstmt.setObject(5,h.getHomePhone());
            pstmt.setObject(6,h.getEmail());
            pstmt.setObject(7,h.getQq());
            pstmt.setObject(8,h.getCardID());
            pstmt.setObject(9,h.getRecordDate());
            pstmt.setObject(10,h.getUserID());
            rc=pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteHirePerson(hirePerson h) {
        DBCon dbc=new DBCon();
        Connection conn= dbc.getConnection();
        PreparedStatement pstmt=null;
        String sql="delete from tb_hireperson where userID=?";
        ResultSet rs=null;
        int rc=0;
        try{
            pstmt=conn.prepareStatement(sql);
            pstmt.setObject(1,h.getUserID());
            rc=pstmt.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HirePersonDAO hirePersonDAO=new HirePersonDAOImpl();
    }
}
