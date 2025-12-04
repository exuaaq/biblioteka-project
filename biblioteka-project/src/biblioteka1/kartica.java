package biblioteka1;

public class kartica {
    int idBiblioteka, idKartica;
    String imeK, prezimeK, adresaK, datumV, datumD, nazivK, pisacK;

    public kartica(int idBiblioteka, int idKartica, String imeK, String prezimeK, String adresaK, String datumV, String datumD, String nazivK, String pisacK) {
        this.idBiblioteka = idBiblioteka;
        this.idKartica = idKartica;
        this.imeK = imeK;
        this.prezimeK = prezimeK;
        this.adresaK = adresaK;
        this.datumV = datumV;
        this.datumD = datumD;
        this.nazivK = nazivK;
        this.pisacK = pisacK;

    }

    public int getIdBiblioteka() {
        return idBiblioteka;
    }

    public void setIdBiblioteka(int idBiblioteka) {
        this.idBiblioteka = idBiblioteka;
    }

    public int getIdKartica() {
        return idKartica;
    }

    public void setIdKartica(int idKartica) {
        this.idKartica = idKartica;
    }

    public String getImeK() {
        return imeK;
    }

    public void setImeK(String imeK) {
        this.imeK = imeK;
    }

    public String getPrezimeK() {
        return prezimeK;
    }

    public void setPrezimeK(String prezimeK) {
        this.prezimeK = prezimeK;
    }

    public String getAdresaK() {
        return adresaK;
    }

    public void setAdresaK(String adresaK) {
        this.adresaK = adresaK;
    }

    public String getDatumV() {
        return datumV;
    }

    public void setDatumV(String datumV) {
        this.datumV = datumV;
    }

    public String getDatumD() {
        return datumD;
    }

    public void setDatumD(String datumD) {
        this.datumD = datumD;
    }

    public String getNazivK() {
        return nazivK;
    }

    public void setNazivK(String nazivK) {
        this.nazivK = nazivK;
    }

    public String getPisacK() {
        return pisacK;
    }

    public void setPisacK(String pisacK) {
        this.pisacK = pisacK;
    }

}
