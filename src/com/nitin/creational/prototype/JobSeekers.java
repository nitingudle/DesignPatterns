package com.nitin.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class JobSeekers implements Cloneable
{
    private List<JobSeeker> list = new ArrayList<>();

    public List<JobSeeker> load()
    {
        JobSeeker j1 = new JobSeeker("Nitin", "nitin.gudle@gmail.com", 99643707465l, false);
        JobSeeker j2 = new JobSeeker("Sachin", "sachin.more@gmail.com", 98468751468l, false);
        JobSeeker j3 = new JobSeeker("Viresh", "viresh.kamble@gmail.com", 94962570798l, true);
        JobSeeker j4 = new JobSeeker("Praveen", "praveen.kale@gmail.com", 9968761496l, false);
        JobSeeker j5 = new JobSeeker("Rahul", "rahul.gade@gmail.com", 99645612531l, true);
        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);
        list.add(j5);
        return list;
    }

    @Override
    protected List<JobSeeker> clone() throws CloneNotSupportedException
    {
        List<JobSeeker> list = new ArrayList<>();
        list.addAll(this.list);
        return list;
    }

    @Override
    public String toString()
    {
        System.out.print("[ ");
        for (JobSeeker j : this.list)
        {
            System.out.print(j.getName() + " ");
        }
        System.out.println(" ]");
        return "";
    }
}
