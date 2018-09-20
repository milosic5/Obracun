package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cek;
import model.Korisnik;
import model.Mesec;
import model.Prihod;
import model.Rashod;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author Milos
 */
public class ProjectDao {

    private String user;
    private String password;
    private String host;
    private String dbName;
    private String dbUrl;
    private String dbDriverName = "org.gjt.mm.mysql.Driver";

    public ProjectDao() {
        user = "root";
        password = "poruka";
        host = "";
        dbName = "";
        dbUrl = "";
    }

    public void setConnectionURL(String url) {
        this.dbUrl = url;
    }

    private Connection getDBConnection() {
        Connection conn = null;
        if (dbUrl == null || dbUrl.isEmpty()) {
            this.dbUrl = "jdbc:mysql://" + host + "/" + dbName;
        }
        try {
            // Ucitavanje upravljackog programa - driver manager-a
            Class.forName(dbDriverName);
            conn = DriverManager.getConnection(dbUrl, user, password);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            //Nije pronadjena klasa. Proveri driver-e.
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return conn;
    }

    public Korisnik ucitajKorisnika(String korisnickoIme, String sifra) {
        Korisnik korisnik = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return korisnik;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM korisnik WHERE KORISNICKO_IME='" + korisnickoIme + "' AND SIFRA='" + sifra + "'";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            if (rs != null) {
                while (rs.next()) {
                    korisnik = new Korisnik();
                    korisnik.setKorisnickoIme(rs.getString("KORISNICKO_IME"));
                    korisnik.setSifra(rs.getString("SIFRA"));
                    System.out.println("ko " + korisnik);
                }
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return korisnik;
    }

    public ArrayList<Mesec> ucitajMesece() {
        ArrayList<Mesec> retvalue = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM meseci";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);
            retvalue = new ArrayList<>();
            if (rs != null) {
                while (rs.next()) {
                    Mesec m = new Mesec();
                    m.setId(rs.getInt("MESEC_ID"));
                    m.setNaziv(rs.getString("NAZIV"));
                    retvalue.add(m);
                }
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }

    public ArrayList<Rashod> ucitajRashode() {
        ArrayList<Rashod> retvalue = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM rashodi";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);
            retvalue = new ArrayList<>();
            if (rs != null) {
                while (rs.next()) {
                    Rashod r = new Rashod();
                    r.setNaziv(rs.getString("NAZIV_RASHODA"));
                    r.setPlaniranaVrednost(rs.getInt("PLANIRANA_VREDNOST"));
                    r.setRealizovanaVrednost(rs.getInt("REALIZOVANA_VREDNOST"));
                    retvalue.add(r);
                }
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }

    public Mesec vratiMesecPoNazivu(String naziv) {
        Mesec retvalue = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM meseci WHERE NAZIV='" + naziv + "'";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            if (rs != null) {
                while (rs.next()) {
                    retvalue = new Mesec();
                    retvalue.setId(rs.getInt("MESEC_ID"));
                    retvalue.setNaziv(rs.getString("NAZIV"));

                }
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }

    public Prihod ucitajPrihodPoMesecu(int idMeseca) {
        Prihod retvalue = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM prihodi WHERE MESEC_ID= " + idMeseca + "";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            while (rs.next()) {
                retvalue = new Prihod();
                retvalue.setAkontacija(rs.getInt("AKONTACIJA"));
                retvalue.setDrugiDeo(rs.getInt("DRUGI_DEO"));
                retvalue.setBonus(rs.getInt("BONUS"));
                retvalue.setTeren(rs.getInt("TEREN"));
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }

    public boolean sacuvajPrihod(Prihod prihod) {
        boolean retValue = false;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retValue;
        }
        String queryStr = "";
        try {

            queryStr = "INSERT INTO prihodi (AKONTACIJA,DRUGI_DEO,BONUS,TEREN,MESEC_ID) VALUES(?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(queryStr);
            statement.setInt(1, prihod.getAkontacija());
            statement.setInt(2, prihod.getDrugiDeo());
            statement.setInt(3, prihod.getBonus());
            statement.setInt(4, prihod.getTeren());
            statement.setInt(5, prihod.getMesecID());
            statement.executeUpdate();
            statement.close();
            statement = null;
            retValue = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return retValue;
    }

    public boolean azurirajPrihod(Prihod prihod) {
        boolean retValue = false;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retValue;
        }
        String queryStr = "";
        try {

            queryStr = "UPDATE prihodi set AKONTACIJA=?,DRUGI_DEO=?,BONUS=?,TEREN=? WHERE MESEC_ID=" + prihod.getMesecID() + "";

            PreparedStatement statement = connection.prepareStatement(queryStr);
            statement.setInt(1, prihod.getAkontacija());
            statement.setInt(2, prihod.getDrugiDeo());
            statement.setInt(3, prihod.getBonus());
            statement.setInt(4, prihod.getTeren());
            statement.executeUpdate();
            statement.close();
            statement = null;
            retValue = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return retValue;
    }

    public boolean sacuvajRashod(Rashod rashod) {
        boolean retValue = false;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retValue;
        }
        String queryStr = "";
        try {

            queryStr = "INSERT INTO rashodi (NAZIV_RASHODA,PLANIRANA_VREDNOST,REALIZOVANA_VREDNOST) VALUES(?,?,?)";

            PreparedStatement statement = connection.prepareStatement(queryStr);
            statement.setString(1, rashod.getNaziv());
            statement.setInt(2, rashod.getPlaniranaVrednost());
            statement.setInt(3, rashod.getRealizovanaVrednost());
            statement.executeUpdate();
            statement.close();
            statement = null;
            retValue = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return retValue;
    }

    public boolean azurirajRashod(Rashod rashod) {
        boolean retValue = false;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retValue;
        }
        String queryStr = "";
        try {

            queryStr = "UPDATE rashodi set NAZIV_RASHODA=?,PLANIRANA_VREDNOST=?,REALIZOVANA_VREDNOST=? WHERE NAZIV_RASHODA='" + rashod.getNaziv() + "'";

            PreparedStatement statement = connection.prepareStatement(queryStr);
            statement.setString(1, rashod.getNaziv());
            statement.setInt(2, rashod.getPlaniranaVrednost());
            statement.setInt(3, rashod.getRealizovanaVrednost());
            statement.executeUpdate();
            statement.close();
            statement = null;
            retValue = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return retValue;
    }

    public ArrayList<Cek> ucitajCekove() {
        ArrayList<Cek> retvalue = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM cekovi";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);
            retvalue = new ArrayList<>();
            if (rs != null) {
                while (rs.next()) {
                    Cek cek = new Cek();
                    cek.setBrojCeka(rs.getInt("BROJ_CEKA"));
                    cek.setVrednost(rs.getInt("VREDNOST"));
                    cek.setDatumRealizacije(rs.getDate("DATUM_REALIZACIJE"));
                    cek.setRealizovan(rs.getBoolean("REALIZOVAN"));
                    retvalue.add(cek);
                }
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }

    public boolean azurirajCek(Cek cek) {
        boolean retValue = false;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retValue;
        }
        String queryStr = "";
        try {

            queryStr = "UPDATE cekovi set BROJ_CEKA=?,VREDNOST=?,DATUM_REALIZACIJE=?,REALIZOVAN=? WHERE BROJ_CEKA='" + cek.getBrojCeka() + "'";

            PreparedStatement statement = connection.prepareStatement(queryStr);
            statement.setInt(1, cek.getBrojCeka());
            statement.setInt(2, cek.getVrednost());
            statement.setDate(3, new java.sql.Date(cek.getDatumRealizacije().getTime()));
            statement.setBoolean(4, cek.isRealizovan());
            statement.executeUpdate();
            statement.close();
            statement = null;
            retValue = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return retValue;
    }

    public boolean sacuvajCek(Cek cek) {
        boolean retValue = false;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retValue;
        }
        String queryStr = "";
        try {

            queryStr = "INSERT INTO cekovi (BROJ_CEKA,VREDNOST,DATUM_REALIZACIJE,REALIZOVAN) VALUES(?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(queryStr);
            statement.setInt(1, cek.getBrojCeka());
            statement.setInt(2, cek.getVrednost());
            statement.setDate(3, new java.sql.Date(cek.getDatumRealizacije().getTime()));
            statement.setBoolean(4, cek.isRealizovan());
            statement.executeUpdate();
            statement.close();
            statement = null;
            retValue = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return retValue;
    }

    public ArrayList<Prihod> ucitajSvePrihode() {
        ArrayList<Prihod> retvalue = null;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT * FROM prihodi";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);
            retvalue = new ArrayList<>();
            if (rs != null) {
                while (rs.next()) {
                    Prihod prihod = new Prihod();
                    prihod.setAkontacija(rs.getInt("AKONTACIJA"));
                    prihod.setBonus(rs.getInt("BONUS"));
                    prihod.setDrugiDeo(rs.getInt("DRUGI_DEO"));
                    prihod.setTeren(rs.getInt("TEREN"));
                    prihod.setMesecID(rs.getInt("MESEC_ID"));
                    retvalue.add(prihod);
                }
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }

    public int ucitajPlatu(int idMeseca) {
        int retvalue = 0;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT AKONTACIJA+BONUS+TEREN+DRUGI_DEO AS PLATA FROM prihodi WHERE MESEC_ID=" + idMeseca + "";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            while (rs.next()) {
                retvalue = rs.getInt("PLATA");
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }
    
    public int vratiUkupnePrihode() {
        int retvalue = 0;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT sum(`AKONTACIJA`+`DRUGI_DEO`+`BONUS`+`TEREN`) as ukupno FROM prihodi;";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            while (rs.next()) {
                retvalue = rs.getInt("ukupno");
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }
    
     public int vratiUkupneRashode() {
        int retvalue = 0;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT sum(`REALIZOVANA_VREDNOST`) as ukupno FROM rashodi;";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            while (rs.next()) {
                retvalue = rs.getInt("ukupno");
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }
     
     public int vratiProsecnuPlatu() {
        int retvalue = 0;
        Connection connection = getDBConnection();
        if (connection == null) {
            return retvalue;
        }
        String queryStr = "";
        try {
            ResultSet rs;
            Statement statement;

            queryStr = "SELECT (sum(`AKONTACIJA`+`DRUGI_DEO`+`BONUS`+`TEREN`)/count(ID)) as prosek FROM prihodi";
            statement = connection.createStatement();
            rs = statement.executeQuery(queryStr);

            while (rs.next()) {
                retvalue = rs.getInt("prosek");
            }

            rs.close();
            rs = null;
            statement.close();
            statement = null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return retvalue;
    }
}
