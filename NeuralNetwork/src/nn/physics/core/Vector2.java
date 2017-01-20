package nn.physics.core;

/**
 * Vector2 represents a Vector in 2D plane with X and Y.
 * @author Will Wright
 * @author Corbin Naderzad
 */
public final class Vector2
{
	private float x;
	private float y;
	
	/**
	 * Constructs a 2D Vector.
	 * @param x The x magnitude to pass to the vector.
	 * @param y The y magnitude to pass to the vector.
	 */
	public Vector2(float x, float y)
	{
		init(x, y);
	}
	
	/**
	 * Constructs a 2D Vector with a x and y component values both equal to zero.
	 */
	public Vector2()
	{
		init(0f, 0f);
	}
	
	/**
	 * Method that all Constructors call to initialize variables.
	 * @param x the x component of the vector.
	 * @param y the y component of the vector.
	 */
	private void init(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Adds x to the X component.
	 * @param x the value to add to the X component.
	 */
	public void addX(float x)
	{
		this.x += x;
	}
	
	/**
	 * Adds y to the Y component.
	 * @param y the value to add to the Y component.
	 */
	public void addY(float y)
	{
		this.y += y;
	}
	
	/**
	 * Adds the 2D Vector to the Vector2 object.
	 * @param vec The 2D Vector to add.
	 */
	public void addVector(Vector2 vec)
	{
		this.x += vec.getX();
		this.y += vec.getY();
	}
	
	/**
	 * Returns a new Vector with each component of vec1 added with the respective component of vec2.
	 * @param vec1 The first 2D Vector.
	 * @param vec2 The second 2D Vector.
	 * @return A 2D Vector.
	 */
	public static Vector2 createAddedVector(Vector2 vec1, Vector2 vec2)
	{
		return new Vector2(vec1.getX() + vec2.getX(), vec1.getY() + vec2.getY());
	}
	
	/**
	 * Get the x magnitude contained in the vector.
	 * @return The x magnitude.
	 */
	public float getX()
	{
		return x;
	}

	/**
	 * Get the y magnitude contained in the vector.
	 * @return The y magnitude.
	 */
	public float getY()
	{
		return y;
	}
	
	/**
	 * Sets the X Component to x.
	 * @param x the value to set the X component to.
	 */
	public void setX(float x)
	{
		this.x = x;
	}
	
	/**
	 * Sets the Y Component to y.
	 * @param y the value to set the Y component to.
	 */
	public void setY(float y)
	{
		this.y = y;
	}
	
	
}
