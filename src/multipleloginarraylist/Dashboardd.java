package multipleloginarraylist;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
//import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.Timer;


public class Dashboardd extends javax.swing.JFrame {
    
    int i, ctr=1;
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
    SimpleDateFormat s1 = new SimpleDateFormat("hh:mm a");
    String dat = s.format(d);
    
  
    public Dashboardd() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        ImageIcon room = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("roomlogo.png")));
        Image room1 = room.getImage();
        Image room2 = room1.getScaledInstance(totalroomslbl.getWidth(),totalroomslbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon roomlogoicon = new ImageIcon(room2);
        totalroomslbl.setIcon(roomlogoicon);
        
        ImageIcon availroomslogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("availlogo.png")));
        Image availrooms1 = availroomslogo.getImage();
        Image availrooms2 = availrooms1.getScaledInstance(availroomlbl.getWidth(),availroomlbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon availroomsicon = new ImageIcon(availrooms2);
        availroomlbl.setIcon(availroomsicon);
        
        ImageIcon bookedroomslogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bookedlogo.png")));
        Image bookedrooms1 = bookedroomslogo.getImage();
        Image bookedrooms2 = bookedrooms1.getScaledInstance(bookedroomslbl.getWidth(),bookedroomslbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bookedroomsicon = new ImageIcon(bookedrooms2);
        bookedroomslbl.setIcon(bookedroomsicon);
        
        ImageIcon moneylogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("moneylogo.png")));
        Image money1 = moneylogo.getImage();
        Image money2 = money1.getScaledInstance(moneylbl.getWidth(),moneylbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon moneyicon = new ImageIcon(money2);
        moneylbl.setIcon(moneyicon);
        
        ImageIcon cardlogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("cardlogo.png")));
        Image card1 = cardlogo.getImage();
        Image card2 = card1.getScaledInstance(cardlogolbl.getWidth(),cardlogolbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon cardicon = new ImageIcon(card2);
        cardlogolbl.setIcon(cardicon);
        
        ImageIcon banklogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("banklogo.png")));
        Image bank1 = banklogo.getImage();
        Image bank2 = bank1.getScaledInstance(banklogolbl.getWidth(),banklogolbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bankicon = new ImageIcon(bank2);
        banklogolbl.setIcon(bankicon);
        
        ImageIcon cashlogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("cashlogo.png")));
        Image cash1 = cashlogo.getImage();
        Image cash2 = cash1.getScaledInstance(cashlogolbl.getWidth(),cashlogolbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon cashicon = new ImageIcon(cash2);
        cashlogolbl.setIcon(cashicon);
        
        ImageIcon acclogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("accicon.png")));
        Image acc1 = acclogo.getImage();
        Image acc2 = acc1.getScaledInstance(acciconlbl.getWidth(),acciconlbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon acclogoicon = new ImageIcon(acc2);
        acciconlbl.setIcon(acclogoicon);
        
        ImageIcon housekeeplogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("housekeepinglogo.png")));
        Image house1 = housekeeplogo.getImage();
        Image house2 = house1.getScaledInstance(housekeepinglbl1.getWidth(),housekeepinglbl1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon housekeepicon = new ImageIcon(house2);
        housekeepinglbl1.setIcon(housekeepicon);
        
        checkincustomidtxt1.setEditable(false);
        checkoutfnametxt.setEditable(false);
        checkoutlnametxt.setEditable(false);
        checkoutemailtxt.setEditable(false);
        checkoutroomnotxt.setEditable(false);
        checkoutamounttxt.setEditable(false);
        checkoutindatetxt.setEditable(false);
        checkouttimeintxt.setEditable(false);
        checkoutdatetxt.setEditable(false);
        checkouttimeouttxt.setEditable(false);
        
        if (MultipleLogin.count<1){
            MultipleLogin.username.add("Kaysha");
            MultipleLogin.password.add("12345");
            MultipleLogin.count++;
        }
        
        int a = MultipleLogin.username.size();
        
        for(i=0; i<a;)
        {
        String data1 = Integer.toString(ctr);
        String data2 = MultipleLogin.username.get(i); 
        String data3 = MultipleLogin.password.get(i); 
        
        Object[] row = { data1, data2, data3}; 
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.addRow(row);
        
        ctr++;
        i++;
        }
        prog();
        
        date.setText(dat);
        
        checkinpricetxt.setEditable(false);
        outdaystxt.setEditable(false);
        intotaltxt.setEditable(false);
        checkindatetxt.setEditable(false);
        checkintimetxt.setEditable(false);
        
        //guestlist
        int i;
        int guesta = MultipleLogin.guestcustomid.size();
        int guestb = MultipleLogin.guestroomno.size();
        int guestc = MultipleLogin.guestfname.size();
        int guestd = MultipleLogin.guestlname.size();
        int gueste = MultipleLogin.guestphoneno.size();
        int guestf = MultipleLogin.guestemail.size();
        int guestg = MultipleLogin.guestgender.size();
        int guesth = MultipleLogin.guestprice.size();
        int guesti = MultipleLogin.guestcheckin.size();
        int guestj = MultipleLogin.guesttimein.size();
        int guestk = MultipleLogin.guestcheckout.size();
        int guestl = MultipleLogin.guestbedtype.size();
        
        //userlogslist
        int logsa = MultipleLogin.logsuser.size();
        int logsb = MultipleLogin.logsuserdate.size();
        int logsc = MultipleLogin.logsuserdatetimein.size();
        int logsd = MultipleLogin.logsuserdatetimeout.size();
        
        //manageroomsstatus
        int roomsa = MultipleLogin.manageroomstatus1.size();
        int roomsb = MultipleLogin.manageroomstatus2.size();
        int roomsc = MultipleLogin.manageroomstatus3.size();
        int roomsd = MultipleLogin.manageroomstatus4.size();
        int roomse = MultipleLogin.manageroomstatus5.size();
        int roomsf = MultipleLogin.manageroomstatus6.size();
        int roomsg = MultipleLogin.manageroomstatus7.size();
        int roomsh = MultipleLogin.manageroomstatus8.size();
        int roomsi = MultipleLogin.manageroomstatus9.size();
        int roomsj = MultipleLogin.manageroomstatus10.size();
        
        //housekeeping
        int housekeepa = MultipleLogin.housekeeping1.size();
        int housekeepb = MultipleLogin.housekeeping2.size();
        int housekeepc = MultipleLogin.housekeeping3.size();
        int housekeepd = MultipleLogin.housekeeping4.size();
        int housekeepe = MultipleLogin.housekeeping5.size();
        int housekeepf = MultipleLogin.housekeeping6.size();
        int housekeepg = MultipleLogin.housekeeping7.size();
        int housekeeph = MultipleLogin.housekeeping8.size();
        int housekeepi = MultipleLogin.housekeeping9.size();
        int housekeepj = MultipleLogin.housekeeping10.size();
        
        int totalearns = MultipleLogin.totalearnings.size();
        
        //dashboard summary
        int availroomsupdate = MultipleLogin.totalavailrooms.size();
        int bookedroomsupdate = MultipleLogin.totalbookedrooms.size();
        int housekeepingupdate = MultipleLogin.totalhousekeeping.size();
        
        // guest history
        int historya = MultipleLogin.histocutomid.size();
        int historyb = MultipleLogin.histofname.size();
        int historyc = MultipleLogin.histolname.size();
        int historyd = MultipleLogin.histoeadd.size();
        int historye = MultipleLogin.historoomno.size();
        int historyf = MultipleLogin.histocheckin.size();
        int historyg = MultipleLogin.histotimein.size();
        int historyh = MultipleLogin.histocheckout.size();
        int historyi = MultipleLogin.histotimeout.size();
        
        //guestlists
        for (i=0; i<guesta; i++){
        String data1 = MultipleLogin.guestcustomid.get(i);
        String data2 = MultipleLogin.guestroomno.get(i);
        String data3 = MultipleLogin.guestfname.get(i);
        String data4 = MultipleLogin.guestlname.get(i);
        String data5 = MultipleLogin.guestphoneno.get(i);
        String data6 = MultipleLogin.guestemail.get(i);
        String data7 = MultipleLogin.guestgender.get(i);
        String data8 = MultipleLogin.guestprice.get(i);
        String data9 = MultipleLogin.guestcheckin.get(i);
        String data10 = MultipleLogin.guesttimein.get(i);
        String data11 = MultipleLogin.guestcheckout.get(i);
        String data12 = MultipleLogin.guestbedtype.get(i);

        Object[] row = {data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12 };
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
        model.addRow(row); 
        }
    
        //user logs
        for (i=0; i<logsa; i++){
        String data1 = MultipleLogin.logsuser.get(i);
        String data2 = MultipleLogin.logsuserdate.get(i);
        String data3 = MultipleLogin.logsuserdatetimein.get(i);
        String data4 = MultipleLogin.logsuserdatetimeout.get(i);   
        
        Object[] row = {data1, data2, data3, data4};
        DefaultTableModel model = (DefaultTableModel) userlogtable.getModel();
        model.addRow(row); 
        }
        
        //rooms availability
        for (i=0; i<roomsa; i++){
        String data1 = MultipleLogin.manageroomstatus1.get(i);
        stats1.setText(data1);
        }
        
        for (i=0; i<roomsb; i++){
        String data1 = MultipleLogin.manageroomstatus2.get(i);
        stats2.setText(data1);
        }
        
        for (i=0; i<roomsc; i++){
        String data1 = MultipleLogin.manageroomstatus3.get(i);
        stats3.setText(data1);
        }
        
        for (i=0; i<roomsd; i++){
        String data1 = MultipleLogin.manageroomstatus4.get(i);
        stats4.setText(data1);
        }
        
        for (i=0; i<roomse; i++){
        String data1 = MultipleLogin.manageroomstatus5.get(i);
        stats5.setText(data1);
        }
        
        for (i=0; i<roomsf; i++){
        String data1 = MultipleLogin.manageroomstatus6.get(i);
        stats6.setText(data1);
        }
        
        for (i=0; i<roomsg; i++){
        String data1 = MultipleLogin.manageroomstatus7.get(i);
        stats7.setText(data1);
        }
        
        for (i=0; i<roomsh; i++){
        String data1 = MultipleLogin.manageroomstatus8.get(i);
        stats8.setText(data1);
        }
        
        for (i=0; i<roomsi; i++){
        String data1 = MultipleLogin.manageroomstatus9.get(i);
        stats9.setText(data1);
        }
        
        for (i=0; i<roomsj; i++){
        String data1 = MultipleLogin.manageroomstatus10.get(i);
        stats10.setText(data1);
        }
        
        //housekeeping stats
        for (i=0; i<housekeepa; i++){
        String data1 = MultipleLogin.housekeeping1.get(i);
        housekeep1.setText(data1);
        }
        
        for (i=0; i<housekeepb; i++){
        String data1 = MultipleLogin.housekeeping2.get(i);
        housekeep2.setText(data1);
        }
        
        for (i=0; i<housekeepc; i++){
        String data1 = MultipleLogin.housekeeping3.get(i);
        housekeep3.setText(data1);
        }
        
        for (i=0; i<housekeepd; i++){
        String data1 = MultipleLogin.housekeeping4.get(i);
        housekeep4.setText(data1);
        }
        
        for (i=0; i<housekeepe; i++){
        String data1 = MultipleLogin.housekeeping5.get(i);
        housekeep5.setText(data1);
        }
        
        for (i=0; i<housekeepf; i++){
        String data1 = MultipleLogin.housekeeping6.get(i);
        housekeep6.setText(data1);
        }
        
        for (i=0; i<housekeepg; i++){
        String data1 = MultipleLogin.housekeeping7.get(i);
        housekeep7.setText(data1);
        }
        
        for (i=0; i<housekeeph; i++){
        String data1 = MultipleLogin.housekeeping8.get(i);
        housekeep8.setText(data1);
        }
        
        for (i=0; i<housekeepi; i++){
        String data1 = MultipleLogin.housekeeping9.get(i);
        housekeep9.setText(data1);
        }
        
        for (i=0; i<housekeepj; i++){
        String data1 = MultipleLogin.housekeeping10.get(i);
        housekeep10.setText(data1);
        }
        
        for (i=0; i<totalearns; i++){
        String data1 = MultipleLogin.totalearnings.get(i);
        totalearnslbl.setText(data1);
        }
        
        for (i=0; i<availroomsupdate; i++){
        String data1 = MultipleLogin.totalavailrooms.get(i);
        totalavailroomslbl.setText(data1);
        }
        
        for (i=0; i<bookedroomsupdate; i++){
        String data1 = MultipleLogin.totalbookedrooms.get(i);
        bookedroomslbl2.setText(data1);
        }
        
        for (i=0; i<housekeepingupdate; i++){
        String data1 = MultipleLogin.totalhousekeeping.get(i);
        housekeepinglbl2.setText(data1);
        }
        
        // guest history for loop
        for (i=0; i<historya; i++){
        String data1 = MultipleLogin.histocutomid.get(i);
        String data2 = MultipleLogin.histofname.get(i);
        String data3 = MultipleLogin.histolname.get(i);
        String data4 = MultipleLogin.histoeadd.get(i);
        String data5 = MultipleLogin.historoomno.get(i);
        String data6 = MultipleLogin.histocheckin.get(i);
        String data7 = MultipleLogin.histotimein.get(i);
        String data8 = MultipleLogin.histocheckout.get(i);
        String data9 = MultipleLogin.histotimeout.get(i);

        Object[] historyrow = {data1, data2, data3, data4, data5, data6, data7, data8, data9};
        DefaultTableModel historymodel = (DefaultTableModel) historytable.getModel();
        historymodel.addRow(historyrow); 
        }
    } 

    Timer t;
    SimpleDateFormat st;
    
    public void prog(){
        t = new Timer (1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt){
                Date dt = new Date();
                String t1 = s1.format(dt);
                time.setText(t1);
                checkintimetxt.setText(t1);
                checkouttimeouttxt.setText(t1);
            }
            }); 
        t.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        logout5 = new javax.swing.JLabel();
        tab1 = new javax.swing.JTabbedPane();
        dashboard_panel = new javax.swing.JPanel();
        dashboardlbl3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        availroomlbl = new javax.swing.JLabel();
        totalavailroomslbl = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        acciconlbl = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        bookedroomslbl = new javax.swing.JLabel();
        bookedroomslbl2 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        moneylbl = new javax.swing.JLabel();
        totalearnslbl = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        totalroomslbl = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        housekeepinglbl2 = new javax.swing.JLabel();
        housekeepinglbl1 = new javax.swing.JLabel();
        acc_panel = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        accid = new javax.swing.JTextField();
        acc_uname = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        acc_pass = new javax.swing.JTextField();
        acc_repass = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        dashboardlbl1 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        roomspanel = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        stats10 = new javax.swing.JLabel();
        housekeep10 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        stats9 = new javax.swing.JLabel();
        housekeep9 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        stats8 = new javax.swing.JLabel();
        housekeep8 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        stats7 = new javax.swing.JLabel();
        housekeep7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        stats6 = new javax.swing.JLabel();
        housekeep6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        housekeep5 = new javax.swing.JLabel();
        stats5 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        stats4 = new javax.swing.JLabel();
        housekeep4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        housekeep3 = new javax.swing.JLabel();
        stats3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stats1 = new javax.swing.JLabel();
        housekeep1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        housekeep2 = new javax.swing.JLabel();
        stats2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dashboardlbl18 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        checkinpanel = new javax.swing.JPanel();
        checkinphonetxt = new javax.swing.JTextField();
        add5 = new javax.swing.JButton();
        del5 = new javax.swing.JButton();
        checkingendercb = new javax.swing.JComboBox();
        lbl37 = new javax.swing.JLabel();
        lbl38 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        checkinlnametxt = new javax.swing.JTextField();
        checkinfnametxt = new javax.swing.JTextField();
        lbl47 = new javax.swing.JLabel();
        checkincustomidtxt = new javax.swing.JTextField();
        checkinemailtxt = new javax.swing.JTextField();
        dashboardlbl14 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        dashboardlbl20 = new javax.swing.JLabel();
        dashboardlbl13 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl66 = new javax.swing.JLabel();
        lbl65 = new javax.swing.JLabel();
        checkinbedcb = new javax.swing.JComboBox();
        checkinroomcb = new javax.swing.JComboBox();
        checkinpricetxt = new javax.swing.JTextField();
        outdaystxt = new javax.swing.JTextField();
        intotaltxt = new javax.swing.JTextField();
        dashboardlbl21 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        checkincheckouttxt = new javax.swing.JTextField();
        checkintimetxt = new javax.swing.JTextField();
        checkindatetxt = new javax.swing.JTextField();
        guestpanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        dashboardlbl12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guest_search = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        guestproceedcheckoutbtn = new javax.swing.JButton();
        billspanel = new javax.swing.JPanel();
        dashboardlbl17 = new javax.swing.JLabel();
        cardlogolbl = new javax.swing.JLabel();
        banklogolbl = new javax.swing.JLabel();
        cashlogolbl = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        checkoutpanel = new javax.swing.JPanel();
        dashboardlbl16 = new javax.swing.JLabel();
        checkincustomidtxt1 = new javax.swing.JTextField();
        lbl49 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        checkoutfnametxt = new javax.swing.JTextField();
        checkoutlnametxt = new javax.swing.JTextField();
        checkouttimeouttxt = new javax.swing.JTextField();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        checkoutamounttxt = new javax.swing.JTextField();
        checkoutindatetxt = new javax.swing.JTextField();
        checkouttimeintxt = new javax.swing.JTextField();
        checkoutdatetxt = new javax.swing.JTextField();
        lbl54 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();
        checkoutemailtxt = new javax.swing.JTextField();
        checkoutroomnotxt = new javax.swing.JTextField();
        lbl68 = new javax.swing.JLabel();
        cashpaybtn3 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        dashboardlbl19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userlogspanel = new javax.swing.JPanel();
        userlogslbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userlogtable = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        historylbl = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        dashboardlbl2 = new javax.swing.JLabel();
        dboardlbl = new javax.swing.JLabel();
        dboardroomlbl = new javax.swing.JLabel();
        dboardcheckinlbl = new javax.swing.JLabel();
        dboardguestlbl = new javax.swing.JLabel();
        dboardacclbl = new javax.swing.JLabel();
        dashboardlbl4 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        userlogsanghistorylbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(89, 0, 0));
        jPanel24.setLayout(null);

        time.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel24.add(time);
        time.setBounds(490, 20, 160, 40);

        date.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel24.add(date);
        date.setBounds(310, 20, 160, 40);

        logout5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        logout5.setForeground(new java.awt.Color(255, 255, 255));
        logout5.setText("Logout");
        logout5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout5MouseClicked(evt);
            }
        });
        jPanel24.add(logout5);
        logout5.setBounds(910, 20, 60, 40);

        jPanel1.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 990, 80));

        tab1.setBackground(new java.awt.Color(255, 255, 255));

        dashboard_panel.setBackground(new java.awt.Color(255, 255, 255));
        dashboard_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardlbl3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl3.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl3.setText("Dashboard");
        dashboard_panel.add(dashboardlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel10.setBackground(new java.awt.Color(179, 29, 29));
        jPanel10.setLayout(null);

        jLabel55.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Available Rooms");
        jPanel10.add(jLabel55);
        jLabel55.setBounds(43, 96, 147, 23);
        jPanel10.add(availroomlbl);
        availroomlbl.setBounds(80, 10, 110, 90);

        totalavailroomslbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        totalavailroomslbl.setForeground(new java.awt.Color(255, 255, 255));
        totalavailroomslbl.setText("10");
        jPanel10.add(totalavailroomslbl);
        totalavailroomslbl.setBounds(10, 40, 70, 50);

        dashboard_panel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 200, 130));

        jPanel9.setBackground(new java.awt.Color(179, 29, 29));
        jPanel9.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Welcome");
        jPanel9.add(jLabel47);
        jLabel47.setBounds(160, 20, 250, 70);
        jPanel9.add(acciconlbl);
        acciconlbl.setBounds(-20, -30, 210, 200);

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.add(jLabel48);
        jLabel48.setBounds(270, 80, 170, 40);

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Username:");
        jPanel9.add(jLabel49);
        jLabel49.setBounds(160, 90, 120, 23);

        dashboard_panel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 890, 140));

        jPanel22.setBackground(new java.awt.Color(179, 29, 29));
        jPanel22.setLayout(null);

        jLabel56.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Booked Rooms");
        jPanel22.add(jLabel56);
        jLabel56.setBounds(61, 96, 139, 23);
        jPanel22.add(bookedroomslbl);
        bookedroomslbl.setBounds(90, 0, 120, 110);

        bookedroomslbl2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        bookedroomslbl2.setForeground(new java.awt.Color(255, 255, 255));
        bookedroomslbl2.setText("0");
        jPanel22.add(bookedroomslbl2);
        bookedroomslbl2.setBounds(10, 40, 50, 50);

        dashboard_panel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 200, 130));

        jPanel23.setBackground(new java.awt.Color(179, 29, 29));
        jPanel23.setLayout(null);

        jLabel57.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Total earnings");
        jPanel23.add(jLabel57);
        jLabel57.setBounds(70, 93, 120, 30);
        jPanel23.add(moneylbl);
        moneylbl.setBounds(100, 0, 110, 110);

        totalearnslbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        totalearnslbl.setForeground(new java.awt.Color(255, 255, 255));
        totalearnslbl.setText("0");
        jPanel23.add(totalearnslbl);
        totalearnslbl.setBounds(10, 40, 110, 50);

        dashboard_panel.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 200, 130));

        jPanel30.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        dashboard_panel.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 990, 100));

        jPanel12.setBackground(new java.awt.Color(179, 29, 29));
        jPanel12.setLayout(null);

        jLabel62.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("10");
        jPanel12.add(jLabel62);
        jLabel62.setBounds(10, 20, 60, 80);
        jPanel12.add(totalroomslbl);
        totalroomslbl.setBounds(80, 10, 110, 90);

        jLabel63.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Total Rooms");
        jPanel12.add(jLabel63);
        jLabel63.setBounds(85, 96, 106, 23);

        dashboard_panel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, 130));

        jPanel3.setBackground(new java.awt.Color(179, 29, 29));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Housekeeping");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(65, 96, 125, 23);

        housekeepinglbl2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        housekeepinglbl2.setForeground(new java.awt.Color(255, 255, 255));
        housekeepinglbl2.setText("0");
        jPanel3.add(housekeepinglbl2);
        housekeepinglbl2.setBounds(10, 45, 50, 45);
        jPanel3.add(housekeepinglbl1);
        housekeepinglbl1.setBounds(65, -10, 140, 140);

        dashboard_panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 200, 130));

        tab1.addTab("Dashboard", dashboard_panel);

        acc_panel.setBackground(new java.awt.Color(255, 255, 255));
        acc_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(179, 29, 29));
        lbl1.setText("Account ID:");
        acc_panel.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lbl2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl2.setForeground(new java.awt.Color(179, 29, 29));
        lbl2.setText("Username:");
        acc_panel.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        accid.setEditable(false);
        accid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc_panel.add(accid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 290, 26));

        acc_uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acc_unameKeyPressed(evt);
            }
        });
        acc_panel.add(acc_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 290, 26));

        lbl3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl3.setForeground(new java.awt.Color(179, 29, 29));
        lbl3.setText("Password:");
        acc_panel.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 60));

        lbl4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl4.setForeground(new java.awt.Color(179, 29, 29));
        lbl4.setText("Retype Password:");
        acc_panel.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        acc_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acc_passKeyPressed(evt);
            }
        });
        acc_panel.add(acc_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 86, 290, 30));

        acc_repass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc_repass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acc_repassKeyPressed(evt);
            }
        });
        acc_panel.add(acc_repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 290, 26));

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(89, 0, 0));
        add.setText("Add");
        add.setRequestFocusEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        acc_panel.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 100, 40));

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(89, 0, 0));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        acc_panel.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 100, 40));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(89, 0, 0));
        save.setText("Update");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        acc_panel.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 100, 40));

        table1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        table1.setForeground(new java.awt.Color(148, 14, 14));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setToolTipText("");
        table1.setGridColor(new java.awt.Color(255, 204, 51));
        table1.setRequestFocusEnabled(false);
        table1.setSelectionBackground(new java.awt.Color(179, 29, 29));
        jScrollPane1.setViewportView(table1);
        table1.getColumnModel().getColumn(0).setResizable(false);
        table1.getColumnModel().getColumn(1).setResizable(false);
        table1.getColumnModel().getColumn(2).setResizable(false);

        acc_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 910, 320));

        dashboardlbl1.setBackground(new java.awt.Color(179, 29, 29));
        dashboardlbl1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl1.setForeground(new java.awt.Color(179, 29, 29));
        dashboardlbl1.setText("Registration of Accounts");
        acc_panel.add(dashboardlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel29.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        acc_panel.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 990, 100));

        tab1.addTab("accounts", acc_panel);

        roomspanel.setBackground(new java.awt.Color(255, 255, 255));
        roomspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(239, 237, 237));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(148, 14, 14));
        jLabel18.setText("10");

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(148, 14, 14));
        jLabel29.setText("Suite");

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(148, 14, 14));
        jLabel37.setText("5");

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(148, 14, 14));
        jLabel39.setText("3000");

        stats10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats10.setForeground(new java.awt.Color(148, 14, 14));
        stats10.setText("Available");

        housekeep10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep10.setForeground(new java.awt.Color(148, 14, 14));
        housekeep10.setText("Clean");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel29)
                .addGap(119, 119, 119)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(stats10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats10)
                    .addComponent(housekeep10))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 890, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(148, 14, 14));
        jLabel22.setText("9");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(148, 14, 14));
        jLabel28.setText("Suite");

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(148, 14, 14));
        jLabel36.setText("5");

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(148, 14, 14));
        jLabel46.setText("3000");

        stats9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats9.setForeground(new java.awt.Color(148, 14, 14));
        stats9.setText("Available");

        housekeep9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep9.setForeground(new java.awt.Color(148, 14, 14));
        housekeep9.setText("Clean");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel28)
                .addGap(119, 119, 119)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(stats9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats9)
                    .addComponent(housekeep9))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 890, -1));

        jPanel19.setBackground(new java.awt.Color(239, 237, 237));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(148, 14, 14));
        jLabel21.setText("8");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(148, 14, 14));
        jLabel27.setText("Family");

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(148, 14, 14));
        jLabel35.setText("4");

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(148, 14, 14));
        jLabel45.setText("2500");

        stats8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats8.setForeground(new java.awt.Color(148, 14, 14));
        stats8.setText("Available");

        housekeep8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep8.setForeground(new java.awt.Color(148, 14, 14));
        housekeep8.setText("Clean");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(stats8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats8)
                    .addComponent(housekeep8)))
        );

        roomspanel.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 890, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(148, 14, 14));
        jLabel20.setText("7");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(148, 14, 14));
        jLabel26.setText("Family");

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(148, 14, 14));
        jLabel34.setText("4");

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(148, 14, 14));
        jLabel44.setText("2500");

        stats7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats7.setForeground(new java.awt.Color(148, 14, 14));
        stats7.setText("Available");

        housekeep7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep7.setForeground(new java.awt.Color(148, 14, 14));
        housekeep7.setText("Clean");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(stats7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(stats7)
                .addComponent(housekeep7))
        );

        roomspanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 890, -1));

        jPanel17.setBackground(new java.awt.Color(239, 237, 237));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(148, 14, 14));
        jLabel15.setText("6");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(148, 14, 14));
        jLabel25.setText("Triple");

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(148, 14, 14));
        jLabel33.setText("3");

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(148, 14, 14));
        jLabel42.setText("1500");

        stats6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats6.setForeground(new java.awt.Color(148, 14, 14));
        stats6.setText("Available");

        housekeep6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep6.setForeground(new java.awt.Color(148, 14, 14));
        housekeep6.setText("Clean");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel25)
                .addGap(118, 118, 118)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(stats6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(housekeep6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats6)
                    .addComponent(housekeep6))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 890, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(148, 14, 14));
        jLabel19.setText("5");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(148, 14, 14));
        jLabel24.setText("Triple");

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(148, 14, 14));
        jLabel32.setText("3");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(148, 14, 14));
        jLabel43.setText("1500");

        housekeep5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep5.setForeground(new java.awt.Color(148, 14, 14));
        housekeep5.setText("Clean");

        stats5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats5.setForeground(new java.awt.Color(148, 14, 14));
        stats5.setText("Available");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel24)
                .addGap(117, 117, 117)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stats5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housekeep5)
                    .addComponent(stats5))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 890, -1));

        jPanel16.setBackground(new java.awt.Color(239, 237, 237));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(148, 14, 14));
        jLabel17.setText("4");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(148, 14, 14));
        jLabel23.setText("Double");

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(148, 14, 14));
        jLabel31.setText("2");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(148, 14, 14));
        jLabel40.setText("1000");

        stats4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats4.setForeground(new java.awt.Color(148, 14, 14));
        stats4.setText("Available");

        housekeep4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep4.setForeground(new java.awt.Color(148, 14, 14));
        housekeep4.setText("Clean");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stats4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(housekeep4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats4)
                    .addComponent(housekeep4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 890, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(148, 14, 14));
        jLabel7.setText("3");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(148, 14, 14));
        jLabel16.setText("Double");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(148, 14, 14));
        jLabel30.setText("2");

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(148, 14, 14));
        jLabel38.setText("1000");

        housekeep3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep3.setForeground(new java.awt.Color(148, 14, 14));
        housekeep3.setText("Clean");

        stats3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats3.setForeground(new java.awt.Color(148, 14, 14));
        stats3.setText("Available");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stats3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housekeep3)
                    .addComponent(stats3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 890, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(148, 14, 14));
        jLabel6.setText("1");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(148, 14, 14));
        jLabel8.setText("Single");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(148, 14, 14));
        jLabel10.setText("1");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(148, 14, 14));
        jLabel12.setText("500");

        stats1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats1.setForeground(new java.awt.Color(148, 14, 14));
        stats1.setText("Available");

        housekeep1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep1.setForeground(new java.awt.Color(148, 14, 14));
        housekeep1.setText("Clean");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stats1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(housekeep1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats1)
                    .addComponent(housekeep1)))
        );

        roomspanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 890, -1));

        jPanel11.setBackground(new java.awt.Color(239, 237, 237));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(148, 14, 14));
        jLabel5.setText("2");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(148, 14, 14));
        jLabel9.setText("Single");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(148, 14, 14));
        jLabel11.setText("1");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(148, 14, 14));
        jLabel13.setText("500");

        housekeep2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        housekeep2.setForeground(new java.awt.Color(148, 14, 14));
        housekeep2.setText("Clean");

        stats2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stats2.setForeground(new java.awt.Color(148, 14, 14));
        stats2.setText("Available");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stats2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(housekeep2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housekeep2)
                    .addComponent(stats2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roomspanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 890, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Number of Beds", "Room Rate", "Status", "Housekeeping"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        roomspanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 890, 220));

        dashboardlbl18.setBackground(new java.awt.Color(255, 255, 255));
        dashboardlbl18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl18.setForeground(new java.awt.Color(179, 29, 29));
        dashboardlbl18.setText("Manage Rooms");
        roomspanel.add(dashboardlbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel32.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        roomspanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, -1, -1));

        tab1.addTab("rooms", roomspanel);

        checkinpanel.setBackground(new java.awt.Color(255, 255, 255));
        checkinpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkinphonetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinphonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkinphonetxtKeyPressed(evt);
            }
        });
        checkinpanel.add(checkinphonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 220, 30));

        add5.setBackground(new java.awt.Color(255, 255, 255));
        add5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add5.setForeground(new java.awt.Color(148, 14, 14));
        add5.setText("Add");
        add5.setRequestFocusEnabled(false);
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });
        checkinpanel.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 130, 40));

        del5.setBackground(new java.awt.Color(255, 255, 255));
        del5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        del5.setForeground(new java.awt.Color(148, 14, 14));
        del5.setText("Clear");
        del5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del5ActionPerformed(evt);
            }
        });
        checkinpanel.add(del5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 130, 40));

        checkingendercb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENDER", " ", "MALE", "FEMALE" }));
        checkinpanel.add(checkingendercb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 220, 30));

        lbl37.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl37.setText("*Customer ID:");
        checkinpanel.add(lbl37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        lbl38.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl38.setText("*Last Name:");
        checkinpanel.add(lbl38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        lbl40.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl40.setText("*Gender:");
        checkinpanel.add(lbl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        lbl43.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl43.setText("*Email address:");
        checkinpanel.add(lbl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        lbl46.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl46.setText("*Mobile Number:");
        checkinpanel.add(lbl46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        checkinlnametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinlnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkinlnametxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkinlnametxtKeyReleased(evt);
            }
        });
        checkinpanel.add(checkinlnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 220, 30));

        checkinfnametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinfnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkinfnametxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkinfnametxtKeyReleased(evt);
            }
        });
        checkinpanel.add(checkinfnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 220, 30));

        lbl47.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl47.setText("*First Name:");
        checkinpanel.add(lbl47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        checkincustomidtxt.setEditable(false);
        checkincustomidtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(checkincustomidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 220, 30));

        checkinemailtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinemailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkinemailtxtKeyReleased(evt);
            }
        });
        checkinpanel.add(checkinemailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 220, 30));

        dashboardlbl14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl14.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl14.setText("Guest Check-In");
        checkinpanel.add(dashboardlbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel33.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        checkinpanel.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 990, 100));

        dashboardlbl20.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        dashboardlbl20.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl20.setText("Customer's Information");
        checkinpanel.add(dashboardlbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));

        dashboardlbl13.setBackground(new java.awt.Color(255, 255, 255));
        dashboardlbl13.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        dashboardlbl13.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl13.setText("Room's Information");
        checkinpanel.add(dashboardlbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 30));

        lbl44.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl44.setText("*Bed Type:");
        checkinpanel.add(lbl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 90, 50));

        lbl45.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl45.setText("*Room Number:");
        checkinpanel.add(lbl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 130, 50));

        lbl25.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl25.setText("*Price:");
        checkinpanel.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 60, 40));

        lbl66.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl66.setText("NO. of Days Stay:");
        checkinpanel.add(lbl66, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 140, 40));

        lbl65.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl65.setText("*Total:");
        checkinpanel.add(lbl65, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 60, 40));

        checkinbedcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BED TYPE", " ", "SINGLE", "DOUBLE", "TRIPLE", "FAMILY", "SUITE" }));
        checkinbedcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinbedcbActionPerformed(evt);
            }
        });
        checkinpanel.add(checkinbedcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 220, 30));

        checkinroomcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ROOM" }));
        checkinpanel.add(checkinroomcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 220, 30));

        checkinpricetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(checkinpricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 220, 30));

        outdaystxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(outdaystxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 220, 26));

        intotaltxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(intotaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 220, 30));

        dashboardlbl21.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        dashboardlbl21.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl21.setText("Checkin's Information");
        checkinpanel.add(dashboardlbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 180, -1));

        lbl41.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl41.setText("*Check in date:");
        checkinpanel.add(lbl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 60));

        lbl48.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl48.setText("*Time in:");
        checkinpanel.add(lbl48, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 70, 70));

        lbl27.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl27.setText("*Check out date:");
        checkinpanel.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, 40));

        checkincheckouttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(checkincheckouttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 220, 30));

        checkintimetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(checkintimetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 220, 30));

        checkindatetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkinpanel.add(checkindatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 220, 30));

        tab1.addTab("check in", checkinpanel);

        guestpanel.setBackground(new java.awt.Color(255, 255, 255));
        guestpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        table2.setForeground(new java.awt.Color(148, 14, 14));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Room #", "FirstName", "LastName", "Phone #", "Email", "Gender", "Price", "Check in date", "Time in", "Check out date", "Bed type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setSelectionBackground(new java.awt.Color(179, 29, 29));
        jScrollPane8.setViewportView(table2);

        guestpanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 960, 420));

        dashboardlbl12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl12.setForeground(new java.awt.Color(179, 29, 29));
        dashboardlbl12.setText("Manage Guests");
        guestpanel.add(dashboardlbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(179, 29, 29));
        jLabel3.setText("Search");
        guestpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, 30));

        guest_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                guest_searchKeyReleased(evt);
            }
        });
        guestpanel.add(guest_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 180, 30));

        jPanel34.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        guestpanel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 990, 100));

        guestproceedcheckoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        guestproceedcheckoutbtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        guestproceedcheckoutbtn.setForeground(new java.awt.Color(148, 14, 14));
        guestproceedcheckoutbtn.setText("Proceed to checkout");
        guestproceedcheckoutbtn.setRequestFocusEnabled(false);
        guestproceedcheckoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestproceedcheckoutbtnActionPerformed(evt);
            }
        });
        guestpanel.add(guestproceedcheckoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 190, 40));

        tab1.addTab("guest", guestpanel);

        billspanel.setBackground(new java.awt.Color(255, 255, 255));
        billspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardlbl17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl17.setForeground(new java.awt.Color(179, 29, 29));
        dashboardlbl17.setText("Payment");
        billspanel.add(dashboardlbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cardlogolbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardlogolblMouseClicked(evt);
            }
        });
        billspanel.add(cardlogolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 260, 230));

        banklogolbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banklogolblMouseClicked(evt);
            }
        });
        billspanel.add(banklogolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 250, 210));

        cashlogolbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashlogolblMouseClicked(evt);
            }
        });
        billspanel.add(cashlogolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 240, 190));

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel59.setText("Credit / Debit Card");
        billspanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel60.setText("Bank Transfer");
        billspanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel61.setText("Cash");
        billspanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, -1, -1));

        jPanel35.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        billspanel.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 990, 110));

        tab1.addTab("billing", billspanel);

        checkoutpanel.setBackground(new java.awt.Color(255, 255, 255));
        checkoutpanel.setLayout(null);

        dashboardlbl16.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        dashboardlbl16.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl16.setText("Reservation Summary");
        checkoutpanel.add(dashboardlbl16);
        dashboardlbl16.setBounds(160, 70, 190, 43);

        checkincustomidtxt1.setEditable(false);
        checkincustomidtxt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkincustomidtxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkincustomidtxt1);
        checkincustomidtxt1.setBounds(190, 120, 220, 30);

        lbl49.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl49.setText("First Name:");
        checkoutpanel.add(lbl49);
        lbl49.setBounds(80, 160, 84, 30);

        lbl42.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl42.setText("Last Name:");
        checkoutpanel.add(lbl42);
        lbl42.setBounds(80, 200, 85, 40);

        lbl52.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl52.setText("Email address:");
        checkoutpanel.add(lbl52);
        lbl52.setBounds(50, 240, 111, 40);

        checkoutfnametxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutfnametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutfnametxt);
        checkoutfnametxt.setBounds(190, 160, 220, 30);

        checkoutlnametxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutlnametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutlnametxt);
        checkoutlnametxt.setBounds(190, 200, 220, 30);

        checkouttimeouttxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkouttimeouttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkouttimeouttxt);
        checkouttimeouttxt.setBounds(190, 490, 220, 30);

        lbl50.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl50.setText("Check in date:");
        checkoutpanel.add(lbl50);
        lbl50.setBounds(50, 350, 113, 60);

        lbl51.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl51.setText("Time out:");
        checkoutpanel.add(lbl51);
        lbl51.setBounds(90, 480, 90, 50);

        lbl32.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl32.setText("Check out date:");
        checkoutpanel.add(lbl32);
        lbl32.setBounds(40, 440, 123, 50);

        lbl53.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl53.setText("Time in:");
        checkoutpanel.add(lbl53);
        lbl53.setBounds(100, 400, 59, 50);

        checkoutamounttxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutamounttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutamounttxt);
        checkoutamounttxt.setBounds(190, 330, 220, 30);

        checkoutindatetxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutindatetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutindatetxt);
        checkoutindatetxt.setBounds(190, 370, 220, 30);

        checkouttimeintxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkouttimeintxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkouttimeintxt);
        checkouttimeintxt.setBounds(190, 410, 220, 30);

        checkoutdatetxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutdatetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutdatetxt);
        checkoutdatetxt.setBounds(190, 450, 220, 30);

        lbl54.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl54.setText("Customer ID:");
        checkoutpanel.add(lbl54);
        lbl54.setBounds(70, 120, 96, 30);

        lbl55.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl55.setText("Room Number:");
        checkoutpanel.add(lbl55);
        lbl55.setBounds(50, 290, 130, 21);

        checkoutemailtxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutemailtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutemailtxt);
        checkoutemailtxt.setBounds(190, 250, 220, 30);

        checkoutroomnotxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkoutroomnotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkoutpanel.add(checkoutroomnotxt);
        checkoutroomnotxt.setBounds(190, 290, 220, 30);

        lbl68.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl68.setText("Total amount:");
        checkoutpanel.add(lbl68);
        lbl68.setBounds(60, 330, 120, 21);

        cashpaybtn3.setBackground(new java.awt.Color(255, 255, 255));
        cashpaybtn3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cashpaybtn3.setForeground(new java.awt.Color(148, 14, 14));
        cashpaybtn3.setText("Check out");
        cashpaybtn3.setRequestFocusEnabled(false);
        cashpaybtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashpaybtn3ActionPerformed(evt);
            }
        });
        checkoutpanel.add(cashpaybtn3);
        cashpaybtn3.setBounds(300, 580, 110, 30);

        jPanel39.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        checkoutpanel.add(jPanel39);
        jPanel39.setBounds(0, 630, 990, 100);

        dashboardlbl19.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dashboardlbl19.setForeground(new java.awt.Color(148, 14, 14));
        dashboardlbl19.setText("Guest Check Out");
        checkoutpanel.add(dashboardlbl19);
        dashboardlbl19.setBounds(27, 11, 199, 43);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        checkoutpanel.add(jScrollPane3);
        jScrollPane3.setBounds(540, 80, 390, 470);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(148, 14, 14));
        jButton1.setText("Print Receipt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        checkoutpanel.add(jButton1);
        jButton1.setBounds(820, 580, 120, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        checkoutpanel.add(jPanel2);
        jPanel2.setBounds(530, 70, 410, 490);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        checkoutpanel.add(jLabel4);
        jLabel4.setBounds(904, 10, 50, 20);

        tab1.addTab("checkout", checkoutpanel);

        userlogspanel.setBackground(new java.awt.Color(255, 255, 255));

        userlogslbl.setBackground(new java.awt.Color(255, 255, 255));
        userlogslbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        userlogslbl.setForeground(new java.awt.Color(179, 29, 29));
        userlogslbl.setText("User Logs & Permission");

        userlogtable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userlogtable.setForeground(new java.awt.Color(148, 14, 14));
        userlogtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account User", "Date", "Time in", "Time out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userlogtable.setSelectionBackground(new java.awt.Color(179, 29, 29));
        jScrollPane4.setViewportView(userlogtable);
        userlogtable.getColumnModel().getColumn(0).setResizable(false);
        userlogtable.getColumnModel().getColumn(1).setResizable(false);
        userlogtable.getColumnModel().getColumn(2).setResizable(false);
        userlogtable.getColumnModel().getColumn(3).setResizable(false);

        jPanel31.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        historylbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        historylbl.setForeground(new java.awt.Color(179, 29, 29));
        historylbl.setText("History");
        historylbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historylblMouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(179, 29, 29));
        jLabel41.setText("User Logs & Permission");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(148, 14, 14));
        jButton2.setText("Print Receipt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(148, 14, 14));
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userlogspanelLayout = new javax.swing.GroupLayout(userlogspanel);
        userlogspanel.setLayout(userlogspanelLayout);
        userlogspanelLayout.setHorizontalGroup(
            userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userlogspanelLayout.createSequentialGroup()
                .addGroup(userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userlogspanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(userlogspanelLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(userlogspanelLayout.createSequentialGroup()
                                    .addComponent(userlogslbl)
                                    .addGap(26, 26, 26)
                                    .addComponent(historylbl))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userlogspanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(362, 362, 362))
            .addGroup(userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userlogspanelLayout.createSequentialGroup()
                    .addGap(0, 440, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 440, Short.MAX_VALUE)))
        );
        userlogspanelLayout.setVerticalGroup(
            userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userlogspanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userlogslbl)
                    .addComponent(historylbl))
                .addGap(29, 29, 29)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(userlogspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userlogspanelLayout.createSequentialGroup()
                    .addGap(0, 351, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 351, Short.MAX_VALUE)))
        );

        tab1.addTab("userlogs", userlogspanel);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel52.setText("Back");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel52);
        jLabel52.setBounds(904, 10, 50, 20);

        historytable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        historytable.setForeground(new java.awt.Color(148, 14, 14));
        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Email address", "Room No.", "Check in date", "Time in", "Check out date", "Time out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historytable.setSelectionBackground(new java.awt.Color(179, 29, 29));
        jScrollPane5.setViewportView(historytable);
        historytable.getColumnModel().getColumn(0).setResizable(false);
        historytable.getColumnModel().getColumn(2).setResizable(false);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(40, 142, 902, 420);
        jPanel4.add(jScrollBar1);
        jScrollBar1.setBounds(520, 160, 17, 48);

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(179, 29, 29));
        jLabel50.setText("Guest History");
        jPanel4.add(jLabel50);
        jLabel50.setBounds(1363, 60, 151, 31);

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(179, 29, 29));
        jLabel53.setText("Guest History");
        jPanel4.add(jLabel53);
        jLabel53.setBounds(430, 60, 160, 31);

        jPanel36.setBackground(new java.awt.Color(89, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel36);
        jPanel36.setBounds(0, 620, 990, 100);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(148, 14, 14));
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(860, 570, 80, 30);

        tab1.addTab("history", jPanel4);

        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 990, 760));

        lbl5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl5.setForeground(new java.awt.Color(191, 64, 191));
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 60, 20));

        dashboardlbl2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        dashboardlbl2.setForeground(new java.awt.Color(255, 255, 255));
        dashboardlbl2.setText("Reservation System");
        jPanel1.add(dashboardlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 188, -1, 50));

        dboardlbl.setBackground(new java.awt.Color(255, 255, 255));
        dboardlbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dboardlbl.setForeground(new java.awt.Color(255, 255, 255));
        dboardlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dboardlbl.setText("   Dashboard");
        dboardlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dboardlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dboardlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dboardlblMouseExited(evt);
            }
        });
        jPanel1.add(dboardlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 70));

        dboardroomlbl.setBackground(new java.awt.Color(255, 255, 255));
        dboardroomlbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dboardroomlbl.setForeground(new java.awt.Color(255, 255, 255));
        dboardroomlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dboardroomlbl.setText("Rooms");
        dboardroomlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dboardroomlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dboardroomlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dboardroomlblMouseExited(evt);
            }
        });
        jPanel1.add(dboardroomlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 120, 50));

        dboardcheckinlbl.setBackground(new java.awt.Color(255, 255, 255));
        dboardcheckinlbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dboardcheckinlbl.setForeground(new java.awt.Color(255, 255, 255));
        dboardcheckinlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dboardcheckinlbl.setText("Check In");
        dboardcheckinlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dboardcheckinlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dboardcheckinlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dboardcheckinlblMouseExited(evt);
            }
        });
        jPanel1.add(dboardcheckinlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 140, 50));

        dboardguestlbl.setBackground(new java.awt.Color(255, 255, 255));
        dboardguestlbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dboardguestlbl.setForeground(new java.awt.Color(255, 255, 255));
        dboardguestlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dboardguestlbl.setText("Guest");
        dboardguestlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dboardguestlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dboardguestlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dboardguestlblMouseExited(evt);
            }
        });
        jPanel1.add(dboardguestlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 170, 50));

        dboardacclbl.setBackground(new java.awt.Color(255, 255, 255));
        dboardacclbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dboardacclbl.setForeground(new java.awt.Color(255, 255, 255));
        dboardacclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dboardacclbl.setText("Accounts");
        dboardacclbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dboardacclblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dboardacclblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dboardacclblMouseExited(evt);
            }
        });
        jPanel1.add(dboardacclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, 50));

        dashboardlbl4.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        dashboardlbl4.setForeground(new java.awt.Color(255, 255, 255));
        dashboardlbl4.setText("Deluxe Hotel ");
        jPanel1.add(dashboardlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Payment");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 90, 40));

        userlogsanghistorylbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        userlogsanghistorylbl.setForeground(new java.awt.Color(255, 255, 255));
        userlogsanghistorylbl.setText("User logs & History");
        userlogsanghistorylbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userlogsanghistorylblMouseClicked(evt);
            }
        });
        jPanel1.add(userlogsanghistorylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 720, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multipleloginarraylist/mainicon.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout5MouseClicked
        int result = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO EXIT?", "LOGOUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                String data4 = time.getText();
                MultipleLogin.logsuserdatetimeout.add(data4);
                Loginn logg = new Loginn();
                this.setVisible(false);
                logg.setVisible(true);
                
               
            } else if (result == JOptionPane.NO_OPTION){
               this.setVisible(true);
            }
    }//GEN-LAST:event_logout5MouseClicked

    private void dboardcheckinlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardcheckinlblMouseClicked
        tab1.setSelectedIndex(3);
        checkindatetxt.setText(dat);
        checkincheckouttxt.setText(dat);
    }//GEN-LAST:event_dboardcheckinlblMouseClicked

    private void dboardlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardlblMouseClicked
        tab1.setSelectedIndex(0);
    }//GEN-LAST:event_dboardlblMouseClicked

    private void dboardacclblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardacclblMouseClicked
        tab1.setSelectedIndex(1);
    }//GEN-LAST:event_dboardacclblMouseClicked

    private void dboardguestlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardguestlblMouseClicked
        tab1.setSelectedIndex(4);
    }//GEN-LAST:event_dboardguestlblMouseClicked

    private void dboardroomlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardroomlblMouseClicked
        tab1.setSelectedIndex(2);
    }//GEN-LAST:event_dboardroomlblMouseClicked

    private void dboardlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardlblMouseEntered
        dboardlbl.setForeground(new Color(255,232, 113));
    }//GEN-LAST:event_dboardlblMouseEntered

    private void dboardacclblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardacclblMouseEntered
        dboardacclbl.setForeground(new Color(255,232, 113));
    }//GEN-LAST:event_dboardacclblMouseEntered

    private void dboardroomlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardroomlblMouseEntered
        dboardroomlbl.setForeground(new Color(255,232, 113));
    }//GEN-LAST:event_dboardroomlblMouseEntered

    private void dboardcheckinlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardcheckinlblMouseEntered
        dboardcheckinlbl.setForeground(new Color(255,232, 113));
    }//GEN-LAST:event_dboardcheckinlblMouseEntered

    private void dboardguestlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardguestlblMouseEntered
        dboardguestlbl.setForeground(new Color(255,232, 113));
    }//GEN-LAST:event_dboardguestlblMouseEntered

    private void dboardacclblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardacclblMouseExited
        dboardacclbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_dboardacclblMouseExited

    private void dboardroomlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardroomlblMouseExited
        dboardroomlbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_dboardroomlblMouseExited

    private void dboardcheckinlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardcheckinlblMouseExited
        dboardcheckinlbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_dboardcheckinlblMouseExited

    private void dboardguestlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardguestlblMouseExited
        dboardguestlbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_dboardguestlblMouseExited

    private void dboardlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboardlblMouseExited
        dboardlbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_dboardlblMouseExited

    private void guest_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guest_searchKeyReleased
        DefaultTableModel obj = (DefaultTableModel) table2.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        table2.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(guest_search.getText()));
    }//GEN-LAST:event_guest_searchKeyReleased

    private void del5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del5ActionPerformed

        checkinfnametxt.setText("");
        checkinlnametxt.setText("");
        checkinphonetxt.setText("");
        checkinemailtxt.setText("");
        checkingendercb.setSelectedIndex(0);
        checkinbedcb.setSelectedIndex(0);
        checkinroomcb.setSelectedIndex(0);
        checkinroomcb.removeAllItems();
        checkinpricetxt.setText("");
        outdaystxt.setText("");
        intotaltxt.setText("");
    }//GEN-LAST:event_del5ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed

        if (checkinfnametxt.getText().equals("") || checkinlnametxt.getText().equals("") || checkinphonetxt.getText().equals("")
                || checkingendercb.getSelectedItem().equals("") || checkinemailtxt.getText().equals("") || checkinbedcb.getSelectedItem().equals("")
                || checkinroomcb.getSelectedItem().equals("") || checkinpricetxt.getText().equals("") || outdaystxt.getText().equals("") 
                || intotaltxt.getText().equals("") || outdaystxt.getText().equals("0") || intotaltxt.getText().equals("0") || checkingendercb.getSelectedIndex() == 0
                || checkingendercb.getSelectedIndex() == 1 || checkinbedcb.getSelectedIndex() == 0 || checkinbedcb.getSelectedIndex() == 1 
                || checkinroomcb.getSelectedItem().equals("ROOM")){
            JOptionPane.showMessageDialog(null, "ENTER ALL FIELDS!");
        }
        
        else if (outdaystxt.getText().contains("-")){
            JOptionPane.showMessageDialog(null, "CHECK OUT DATE MUST BE VALID!");
        }
        
        else{
        MultipleLogin.totalavailrooms1--;
        String totalavailrooms2 = Integer.toString(MultipleLogin.totalavailrooms1);
        totalavailroomslbl.setText(totalavailrooms2);
        MultipleLogin.totalavailrooms.add(totalavailrooms2);
        
        MultipleLogin.totalbookedrooms1++;
        String totalbookedrooms2 = Integer.toString(MultipleLogin.totalbookedrooms1);
        bookedroomslbl2.setText(totalbookedrooms2);
        MultipleLogin.totalbookedrooms.add(totalbookedrooms2);
        
        MultipleLogin.totalhousekeeping1++;
        String totalhousekeeping2 = Integer.toString(MultipleLogin.totalhousekeeping1);
        housekeepinglbl2.setText(totalhousekeeping2);
        MultipleLogin.totalhousekeeping.add(totalhousekeeping2);
        
        
        JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED, PROCEED TO PAYMENT!");
        Random ran = new Random();
        int n = ran.nextInt(100000);
        String val = String.valueOf(n);
        String data1 = val;
        String data2 = checkinfnametxt.getText();
        String data3 = checkinlnametxt.getText();
        String data4 = checkinphonetxt.getText();
        String data5 = checkinemailtxt.getText();
        String data6 = checkingendercb.getSelectedItem().toString();
        String data7 = intotaltxt.getText();
        String data8 = checkindatetxt.getText();
        String data9 = checkintimetxt.getText();
        String data10 = checkincheckouttxt.getText();
        String data11 = checkinroomcb.getSelectedItem().toString();
        String data12 = checkinbedcb.getSelectedItem().toString();

        Object[] row = {data1, data11, data2, data3, data4, data5, data6, data7, data8, data9, data10, data12};
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
        model.addRow(row);
        
        MultipleLogin.guestcustomid.add(data1);
        MultipleLogin.guestroomno.add(data11); MultipleLogin.guestfname.add(data2); MultipleLogin.guestlname.add(data3);
        MultipleLogin.guestphoneno.add(data4); MultipleLogin.guestemail.add(data5); MultipleLogin.guestgender.add(data6);
        MultipleLogin.guestprice.add(data7); MultipleLogin.guestcheckin.add(data8); MultipleLogin.guesttimein.add(data9); 
        MultipleLogin.guestcheckout.add(data10); MultipleLogin.guestbedtype.add(data12); 

        if (checkinroomcb.getSelectedItem().equals("1")) {
            stats1.setText("Booked");
            housekeep1.setText("Dirty");
            MultipleLogin.manageroomstatus1.add(stats1.getText());
            MultipleLogin.housekeeping1.add(housekeep1.getText());
        } else if (checkinroomcb.getSelectedItem().equals("2")) {
            stats2.setText("Booked");
            housekeep2.setText("Dirty");
            MultipleLogin.manageroomstatus2.add(stats2.getText());
            MultipleLogin.housekeeping2.add(housekeep2.getText());
        } else if (checkinroomcb.getSelectedItem().equals("3")) {
            stats3.setText("Booked");
            housekeep3.setText("Dirty");
            MultipleLogin.manageroomstatus3.add(stats3.getText());
            MultipleLogin.housekeeping3.add(housekeep3.getText());
        } else if (checkinroomcb.getSelectedItem().equals("4")) {
            stats4.setText("Booked");
            housekeep4.setText("Dirty");
            MultipleLogin.manageroomstatus4.add(stats4.getText());
            MultipleLogin.housekeeping4.add(housekeep4.getText());
        } else if (checkinroomcb.getSelectedItem().equals("5")) {
            stats5.setText("Booked");
            housekeep5.setText("Dirty");
            MultipleLogin.manageroomstatus5.add(stats5.getText());
            MultipleLogin.housekeeping5.add(housekeep5.getText());
        } else if (checkinroomcb.getSelectedItem().equals("6")) {
            stats6.setText("Booked");
            housekeep6.setText("Dirty");
            MultipleLogin.manageroomstatus6.add(stats6.getText());
            MultipleLogin.housekeeping6.add(housekeep6.getText());
        } else if (checkinroomcb.getSelectedItem().equals("7")) {
            stats7.setText("Booked");
            housekeep7.setText("Dirty");
            MultipleLogin.manageroomstatus7.add(stats7.getText());
            MultipleLogin.housekeeping7.add(housekeep7.getText());
        } else if (checkinroomcb.getSelectedItem().equals("8")) {
            stats8.setText("Booked");
            housekeep8.setText("Dirty");
            MultipleLogin.manageroomstatus8.add(stats8.getText());
            MultipleLogin.housekeeping8.add(housekeep8.getText());
        } else if (checkinroomcb.getSelectedItem().equals("9")) {
            stats9.setText("Booked");
            housekeep9.setText("Dirty");
            MultipleLogin.manageroomstatus9.add(stats8.getText());
            MultipleLogin.housekeeping9.add(housekeep9.getText());
        } else if (checkinroomcb.getSelectedItem().equals("10")) {
            stats10.setText("Booked");
            housekeep10.setText("Dirty");
            MultipleLogin.manageroomstatus10.add(stats10.getText());
            MultipleLogin.housekeeping10.add(housekeep10.getText());
        }
        
        
        checkincustomidtxt.setText(""); checkinfnametxt.setText(""); checkinlnametxt.setText("");
        checkinphonetxt.setText(""); checkinemailtxt.setText(""); checkingendercb.setSelectedIndex(0);
        checkinbedcb.setSelectedIndex(0); checkinroomcb.setSelectedIndex(0); checkinpricetxt.setText("");
        checkinroomcb.removeAllItems(); outdaystxt.setText(""); intotaltxt.setText(""); //checkincheckouttxt.setText(dat);
        }
    }//GEN-LAST:event_add5ActionPerformed

    private void checkinphonetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkinphonetxtKeyPressed
        String pas1 = checkinphonetxt.getText();
        int pass_length1 = pas1.length();
        char b1 = evt.getKeyChar();

        if (Character.isDigit(b1)) {

            if (pass_length1 < 11) {
                checkinphonetxt.setEditable(true);
            } else {
                checkinphonetxt.setEditable(false);
            }
        } else {
            if (Character.isISOControl(b1)) {
                checkinphonetxt.setEditable(true);
            } else {
                checkinphonetxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_checkinphonetxtKeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int row = table1.getSelectedRow();
        String data2 = acc_uname.getText();
        String data3 = acc_pass.getText();
        String data1 = accid.getText();

        table1.setValueAt(data1, row, 0);
        table1.setValueAt(data2, row, 1);
        table1.setValueAt(data3, row, 2);

        MultipleLogin.username.set(row, data2);
        MultipleLogin.password.set(row, data3);

        JOptionPane.showMessageDialog(null, "ACCOUNT UPDATED!");
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int row = table1.getSelectedRow();
        String acc = table1.getValueAt(row, 0).toString();
        String un = table1.getValueAt(row, 1).toString();
        String pw = table1.getValueAt(row, 2).toString();

        acc_uname.setText(un);
        acc_pass.setText(pw);
        accid.setText(acc);
    }//GEN-LAST:event_editActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        if (acc_uname.getText().isEmpty() && acc_pass.getText().isEmpty() && acc_repass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ENTER ALL FIELDS!");
        } else if (acc_repass.getText().equals(acc_pass.getText())) {

            String data1 = Integer.toString(ctr++);

            accid.setText(data1);
            String data2 = acc_uname.getText();
            String data3 = acc_pass.getText();

            Object[] row = {data1, data2, data3};
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.addRow(row);

            MultipleLogin.username.add(acc_uname.getText());
            MultipleLogin.password.add(acc_pass.getText());
            accid.setText("");
            acc_uname.setText("");
            acc_pass.setText("");
            acc_repass.setText("");
            JOptionPane.showMessageDialog(null, "NEW ACCOUNT REGISTERED!");

        } else if (!acc_repass.getText().equals(acc_pass.getText())) {
            JOptionPane.showMessageDialog(null, "RETYPE PASSWORD IS INCORRECT!");
            acc_repass.setText("");

        } else if (acc_pass.equals("") && acc_uname.equals("") && acc_repass.equals("")) {
            JOptionPane.showMessageDialog(null, "ENTER ALL FIELDS!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void acc_repassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_repassKeyPressed
        String pas1 = acc_repass.getText();
        int pass_length1 = pas1.length();
        char b1 = evt.getKeyChar();

        if (Character.isDigit(b1)) {

            if (pass_length1 < 10) {
                acc_repass.setEditable(true);
            } else {
                acc_repass.setEditable(false);
            }
        } else {
            if (Character.isISOControl(b1)) {
                acc_repass.setEditable(true);
            } else {
                acc_repass.setEditable(false);
            }
        }
    }//GEN-LAST:event_acc_repassKeyPressed

    private void acc_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_passKeyPressed
        String pas = acc_pass.getText();
        int pass_length = pas.length();
        char b = evt.getKeyChar();

        if (Character.isDigit(b)) {

            if (pass_length < 10) {
                acc_pass.setEditable(true);
            } else {
                acc_pass.setEditable(false);
            }
        } else {
            if (Character.isISOControl(b)) {
                acc_pass.setEditable(true);
            } else {
                acc_pass.setEditable(false);
            }
        }
    }//GEN-LAST:event_acc_passKeyPressed

    private void acc_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_unameKeyPressed
        String un = acc_uname.getText();
        int uname_length = un.length();
        char a = evt.getKeyChar();

        if (Character.isLetter(a)) {

            if (uname_length < 10) {
                acc_uname.setEditable(true);
            } else {
                acc_uname.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(a) || Character.isISOControl(a) || evt.getExtendedKeyCode() == KeyEvent.VK_SHIFT || evt.getExtendedKeyCode() == KeyEvent.VK_2) {
                acc_uname.setEditable(true);
            } else {
                acc_uname.setEditable(false);
            }
        }
    }//GEN-LAST:event_acc_unameKeyPressed

    private void checkinbedcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinbedcbActionPerformed
        if (checkinbedcb.getSelectedIndex() == 2) {
            checkinpricetxt.setText("500");
            checkinroomcb.removeAllItems();

            if (stats1.getText().equals("Available") && stats2.getText().equals("Available")) {
                checkinroomcb.addItem("1");
                checkinroomcb.addItem("2");

            } else if (stats1.getText().equals("Available") && stats2.getText().equals("Booked")) {
                checkinroomcb.addItem("1");

            } else if (stats1.getText().equals("Booked") && stats2.getText().equals("Available")) {
                checkinroomcb.addItem("2");
            }
            String incheckindate = checkindatetxt.getText().substring(4, 6);
            String incheckoutdate = checkincheckouttxt.getText().substring(4, 6);
            int date1 = Integer.parseInt(incheckindate);
            int date2 = Integer.parseInt(incheckoutdate);
            int datediff = date2 - date1;
            String dates2 = Integer.toString(datediff);
            outdaystxt.setText(dates2);


            int price1 = Integer.parseInt(dates2);
            int price2 = Integer.parseInt(checkinpricetxt.getText());
            int total = price1 * price2;
            String newtotal = Integer.toString(total);
            intotaltxt.setText(newtotal);

        } else if (checkinbedcb.getSelectedIndex() == 3) {
            checkinpricetxt.setText("1000");
            checkinroomcb.removeAllItems();
            if (stats3.getText().equals("Available") && stats4.getText().equals("Available")) {
                checkinroomcb.addItem("3");
                checkinroomcb.addItem("4");

            } else if (stats3.getText().equals("Available") && stats4.getText().equals("Booked")) {
                checkinroomcb.addItem("3");

            } else if (stats3.getText().equals("Booked") && stats4.getText().equals("Available")) {
                checkinroomcb.addItem("4");
            }
            String incheckindate = checkindatetxt.getText().substring(4, 6);
            String incheckoutdate = checkincheckouttxt.getText().substring(4, 6);
            int date1 = Integer.parseInt(incheckindate);
            int date2 = Integer.parseInt(incheckoutdate);
            int datediff = date2 - date1;
            String dates2 = Integer.toString(datediff);
            outdaystxt.setText(dates2);


            int price1 = Integer.parseInt(dates2);
            int price2 = Integer.parseInt(checkinpricetxt.getText());
            int total = price1 * price2;
            String newtotal = Integer.toString(total);
            intotaltxt.setText(newtotal);
            
        } else if (checkinbedcb.getSelectedIndex() == 4) {
            checkinpricetxt.setText("1500");
            checkinroomcb.removeAllItems();
            if (stats5.getText().equals("Available") && stats6.getText().equals("Available")) {
                checkinroomcb.addItem("5");
                checkinroomcb.addItem("6");

            } else if (stats5.getText().equals("Available") && stats6.getText().equals("Booked")) {
                checkinroomcb.addItem("5");

            } else if (stats5.getText().equals("Booked") && stats6.getText().equals("Available")) {
                checkinroomcb.addItem("6");
            }
            String incheckindate = checkindatetxt.getText().substring(4, 6);
            String incheckoutdate = checkincheckouttxt.getText().substring(4, 6);
            int date1 = Integer.parseInt(incheckindate);
            int date2 = Integer.parseInt(incheckoutdate);
            int datediff = date2 - date1;
            String dates2 = Integer.toString(datediff);
            outdaystxt.setText(dates2);


            int price1 = Integer.parseInt(dates2);
            int price2 = Integer.parseInt(checkinpricetxt.getText());
            int total = price1 * price2;
            String newtotal = Integer.toString(total);
            intotaltxt.setText(newtotal);
        } else if (checkinbedcb.getSelectedIndex() == 5) {
            checkinpricetxt.setText("2500");
            checkinroomcb.removeAllItems();
            if (stats7.getText().equals("Available") && stats8.getText().equals("Available")) {
                checkinroomcb.addItem("7");
                checkinroomcb.addItem("8");

            } else if (stats7.getText().equals("Available") && stats8.getText().equals("Booked")) {
                checkinroomcb.addItem("7");

            } else if (stats7.getText().equals("Booked") && stats8.getText().equals("Available")) {
                checkinroomcb.addItem("8");
            }
            String incheckindate = checkindatetxt.getText().substring(4, 6);
            String incheckoutdate = checkincheckouttxt.getText().substring(4, 6);
            int date1 = Integer.parseInt(incheckindate);
            int date2 = Integer.parseInt(incheckoutdate);
            int datediff = date2 - date1;
            String dates2 = Integer.toString(datediff);
            outdaystxt.setText(dates2);


            int price1 = Integer.parseInt(dates2);
            int price2 = Integer.parseInt(checkinpricetxt.getText());
            int total = price1 * price2;
            String newtotal = Integer.toString(total);
            intotaltxt.setText(newtotal);
        } else if (checkinbedcb.getSelectedIndex() == 6) {
            checkinpricetxt.setText("3500");
            checkinroomcb.removeAllItems();
            if (stats9.getText().equals("Available") && stats10.getText().equals("Available")) {
                checkinroomcb.addItem("9");
                checkinroomcb.addItem("10");

            } else if (stats9.getText().equals("Available") && stats10.getText().equals("Booked")) {
                checkinroomcb.addItem("9");

            } else if (stats9.getText().equals("Booked") && stats10.getText().equals("Available")) {
                checkinroomcb.addItem("10");
            }
            String incheckindate = checkindatetxt.getText().substring(4, 6);
            String incheckoutdate = checkincheckouttxt.getText().substring(4, 6);
            int date1 = Integer.parseInt(incheckindate);
            int date2 = Integer.parseInt(incheckoutdate);
            int datediff = date2 - date1;
            String dates2 = Integer.toString(datediff);
            outdaystxt.setText(dates2);


            int price1 = Integer.parseInt(dates2);
            int price2 = Integer.parseInt(checkinpricetxt.getText());
            int total = price1 * price2;
            String newtotal = Integer.toString(total);
            intotaltxt.setText(newtotal);

        }
    }//GEN-LAST:event_checkinbedcbActionPerformed

    private void cardlogolblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardlogolblMouseClicked
        Billing bill = new Billing();
        bill.setVisible(true);
    }//GEN-LAST:event_cardlogolblMouseClicked

    private void banklogolblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banklogolblMouseClicked
        BankTransfer trans = new BankTransfer();
        trans.setVisible(true);
    }//GEN-LAST:event_banklogolblMouseClicked

    private void cashlogolblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashlogolblMouseClicked
        CashPay cash = new CashPay();
        cash.setVisible(true);
        CashPay.cashpaytxt2.setText(intotaltxt.getText());
    }//GEN-LAST:event_cashlogolblMouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        tab1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel51MouseClicked

    private void guestproceedcheckoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestproceedcheckoutbtnActionPerformed
        tab1.setSelectedIndex(6);
        
        int table2row2 = table2.getSelectedRow();
        String outcustomid = table2.getValueAt(table2row2, 0).toString();
        String outroomno = table2.getValueAt(table2row2, 1).toString();
        String outfname = table2.getValueAt(table2row2, 2).toString();
        String outlname = table2.getValueAt(table2row2, 3).toString();
        String outemail = table2.getValueAt(table2row2, 5).toString();
        String outamount = table2.getValueAt(table2row2, 7).toString();
        String outindate = table2.getValueAt(table2row2, 8).toString();
        String outtimein = table2.getValueAt(table2row2, 9).toString();
        String outdate = table2.getValueAt(table2row2, 10).toString();

        checkincustomidtxt1.setText(outcustomid);
        checkoutfnametxt.setText(outfname);
        checkoutlnametxt.setText(outlname);
        checkoutemailtxt.setText(outemail);
        checkoutroomnotxt.setText(outroomno);
        checkoutamounttxt.setText(outamount);
        checkoutindatetxt.setText(outindate);
        checkouttimeintxt.setText(outtimein);
        checkoutdatetxt.setText(outdate);

    }//GEN-LAST:event_guestproceedcheckoutbtnActionPerformed

    private void cashpaybtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashpaybtn3ActionPerformed
        int table2row = table2.getSelectedRow();
        int resultrow = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO CHECKOUT?");
        if (resultrow == JOptionPane.YES_OPTION) {
            if(checkoutfnametxt.getText().equals("") || checkoutlnametxt.getText().equals("") || checkoutemailtxt.getText().equals("")
                || checkoutroomnotxt.getText().equals("") || checkoutamounttxt.getText().equals("") || checkoutindatetxt.getText().equals("")
                || checkouttimeintxt.getText().equals("") || checkoutdatetxt.getText().equals("") || checkouttimeouttxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "FIELDS ARE EMPTY!");
            }
                else{
                ((DefaultTableModel) table2.getModel()).removeRow(table2.getSelectedRow());
                
                for (int i = 0; i < 50; i++) {
                JOptionPane.showMessageDialog(null, "CHECK OUT SUCCESSFUL!");
                String data1 = checkincustomidtxt1.getText();
                String data2 = checkoutfnametxt.getText();
                String data3 = checkoutlnametxt.getText();
                String data4 = checkoutemailtxt.getText();
                String data5 = checkoutroomnotxt.getText();
                String data6 = checkoutindatetxt.getText();
                String data7 = checkouttimeintxt.getText();
                String data8 = checkoutdatetxt.getText();
                String data9 = checkouttimeouttxt.getText();
                
                Object[] historyrow = {data1, data2, data3, data4, data5, data6, data7, data8, data9};
                DefaultTableModel historymodel = (DefaultTableModel) historytable.getModel();
                historymodel.addRow(historyrow);

                MultipleLogin.histocutomid.add(data1); MultipleLogin.histofname.add(data2); MultipleLogin.histolname.add(data3); 
                MultipleLogin.histoeadd.add(data4); MultipleLogin.historoomno.add(data5); MultipleLogin.histocheckin.add(data6);
                MultipleLogin.histotimein.add(data7); MultipleLogin.histocheckout.add(data8); MultipleLogin.histotimeout.add(data9);
                

        if (checkoutroomnotxt.getText().equals("1")) {
            stats1.setText("Available");
            housekeep1.setText("Clean");
            MultipleLogin.manageroomstatus1.add(stats1.getText());
            MultipleLogin.housekeeping1.add(housekeep1.getText());
        } else if (checkoutroomnotxt.getText().equals("2")) {
            stats2.setText("Available");
            housekeep2.setText("Clean");
            MultipleLogin.manageroomstatus2.add(stats2.getText());
            MultipleLogin.housekeeping2.add(housekeep2.getText());
        } else if (checkoutroomnotxt.getText().equals("3")) {
            stats3.setText("Available");
            housekeep3.setText("Clean");
            MultipleLogin.manageroomstatus3.add(stats3.getText());
            MultipleLogin.housekeeping3.add(housekeep3.getText());
        } else if (checkoutroomnotxt.getText().equals("4")) {
            stats4.setText("Available");
            housekeep4.setText("Clean");
            MultipleLogin.manageroomstatus4.add(stats4.getText());
            MultipleLogin.housekeeping4.add(housekeep4.getText());
        } else if (checkoutroomnotxt.getText().equals("5")) {
            stats5.setText("Available");
            housekeep5.setText("Clean");
            MultipleLogin.manageroomstatus5.add(stats5.getText());
            MultipleLogin.housekeeping5.add(housekeep5.getText());
        } else if (checkoutroomnotxt.getText().equals("6")) {
            stats6.setText("Available");
            housekeep6.setText("Clean");
            MultipleLogin.manageroomstatus6.add(stats6.getText());
            MultipleLogin.housekeeping6.add(housekeep6.getText());
        } else if (checkoutroomnotxt.getText().equals("7")) {
            stats7.setText("Available");
            housekeep7.setText("Clean");
            MultipleLogin.manageroomstatus7.add(stats7.getText());
            MultipleLogin.housekeeping7.add(housekeep7.getText());
        } else if (checkoutroomnotxt.getText().equals("8")) {
            stats8.setText("Available");
            housekeep8.setText("Clean");
            MultipleLogin.manageroomstatus8.add(stats8.getText());
            MultipleLogin.housekeeping8.add(housekeep8.getText());
        } else if (checkoutroomnotxt.getText().equals("9")) {
            stats9.setText("Available");
            housekeep9.setText("Clean");
            MultipleLogin.manageroomstatus9.add(stats9.getText());
            MultipleLogin.housekeeping9.add(housekeep9.getText());
        } else if (checkoutroomnotxt.getText().equals("10")) {
            stats10.setText("Available");
            housekeep10.setText("Clean");
            MultipleLogin.manageroomstatus10.add(stats10.getText());
            MultipleLogin.housekeeping10.add(housekeep10.getText());
        }
            
                MultipleLogin.totalavailrooms1++;
                String totalavailrooms3 = Integer.toString(MultipleLogin.totalavailrooms1);
                totalavailroomslbl.setText(totalavailrooms3);
                MultipleLogin.totalavailrooms.add(totalavailrooms3);
                
                MultipleLogin.totalbookedrooms1--;
                String totalbookedrooms2 = Integer.toString(MultipleLogin.totalbookedrooms1);
                bookedroomslbl2.setText(totalbookedrooms2);
                MultipleLogin.totalbookedrooms.add(totalbookedrooms2);
                
                MultipleLogin.totalhousekeeping1--;
                String totalhousekeeping2 = Integer.toString(MultipleLogin.totalhousekeeping1);
                housekeepinglbl2.setText(totalhousekeeping2);
                MultipleLogin.totalhousekeeping.add(totalhousekeeping2);
                
                Date obj = new Date();
                String date = obj.toString();
                billHeader();
                Random receiptno = new Random();
                int r = receiptno.nextInt(1000);
                String receiptvalue = String.valueOf(r);
                
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "RECEIPT NO.:" + receiptvalue + "\n");
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "CUSTOMER INFORMATION" + "\n");
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      CUSTOMER ID: " + checkincustomidtxt1.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      FIRST NAME: " + checkoutfnametxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      LAST NAME: " + checkoutlnametxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      EMAIL: " + checkoutemailtxt.getText()+"\n");
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "RESERVATION INFORMATION" + "\n");
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      ROOM NO.: " + checkoutroomnotxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      AMOUNT: " + checkoutamounttxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      CHECK IN DATE: " + checkoutindatetxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      TIME IN: " + checkouttimeintxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      CHECK OUT DATE: " + checkoutdatetxt.getText());
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "      TIME OUT: " + checkouttimeouttxt.getText()+"\n");
                jTextArea1.setText(jTextArea1.getText()+"\n");
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "                                       THANK YOU FOR YOUR STAY!");
                jTextArea1.setText(jTextArea1.getText()+"\n"+ "                                              PLEASE COME AGAIN!"+"\n");
                
                MultipleLogin.guestcustomid.remove(table2row);
                MultipleLogin.guestroomno.remove(table2row);
                MultipleLogin.guestfname.remove(table2row);
                MultipleLogin.guestlname.remove(table2row);
                MultipleLogin.guestphoneno.remove(table2row);
                MultipleLogin.guestemail.remove(table2row);
                MultipleLogin.guestgender.remove(table2row);
                MultipleLogin.guestprice.remove(table2row);
                MultipleLogin.guestcheckin.remove(table2row);
                MultipleLogin.guesttimein.remove(table2row);
                MultipleLogin.guestcheckout.remove(table2row);
                MultipleLogin.guestbedtype.remove(table2row);
                
                checkincustomidtxt1.setText("");
                checkoutfnametxt.setText("");
                checkoutlnametxt.setText("");
                checkoutemailtxt.setText("");
                checkoutroomnotxt.setText("");
                checkoutamounttxt.setText("");
                checkoutindatetxt.setText("");
                checkouttimeintxt.setText("");
                checkoutdatetxt.setText("");
                break;
            }
        }
        }
    }//GEN-LAST:event_cashpaybtn3ActionPerformed
    private void billHeader(){ 
        jTextArea1.setText("====================================================="+"\n"+"\t"+"                  DELUXE HOTEL"+"\n"+"                           Address: Coral Way, Pasay, Metro Manila"+
                "\n"+"                                       Contact Number:0943728920" + "\n"+ "                                            Tel No. (023) 488 80231 " + "\n"+"====================================================="
                );
        
    }
    private void checkinfnametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkinfnametxtKeyReleased
        int fnamecase = checkinfnametxt.getCaretPosition();
        checkinfnametxt.setText(checkinfnametxt.getText().toUpperCase());
        checkinfnametxt.setCaretPosition(fnamecase);

    }//GEN-LAST:event_checkinfnametxtKeyReleased

    private void checkinlnametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkinlnametxtKeyReleased
        int lnamecase = checkinlnametxt.getCaretPosition();
        checkinlnametxt.setText(checkinlnametxt.getText().toUpperCase());
        checkinlnametxt.setCaretPosition(lnamecase);
    }//GEN-LAST:event_checkinlnametxtKeyReleased

    private void checkinemailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkinemailtxtKeyReleased
        int emailcase = checkinemailtxt.getCaretPosition();
        checkinemailtxt.setText(checkinemailtxt.getText().toLowerCase());
        checkinemailtxt.setCaretPosition(emailcase);
    }//GEN-LAST:event_checkinemailtxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jTextArea1.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userlogsanghistorylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userlogsanghistorylblMouseClicked
        tab1.setSelectedIndex(7);
    }//GEN-LAST:event_userlogsanghistorylblMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        tab1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void checkinfnametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkinfnametxtKeyPressed
        String fn = checkinfnametxt.getText();
        int fn_length = fn.length();
        char f = evt.getKeyChar();

        if (Character.isLetter(f)) {

            if (fn_length < 30) {
                checkinfnametxt.setEditable(true);
            } else {
                checkinfnametxt.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(f) || Character.isISOControl(f) ) {
                checkinfnametxt.setEditable(true);
            } else {
                checkinfnametxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_checkinfnametxtKeyPressed

    private void checkinlnametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkinlnametxtKeyPressed
        String ln = checkinlnametxt.getText();
        int ln_length = ln.length();
        char l = evt.getKeyChar();

        if (Character.isLetter(l)) {

            if (ln_length < 30) {
                checkinlnametxt.setEditable(true);
            } else {
                checkinlnametxt.setEditable(false);
            }
        } else {
            if (Character.isWhitespace(l) || Character.isISOControl(l) ) {
                checkinlnametxt.setEditable(true);
            } else {
                checkinlnametxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_checkinlnametxtKeyPressed

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        tab1.setSelectedIndex(7);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void historylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historylblMouseClicked
        tab1.setSelectedIndex(8);
    }//GEN-LAST:event_historylblMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            historytable.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            userlogtable.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Dashboardd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel acc_panel;
    private javax.swing.JTextField acc_pass;
    private javax.swing.JTextField acc_repass;
    private javax.swing.JTextField acc_uname;
    private javax.swing.JLabel acciconlbl;
    private javax.swing.JTextField accid;
    private javax.swing.JButton add;
    private javax.swing.JButton add5;
    private javax.swing.JLabel availroomlbl;
    private javax.swing.JLabel banklogolbl;
    private javax.swing.JPanel billspanel;
    private javax.swing.JLabel bookedroomslbl;
    private javax.swing.JLabel bookedroomslbl2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cardlogolbl;
    private javax.swing.JLabel cashlogolbl;
    private javax.swing.JButton cashpaybtn3;
    public static javax.swing.JComboBox checkinbedcb;
    public static javax.swing.JTextField checkincheckouttxt;
    private javax.swing.JTextField checkincustomidtxt;
    private javax.swing.JTextField checkincustomidtxt1;
    public static javax.swing.JTextField checkindatetxt;
    public static javax.swing.JTextField checkinemailtxt;
    public static javax.swing.JTextField checkinfnametxt;
    public static javax.swing.JComboBox checkingendercb;
    public static javax.swing.JTextField checkinlnametxt;
    private javax.swing.JPanel checkinpanel;
    public static javax.swing.JTextField checkinphonetxt;
    public static javax.swing.JTextField checkinpricetxt;
    public static javax.swing.JComboBox checkinroomcb;
    public static javax.swing.JTextField checkintimetxt;
    private javax.swing.JTextField checkoutamounttxt;
    private javax.swing.JTextField checkoutdatetxt;
    private javax.swing.JTextField checkoutemailtxt;
    private javax.swing.JTextField checkoutfnametxt;
    private javax.swing.JTextField checkoutindatetxt;
    private javax.swing.JTextField checkoutlnametxt;
    private javax.swing.JPanel checkoutpanel;
    private javax.swing.JTextField checkoutroomnotxt;
    private javax.swing.JTextField checkouttimeintxt;
    private javax.swing.JTextField checkouttimeouttxt;
    public static javax.swing.JPanel dashboard_panel;
    private javax.swing.JLabel dashboardlbl1;
    private javax.swing.JLabel dashboardlbl12;
    private javax.swing.JLabel dashboardlbl13;
    private javax.swing.JLabel dashboardlbl14;
    private javax.swing.JLabel dashboardlbl16;
    private javax.swing.JLabel dashboardlbl17;
    private javax.swing.JLabel dashboardlbl18;
    private javax.swing.JLabel dashboardlbl19;
    private javax.swing.JLabel dashboardlbl2;
    private javax.swing.JLabel dashboardlbl20;
    private javax.swing.JLabel dashboardlbl21;
    private javax.swing.JLabel dashboardlbl3;
    private javax.swing.JLabel dashboardlbl4;
    public static javax.swing.JLabel date;
    public static javax.swing.JLabel dboardacclbl;
    private javax.swing.JLabel dboardcheckinlbl;
    private javax.swing.JLabel dboardguestlbl;
    private javax.swing.JLabel dboardlbl;
    private javax.swing.JLabel dboardroomlbl;
    private javax.swing.JButton del5;
    private javax.swing.JButton edit;
    private javax.swing.JTextField guest_search;
    private javax.swing.JPanel guestpanel;
    private javax.swing.JButton guestproceedcheckoutbtn;
    private javax.swing.JLabel historylbl;
    private javax.swing.JTable historytable;
    public static javax.swing.JLabel housekeep1;
    public static javax.swing.JLabel housekeep10;
    public static javax.swing.JLabel housekeep2;
    public static javax.swing.JLabel housekeep3;
    public static javax.swing.JLabel housekeep4;
    public static javax.swing.JLabel housekeep5;
    public static javax.swing.JLabel housekeep6;
    public static javax.swing.JLabel housekeep7;
    public static javax.swing.JLabel housekeep8;
    public static javax.swing.JLabel housekeep9;
    private javax.swing.JLabel housekeepinglbl1;
    public static javax.swing.JLabel housekeepinglbl2;
    public static javax.swing.JTextField intotaltxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    public static javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    public static javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl65;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lbl68;
    private javax.swing.JLabel logout5;
    private javax.swing.JLabel moneylbl;
    private javax.swing.JTextField outdaystxt;
    private javax.swing.JPanel roomspanel;
    private javax.swing.JButton save;
    public static javax.swing.JLabel stats1;
    public static javax.swing.JLabel stats10;
    public static javax.swing.JLabel stats2;
    public static javax.swing.JLabel stats3;
    public static javax.swing.JLabel stats4;
    public static javax.swing.JLabel stats5;
    public static javax.swing.JLabel stats6;
    public static javax.swing.JLabel stats7;
    public static javax.swing.JLabel stats8;
    public static javax.swing.JLabel stats9;
    public static javax.swing.JTabbedPane tab1;
    public static javax.swing.JTable table1;
    public static javax.swing.JTable table2;
    private javax.swing.JLabel time;
    public static javax.swing.JLabel totalavailroomslbl;
    public static javax.swing.JLabel totalearnslbl;
    private javax.swing.JLabel totalroomslbl;
    public static javax.swing.JLabel userlogsanghistorylbl;
    private javax.swing.JLabel userlogslbl;
    private javax.swing.JPanel userlogspanel;
    public static javax.swing.JTable userlogtable;
    // End of variables declaration//GEN-END:variables
}
