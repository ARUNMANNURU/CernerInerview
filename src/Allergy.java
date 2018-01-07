/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Allergy {
	
	private String name;
    private Severity severity;

    public Allergy(String name, Severity severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
}
