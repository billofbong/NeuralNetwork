package nn.physics.core;

/**
 * @author Will Wright
 * @author Corbin Naderzad
 */
public class Vector2
{
	
	/**
	 * Get the x magnitude contained in the vector.
	 * @return The x magnitude.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get the y magnitude contained in the vector.
	 * @return The y magnitude.
	 */
	public int getY() {
		return y;
	}

	private int x;
	private int y;
	
	/**
	 * Constructs a 2D Vector.
	 * @param x The x magnitude to pass to the vector.
	 * @param y The y magnitude to pass to the vector.
	 */
	public Vector2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
