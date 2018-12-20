package card;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean cardBean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.카드 선택 \n"
					+ "2.카드 정보 \n")){
			case "0" : 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" :
				cardBean = new CardBean();
				String kind = JOptionPane.showInputDialog("종류?");
				String number = JOptionPane.showInputDialog("번호?");
				cardBean.setKind(kind);
				cardBean.setNumber(Integer.parseInt(number));
				break;
			case "2" : 
				JOptionPane.showMessageDialog(null,cardBean.toString(cardBean.getKind(), cardBean.getNumber()));
				break;
			case "3" : break;
			}
		}
	}
}