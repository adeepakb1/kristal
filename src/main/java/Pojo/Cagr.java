package Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Cagr{

	@SerializedName("twoYear")
	private double twoYear;

	@SerializedName("oneYear")
	private double oneYear;

	@SerializedName("fiveYear")
	private double fiveYear;

	@SerializedName("lifeTime")
	private double lifeTime;

	@SerializedName("threeYear")
	private double threeYear;

	public void setTwoYear(double twoYear){
		this.twoYear = twoYear;
	}

	public double getTwoYear(){
		return twoYear;
	}

	public void setOneYear(double oneYear){
		this.oneYear = oneYear;
	}

	public double getOneYear(){
		return oneYear;
	}

	public void setFiveYear(double fiveYear){
		this.fiveYear = fiveYear;
	}

	public double getFiveYear(){
		return fiveYear;
	}

	public void setLifeTime(double lifeTime){
		this.lifeTime = lifeTime;
	}

	public double getLifeTime(){
		return lifeTime;
	}

	public void setThreeYear(double threeYear){
		this.threeYear = threeYear;
	}

	public double getThreeYear(){
		return threeYear;
	}

	@Override
 	public String toString(){
		return 
			"Cagr{" + 
			"twoYear = '" + twoYear + '\'' + 
			",oneYear = '" + oneYear + '\'' + 
			",fiveYear = '" + fiveYear + '\'' + 
			",lifeTime = '" + lifeTime + '\'' + 
			",threeYear = '" + threeYear + '\'' + 
			"}";
		}
}