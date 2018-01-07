import java.util.Comparator;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class LastSeenComparator implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o2.getLastSeen().compareTo(o1.getLastSeen());
	}
}
