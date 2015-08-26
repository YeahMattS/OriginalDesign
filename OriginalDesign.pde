void setup()
{
	size(500, 500);
	background(0);
	smooth();
	noStroke();
	frameRate(30);
}

void draw()
{
	randBack();
	// Click once to change background. Click and hold for rave.
	fillChoice();
	// Press r, g, or b to change the color. Hold keys for salami.
	ellipse(mouseX, mouseY, 100, 100);
	// Control movement with mouse.
} 

void randBack()
{
	if (mousePressed)
	{
		background(random(256), random(256), random(256));
	}
}

void fillChoice()
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
