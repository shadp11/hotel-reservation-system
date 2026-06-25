package multipleloginarraylist;

import java.util.ArrayList;

public class MultipleLogin {
    public static int attempts = 1;
    public static int count = 0;
    public static int totalavailrooms1 = 10;
    public static int totalbookedrooms1 = 0;
    public static int totalhousekeeping1 = 0;
    
    //accounts
    
    public static ArrayList<String> username = new ArrayList<String>();
    public static ArrayList<String> password = new ArrayList<String>();
    
    //guest
    public static ArrayList<String> guestcustomid = new ArrayList<String>();
    public static ArrayList<String> guestroomno = new ArrayList<String>();
    public static ArrayList<String> guestfname = new ArrayList<String>();
    public static ArrayList<String> guestlname = new ArrayList<String>();
    public static ArrayList<String> guestphoneno = new ArrayList<String>();
    public static ArrayList<String> guestemail = new ArrayList<String>();
    public static ArrayList<String> guestgender = new ArrayList<String>();
    public static ArrayList<String> guestprice = new ArrayList<String>();
    public static ArrayList<String> guestcheckin = new ArrayList<String>();
    public static ArrayList<String> guesttimein = new ArrayList<String>();
    public static ArrayList<String> guestcheckout = new ArrayList<String>();
    public static ArrayList<String> guestbedtype = new ArrayList<String>();
    
    public static ArrayList<String> logsuser = new ArrayList<String>();
    public static ArrayList<String> logsuserdate = new ArrayList<String>();
    public static ArrayList<String> logsuserdatetimein = new ArrayList<String>();
    public static ArrayList<String> logsuserdatetimeout = new ArrayList<String>();
    
    public static ArrayList<String> manageroomstatus1 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus2 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus3 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus4 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus5 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus6 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus7 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus8 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus9 = new ArrayList<String>();
    public static ArrayList<String> manageroomstatus10 = new ArrayList<String>();
    
    public static ArrayList<String> housekeeping1 = new ArrayList<String>();
    public static ArrayList<String> housekeeping2 = new ArrayList<String>();
    public static ArrayList<String> housekeeping3 = new ArrayList<String>();
    public static ArrayList<String> housekeeping4 = new ArrayList<String>();
    public static ArrayList<String> housekeeping5 = new ArrayList<String>();
    public static ArrayList<String> housekeeping6 = new ArrayList<String>();
    public static ArrayList<String> housekeeping7 = new ArrayList<String>();
    public static ArrayList<String> housekeeping8 = new ArrayList<String>();
    public static ArrayList<String> housekeeping9 = new ArrayList<String>();
    public static ArrayList<String> housekeeping10 = new ArrayList<String>();
    
    //dashboard summary
    public static ArrayList<String> totalearnings = new ArrayList<String>();
    public static ArrayList<String> totalavailrooms = new ArrayList<String>();
    public static ArrayList<String> totalbookedrooms = new ArrayList<String>();
    public static ArrayList<String> totalhousekeeping = new ArrayList<String>();
    
    //guest history
    public static ArrayList<String> histocutomid = new ArrayList<String>();
    public static ArrayList<String> histofname = new ArrayList<String>();
    public static ArrayList<String> histolname = new ArrayList<String>();
    public static ArrayList<String> histoeadd = new ArrayList<String>();
    public static ArrayList<String> historoomno = new ArrayList<String>();
    public static ArrayList<String> histocheckin = new ArrayList<String>();
    public static ArrayList<String> histotimein= new ArrayList<String>();
    public static ArrayList<String> histocheckout = new ArrayList<String>();
    public static ArrayList<String> histotimeout = new ArrayList<String>();
    
    public static ArrayList<String> table2list = new ArrayList<String>();
    
    public static ArrayList<String> userlogslist = new ArrayList<String>();
    
    public static void main(String[] args) {
     new Start().setVisible(true);
}
}
