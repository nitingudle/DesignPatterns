package com.nitin.creational.prototype;

public class JobSeeker
{
    private String  name;
    private String  email;
    private long    phone;
    private boolean attended;

    public JobSeeker(String name, String email, long phone, boolean attended)
    {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.attended = attended;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public long getPhone()
    {
        return phone;
    }
    public boolean isAttended()
    {
        return attended;
    }
}
