

import java.io.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
public class FlagOutput extends JFrame {
  public static JLabel jlabel = new JLabel("Utah");

  public FlagOutput () {
setBounds(150,150,800,600);
Container contentPane = getContentPane();
    JPanel jpanel = new JPanel();
    jpanel.add(jlabel);
    contentPane.add(jpanel,"Center");
  }

  public static void main(String [] aa) {
String url;
    Blob img;
    ImageIcon icon = null;
    Image img3 = null;
    BufferedImage img2 = null;
    byte[] imgData = null ;
    url = "jdbc:oracle:thin:@localhost:1521:orcl";
    Statement stmt;
    Connection con;
    String query = "select * from  States";
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    }
    catch (Exception e) {
      System.out.println("MR.UnitSitQueries.constructor.Exception: " + e);
    }
    try {
      con = DriverManager.getConnection(url,"sys as sysdba","harsh");
      
      stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        img = rs.getBlob(4);
        imgData = img.getBytes(1,(int)img.length());
        try {
        img2 = ImageIO.read(new ByteArrayInputStream(imgData));
        } catch(Exception e){};
        img3 = img2;
        icon = new ImageIcon(img3);
        FlagOutput.jlabel.setIcon(icon);
      }
    }
    catch (SQLException e) {
    System.out.println("OOPS" + e.getMessage());
    }
    FlagOutput jfram = new FlagOutput();
    jfram.setVisible(true);
  }
}
