package Orions_War.main;

public class Player_Ship extends Space_Objects
{
	final static double ShipRadius = 10;
	final static double maxShipSpeed = 10;
	final static double shipTurningRate = java.lang.Math.PI/32;
	
	private double angle;
	
	Player_Ship(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, ShipRadius);
		angle = 0;
	}
	
	public double getAngle()
	{
		return angle;
	}
	

	public void rotateLeft()
	{
		angle += shipTurningRate;
	}
	
	public void rotateRight()
	{
		angle -= shipTurningRate;
	}

	public void accelerate()
	{
		
		xVelocity += 0.1 * java.lang.Math.sin(angle);
		yVelocity += 0.1 * java.lang.Math.cos(angle);
		
		if(java.lang.Math.sqrt(xVelocity * xVelocity + yVelocity * yVelocity) > 10)
		{
		
			xVelocity = 10* java.lang.Math.sin(angle);
			yVelocity = 10* java.lang.Math.cos(angle);
		}
	}

}
