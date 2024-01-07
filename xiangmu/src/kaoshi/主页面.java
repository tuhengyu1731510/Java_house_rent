package kaoshi;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class 主页面 extends JFrame{
    private JMenuBar menuBar;
    private JMenu houseInfoManager;
    private JMenu userInfoManager;
    private JMenu rentPersonManager;
    private JMenu hirePersonManager;
    private JMenu rentInfoManager;
    private JMenu systemManager;
    private JMenu userfulUtil;
    private JMenu help;
    private JMenu quit;
    private JMenuItem setHouseInfo;
    private JMenuItem searchHouseInfo;
    private JMenuItem userManager;
    private JMenuItem passWordManager;
    private JMenuItem dataBaseBackUp;
    private JMenuItem rentInfoSearch;
    private JMenuItem rentInfoSet;
    private JMenuItem rentcalculator;
    private JMenuItem notebook;
    private JMenuItem clockDisplay;
    private JMenuItem rentPersonInfoSet;
    private JMenuItem rentPersonInfoSearch;
    private JMenuItem hirePersonInfoSet;
    private JMenuItem hirePersonSearch;
    private JMenuItem version;
    private JMenuItem helpContent;
    private JMenuItem quitItem;
    public 主页面(){
        this.setTitle("房屋租赁管理系统");

        
        menuBar=new JMenuBar();
        houseInfoManager=new JMenu("【房源信息管理(H)】");
        houseInfoManager.setMnemonic('H');
        rentPersonManager=new JMenu("【出租人信息管理(R)】");
        rentPersonManager.setMnemonic('R');
        hirePersonManager=new JMenu("【求租人信息管理(P)】");
        hirePersonManager.setMnemonic('P');
        rentInfoManager=new JMenu("【出租房源信息管理(I)】");
        rentInfoManager.setMnemonic('I');
        systemManager=new JMenu("【系统管理(S)】");
        systemManager.setMnemonic('S');
        userfulUtil=new JMenu("【常用工具(U)】");
        userfulUtil.setMnemonic('U');
        help=new JMenu("【帮助(L)】");
        help.setMnemonic('L');
        quit=new JMenu("【退出(E)】");
        quit.setMnemonic('E');
        menuBar.add(houseInfoManager);
        menuBar.add(rentPersonManager);
        menuBar.add(hirePersonManager);
        menuBar.add(rentInfoManager);
        menuBar.add(systemManager);
        menuBar.add(userfulUtil);
        menuBar.add(help);
        menuBar.add(quit);
        add(menuBar,BorderLayout.NORTH);
        setVisible(true);
        setHouseInfo=new JMenuItem("【房源信息设置】");
        searchHouseInfo=new JMenuItem("【房源信息查询】");
        houseInfoManager.add(setHouseInfo);
        houseInfoManager.add(searchHouseInfo);


        userManager=new JMenuItem("【用户管理】");
        passWordManager=new JMenuItem("【密码管理】");
        dataBaseBackUp=new JMenuItem("【数据库】");
        systemManager.add(userManager);
        systemManager.add(passWordManager);
        systemManager.add(dataBaseBackUp);



        rentInfoSearch=new JMenuItem("【出租房源信息设置】");
        rentInfoSet=new JMenuItem("【出租房源信息查询】");
        rentInfoManager.add(rentInfoSearch);
        rentInfoManager.add(rentInfoSet);



        rentcalculator=new JMenuItem("【租金计算】");
        notebook=new JMenuItem("【记事本】");
        clockDisplay=new JMenuItem("【显示器】");
        userfulUtil.add(rentcalculator);
        userfulUtil.add(notebook);
        userfulUtil.add(clockDisplay);



        rentPersonInfoSet=new JMenuItem("【出租人信息设置】");
        rentPersonInfoSearch=new JMenuItem("【出租人信息查询】");
        rentPersonManager.add(rentPersonInfoSet);
        rentPersonManager.add(rentPersonInfoSearch);



        hirePersonInfoSet=new JMenuItem("【求租人信息设置】");
        hirePersonSearch=new JMenuItem("【求租人信息查询】");
        hirePersonManager.add(hirePersonInfoSet);
        hirePersonManager.add(hirePersonSearch);



        version=new JMenuItem("【版本】");
        helpContent=new JMenuItem("【帮助选项】");
        quitItem=new JMenuItem("【退出】");
        help.add(version);
        help.add(helpContent);
        help.add(quitItem);



        setSize(1000,600);
        setLocationRelativeTo(null);
        setVisible(true);
        hirePersonInfoSet.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new 求租人();
            }
        });
        setHouseInfo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new 房源信息设置();
            }
        });
        rentPersonInfoSet.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new 出租();
            }
        });
        rentInfoSearch.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new 出租房源设置();
            }
        });
        quitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        new 主页面();
    }
}

