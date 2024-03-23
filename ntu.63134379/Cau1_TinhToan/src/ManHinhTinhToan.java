import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKq;
	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setTitle("Tính toán ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(36, 50, 180, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNhpSB.setBounds(36, 122, 180, 62);
		contentPane.add(lblNhpSB);
		
		txtA = new JTextField();
		txtA.setBounds(184, 68, 338, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(184, 140, 338, 32);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCong.setBounds(64, 207, 129, 56);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnTru.setBounds(250, 207, 129, 56);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNhan.setBounds(402, 207, 129, 56);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnChia.setBounds(566, 207, 129, 56);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblKtQuTnh.setBounds(36, 289, 180, 62);
		contentPane.add(lblKtQuTnh);
		
		txtKq = new JTextField();
		txtKq.setColumns(10);
		txtKq.setBounds(218, 307, 338, 32);
		contentPane.add(txtKq);
	}
	void HamXuLyCong() {
		//Lay du lieu tu dieu khien
		String str_soA= txtA.getText();
		String str_soB= txtB.getText();
		//Chuyen kieu
		double  soA=Double.parseDouble(str_soA);
		double soB=Double.parseDouble(str_soB);
		//TinhToan
		double tong =soA+soB;
		//Dua hien thi len kq
		txtKq.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lay du lieu tu dieu khien
				String str_soA= txtA.getText();
				String str_soB= txtB.getText();
				//Chuyen kieu
				double  soA=Double.parseDouble(str_soA);
				double soB=Double.parseDouble(str_soB);
				//TinhToan
				double hieu =soA-soB;
				//Dua hien thi len kq
				txtKq.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		//Lay du lieu tu dieu khien
		String str_soA= txtA.getText();
		String str_soB= txtB.getText();
		//Chuyen kieu
		double  soA=Double.parseDouble(str_soA);
		double soB=Double.parseDouble(str_soB);
		//TinhToan
		double nhan =soA*soB;
		//Dua hien thi len kq
		txtKq.setText(String.valueOf(nhan));
	}
	void HamXuLyChia() {
		//Lay du lieu tu dieu khien
		String str_soA= txtA.getText();
		String str_soB= txtB.getText();
		//Chuyen kieu
		double  soA=Double.parseDouble(str_soA);
		double soB=Double.parseDouble(str_soB);
		//TinhToan
		double chia =soA/soB;
		//Dua hien thi len kq
		txtKq.setText(String.valueOf(chia));
	}
}