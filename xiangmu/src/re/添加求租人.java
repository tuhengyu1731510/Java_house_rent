package re;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.text.*;
import java.util.*;
import java.sql.*;
import dean.hirePerson;
import kaoshi.DBCon;
import kaoshi.HirePersonDAO;
import kaoshi.HirePersonDAOImpl;
import kaoshi.求租人;

import javax.swing.*;


public class 添加求租人 extends JDialog {
    private JLabel hirePersonNo; //日求租人编号
    private JTextField hirePersonValue;
    private JLabel userName; //姓名
    private JTextField userNameValue;
    private JLabel sex;
    //性别
    private JRadioButton male;
    private JRadioButton femal;
    ButtonGroup bg;
    private JLabel phone; //电话
    private JTextField phoneValue;
    private JLabel homePhone; //家庭电话
    private JTextField homePhoneValue;
    private JLabel email; //邮箱
    private JTextField emailValue;
    private JLabel qq; // QQ
    private JTextField qqValue;
    private JLabel cardID; //身份证号码
    private JTextField cardIDValue;
    private JButton addButton;
    private JButton resetButton;

    public 添加求租人(JFrame f, boolean model, JTable table) {
        this.setTitle("添加求租人信息");
        this.setBounds(200, 200, 400, 400);
        this.setLayout(null);
        JPanel northPanel = new JPanel(); //创建组件
        northPanel.setBorder(BorderFactory.createTitledBorder("添加求租人信息"));
        northPanel.setBounds(3, 5, 385, 310);
        hirePersonNo = new JLabel("求租人编号");
        hirePersonValue = new JTextField(15);
        userName = new JLabel("姓名       ", JLabel.RIGHT);
        userNameValue = new JTextField(15);
        sex = new JLabel("性别");
        male = new JRadioButton("男", true);
        femal = new JRadioButton("女");
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(femal);
        phone = new JLabel("手机     ", JLabel.RIGHT);
        phoneValue = new JTextField(15);
        homePhone = new JLabel("家庭电话     ", JLabel.RIGHT);
        homePhoneValue = new JTextField(15);
        email = new JLabel("邮箱        ", JLabel.RIGHT);
        emailValue = new JTextField(15);
        qq = new JLabel("QQ     ");
        qqValue = new JTextField(15);
        cardID = new JLabel("身份证号码", JLabel.RIGHT);
        cardIDValue = new JTextField(15);
        Box vBox = Box.createVerticalBox();
        Box vBox1 = Box.createVerticalBox();
        Box hBox1 = Box.createHorizontalBox();
        hBox1.add(hirePersonNo);
        hBox1.add(Box.createHorizontalStrut(15));
        hBox1.add(hirePersonValue);
        vBox1.add(hBox1);
        vBox1.add(Box.createVerticalStrut(12));
        Box vBox2 = Box.createVerticalBox();
        Box hBox2 = Box.createHorizontalBox();
        hBox2.add(userName);
        hBox2.add(Box.createHorizontalStrut(15));
        hBox2.add(userNameValue);
        vBox2.add(hBox2);
        vBox2.add(Box.createVerticalStrut(12));
        Box vBox3 = Box.createVerticalBox();
        Box hBox3 = Box.createHorizontalBox();
        hBox3.add(sex);
        hBox3.add(Box.createHorizontalStrut(15));
        hBox3.add(male);
        hBox3.add(femal);
        vBox3.add(hBox3);
        vBox3.add(Box.createVerticalStrut(12));
        Box vBox4 = Box.createVerticalBox();
        Box hBox4 = Box.createHorizontalBox();
        hBox4.add(cardID);
        hBox4.add(Box.createHorizontalStrut(15));
        hBox4.add(cardIDValue);
        vBox4.add(hBox4);
        vBox4.add(Box.createVerticalStrut(12));
        Box vBox5 = Box.createVerticalBox();
        Box hBox5 = Box.createHorizontalBox();
        hBox5.add(homePhone);
        hBox5.add(Box.createHorizontalStrut(15));
        hBox5.add(homePhoneValue);
        vBox5.add(hBox5);
        vBox5.add(Box.createVerticalStrut(12));
        Box vBox6 = Box.createVerticalBox();
        Box hBox6 = Box.createHorizontalBox();
        hBox6.add(email);
        hBox6.add(Box.createHorizontalStrut(15));
        hBox6.add(emailValue);
        vBox6.add(hBox6);
        vBox6.add(Box.createVerticalStrut(12));
        Box vBox7 = Box.createVerticalBox();
        Box hBox7 = Box.createHorizontalBox();
        hBox7.add(phone);
        hBox7.add(Box.createHorizontalStrut(15));
        hBox7.add(phoneValue);
        vBox7.add(hBox7);
        vBox7.add(Box.createVerticalStrut(12));
        Box vBox8 = Box.createVerticalBox();
        Box hBox8 = Box.createHorizontalBox();
        hBox8.add(qq);
        hBox8.add(Box.createHorizontalStrut(35));
        hBox8.add(qqValue);
        vBox8.add(hBox8);
        vBox8.add(Box.createVerticalStrut(12));
        vBox.add(vBox1);
        vBox.add(vBox2);
        vBox.add(vBox3);
        vBox.add(vBox4);
        vBox.add(vBox5);
        vBox.add(vBox6);
        vBox.add(vBox7);
        vBox.add(vBox8);
        northPanel.add(vBox);
        JPanel southPanel = new JPanel(); //南边面板
        southPanel.setBounds(0, 320, 400, 70);
        addButton = new JButton("确定");
        resetButton = new JButton("重置");
        southPanel.add(addButton);
        southPanel.add(resetButton);
        this.add(northPanel);
        this.add(southPanel);       //关闭用户管理对话框事件处理
//        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        this.show();

        HirePersonDAO hirePersonDAO = new HirePersonDAOImpl();


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBCon db = new DBCon();
                Connection con = db.getConnection();


                PreparedStatement sta = null;
                ResultSet rs = null;
                hirePerson hirePerson = new hirePerson();
                hirePerson.setUserName(userNameValue.getText());
                hirePerson.setSex(male.isSelected() ? "男" : "女");
                hirePerson.setHirePersonNo(hirePersonValue.getText());
                hirePerson.setPhone(phoneValue.getText());
                hirePerson.setHomePhone(homePhoneValue.getText());
                hirePerson.setEmail(emailValue.getText());
                hirePerson.setQq(qqValue.getText());
                hirePerson.setCardID(cardIDValue.getText());
                HirePersonDAO hdao = new HirePersonDAOImpl();
                hdao.insertHirePerson(hirePerson);
                ((求租人) f).getInfo(table);
            }

        });
    }
}