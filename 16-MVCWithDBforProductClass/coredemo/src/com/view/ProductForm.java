package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idTxt;
	private JTextField nameTxt;
	private JTextField companyTxt;
	private JTextField priceTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductForm frame = new ProductForm();
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
	public ProductForm() {
		setTitle("Warehouse App");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 904, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Form");
		lblNewLabel.setForeground(new Color(51, 102, 0));
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setBounds(316, 25, 218, 41);
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(177, 112, 108, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(177, 167, 126, 41);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Company");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(177, 215, 126, 41);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Price");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(177, 266, 126, 41);
		contentPane.add(lblNewLabel_1_1_2);
		
		idTxt = new JTextField();
		idTxt.setBounds(329, 112, 205, 34);
		contentPane.add(idTxt);
		idTxt.setColumns(10);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(329, 167, 205, 34);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);
		
		companyTxt = new JTextField();
		companyTxt.setBounds(329, 215, 205, 34);
		contentPane.add(companyTxt);
		companyTxt.setColumns(10);
		
		priceTxt = new JTextField();
		priceTxt.setBounds(329, 266, 205, 34);
		contentPane.add(priceTxt);
		priceTxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Success!");
				
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				
//				if(un.equals("ram") && psw.equals("123")) {
//					JOptionPane.showMessageDialog(null, "Login Success!");
//				}
				String company = companyTxt.getText();
				int price = Integer.parseInt(priceTxt.getText());
				
				ProductService pService = new ProductServiceImpl();
				Product p = new Product();
				p.setId(id);
				p.setName(name);
				p.setCompany(company);
				p.setPrice(price);
				
				pService.addProduct(p);
				JOptionPane.showMessageDialog(null, "Product added successfully!");
				idTxt.setText("");
				nameTxt.setText("");
				companyTxt.setText("");
				priceTxt.setText("");
			}
		});
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setForeground(new Color(0, 0, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(305, 362, 229, 52);
		contentPane.add(btnNewButton);
	}

}
