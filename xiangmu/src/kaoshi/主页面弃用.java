package kaoshi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class 主页面弃用 extends JFrame{
    private double width;
    private double height; //菜单与菜单项
    private JMenuBar menuBar;//菜单条
    private JMenu houseInfoManager; //房源信息管理
    private JMenu userInfoManager;//用户管理
    private JMenu rentPersonManager; //出租人信息管理
    private JMenu hirePersonManager;//求租人信息管理
    private JMenu rentInfoManager;//出租房源管理
    private JMenu systemManager;//系统管理
    private JMenu userfulUtil; //常用工具
    private JMenu help;//帮助
    private JMenu quit;    //退出
    //川房源信息管理菜单项
    private JMenuItem setHouseInfo;
    private JMenuItem searchHouseInfo; //用户管理菜单项
    private JMenuItem userManager;
    private JMenuItem passWordManager;
    private JMenuItem dataBaseBackUp; //出租房源管理菜单项
    private JMenuItem rentInfoSearch;
    private JMenuItem rentInfoSet;
    private JMenuItem rentcalculator;//常用工具菜单项
    private JMenuItem notebook;
    private JMenuItem clockDisplay;//出租人信息管理菜单项
    private JMenuItem rentPersonInfoSet;
    private JMenuItem rentPersonInfoSearch;   //求租人信息管理菜单项
    private JMenuItem hirePersonInfoSet;
    private JMenuItem hirePersonInfoSearch; //帮助菜单项
    private JMenuItem version;
    private JMenuItem helpContent;
    private JMenuItem quitItem;
    //private DTimeframe dtimeFrame; //时钟显示窗体
    private JPanel dtimePanel;//时钟显示面板
    private JToolBar uptoolBar;//工具条

    public 主页面弃用() {
        this.setTitle("房屋租赁管理系统"); //设置成最大化窗口
        Toolkit tokit = this.getToolkit();
        width = tokit.getScreenSize().getWidth();
        height = tokit.getScreenSize().getHeight();
        this.setSize((int) width, (int) height);
        Container contentPane = this.getContentPane(); //加载图片
        Image housePic = tokit.getImage("/house.bmp");
        JPanel mainPanel = new JPanel(); //菜单
        menuBar = new JMenuBar();
        houseInfoManager = new JMenu(" [房源信息管理(H)] ");
        houseInfoManager.setMnemonic('H');
        rentPersonManager = new JMenu(" [出租人信息管理(R)] ");
        rentPersonManager.setMnemonic('R');
        hirePersonManager = new JMenu(" [求租人信息管理(P)] ");
        hirePersonManager.setMnemonic('P');
        rentInfoManager = new JMenu(" [出租房源信息管理(I)] ");
        rentInfoManager.setMnemonic('T');
        systemManager = new JMenu(" [系统管理(S)] ");
        systemManager.setMnemonic('S');
        userfulUtil = new JMenu(" [常用工具(U)] ");
        userfulUtil.setMnemonic('U');
        help = new JMenu(" [帮助(L)] ");
        help.setMnemonic('L');
        quit = new JMenu(" [退出(E)] ");
        quit.setMnemonic('E');
        menuBar.add(houseInfoManager);
        menuBar.add(userInfoManager);
        menuBar.add(rentPersonManager);
        menuBar.add(hirePersonManager);
        menuBar.add(rentInfoManager);
        menuBar.add(systemManager);
        menuBar.add(userfulUtil);
        menuBar.add(help);
        menuBar.add(quit);
        //求租人信息管理菜单项
        hirePersonInfoSet = new JMenuItem("求租人员信息设置");
        hirePersonInfoSet = new JMenuItem("求租人员信息查询");
        hirePersonManager.add(hirePersonInfoSet);
        hirePersonManager.add(hirePersonInfoSearch);
        ////
        ////
        hirePersonInfoSet.setAccelerator(KeyStroke.getKeyStroke('Y',
                java.awt.Event.CTRL_MASK, false));
        hirePersonInfoSearch.setAccelerator(KeyStroke.getKeyStroke('Z',
                java.awt.Event.CTRL_MASK, false));
        //
        this.setJMenuBar(menuBar);//创建工具条
        ////
        contentPane.add(uptoolBar, BorderLayout.NORTH);
        ////
        ////
        //关闭窗口事件
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //设置最大化显示
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
}