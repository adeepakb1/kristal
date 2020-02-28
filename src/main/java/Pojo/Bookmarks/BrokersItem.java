package Pojo.Bookmarks;

public class BrokersItem{
	private String wealthManagerName;
	private String imageUrl;
	private int wealthManagerId;
	private String wealthManagerType;

	public void setWealthManagerName(String wealthManagerName){
		this.wealthManagerName = wealthManagerName;
	}

	public String getWealthManagerName(){
		return wealthManagerName;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setWealthManagerId(int wealthManagerId){
		this.wealthManagerId = wealthManagerId;
	}

	public int getWealthManagerId(){
		return wealthManagerId;
	}

	public void setWealthManagerType(String wealthManagerType){
		this.wealthManagerType = wealthManagerType;
	}

	public String getWealthManagerType(){
		return wealthManagerType;
	}

	@Override
 	public String toString(){
		return 
			"BrokersItem{" + 
			"wealthManagerName = '" + wealthManagerName + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",wealthManagerId = '" + wealthManagerId + '\'' + 
			",wealthManagerType = '" + wealthManagerType + '\'' + 
			"}";
		}
}
