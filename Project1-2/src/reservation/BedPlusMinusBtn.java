package reservation;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BedPlusMinusBtn {
	// �ο� �÷��� ���̳ʽ� ��ư
	public JButton ppbtn(int num, TextArea j1) {
		JButton pplustbtn = new JButton();
		ImageIcon i = new ImageIcon("up.png");
		ImageIcon i2 = new ImageIcon("up2.png");
		pplustbtn = new JButton(i);
		pplustbtn.setRolloverIcon(i2);
		pplustbtn.setBorderPainted(false);
		pplustbtn.setContentAreaFilled(false);
		pplustbtn.setFocusPainted(false);
		if (num == 1) {

			pplustbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.person + 1) >= 5) {
						JOptionPane.showMessageDialog(null, "�ִ��ο��� 4����� �����Ҽ� �ֽ��ϴ�.");
					} else {
						Bedbaguni.person +=1;
						j1.setText(String.valueOf(Bedbaguni.person));
					}
				}
			});
		}
		return pplustbtn;
	}// ������� �÷���

	// �ο� ���̳ʽ���ư
	public JButton mpbtn(int num, TextArea j1) {
		JButton mpbtn = new JButton();
		ImageIcon i = new ImageIcon("down.png");
		ImageIcon i2 = new ImageIcon("down2.png");
		mpbtn = new JButton(i);
		mpbtn.setRolloverIcon(i2);
		mpbtn.setBorderPainted(false);
		mpbtn.setContentAreaFilled(false);
		mpbtn.setFocusPainted(false);
		if (num == 1) {
			mpbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.person - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1���̻� ������ �ּ���.");
					} else {
						Bedbaguni.person -= 1;
						j1.setText(String.valueOf(Bedbaguni.person));
					}

				}
			});
		}
		return mpbtn;
	}

	// ħ�� �÷��� ���̽��ʽ� ��ư
	public JButton plusbtn(int num, TextArea j) {
		JButton plusbtn = new JButton();
		ImageIcon i = new ImageIcon("�÷���.png"); // �߰�����
		ImageIcon i2 = new ImageIcon("�÷���2.png"); // �߰�����
		plusbtn.setRolloverIcon(i2); // �ٲ�°�
		plusbtn.setBorderPainted(false);
		plusbtn.setContentAreaFilled(false);
		plusbtn.setFocusPainted(false);
		if (num == 1) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count1 + 1) >= 4) {
						JOptionPane.showMessageDialog(null, "�ѹ��� 3�� ���� ������ �ֽ��ϴ�.");
					} else {
						Bedbaguni.count1 += 1;
						j.setText(String.valueOf(Bedbaguni.count1));
					}
				}

			});
		} else if (num == 2) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count2 + 1) >= 4) {
						JOptionPane.showMessageDialog(null, "�ѹ��� 3�� ���� ������ �ֽ��ϴ�.");
					} else {
						Bedbaguni.count2 += 1;
						j.setText(String.valueOf(Bedbaguni.count2));
					}
				}
			});
		} else if (num == 3) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count3 + 1) >= 4) {
						JOptionPane.showMessageDialog(null, "�ѹ��� 3�� ���� ������ �ֽ��ϴ�.");
					} else {
						Bedbaguni.count3 += 1;
						j.setText(String.valueOf(Bedbaguni.count3));
					}

				}
			});
		} else if (num == 4) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count4 + 1) >= 4) {
						JOptionPane.showMessageDialog(null, "�ѹ��� 3�� ���� ������ �ֽ��ϴ�.");
					} else {
						Bedbaguni.count4 += 1;
						j.setText(String.valueOf(Bedbaguni.count4));
					}
				}
			});
		}

		return plusbtn;

	}// ������� plus

	public JButton minusbutton(int num, TextArea j) {
		JButton minusbtn = new JButton();
		ImageIcon i = new ImageIcon("down.png");
		ImageIcon i2 = new ImageIcon("down2.png");
		minusbtn = new JButton(i);
		minusbtn.setRolloverIcon(i2);
		
		minusbtn.setBorderPainted(false);
		minusbtn.setContentAreaFilled(false);
		minusbtn.setFocusPainted(false);
		if (num == 1) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count1 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1���̻��� ħ�븦 �����Ͻʽÿ�.");
					} else {
						Bedbaguni.count1 -=1;
						j.setText(String.valueOf(Bedbaguni.count1));
					}
				}
			});
		} else if (num == 2) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count2 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1���̻��� ħ�븦 �����Ͻʽÿ�.");
					} else {
						Bedbaguni.count2 -= 1;
						j.setText(String.valueOf(Bedbaguni.count2));
					}
				}
			});
		} else if (num == 3) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count3 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1���̻��� ħ�븦 �����Ͻʽÿ�.");
					} else {
						Bedbaguni.count3 -= 1;
						j.setText(String.valueOf(Bedbaguni.count3));
					}
				}
			});
		} else if (num == 4) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count4 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1���̻��� ħ�븦 �����Ͻʽÿ�.");
					} else {
						Bedbaguni.count4 -= 1;
						j.setText(String.valueOf(Bedbaguni.count4));
					}
				}
			});
		}

		return minusbtn;
	}

	public TextArea getCountArea() {
		Font f = new Font("monospaced", Font.BOLD, 22);
		TextArea j = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		j.setEditable(false);
		j.setText("1");
		j.setFont(f);
		return j;
	}
	public TextArea getCountArea1() {
		Font f = new Font("monospaced", Font.BOLD, 22);
		TextArea j1 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		j1.setEditable(false);
		j1.setText("1");
		j1.setFont(f);
		return j1;
	}
//	
//	//��ٱ���
//	public JButton getbuyButton(int num, TextArea j, ArrayList<Menu> m) {
//		ImageIcon bas = new ImageIcon("��ٱ��Ϸΰ�.jpg");
//		ImageIcon bas2 = new ImageIcon("��ٱ��Ϸΰ�2.jpg");
//		JButton btnBuy = new JButton(bas);
//		btnBuy.setRolloverIcon(bas2);
//		btnBuy.setToolTipText("��ٱ��Ͽ� ����ϴ�");
//		if (num == 1) {
//			btnBuy.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					if (BedMenu.buylist.isEmpty()) {
//						m.get(num - 1).setCount(MyMenu.count1);
//						MyMenu.add(m.get(num - 1));
//						MyMenu.count1 = 1;
//						j.setText(String.valueOf(MyMenu.count1));
//					} else if (!MyMenu.buylist.isEmpty()) {
//						for (int i = 0; i < MyMenu.buylist.size(); i++) {
//							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
//								MyMenu.buylist.get(i).setCount(MyMenu.count1);
//								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
//								MyMenu.count1 = 1;
//								j.setText(String.valueOf(MyMenu.count1));
//								break;
//							}
//						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
//								m.get(num - 1).setCount(MyMenu.count1);
//								MyMenu.add(m.get(num - 1));
//								MyMenu.count1 = 1;
//								j.setText(String.valueOf(MyMenu.count1));
//							}
//						 
//					}
//				}
//				
//			});
//		} else if (num == 2) {
//			btnBuy.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					if (MyMenu.buylist.isEmpty()) {
//						m.get(num - 1).setCount(MyMenu.count2);
//						MyMenu.add(m.get(num - 1));
//						MyMenu.count2 = 1;
//						j.setText(String.valueOf(MyMenu.count2));
//					} else if (!MyMenu.buylist.isEmpty()) {
//						for (int i = 0; i < MyMenu.buylist.size(); i++) {
//							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
//								MyMenu.buylist.get(i).setCount(MyMenu.count2);
//								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
//								MyMenu.count2 = 1;
//								j.setText(String.valueOf(MyMenu.count2));
//							}
//						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
//								m.get(num - 1).setCount(MyMenu.count2);
//								MyMenu.add(m.get(num - 1));
//								MyMenu.count2 = 1;
//								j.setText(String.valueOf(MyMenu.count2));
//							}
//						 
//					}
//				}
//				
//			});
//		} else if (num == 3) {
//			btnBuy.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					if (MyMenu.buylist.isEmpty()) {
//						m.get(num - 1).setCount(MyMenu.count3);
//						MyMenu.add(m.get(num - 1));
//						MyMenu.count3 = 1;
//						j.setText(String.valueOf(MyMenu.count3));
//					} else if (!MyMenu.buylist.isEmpty()) {
//						for (int i = 0; i < MyMenu.buylist.size(); i++) {
//							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
//								MyMenu.buylist.get(i).setCount(MyMenu.count3);
//								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
//								MyMenu.count3 = 1;
//								j.setText(String.valueOf(MyMenu.count3));
//							}
//						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
//								m.get(num - 1).setCount(MyMenu.count3);
//								MyMenu.add(m.get(num - 1));
//								MyMenu.count3 = 1;
//								j.setText(String.valueOf(MyMenu.count3));
//							}
//						 
//					}
//				}
//				
//			});
//		} else if (num == 4) {
//			btnBuy.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					if (MyMenu.buylist.isEmpty()) {
//						m.get(num - 1).setCount(MyMenu.count4);
//						MyMenu.add(m.get(num - 1));
//						MyMenu.count4 = 1;
//						j.setText(String.valueOf(MyMenu.count4));
//					} else if (!MyMenu.buylist.isEmpty()) {
//						for (int i = 0; i < MyMenu.buylist.size(); i++) {
//							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
//								MyMenu.buylist.get(i).setCount(MyMenu.count4);
//								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
//								MyMenu.count4 = 1;
//								j.setText(String.valueOf(MyMenu.count4));
//							}
//						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
//								m.get(num - 1).setCount(MyMenu.count4);
//								MyMenu.add(m.get(num - 1));
//								MyMenu.count4 = 1;
//								j.setText(String.valueOf(MyMenu.count4));
//							}
//						 
//					}
//				}
//				
//			});
//		}
//		return btnBuy;
//	}
}
