package Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Returns{

	@SerializedName("metricName")
	private String metricName;

	@SerializedName("returnsSinceDate")
	private int returnsSinceDate;

	@SerializedName("returns")
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