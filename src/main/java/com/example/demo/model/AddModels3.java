package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ebooks")
public class AddModels3 {
	@Id
	private int id;
    private String Title;
    private String Author;
    private String Genres;
    private String Chapter;
    private String Image;
    private String Page;
    private String Rating;
    private String Description;
    public AddModels3(String rating) {
		super();
		Rating = rating;
	}

	
    
    public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

	
    // Constructors, getters, setters, and other methods...

    public AddModels3() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getGenres() {
		return Genres;
	}

	public void setGenres(String genres) {
		Genres = genres;
	}

	public String getChapter() {
		return Chapter;
	}

	public void setChapter(String chapter) {
		Chapter = chapter;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getPage() {
		return Page;
	}

	public void setPage(String page) {
		Page = page;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public AddModels3(int id, String title, String author, String genres, String chapter, String image, String page,
			String description) {
		super();
		this.id = id;
		Title = title;
		Author = author;
		Genres = genres;
		Chapter = chapter;
		Image = image;
		Page = page;
		Description = description;
	}
	

    
}
