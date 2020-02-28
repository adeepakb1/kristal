package Pojo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CategoryItem{

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("rank")
	private int rank;

	@SerializedName("description")
	private String description;

	@SerializedName("kristals")
	private List<KristalsItem> kristals;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
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

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setKristals(List<KristalsItem> kristals){
		this.kristals = kristals;
	}

	public List<KristalsItem> getKristals(){
		return kristals;
	}

	@Override
 	public String toString(){
		return 
			"CategoryItem{" + 
			"imageUrl = '" + imageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",description = '" + description + '\'' + 
			",kristals = '" + kristals + '\'' + 
			"}";
		}
}