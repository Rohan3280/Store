package com.codein.store;

public class User {
    Long id;
    String email;
    String Password;
    String Name;

    public void User(Long id ,String email, String Password, String Name)
    {
        this.id=id;
        this.email=email;
        this.Password=Password;
        this.Name=Name;
    }
    public Long getId(Long id)
    {
        return id;
    }
    public String getEmail(String email)
    {
        return email;
    }
    public String getPassword(String Password)
    {
        return Password;
    }
    public String getName(String Name)
    {
        return Name;
    }



}
