package com.salesinvoicesgenerator.Tables;

/**
 * This Class defines the Invoices Table Table Model (Right hand Table).
 *
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class InvoicesTableTableModel extends AbstractTableModel {

    // Variables declaration.
    private List<InvoicesTable> invoicesTableArray;
    private DateFormat dateFt = new SimpleDateFormat("dd-MM-yyyy");
// End of variables declaration.

    public InvoicesTableTableModel(List<InvoicesTable> invoicesArray) {
        this.invoicesTableArray = invoicesArray;
    }

    public List<InvoicesTable> getInvoicesTableArray() {
        return invoicesTableArray;
    }


    @Override
    public int getRowCount() {
        return invoicesTableArray.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> "Invoice Number";
            case 1 -> "Customer Name";
            case 2 -> "Invoice Date";
            case 3 -> "Invoice Total";
            default -> "";
        };

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class;
            case 1 -> String.class;
            case 2 -> String.class;
            case 3 -> Double.class;
            default -> Object.class;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoicesTable row = invoicesTableArray.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> row.getInvNum();
            case 1 -> row.getCustomerName();
            case 2 -> dateFt.format(row.getInvDate());
            case 3 -> row.getInvTotal();
            default -> "";
        };
    }

}
