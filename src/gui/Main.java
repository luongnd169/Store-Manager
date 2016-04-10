package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import model.DAO;
import model.Item;
import model.TableModel;

public class Main {

	private JFrame frame;
	private JTextField txtSearch;
	private JTable table;
	private JTextField textField;
	private DefaultTableModel dtm = new DefaultTableModel();
	private String[] colsName = { "Mã sản phẩm", "Tên sản phẩm", "Loại", "Số lượng", "Giá nhập", "Giá xuất",
			"Nhà cung cấp" };
	private DAO dao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		dao = new DAO();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 0, 774, 560);
		panel.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Tồn kho", null, panel_1, null);
		panel_1.setBounds(10, 0, 774, 560);
		panel_1.setLayout(null);

		JLabel lblSortBy = new JLabel("Sắp xếp theo");
		lblSortBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSortBy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSortBy.setBounds(10, 11, 100, 40);
		panel_1.add(lblSortBy);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 23, 28, 20);
		panel_1.add(comboBox);

		JLabel lblSearch = new JLabel("Tìm kiếm");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSearch.setBounds(360, 11, 100, 40);
		panel_1.add(lblSearch);

		txtSearch = new JTextField();
		txtSearch.setBounds(470, 17, 200, 32);
		panel_1.add(txtSearch);
		txtSearch.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 100, 750, 421);
		// updateData();
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		try {
			table.setModel(new TableModel(dao.getItem()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		panel_1.add(table);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Nhập/Xuất", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblName = new JLabel("Sản phẩm");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(10, 11, 100, 40);
		panel_2.add(lblName);

		textField = new JTextField();
		textField.setBounds(120, 11, 250, 40);
		panel_2.add(textField);
		textField.setColumns(10);

		JButton btnAdd = new JButton("Thêm");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdd.setBounds(409, 15, 67, 32);
		panel_2.add(btnAdd);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Thống kê", null, panel_4, null);
	}

	private void updateData() {
		dtm.setColumnIdentifiers(colsName);
		// ArrayList<Item> list = dao.getItems();
		// Vector<Item> vector = new Vector<>();
		// for(Item i : list){
		// vector.add(i);
		// }
		// dtm.addRow(vector);

	}
}
