package utils;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * Created by KELANI on 9/18/2017. Package name: Utility Project name:
 * GestionnaireLibrairieEnLigne
 */
public class Utility {

    public static java.util.Date convertFromSQLDateToJavaDate(java.sql.Date sqlDate) {
        java.util.Date javaDate = null;

        if (sqlDate != null) {
            javaDate = new Date(sqlDate.getTime());
        }

        return javaDate;
    }

    public static java.sql.Date formatStringToSQLDate(String strDate) throws Exception {

        Date utilDate = new Date(); //DateFormat

        SimpleDateFormat dfFormat = new SimpleDateFormat("yyyy-MM-dd"); // parse string into a DATE format      

        utilDate = dfFormat.parse(strDate); // convert a util.Date to milliseconds via its getTime() method        

        long time = utilDate.getTime(); // get the long value of java.sql.Date

        java.sql.Date sqlDate = new java.sql.Date(time);

        return sqlDate;

    }

    // Method that generates almost unique 10 digits id
    public static long getID(long last) {
        
        final long LIMIT = 10000000000L;
        // 10 digits.
        long id = System.currentTimeMillis() % LIMIT;
        if (id <= last) {
            id = (last + 1) % LIMIT;
        }
        return id;
    }

    public static void AlternateTableLineColor(JTable jTable) {

        // Alternate colouring of rows in JTable
        jTable.setDefaultRenderer(Object.class, new TableCellRenderer() {
            private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    c.setBackground(Color.BLUE);
                } else {
                    if (row % 2 == 0) {
                        c.setBackground(Color.WHITE);

                    } else {
                        c.setBackground(Color.lightGray);
                    }
                }
                return c;
            }
        });
    }
    
    public static Double getTwoDecimalDigits(Double number) {
        return ((int)(number * 100)) / 100.00;
    }
    
    public static Double getTwoDecimalDigits(Float number) {
        return ((int)(number * 100)) / 100.00;
    }
    
    public static String displayFormattedDate(Date date) {
        Formatter fmt = new Formatter();
   
        
        return String.format("%1$td %1$tB %1$tY", date);
    }
}
