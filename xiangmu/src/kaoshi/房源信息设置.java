package kaoshi;
import javax.swing.*;
import java.awt.*;

public class 房源信息设置 extends JFrame {
    private JPanel northPanel;
    private JPanel southPanel;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton quitButton;
    public 房源信息设置() {
        this.setTitle("房源信息设置");
        this.setBounds(200, 200, 800, 400);

        Container container=this.getContentPane();
        container.setLayout(new BorderLayout(10, 10));
        northPanel =new JPanel();
        northPanel.setBorder(BorderFactory.createTitledBorder("房源信息操作"));
        northPanel.setBounds(30, 30, 750, 30);
        addButton = new JButton("添加");

        updateButton = new JButton("修改");
        deleteButton=new JButton("删除");
        quitButton =new JButton("退出");
        northPanel.add(addButton);
        northPanel.add(updateButton);
        northPanel.add(deleteButton);
        northPanel.add(quitButton);
        southPanel = new JPanel();
        southPanel.setBorder(BorderFactory.createTitledBorder("房源信息列表"));
        JLabel jl =new JLabel("建设中，静请期待！！!!");
        southPanel.add(jl);
        southPanel.setBounds(10, 10, 750, 430);
        container.add(northPanel, BorderLayout.NORTH);
        container.add(southPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        房源信息设置 hirePersonSetFrame = new 房源信息设置();
    }
}
