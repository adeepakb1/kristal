package Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PeriodReturns{

	@SerializedName("oneMonth")
	private double oneMonth;

	@SerializedName("threeMonths")
	private double threeMonths;

	@SerializedName("oneYear")
	private double oneYear;

	@SerializedName("halfYear")
	private double halfYear;

	@SerializedName("oneWeek")
	private double oneWeek;

	@SerializedName("lifeTime")
	private double lifeTime;

	public void setOneMonth(double oneMonth){
		this.oneMonth = oneMonth;
	}

	public double getOneMonth(){
		return oneMonth;
	}

	public void setThreeMonths(double threeMonths){
		this.threeMonths = threeMonths;
	}

	public double getThreeMonths(){
		return threeMonths;
	}

	public void setOneYear(double oneYear){
		this.oneYear = oneYear;
	}

	public double getOneYear(){
		return oneYear;
	}

	public void setHalfYear(double halfYear){
		this.halfYear = halfYear;
	}

	public double getHalfYear(){
		return halfYear;
	}

	public void setOneWeek(double oneWeek){
		this.oneWeek = oneWeek;
	}

	public double getOneWeek(){
		return oneWeek;
	}

	public void setLifeTime(double lifeTime){
		this.lifeTime = lifeTime;
	}

	public double getLifeTime(){
		return lifeTime;
	}

	@Override
 	public String toString(){
		return 
			"PeriodReturns{" + 
			"oneMonth = '" + oneMonth + '\'' + 
			",threeMonths = '" + threeMonths + '\'' + 
			",oneYear = '" + oneYear + '\'' + 
			",halfYear = '" + halfYear + '\'' + 
			",oneWeek = '" + oneWeek + '\'' + 
			",lifeTime = '" + lifeTime + '\'' + 
			"}";
		}
}