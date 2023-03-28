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

public class HinhTronView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhTronView frame = new HinhTronView();
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
	public HinhTronView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener ac = new HinhTronController(this);

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
		
		JLabel lblNewLabel = new JLabel("HÌNH TRÒN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(254, 27, 140, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bán kính:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 129, 86, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(177, 129, 367, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kết quả:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(45, 190, 86, 22);
		contentPane.add(lblNewLabel_1_1);
		
		textField_kq = new JTextField();
		textField_kq.setColumns(10);
		textField_kq.setBounds(177, 194, 367, 22);
		contentPane.add(textField_kq);
		
		JButton btn_tinh = new JButton("Tính");
		btn_tinh.addActionListener(ac);
		btn_tinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_tinh.setBounds(280, 262, 85, 21);
		contentPane.add(btn_tinh);
		this.setVisible(true);
	}

	public void tinh() {
		double r = Double.valueOf(this.textField.getText() + "");
		this.textField_kq.setText("Chu vi: " + (2 * r * Math.PI) + ",  Diện tích: " + (r * r * Math.PI) );
	}

}
