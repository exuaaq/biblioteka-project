package biblioteka1;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TableColumn<kartica, String> datumIKolona;

    @FXML
    private TableColumn<kartica, String> datumVKolona;

    @FXML
    private TableColumn<kartica, Integer> idBKolona;

    @FXML
    private TableColumn<kartica, Integer> idKKolona;

    @FXML
    private TableColumn<kartica, String> imeKolona;

    @FXML
    private TableColumn<kartica, String> nazivKKolona;

    @FXML
    private TableColumn<kartica, String> pisacKolona;

    @FXML
    private TableColumn<kartica, String> prezimeKolona;

    @FXML
    private TableView<kartica> tabela;

    @FXML
    private TextField txtAdresa;

    @FXML
    private TextField txtDatumI;

    @FXML
    private TextField txtDatumV;

    @FXML
    private TextField txtIDB;

    @FXML
    private TextField txtIDBroj;

    @FXML
    private TextField txtIme;

    @FXML
    private TextField txtNazivK;

    @FXML
    private TextField txtPisac;

    @FXML
    private TextField txtPrezime;

    public ObservableList<kartica> lista;

    Connection con;
    PreparedStatement pst;
    ResultSet rs = null;

    private void Update() {

        try {
            idBKolona.setCellValueFactory(new PropertyValueFactory<kartica, Integer>("idBiblioteka"));
            idKKolona.setCellValueFactory(new PropertyValueFactory<kartica, Integer>("idKartica"));
            imeKolona.setCellValueFactory(new PropertyValueFactory<kartica, String>("imeK"));
            prezimeKolona.setCellValueFactory(new PropertyValueFactory<kartica, String>("prezimeK"));
            nazivKKolona.setCellValueFactory(new PropertyValueFactory<kartica, String>("nazivK"));
            pisacKolona.setCellValueFactory(new PropertyValueFactory<kartica, String>("pisacK"));
            datumIKolona.setCellValueFactory(new PropertyValueFactory<kartica, String>("datumD"));
            datumVKolona.setCellValueFactory(new PropertyValueFactory<kartica, String>("datumV"));

            lista = veza.uzmiKartica();
            tabela.setItems(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @FXML
    public void Dodaj(ActionEvent event) throws SQLException {

        String idB = txtIDB.getText();
        String idK = txtIDBroj.getText();
        String kIme = txtIme.getText();
        String kPrezime = txtPrezime.getText();
        String nazivK = txtNazivK.getText();
        String adresaK = txtAdresa.getText();
        String pisac = txtPisac.getText();
        String datumV = txtDatumV.getText();
        String datumD = txtDatumI.getText();

        con = veza.uzmiVezu();
        String sql = "INSERT INTO kartica(id_kartica, ime, prezime, adresa, datumd, datumv, naziv, pisac, id_biblioteka) VALUES (" + idK + ",'" + kIme + "','" + kPrezime + "','" + adresaK + "','" + datumD + "','" + datumV + "','" + nazivK + "','" + pisac + "'," + idB + ")";

        try {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Zapis je dodan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Update();
    }

    @FXML
    void Izmijeni(ActionEvent event) {
        try {
            String idB = txtIDB.getText();
            String idK = txtIDBroj.getText();
            String kIme = txtIme.getText();
            String kPrezime = txtPrezime.getText();
            String nazivK = txtNazivK.getText();
            String adresaK = txtAdresa.getText();
            String pisac = txtPisac.getText();
            String datumV = txtDatumV.getText();
            String datumD = txtDatumI.getText();
            con = veza.uzmiVezu();
            String sql = "update kartica set ime = '" + kIme + "',prezime= '" + kPrezime + "',adresa= '" + adresaK + "',datumd= '" + datumD + "',datumv= '" + datumV + "',naziv= '" + nazivK + "',pisac= '" + pisac + "' where id_biblioteka='" + idB + "' OR id_kartica='" + idK + "' ";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Podaci su promjenjeni");
            Update();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @FXML
    void Brisi(ActionEvent event) {
        con = veza.uzmiVezu();
        try {
            String idB = txtIDB.getText();
            String idK = txtIDBroj.getText();
            String sql = "delete from kartica where id_kartica = '" + idK + "' ";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Obrisano");
            Update();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Update();
    }

}
