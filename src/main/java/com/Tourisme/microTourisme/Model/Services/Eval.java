package com.Tourisme.microTourisme.Model.Services;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "eval")

public class Eval{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int ideval;
		private String username;
		private String destination;
		private int note;
		@CreatedDate
		@Column(name = "dateevaluation",updatable = false)
		@CreationTimestamp
		private Date dateevaluation;
		
	    public Eval() {}
	    public Eval(int ideval,String destination,String username,int note,Date dateevaluation)
	    {this.ideval=ideval;
	    this.destination=destination;
	    this.username=username;
	    this.note=note;
	    this.dateevaluation=dateevaluation;}
	    public int getideval() {
			return ideval;
		}
		public void setideval(int ideval) {
			this.ideval = ideval;
		}
	    
	    public String getdestination() {
			return destination;
		}
		public void setdestination(String destination) {
			this.destination = destination;
		}
		public String getusername() {
			return username;
		}
		public void setusername(String username) {
			this.username = username;
		}
		public int getnote() {
			return note;
		}
		public void setnote(int note) {
			this.note = note;
		}
		public Date getdateevaluation() {
			return dateevaluation;
		}
		public void setdateevaluation(Date dateevaluation) {
			this.dateevaluation=dateevaluation;
		}
		@Override
	    public String toString(){  
	        return "IdEval=" +ideval+
	        ",username=" +username+ 
	        ",destination=" +destination+ 
	        ",note="+note+",DateEvaluation="+dateevaluation+"}";
	    }
		public Eval(String username, String destination, int note) {
			super();
			this.username = username;
			this.destination = destination;
			this.note = note;
		}
		
	}

