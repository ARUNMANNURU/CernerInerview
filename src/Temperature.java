	/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Temperature {
	
	private float temperature;
    private Location location;

    public Temperature(int temperature, Location location) {
        this.temperature = temperature;
        this.location = location;
    }

    public Temperature(Location location) {
        this.temperature = 0;
        this.location = location;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getTemperatureInFahrenheit() {
        return ( temperature * (9/5.0) + 32 );
    }

}
