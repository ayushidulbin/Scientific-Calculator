package firstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;

public class Scientific_Calculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_Calculator window = new Scientific_Calculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientific_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 525, 367 );
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 275, 367 );
				txtDisplay.setBounds(10,11,243,37);
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 525, 367 );
				txtDisplay.setBounds(10,11,494,37);
				
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Unit Conversion");
				frmStandardCalculator.setBounds(100, 100, 884, 367 );
				txtDisplay.setBounds(10,11,494,37);
				
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 499, 37);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("x");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtDisplay.getText().length()>0){
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnNewButton.setBounds(10, 59, 47, 43);
		frmStandardCalculator.getContentPane().add(btnNewButton);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setBounds(10, 103, 47, 43);
		frmStandardCalculator.getContentPane().add(btn7);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtDisplay.getText().length()>0){
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCe.setBounds(60, 59, 47, 43);
		frmStandardCalculator.getContentPane().add(btnCe);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setBounds(60, 103, 47, 43);
		frmStandardCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setBounds(109, 103, 47, 43);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnC.setBounds(109, 59, 47, 43);
		frmStandardCalculator.getContentPane().add(btnC);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setBounds(10, 147, 47, 43);
		frmStandardCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setBounds(60, 147, 47, 43);
		frmStandardCalculator.getContentPane().add(btn5);
		
		JButton button_7 = new JButton("\u00B1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_7.setBounds(158, 59, 47, 43);
		frmStandardCalculator.getContentPane().add(button_7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setBounds(109, 147, 47, 43);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton button_9 = new JButton("/");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		button_9.setBounds(158, 103, 47, 43);
		frmStandardCalculator.getContentPane().add(button_9);
		
		JButton btnRoot = new JButton("Root");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnRoot.setBounds(207, 59, 47, 43);
		frmStandardCalculator.getContentPane().add(btnRoot);
		
		JButton button_11 = new JButton("%");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
			}
		});
		button_11.setBounds(207, 103, 47, 43);
		frmStandardCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		button_12.setBounds(158, 147, 47, 43);
		frmStandardCalculator.getContentPane().add(button_12);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=1/Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnx.setBounds(207, 147, 47, 43);
		frmStandardCalculator.getContentPane().add(btnx);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setBounds(10, 192, 47, 43);
		frmStandardCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setBounds(60, 192, 47, 43);
		frmStandardCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setBounds(109, 192, 47, 43);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton button_17 = new JButton("-");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		button_17.setBounds(158, 192, 47, 43);
		frmStandardCalculator.getContentPane().add(button_17);
		
		JButton button_19 = new JButton(".");
		button_19.setBounds(109, 238, 47, 43);
		frmStandardCalculator.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("+");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
				
			}
		});
		button_20.setBounds(158, 238, 47, 43);
		frmStandardCalculator.getContentPane().add(button_20);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 238, 97, 43);
		frmStandardCalculator.getContentPane().add(btn0);
		
		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operations=="+"){
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="-"){
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="*"){
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="/"){
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnNewButton_2.setBounds(207, 192, 47, 89);
		frmStandardCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Log");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_3.setBounds(274, 59, 52, 43);
		frmStandardCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setBounds(331, 59, 52, 43);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setBounds(388, 59, 52, 43);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="Mod";
			}
		});
		btnMod.setBounds(445, 59, 52, 43);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		JButton btnPi = new JButton("pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops=(3.14159265358);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi.setBounds(274, 103, 52, 43);
		frmStandardCalculator.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setBounds(331, 103, 52, 43);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnCosh.setBounds(388, 103, 52, 43);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnInx.setBounds(445, 103, 52, 43);
		frmStandardCalculator.getContentPane().add(btnInx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.pow(ops,ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnXy.setBounds(274, 147, 52, 43);
		frmStandardCalculator.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setBounds(331, 147, 52, 43);
		frmStandardCalculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnTanh.setBounds(388, 147, 52, 43);
		frmStandardCalculator.getContentPane().add(btnTanh);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="Exp";
			}
		});
		btnExp.setBounds(445, 147, 52, 43);
		frmStandardCalculator.getContentPane().add(btnExp);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(ops*ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnX.setBounds(274, 192, 52, 43);
		frmStandardCalculator.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setBounds(331, 192, 52, 43);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		JButton btnRound = new JButton("Round");
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRound.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRound.setBounds(388, 192, 52, 43);
		frmStandardCalculator.getContentPane().add(btnRound);
		
		JButton btnpi = new JButton("2*pi");
		btnpi.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops=(3.14159265358)*2;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnpi.setBounds(445, 192, 52, 43);
		frmStandardCalculator.getContentPane().add(btnpi);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(ops*ops*ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnX_1.setBounds(274, 238, 52, 43);
		frmStandardCalculator.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnBin.setBounds(331, 238, 52, 43);
		frmStandardCalculator.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setBounds(388, 238, 52, 43);
		frmStandardCalculator.getContentPane().add(btnHex);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnOctal.setBounds(445, 238, 52, 43);
		frmStandardCalculator.getContentPane().add(btnOctal);
	}
}
