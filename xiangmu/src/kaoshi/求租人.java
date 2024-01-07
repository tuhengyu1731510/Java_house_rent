package kaoshi;
import dean.hirePerson;
import re.添加求租人;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 求租人 extends JFrame {
    private JPanel northPanel;
    private JPanel southPanel;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton quitButton;
    public 求租人() {
        this.setTitle("求租人信息设置");
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
        northPanel.add(addButton);
        northPanel.add(updateButton);
        northPanel.add(deleteButton);
        northPanel.add(quitButton);
        southPanel = new JPanel();
        southPanel.setBorder(BorderFactory.createTitledBorder("求租人信息列表"));
        southPanel.setBounds(10, 10, 1000, 800);

        container.add(northPanel, BorderLayout.NORTH);
        container.add(southPanel, BorderLayout.CENTER);
        DefaultTableModel model=new DefaultTableModel(null,new String[]{
                "用户ID","编号","用户名","性别","手机","家庭电话","邮箱","QQ","身份证","记录日期"
        }) {
            public boolean isCellEditable(int row, int column) {

                return column!=0;
            }
        };;
        JTable table=new JTable(model);
        JScrollPane scrollPane=new JScrollPane(table);
        table.setBounds(10, 10, 1000, 800);
        southPanel.add(scrollPane);



        getInfo(table);
        JFrame f=this;
        this.setVisible(true);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new 添加求租人(f,false,table);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HirePersonDAO hdao=new HirePersonDAOImpl();
                int rows[]=table.getSelectedRows();
                for(int i:rows){
                    hirePerson h=new hirePerson();
                    h.setUserID(Integer.valueOf((String) model.getValueAt(i,0)));
                    hdao.deleteHirePerson(h);

                }
                getInfo(table);
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HirePersonDAO hdao=new HirePersonDAOImpl();
                for(int row=0;row<model.getRowCount();row++){

                hirePerson h=new hirePerson( Integer.valueOf((String) model.getValueAt(row,0)),
                        (String)model.getValueAt(row,1),
                        (String)model.getValueAt(row,2),
                        (String)model.getValueAt(row,3),
                        (String)model.getValueAt(row,4),
                        (String)model.getValueAt(row,5),
                        (String)model.getValueAt(row,6),
                        (String)model.getValueAt(row,7),
                        (String)model.getValueAt(row,8),
                        (String)model.getValueAt(row,9));
                         hdao.updateAll(h);

        }
                getInfo(table);
            }});

            }
public void getInfo(JTable table){
        DefaultTableModel model=(DefaultTableModel)table.getModel();
    HirePersonDAO hdao=new HirePersonDAOImpl();
    List<hirePerson> list=hdao.getHirePerson();
    while (model.getRowCount()>0){
        model.removeRow(0);
    }
    for(hirePerson h:list){
        model.insertRow(0,h.toStringRow());
    }
    table.repaint();

}
    public static void main(String[] args) {
        求租人 hirePersonSetFrame = new 求租人();
    }
}
