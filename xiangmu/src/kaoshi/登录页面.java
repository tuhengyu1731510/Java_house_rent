package kaoshi;
import dean.login;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 登录页面 extends JFrame {
    private JTextField userName;
    private JPasswordField password;
    private JButton okButton, cancelButton;

    public 登录页面(){
        this.setTitle("房屋租赁管理系统");
        doLogin();
        setResizable(false);
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(350,250);
    }
    //设置标题
    public void doLogin(){
        JLabel title = new JLabel("欢迎您访问房屋租赁管理系统",JLabel.CENTER);
        JLabel userNameLabel = new JLabel("用户名:",JLabel.CENTER);
        JLabel passwordLabel=new JLabel("密码:",JLabel.CENTER);
        userName = new JTextField(14);
        password = new JPasswordField(14);
        okButton = new JButton("确定");
        cancelButton = new JButton("取消");
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(4,1));
        JPanel p0 = new JPanel();
        //放置首行标题的JPanel
        p0.add(title);
        //放置用户名信息的JPanel
        JPanel p1 = new JPanel();
        p1.add(userNameLabel);
        p1.add(userName);
        JPanel p2 = new JPanel();
        p2.add(passwordLabel);
        p2.add(password);
        JPanel p3 = new JPanel();
        //放置密码信息的JPanel
        //放置两个按钮的JPanel
        p3.add(okButton);
        p3.add(cancelButton);
        p.add(p0);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        this.add(p);
        okButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(existUser(userName.getText(),password.getText())){
                    
                    System.out.println("登陆成功!");
                    dispose();
                    new 主页面();
                }
                else{
                    System.out.println("登录失败");
                }
            }
        });
    }
    public boolean existUser(String userName,String passWord){
        DBCon dbc=new DBCon();
        Connection conn=dbc.getConnection();
        java.sql.PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            String sql="select* from tb_login where userName=? and password=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setObject(1, userName);
            pstmt.setObject(2, passWord);
            rs=pstmt.executeQuery();

            return rs.next();
        }catch(SQLException e){
            //e.printStackTrace();
            return false;
        }

    }
    public void setlogin(){

    }
    //添加4个中间容器到窗体中
    public static void main(String[] args){
        登录页面 userLogin =new 登录页面();
    }
}

