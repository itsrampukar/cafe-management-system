/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TableNumber;
/**
 *
 * @author Rampukar
 */
public class TableNumberDao {
    public static void save(TableNumber tablenumber) {
        String query = "insert into tables(tablenumber) values('" + tablenumber.getTablenumber() + "')";
        DbOperations.setDataorDelete(query, "TableNumber Added Successfully");
    }
    
    public static ArrayList<TableNumber> getAllRecords() {
        ArrayList<TableNumber> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from tables");
            while (rs.next()) {
                TableNumber tablenumber = new TableNumber();
                tablenumber.setId(rs.getInt("id"));
                tablenumber.setTablenumber(rs.getString("tablenumber"));
                arrayList.add(tablenumber);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id) {
        String query = "delete from tables where id = '" + id + "'";
        DbOperations.setDataorDelete(query, "Table Deleted Successfully");
    }
}
