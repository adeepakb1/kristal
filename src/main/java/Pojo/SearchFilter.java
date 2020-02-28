package Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SearchFilter{

	@SerializedName("imageUrl")
	private Object imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("rank")
	private int rank;

	@SerializedName("description")
	private Object description;

	public void setImageUrl(Object imageUrl){
		this.imageUrl = imageUrl;
	}

	public Object getImageUrl(){
		return imageUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"SearchFilter{" + 
			"imageUrl = '" + imageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}