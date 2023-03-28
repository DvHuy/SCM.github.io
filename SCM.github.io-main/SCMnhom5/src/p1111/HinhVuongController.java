package p1111;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HinhVuongController implements ActionListener{ 
    private HinhVuongView view;
    private HCNView view2;
	private HinhTronView view3;
	private HinhThoiView view4;
	
	
	
	public HinhVuongController(HinhVuongView view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		if(cm.equals("Tính")) {
			this.view.tinh();
		}
		else if(cm.equals("Hình chữ nhật")){
			new HCNView();
			this.view.setVisible(false);
			this.view3.setVisible(false);
			this.view4.setVisible(false);
		}
		else if(cm.equals("Hình tròn")){
			new HinhTronView();
			this.view.setVisible(false);
			this.view2.setVisible(false);
			this.view4.setVisible(false);
		}
		else if(cm.equals("Hình thoi")){
			new HinhThoiView();
			this.view.setVisible(false);
			this.view2.setVisible(false);
			this.view3.setVisible(false);
		}
	}

}
