package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;

public class ListProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField nameTxt;
	private JTextField priceTxt;
	private JTextField companyTxt;
	private int pid = 0;
	private JTextField searchTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListProduct frame = new ListProduct();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("List of Products");
		lblNewLabel.setBounds(296, 25, 155, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(333, 108, 524, 295);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Company", "Price"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() < 0) {
					JOptionPane.showMessageDialog(null, "Please select any row...");
					return;
				}
				
				int srow = table.getSelectedRow();
				int pid = (int) table.getModel().getValueAt(srow, 0);
				
				ProductService service = new ProductServiceImpl();
				service.deleteProduct(pid);
				
				JOptionPane.showMessageDialog(null, "Deletion success! 👍");
				
				displayData();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(702, 419, 155, 45);
		contentPane.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() < 0) {
					JOptionPane.showMessageDialog(null, "Select any data");
					return;
				}
				
				int srow = table.getSelectedRow();
				pid = (int) table.getModel().getValueAt(srow, 0);
				nameTxt.setText(table.getModel().getValueAt(srow, 1).toString());
				priceTxt.setText(table.getModel().getValueAt(srow, 3).toString());
				companyTxt.setText(table.getModel().getValueAt(srow, 2).toString());
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEdit.setBounds(515, 419, 155, 45);
		contentPane.add(btnEdit);
		
		JLabel lblNewLabel_1 = new JLabel("Company");
		lblNewLabel_1.setBounds(33, 248, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(33, 140, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Price");
		lblNewLabel_1_1.setBounds(33, 196, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(103, 137, 96, 19);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);
		
		priceTxt = new JTextField();
		priceTxt.setBounds(103, 193, 96, 19);
		contentPane.add(priceTxt);
		priceTxt.setColumns(10);
		
		companyTxt = new JTextField();
		companyTxt.setBounds(103, 245, 96, 19);
		contentPane.add(companyTxt);
		companyTxt.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product p = new Product();
				p.setId(pid);
				p.setName(nameTxt.getText());
				p.setCompany(companyTxt.getText());
				p.setPrice(Integer.parseInt(priceTxt.getText()));
				
				ProductService service = new ProductServiceImpl();
				service.updateProduct(p);
				
				JOptionPane.showMessageDialog(null, "Update Success!");
				
				displayData();
				
			}
		});
		btnNewButton_1.setBounds(103, 299, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Search");
		lblNewLabel_3.setBounds(625, 64, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		searchTxt = new JTextField();
		searchTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String sdata = searchTxt.getText().trim();
				
				
				ProductService service = new ProductServiceImpl();
				List<Product> plist = service.searchProduct(sdata);
				
				DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
				tmodel.setRowCount(0); // reset table
				
				for(Product p:plist) {
					tmodel.addRow(new Object[] {p.getId(), p.getName(), p.getCompany(), p.getPrice()});
				}
			}
		});
		searchTxt.setBounds(667, 61, 96, 19);
		contentPane.add(searchTxt);
		searchTxt.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					table.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(386, 427, 105, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add New");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductForm().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(71, 60, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Refresh");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayData();
			}
		});
		btnNewButton_4.setBounds(475, 60, 85, 21);
		contentPane.add(btnNewButton_4);
		
		displayData();
	}
	
	private void displayData() {
		ProductService service  = new ProductServiceImpl();
		List<Product> plist = service.getAllProducts();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0); // reset table
		
		for(Product p:plist) {
			tmodel.addRow(new Object[] {p.getId(), p.getName(), p.getCompany(), p.getPrice()});
		}
	
		
		
	}
}
