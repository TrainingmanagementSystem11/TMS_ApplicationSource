package com.training.entities;

public class Admin extends User{
	public Admin() {
			
		}
		private String adminId;
		public String getAdminId() {
			return adminId;
		}
		public void setAdminId(String adminId) {
			this.adminId = adminId;
		}
		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + "]";
		}
	}


