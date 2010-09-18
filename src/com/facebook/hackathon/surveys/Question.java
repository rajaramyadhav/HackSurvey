package com.facebook.hackathon.surveys;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Question {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	
	@Persistent
	private String type;
	
	@Persistent
	private String isMandatory;
	
	@Persistent
	private Key survey_id;
	
	@Persistent
	private int position;
	
	@Persistent
	private String choice1;
	
	@Persistent
	private String choice2;
	
	@Persistent
	private String choice3;
	
	@Persistent
	private String choice4;
	
	@Persistent
	private String choice5;
	
	@Persistent
	private String choice6;
	
	@Persistent
	private String choice7;
	
	@Persistent
	private String choice8;
	
	@Persistent
	private String choice9;
	
	@Persistent
	private String choice10;

	public Question(Key id, String type, String isMandatory, Key survey_id,
			int position, String choice1, String choice2, String choice3,
			String choice4, String choice5, String choice6, String choice7,
			String choice8, String choice9, String choice10) {
		super();
		this.id = id;
		this.type = type;
		this.isMandatory = isMandatory;
		this.survey_id = survey_id;
		this.position = position;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.choice5 = choice5;
		this.choice6 = choice6;
		this.choice7 = choice7;
		this.choice8 = choice8;
		this.choice9 = choice9;
		this.choice10 = choice10;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(String isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Key getSurvey_id() {
		return survey_id;
	}

	public void setSurvey_id(Key survey_id) {
		this.survey_id = survey_id;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public String getChoice4() {
		return choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	public String getChoice5() {
		return choice5;
	}

	public void setChoice5(String choice5) {
		this.choice5 = choice5;
	}

	public String getChoice6() {
		return choice6;
	}

	public void setChoice6(String choice6) {
		this.choice6 = choice6;
	}

	public String getChoice7() {
		return choice7;
	}

	public void setChoice7(String choice7) {
		this.choice7 = choice7;
	}

	public String getChoice8() {
		return choice8;
	}

	public void setChoice8(String choice8) {
		this.choice8 = choice8;
	}

	public String getChoice9() {
		return choice9;
	}

	public void setChoice9(String choice9) {
		this.choice9 = choice9;
	}

	public String getChoice10() {
		return choice10;
	}

	public void setChoice10(String choice10) {
		this.choice10 = choice10;
	}


}
