package factsgenerator_maths;

import java.util.Comparator;

import generator.Date;
import generator.HistoryFact;
import generator.TimePeriod;

public class HistoryFactComparator implements Comparator<HistoryFact> {
	@Override
	public int compare(HistoryFact o1, HistoryFact o2) { // -1, 0, or 1 to say if it is less than, equal, or greater
		if(o1.getTime() instanceof TimePeriod && o2.getTime() instanceof TimePeriod) {
			TimePeriod to1 = (TimePeriod) o1.getTime();
			TimePeriod to2 = (TimePeriod) o2.getTime();
			return Integer.valueOf(to1.getStartYear()) - Integer.valueOf(to2.getStartYear());
		}
		if(o1.getTime() instanceof TimePeriod && o2.getTime() instanceof Date) {
			TimePeriod to1 = (TimePeriod) o1.getTime();
			Date to2 = (Date) o2.getTime();
			return Integer.valueOf(to1.getStartYear()) - Integer.valueOf(to2.getYear());
		}
		if(o1.getTime() instanceof Date && o2.getTime() instanceof TimePeriod) {
			Date to1 = (Date) o1.getTime();
			TimePeriod to2 = (TimePeriod) o2.getTime();
			return Integer.valueOf(to1.getYear()) - Integer.valueOf(to2.getStartYear());
		} else {
			Date to1 = (Date) o1.getTime();
			Date to2 = (Date) o2.getTime();
			
			int year = Integer.valueOf(to1.getYear()) - Integer.valueOf(to2.getYear());
			return year;
		}
	}
}
