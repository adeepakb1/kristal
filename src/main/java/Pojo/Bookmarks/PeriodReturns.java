package Pojo.Bookmarks;

public class PeriodReturns{
	private double oneMonth;
	private Object threeMonths;
	private Object oneYear;
	private Object halfYear;
	private double oneWeek;
	private double lifeTime;

	public void setOneMonth(double oneMonth){
		this.oneMonth = oneMonth;
	}

	public double getOneMonth(){
		return oneMonth;
	}

	public void setThreeMonths(Object threeMonths){
		this.threeMonths = threeMonths;
	}

	public Object getThreeMonths(){
		return threeMonths;
	}

	public void setOneYear(Object oneYear){
		this.oneYear = oneYear;
	}

	public Object getOneYear(){
		return oneYear;
	}

	public void setHalfYear(Object halfYear){
		this.halfYear = halfYear;
	}

	public Object getHalfYear(){
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
