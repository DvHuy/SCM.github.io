package p1111;

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

public class HinhThoiView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
					HinhThoiView frame = new HinhThoiView();
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
	public HinhThoiView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener ac = new HinhThoiController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Option");
		mnNewMenu.addActionListener(ac);
		menuBar.add(mnNewMenu);
		
		JMenuItem opt_hinhchunhat = new JMenuItem("Hình chữ nhật");
		opt_hinhchunhat.addActionListener(ac);
		mnNewMenu.add(opt_hinhchunhat);
		
		JMenuItem opt_hinhvuong = new JMenuItem("Hình vuông");
		opt_hinhvuong.addActionListener(ac);
		mnNewMenu.add(opt_hinhvuong);
		
		JMenuItem opt_hinhtron = new JMenuItem("Hình tròn");
		opt_hinhtron.addActionListener(ac);
		mnNewMenu.add(opt_hinhtron);
		
		JMenuItem opt_hinhthoi = new JMenuItem("Hình thoi");
		opt_hinhthoi.addActionListener(ac);
		mnNewMenu.add(opt_hinhthoi);
		
		JLabel lblNewLabel = new JLabel("HÌNH THOI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(259, 33, 121, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cạnh:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 104, 88, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đường chéo 1:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(35, 156, 121, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Đường chéo 2: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(35, 208, 134, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Kết quả:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(35, 264, 88, 22);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(181, 108, 390, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 160, 390, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 212, 390, 19);
		contentPane.add(textField_2);
		
		textField_kq = new JTextField();
		textField_kq.setColumns(10);
		textField_kq.setBounds(181, 268, 390, 19);
		contentPane.add(textField_kq);
		
		JButton btn_tinh = new JButton("Tính");
		btn_tinh.addActionListener(ac);
		btn_tinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_tinh.setBounds(291, 326, 85, 21);
		contentPane.add(btn_tinh);
		this.setVisible(true);
	}

	public void tinh() {
		double a = Double.valueOf(this.textField.getText() + "");
		double d1 = Double.valueOf(this.textField_1.getText() + "");
		double d2 = Double.valueOf(this.textField_2.getText() + "");
		this.textField_kq.setText("Chu vi: " + (4 * a) + ",  Diện tích: " + (0.5 * (d1 + d2)));
	}

}
