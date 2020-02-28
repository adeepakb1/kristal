package Pojo.Bookmarks;

public class Cagr{
	private Object twoYear;
	private Object oneYear;
	private Object fiveYear;
	private Object lifeTime;
	private Object threeYear;

	public void setTwoYear(Object twoYear){
		this.twoYear = twoYear;
	}

	public Object getTwoYear(){
		return twoYear;
	}

	public void setOneYear(Object oneYear){
		this.oneYear = oneYear;
	}

	public Object getOneYear(){
		return oneYear;
	}

	public void setFiveYear(Object fiveYear){
		this.fiveYear = fiveYear;
	}

	public Object getFiveYear(){
		return fiveYear;
	}

	public void setLifeTime(Object lifeTime){
		this.lifeTime = lifeTime;
	}

	public Object getLifeTime(){
		return lifeTime;
	}

	public void setThreeYear(Object threeYear){
		this.threeYear = threeYear;
	}

	public Object getThreeYear(){
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
