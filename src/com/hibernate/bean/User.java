package com.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
		@Id @GeneratedValue
		private int id;
		private String name;
		private String userId;
		private String password;
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String name, String userId, String password) {
			super();
			this.name = name;
			this.userId = userId;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
}
