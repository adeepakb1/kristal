package Pojo.Bookmarks;

public class Returns{
	private String metricName;
	private int returnsSinceDate;
	private double returns;

	public void setMetricName(String metricName){
		this.metricName = metricName;
	}

	public String getMetricName(){
		return metricName;
	}

	public void setReturnsSinceDate(int returnsSinceDate){
		this.returnsSinceDate = returnsSinceDate;
	}

	public int getReturnsSinceDate(){
		return returnsSinceDate;
	}

	public void setReturns(double returns){
		this.returns = returns;
	}

	public double getReturns(){
		return returns;
	}

	@Override
 	public String toString(){
		return 
			"Returns{" + 
			"metricName = '" + metricName + '\'' + 
			",returnsSinceDate = '" + returnsSinceDate + '\'' + 
			",returns = '" + returns + '\'' + 
			"}";
		}
}
