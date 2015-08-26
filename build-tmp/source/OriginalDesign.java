import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(500, 500);
	background(0);
	smooth();
	noStroke();
	frameRate(30);
}

public void draw()
{
	randBack();
	// Click once to change background. Click and hold for rave.
	fillChoice();
	// Press r, g, or b to change the color. Hold keys for salami.
	ellipse(mouseX, mouseY, 100, 100);
	// Control movement with mouse.
} 

public void randBack()
{
	if (mousePressed)
	{
		background(random(256), random(256), random(256));
	}
}

public void fillChoice()
{
	if (keyPressed)
	{
		if (key == 'r')
		{
			fill(random(256), 0, 0);
		}
		else if (key == 'g')
		{
			fill(0, random(256), 0);
		}
		else if (key == 'b')
		{
			fill(0, 0, random(256));
		}
	}
	else
	{
		fill(random(256));
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
