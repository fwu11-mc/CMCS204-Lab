package GenericsLab;

public class DataSetGen <T extends Measurable> {
	private double total;
	private T maximum;
	private int count;
	
	
	public DataSetGen() {
		total = 0;
		count = 0;
		maximum = null;
	}
	
	
	public void add(T x) {
		total = total + x.getMeasure();
		if(count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}
	
	
	public double getAverage() {
		if(count == 0) {
			return 0;
		}
		else {
			return total/count;
		}
	}
	
	
	public T getMaximum() {
		return maximum;
	}

}
