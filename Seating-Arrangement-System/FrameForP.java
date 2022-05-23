//package myproject;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.lang.*;
import javax.swing.*;  
public class FrameForP 
{
	JFrame f;
	
	JLabel titleTxt,classTxt,timeTxt,dateTxt,arrangementChoice;
	
	JTextField examTimeIn,examDateIn;
	
	JComboBox classCB,choiceCB;
	
	JCheckBox R1,R2,R3,R4;
	
	JButton next,remove;
	
	//MyActionListenerSA ml = new MyActionListenerSA(this);
	
	FrameForP()
	{
		f=new JFrame("Practical exam");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] classdd = { "TK1","coming soon", "coming soon","coming soon"};
		String[] choicedd = { "Roll no wise","Randomly"};
		
		titleTxt = new JLabel("Practical exam arrangement");
		classTxt = new JLabel("Class:-");
		timeTxt = new JLabel("Time");
		examTimeIn = new JTextField("hh:mm");
		examDateIn = new JTextField("dd/mm/yyyy");
		dateTxt = new JLabel("Date");
		arrangementChoice = new JLabel("Arrangement type:-");
		R1 = new JCheckBox("MA 102");
		R2 = new JCheckBox("MA 104");
		R3 = new JCheckBox("MA 112");
		R4 = new JCheckBox("MA 115");
		next = new JButton("NEXT");
		remove = new JButton("REMOVE ALL");
		
		classCB = new JComboBox(classdd);
		choiceCB = new JComboBox(choicedd);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		Font f2 = new Font("Arial",Font.ITALIC,23);
		//SetFont
		titleTxt.setFont(f1);
		classTxt.setFont(f2);
		arrangementChoice.setFont(f2);
		classCB.setFont(f2);
		choiceCB.setFont(f2);
		R1.setFont(f2);
		R2.setFont(f2);
		R3.setFont(f2);
		R4.setFont(f2);
		timeTxt.setFont(f2);
		examTimeIn.setFont(f2);
		dateTxt.setFont(f2);
		examDateIn.setFont(f2);
		next.setFont(f2);
		remove.setFont(f2);
		
		titleTxt.setBounds(100,20, 600,100);
		classTxt.setBounds(100,140,200,50);
		classCB.setBounds(400,140,200,50);
		arrangementChoice.setBounds(100,230,200,50);
		choiceCB.setBounds(400,230,200,50);
		R1.setBounds(130,320,200,50);
		R2.setBounds(430,320,200,50);
		R3.setBounds(130,400,200,50);
		R4.setBounds(430,400,200,50);
		timeTxt.setBounds(100,470,100,50);
		examTimeIn.setBounds(200,480,150,40);
		dateTxt.setBounds(360,470,100,50);
		examDateIn.setBounds(460,480,150,40);
		remove.setBounds(100,550,200,50);
		next.setBounds(400,550,200,50);
		
		f.add(titleTxt);
		f.add(classTxt);
		f.add(classCB);
		f.add(arrangementChoice);
		f.add(choiceCB);
		f.add(R1);
		f.add(R2);
		f.add(R3);
		f.add(R4);
		f.add(timeTxt);
		f.add(examTimeIn);
		f.add(dateTxt);
		f.add(examDateIn);
		f.add(next);
		f.add(remove);
		/*
		f.examTimeIn.addActionListener(ml);
		f.examDateIn.addActionListener(ml);
		
		f.classCB.addActionListener(ml);
		f.choiceCB.addActionListener(ml);
		f.next.addActionListener(ml);
		f.remove.addActionListener(ml);
		
		f.R1.addItemListener(ml);
		f.R2.addItemListener(ml);
		f.R3.addItemListener(ml);
		f.R4.addItemListener(ml);
		*/
		f.setLayout(null);
		f.setSize(800,750);
		f.setVisible(true);
	}    
	public static void main(String[] args) 
	{
		new FrameForP();         
	}
}   