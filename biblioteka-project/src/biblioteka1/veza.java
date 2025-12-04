package biblioteka1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

public class veza {

    public Connection con = null;

    public static Connection uzmiVezu() {
        String db = "biblioteka";
        String username = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, username, pass);
//            JOptionPane.showMessageDialog(null, "Veza je uspostavljena");
            return con;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public static ObservableList<kartica> uzmiKartica() {
        Connection con = uzmiVezu();
        ObservableList<kartica> lista = FXCollections.observableArrayList();
        try {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM kartica");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new kartica(Integer.parseInt(rs.getString("id_biblioteka")), Integer.parseInt(rs.getString("id_kartica")), rs.getString("ime"), rs.getString("prezime"), rs.getString("adresa"), rs.getString("datumv"), rs.getString("datumd"), rs.getString("naziv"), rs.getString("pisac")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

}
