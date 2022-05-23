//package myproject;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.lang.*;
import javax.swing.*;
public class HomeFrame extends JFrame
{
	//Component
	
	JFrame f;
	
	JRadioButton sub1,sub2,sub3,sub4,sub5;
	JRadioButton type1,type2,type3;
	
	JLabel welcomeTxt,subtxt,typetxt;
	
	JButton next,clear;

	MyActionListenerSA ml = new MyActionListenerSA(this);
	
	HomeFrame()
	{
		
		f=new JFrame("Practical exam");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Initialized Components
		
		
		welcomeTxt = new JLabel("Welcome to my small program");
		subtxt = new JLabel("-> Subject Choice");
		typetxt = new JLabel("-> Exam type");
		type1 = new JRadioButton("Practical exam");
		type2 = new JRadioButton("Theoretical exam");
		type3 = new JRadioButton("Combine exam");
		sub1 = new JRadioButton("OOP(Object Oriented Programming)");
		sub2 = new JRadioButton("DE(Digital Electronics)");
		sub3 = new JRadioButton("MAVC(Matrix Algebra and Vector Calculus)");
		sub4 = new JRadioButton("IRRS(Introduction To R and R Studio)");
		sub5 = new JRadioButton("EDCAD(Engineering Drawing And CAD)");
		clear = new JButton("CLEAR");
		next = new JButton("Next ->");
		
		
		ButtonGroup subGroup = new ButtonGroup();
		subGroup.add(sub1);subGroup.add(sub2);subGroup.add(sub3);subGroup.add(sub4);subGroup.add(sub5);
		
		ButtonGroup typeGroup = new ButtonGroup();
		typeGroup.add(type1);typeGroup.add(type2);typeGroup.add(type3);
		
		//Set Component
		welcomeTxt.setBounds(100,30,600,100);
		
		subtxt.setBounds(75,140,300,50);
		sub1.setBounds(75,200,600,50);
		sub2.setBounds(75,260,600,50);
		sub3.setBounds(75,320,600,50);
		sub4.setBounds(75,380,600,50);
		sub5.setBounds(75,440,600,50);
		
		typetxt.setBounds(75,510,300,50);
		type1.setBounds(75,570,200,50);
		type2.setBounds(290,570,220,50);
		type3.setBounds(520,570,200,50);
		
		clear.setBounds(75,640,300,50);
		next.setBounds(400,640,300,50);
		
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		Font f2 = new Font("Arial",Font.ITALIC,25);
		Font f3 = new Font("Arial",Font.BOLD,30);
		//SetFont
		welcomeTxt.setFont(f1);
		clear.setFont(f1);
		next.setFont(f1);
		subtxt.setFont(f3);
		typetxt.setFont(f3);
		sub1.setFont(f2);sub2.setFont(f2);sub3.setFont(f2);sub4.setFont(f2);sub5.setFont(f2);
		type1.setFont(f2);type2.setFont(f2);type3.setFont(f2);
		
		
		f.add(welcomeTxt);
		f.add(subtxt);
		f.add(typetxt);
		f.add(clear);
		f.add(next);
		f.add(sub1);f.add(sub2);f.add(sub3);f.add(sub4);f.add(sub5);
		f.add(type1);f.add(type2);f.add(type3);
		next.setEnabled(false);
		/*
		sub1.addActionListener(ml);sub2.addActionListener(ml);sub3.addActionListener(ml);sub4.addActionListener(ml);sub5.addActionListener(ml);
		type1.addActionListener(ml);type2.addActionListener(ml);type3.addActionListener(ml);*/
		sub1.addItemListener(ml);sub2.addItemListener(ml);sub3.addItemListener(ml);sub4.addItemListener(ml);sub5.addItemListener(ml);
		type1.addItemListener(ml);type2.addItemListener(ml);type3.addItemListener(ml);
		clear.addActionListener(ml);
		next.addActionListener(ml);
		//addItemListener
		
		
		f.setLayout(null);
		f.setSize(800,750);
		f.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		HomeFrame();
		
	}
}