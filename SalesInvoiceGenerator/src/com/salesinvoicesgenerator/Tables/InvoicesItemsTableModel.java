
package com.salesinvoicesgenerator.Tables;
/**
 * This Class defines the Invoices Items Table Model (Right hand Table).
 *
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class InvoicesItemsTableModel extends AbstractTableModel {

    // Variables declaration.
    private List<InvoicesItems> invoicesItemsArray;
    private DateFormat dateFt = new SimpleDateFormat("dd-MM-yyyy");
// End of variables declaration.

    public InvoicesItemsTableModel(List<InvoicesItems> invoicesItemsArray) {
        this.invoicesItemsArray = invoicesItemsArray;
    }

    public List<InvoicesItems> getInvoicesItemsArray() {
        return invoicesItemsArray;
    }


    @Override
    public int getRowCount() {
        return invoicesItemsArray.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> "Item Name";
            case 1 -> "Item Price";
            case 2 -> "Item Count";
            case 3 -> "Items Total";
            default -> "";
        };

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class;
            case 1 -> Double.class;
            case 2 -> Integer.class;
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
        InvoicesItems row = invoicesItemsArray.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> row.getItemName();
            case 1 -> row.getItemPrice();
            case 2 -> row.getItemCount();
            case 3 -> row.getLineTotal();
            default -> "";
        };
    }

}
