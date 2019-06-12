package co.grandcircus.SpringAPIProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeDetails {

	private String title;
	private String href;
	private String ingredients;
	private String thumbnail;
	
	public RecipeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeDetails(String title, String href, String ingredients, String thumbnail) {
		super();
		this.title = title;
		this.href = href;
		this.ingredients = ingredients;
		this.thumbnail = thumbnail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@Override
	public String toString() {
		return "RecipeDetails [title=" + title + ", href=" + href + ", ingredients=" + ingredients + ", thumbnail="
				+ thumbnail + "]";
	}

}
