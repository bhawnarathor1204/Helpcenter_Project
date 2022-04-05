package com.seb.temp.db;

public class IssueCategoryDetails {
	   private int catgId;
	   private String catgName;
	   
	   IssueCategoryDetails(){
		   
	   }
		public int getCatgId() {
			return catgId;
		}
		public void setCatgId(int catgId) {
			this.catgId = catgId;
		}
		public String getCatgName() {
			return catgName;
		}
		public void setCatgName(String catgName) {
			this.catgName = catgName;
		}
}
