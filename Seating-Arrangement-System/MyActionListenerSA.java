//package myproject;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
public class MyActionListenerSA implements ActionListener,ItemListener
{
	public int count=0,count1=0;
	public String subIn,typeIn;
	HomeFrame fm1;
	//FrameForP fm2;
	MyActionListenerSA(HomeFrame f)
	{
		this.fm1=f;
	}
	/*
	MyActionListenerSA(FrameForP f)
	{
		this.fm2=f;
	}*/
	
	
	public void itemStateChanged(ItemEvent e)
	{
		fm1=new HomeFrame();
		//count1=0;
		//count2=0;
		/*
		if(e.getSourse()==sub1)
		{
			subIn=this.fm1.sub1.getLabel();
			System.out.println(subIn);
		}
		else if(e.getSourse()==sub2)
		{
			subIn=this.fm1.sub1.getLabel();
			System.out.println(subIn);
		}*/
		
		if(fm1.sub1.isSelected())
		{
			subIn=this.fm1.sub1.getLabel();
			System.out.println(subIn);
		}
		else if(fm1.sub2.isSelected())
		{
			subIn=this.fm1.sub2.getLabel();
			System.out.println(subIn);
		}
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		fm1=new HomeFrame();
		
		/*
		if(e.getSourse()==sub1)
		{
			subIn=this.fm1.sub1.getLabel();
			System.out.println(subIn);
		}*/
		
		/*
		else if(e.getActionCommand().equals("CLEAR"))
		{
			this.fm1.next.setEnabled(false);
			subIn=null;
			typeIn= null;
			
		}*/
		
	}
}