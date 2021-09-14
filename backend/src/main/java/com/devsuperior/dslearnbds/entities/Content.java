package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_content")
public class Content extends Lesson {
	private static final long serialVersionUID = 1L;

	//Atributos
	private String textContent;
	private String videoUri;
	
	//Construtores
	public Content () {
	}

	public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}

	//Gets e Sets
	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
	
	//Não precisa de Equals e HashCode pois
	//como estou herdando do "Lesson", eu vou herdar
	//o seu Equals e HashCode.
}
