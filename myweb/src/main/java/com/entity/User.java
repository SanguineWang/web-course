package com.entity;

public class User {
  private  String id;
  private String key;
  private int isadmin ;
  public User( String id,String name, String key , int isadmin){
      this.id=id;
      this.key=key;
      this.isadmin=isadmin;

  }
  public User(String id ,String key,int isadmin){
      this.id=id;
      this.key=key;
      this.isadmin=isadmin;
  }
    public User(String id ){
        this.id=id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public int getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(int isadmin) {
        this.isadmin = isadmin;
    }
}
