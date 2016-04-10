package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private Vector colHeaders;
	private Vector tbData;
	String[] colsName = { "Mã sản phẩm", "Tên sản phẩm", "Loại", "Số lượng", "Giá nhập", "Giá xuất", "Nhà cung cấp" };

	public TableModel(ResultSet rsData) throws Exception {
		ResultSetMetaData rsMeta = rsData.getMetaData();

		int count = rsMeta.getColumnCount();

		colHeaders = new Vector(count);
		tbData = new Vector();

		for (int i = 0; i < count; i++) {
			colHeaders.addElement(colsName[i]);
		}

		while (rsData.next()) {

			Vector dataRow = new Vector(count);

			for (int i = 1; i <= count; i++) {
				dataRow.addElement(rsData.getObject(i));
			}
			tbData.addElement(dataRow);
		}
	}

	@Override
	public int getColumnCount() {
		// return colHeaders.size();
		return colsName.length;
	}

	@Override
	public int getRowCount() {
		return tbData.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		Vector rowData = (Vector) (tbData.elementAt(row));
		return rowData.elementAt(col);
	}

	@Override
	public String getColumnName(int column) {
		// return (String) colHeaders.elementAt(column);
		return colsName[column];
	}

}
