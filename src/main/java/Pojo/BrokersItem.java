package Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BrokersItem{

	@SerializedName("wealthManagerName")
	private String wealthManagerName;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("wealthManagerId")
	private int wealthManagerId;

	@SerializedName("wealthManagerType")
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