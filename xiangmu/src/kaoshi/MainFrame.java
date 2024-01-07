package kaoshi;
import javax.swing.*;
import java.awt.*;
public class MainFrame extends JFrame {
    private JPanel northPanel;
    private JPanel southPanel;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton quitButton;
    private double width;
    private JButton houseInfoManager; //房源信息管理
    private JButton rentPersonManager; //出租人信息管理
    private JButton hirePersonManager;//求租人信息管理
    private JButton rentInfoManager;//出租房源管理
    private JButton systemManager;//系统管理
    private JButton userfulUtil; //常用工具
    private JButton help;//帮助
    private JButton quit;    //退出
    //川房源信息管理菜单项
    public MainFrame() {
        this.setTitle("房屋租聘管理系统");
        this.setBounds(200, 200, 800, 400);

        Container container=this.getContentPane();
        container.setLayout(new BorderLayout(10, 10));
        northPanel =new JPanel();
        northPanel.setBorder(BorderFactory.createTitledBorder("求租人信息操作"));
        northPanel.setBounds(30, 30, 750, 30);
        addButton = new JButton("添加");

        updateButton = new JButton("修改");
        deleteButton=new JButton("删除");
        quitButton =new JButton("退出");
        houseInfoManager=new JButton("房源信息管理");
        rentPersonManager=new JButton("出租人信息管理");
        hirePersonManager=new JButton("求租人信息管理");
        rentInfoManager=new JButton("出租房源信息管理");
        systemManager=new JButton("系统管理");
        userfulUtil=new JButton("常用工具");
        help=new JButton("帮助");
        quit=new JButton("退出");
        northPanel.add(addButton);
        northPanel.add(updateButton);
        northPanel.add(deleteButton);
        northPanel.add(quitButton);
        northPanel.add(houseInfoManager);
        southPanel = new JPanel();
        southPanel.setBorder(BorderFactory.createTitledBorder("求租人信息列表"));
        JLabel jl =new JLabel("建设中，静请期待！！!!");
        southPanel.add(jl);
        southPanel.setBounds(10, 10, 750, 430);
        container.add(northPanel, BorderLayout.NORTH);
        container.add(southPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        求租人 hirePersonSetFrame = new 求租人();
    }
}
