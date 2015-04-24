/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatron2;

import com.theopentutorials.jdbc.dao.EmployeeDAO;
import java.sql.SQLException;
import demo.demo1;

/**
 *
 * @author Fabian
 */
public class EjemploPatron2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        EmployeeDAO empDAO = new EmployeeDAO();
        demo1 dem = new demo1();
        dem.demo1();
    }
}