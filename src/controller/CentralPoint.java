package controller;

import dao.ProjectDao;
import javax.swing.JOptionPane;
import model.Rashod;

/**
 *
 * @author Milos
 */
public class CentralPoint {

    private ProjectDao dao = null;
    private static CentralPoint instance = null;

    public CentralPoint() {
        String projectDbUrl = "jdbc:mysql://localhost/prihodi_rashodi?user=root&password=poruka&useSSL=false";

        if (!readProjectDb(projectDbUrl)) {
            //Nema projekta. Prekidamo program.
            JOptionPane.showMessageDialog(null, "Problem prlikom pristupa bazi \n" + projectDbUrl + "\nIzlazimo iz programa.", "Greška", JOptionPane.ERROR_MESSAGE);
            exit();
        }
    }

    public boolean readProjectDb(String url) {
        boolean retValue = false;

        dao = new ProjectDao();
        
        dao.setConnectionURL(url);

        retValue = true;
        return retValue;
    }

    public ProjectDao getProjectDao() {
        return dao;
    }

    public static CentralPoint getInstance() {
        if (instance == null) {
            instance = new CentralPoint();
        }
        return instance;
    }

    public void exit() {
        System.exit(0);
    }

    
}
