package p1111;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class HCNView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HCNView frame = new HCNView();
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
	public HCNView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener ac = new HCNController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu option = new JMenu("Option");
		option.addActionListener(ac);
		menuBar.add(option);
		
		JMenuItem opt_hinhchunhat = new JMenuItem("Hình chữ nhật");
		opt_hinhchunhat.addActionListener(ac);
		option.add(opt_hinhchunhat);
		
		JMenuItem opt_hinhvuong = new JMenuItem("Hình vuông");
		opt_hinhvuong.addActionListener(ac);
		option.add(opt_hinhvuong);
		
		JMenuItem opt_hinhtron = new JMenuItem("Hình tròn");
		opt_hinhtron.addActionListener(ac);
		option.add(opt_hinhtron);
		
		JMenuItem opt_hinhthoi = new JMenuItem("Hình thoi");
		opt_hinhthoi.addActionListener(ac);
		option.add(opt_hinhthoi);
		
		JLabel lblNewLabel = new JLabel("HÌNH CHỮ NHẬT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(267, 44, 199, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cạnh thứ nhất:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(41, 97, 121, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cạnh thứ hai:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(41, 167, 121, 30);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 102, 364, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 172, 364, 25);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Kết quả:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(41, 237, 121, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_kq = new JTextField();
		textField_kq.setColumns(10);
		textField_kq.setBounds(213, 237, 364, 25);
		contentPane.add(textField_kq);
		
		JButton btn_tinh = new JButton("Tính");
		btn_tinh.addActionListener(ac);
		btn_tinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_tinh.setBounds(328, 320, 85, 21);
		contentPane.add(btn_tinh);
		this.setVisible(true);
	}

	public void tinh() {
		double a = Double.valueOf(this.textField_1.getText() + "");
		double b = Double.valueOf(this.textField_2.getText() + "");
		this.textField_kq.setText("Chu vi: " + 2 * (a + b) + ",  Diện tích: " + (a * b) );
		System.out.println("hello world!!!!!!!!!!");
	}
	
	
}
