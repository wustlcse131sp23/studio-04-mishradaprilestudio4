package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	Color pink = new Color (230,175,185);
	StdDraw.setPenColor(pink);
	StdDraw.filledRectangle(0.5, 0.5, .2, .2);
	
	Color purply = new Color (150,50,150);
	StdDraw.setPenColor(purply);
	StdDraw.setPenRadius(.01);
	StdDraw.filledCircle(.3, .30, .075);
	
	Color green = new Color (4, 24, 150);
	StdDraw.setPenColor(green);
	StdDraw.circle(.7, .85, .2);
	
	Color turqoise = new Color (0,167,167);
	StdDraw.setPenColor(turqoise);
	StdDraw.setPenRadius(.02);
	StdDraw.circle(.3, .30, .15);
	
	Color lightPink = new Color (230,50,190);
	StdDraw.setPenColor(lightPink);
	StdDraw.rectangle(.8, .2, .2, .2);
	
	Color lightBlue = new Color (10,100,190);
	StdDraw.setPenColor(lightBlue);
	StdDraw.setPenRadius(.01);
	double[] x= {.45,.75,.86};
	double[] y= {.45,.25,.97};
	StdDraw.polygon(x,y);
	}
}