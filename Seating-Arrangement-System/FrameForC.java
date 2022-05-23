//package myproject;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.lang.*;
import javax.swing.*;    
public class FrameForC 
{
	JFrame f;
	
	JLabel titleTxt,classTxt,timePTxt,datePTxt,timeTTxt,dateTTxt,arrangementChoice,pexam,texam;
	
	JTextField examTimePIn,examDatePIn,examTimeTIn,examDateTIn;
	
	JComboBox classCB,choiceCB;
	
	JCheckBox P1,P2,P3,P4;
	JCheckBox T1,T2,T3,T4;
	
	JButton next,remove;
	
	FrameForC()
	{
		f=new JFrame("Combine exam");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] classdd = { "TK1","coming soon", "coming soon","coming soon"};
		String[] choicedd = { "Roll no wise","Randomly"};
		
		titleTxt = new JLabel("Combine exam arrangement");
		classTxt = new JLabel("Class:-");
		timePTxt = new JLabel("Time");
		datePTxt = new JLabel("Date");
		pexam = new JLabel("->Practical exam");
		texam = new JLabel("->Theoretical exam");
		examTimePIn = new JTextField("hh:mm");
		examDatePIn = new JTextField("dd/mm/yyyy");
		timeTTxt = new JLabel("Time");
		dateTTxt = new JLabel("Date");
		examTimeTIn = new JTextField("hh:mm");
		examDateTIn = new JTextField("dd/mm/yyyy");
		
		arrangementChoice = new JLabel("Arrangement type:-");
		P1 = new JCheckBox("MA 102");
		P2 = new JCheckBox("MA 104");
		P3 = new JCheckBox("MA 112");
		P4 = new JCheckBox("MA 115");
		T1 = new JCheckBox("MA 105");
		T2 = new JCheckBox("MA 106");
		T3 = new JCheckBox("MA 110");
		T4 = new JCheckBox("MA 111");
		next = new JButton("Done");
		remove = new JButton("clear all");
		
		classCB = new JComboBox(classdd);
		choiceCB = new JComboBox(choicedd);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		Font f2 = new Font("Arial",Font.ITALIC,19);
		//SetFont
		titleTxt.setFont(f1);
		classTxt.setFont(f2);
		arrangementChoice.setFont(f2);
		classCB.setFont(f2);
		choiceCB.setFont(f2);
		P1.setFont(f2);
		P2.setFont(f2);
		P3.setFont(f2);
		P4.setFont(f2);
		T1.setFont(f2);
		T2.setFont(f2);
		T3.setFont(f2);
		T4.setFont(f2);
		pexam.setFont(f2);
		texam.setFont(f2);
		timePTxt.setFont(f2);
		examTimePIn.setFont(f2);
		datePTxt.setFont(f2);
		examDatePIn.setFont(f2);
		timeTTxt.setFont(f2);
		examTimeTIn.setFont(f2);
		dateTTxt.setFont(f2);
		examDateTIn.setFont(f2);
		next.setFont(f2);
		remove.setFont(f2);
		
		titleTxt.setBounds(100,5, 600,100);
		classTxt.setBounds(100,115,200,40);
		classCB.setBounds(400,115,200,40);
		arrangementChoice.setBounds(100,160,200,40);
		choiceCB.setBounds(400,160,200,40);
		pexam.setBounds(100,210,200,40);
		P1.setBounds(130,260,100,50);
		P2.setBounds(240,260,100,50);
		P3.setBounds(350,260,100,50);
		P4.setBounds(460,260,100,50);
		timePTxt.setBounds(100,315,100,50);
		examTimePIn.setBounds(200,320,150,40);
		datePTxt.setBounds(360,315,100,50);
		examDatePIn.setBounds(460,320,150,40);
		
		texam.setBounds(100,370,200,40);
		T1.setBounds(130,420,100,50);
		T2.setBounds(240,420,100,50);
		T3.setBounds(350,420,100,50);
		T4.setBounds(460,420,100,50);
		timeTTxt.setBounds(100,475,100,50);
		examTimeTIn.setBounds(200,485,150,40);
		dateTTxt.setBounds(360,475,100,50);
		examDateTIn.setBounds(460,485,150,40);
		
		remove.setBounds(100,580,200,50);
		next.setBounds(400,580,200,50);
		
		f.add(titleTxt);
		f.add(classTxt);
		f.add(classCB);
		f.add(arrangementChoice);
		f.add(choiceCB);
		f.add(pexam);
		f.add(texam);
		f.add(P1);
		f.add(P2);
		f.add(P3);
		f.add(P4);
		f.add(T1);
		f.add(T2);
		f.add(T3);
		f.add(T4);
		f.add(timePTxt);
		f.add(examTimePIn);
		f.add(datePTxt);
		f.add(examDatePIn);
		f.add(timeTTxt);
		f.add(examTimeTIn);
		f.add(dateTTxt);
		f.add(examDateTIn);
		f.add(next);
		f.add(remove);
		f.setLayout(null);
		f.setSize(800,750);
		f.setVisible(true);         
	}    
	public static void main(String[] args) 
	{
		new FrameForC();         
	}
}   