package co.grandcircus.SpringAPIProject.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
	
	private ArrayList<RecipeDetails> results;

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(ArrayList<RecipeDetails> results) {
		super();
		this.results = results;
	}

	public ArrayList<RecipeDetails> getResults() {
		return results;
	}

	public void setResults(ArrayList<RecipeDetails> results) {
		this.results = results;
	}
	
}
