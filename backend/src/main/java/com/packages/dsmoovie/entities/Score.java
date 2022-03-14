package com.packages.dsmoovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePk id = new ScorePk();
	
	private Double value;
	
	public Score() {
		
	}

		public void setMoovie(Moovie moovie) {
			id.setMoovie(moovie);
			
		}
		
		public void setUser (User user) {
			id.setUser(user);
			
		}
		
		
}
