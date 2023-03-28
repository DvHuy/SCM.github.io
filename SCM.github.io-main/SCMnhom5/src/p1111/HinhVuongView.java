package p1111;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class HinhVuongView extends JFrame {

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
					HinhVuongView frame = new HinhVuongView();
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
	public HinhVuongView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener ac = new HinhVuongController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HÌNH VUÔNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(242, 41, 171, 38);
		contentPane.add(lblNewLabel);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Cạnh: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(42, 131, 85, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(184, 131, 351, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_tinh = new JButton("Tính");
		btn_tinh.addActionListener(ac);
		btn_tinh.setBounds(259, 306, 85, 21);
		contentPane.add(btn_tinh);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(42, 218, 69, 21);
		contentPane.add(lblNewLabel_2);
		
		textField_kq = new JTextField();
		textField_kq.setColumns(10);
		textField_kq.setBounds(184, 215, 351, 23);
		contentPane.add(textField_kq);
		this.setVisible(true);
	}

	public void tinh() {
		double a = Double.valueOf(this.textField.getText() + "");
		this.textField_kq.setText("Chu vi: " + (4 * a) + ",  Diện tích: " + (a * a) );
	}
}
