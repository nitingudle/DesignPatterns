package com.nitin.creational.prototype;

import java.util.List;

public class Main
{
    public static void main(String are[]) throws Exception
    {
        JobSeekers jobSeekers = new JobSeekers();
        List<JobSeeker> list = jobSeekers.load();
        List<JobSeeker> copy = jobSeekers.clone();
        System.out.print("Origanal " + list.size()+" ");
        jobSeekers.toString();
        System.out.println("Removing 1st ");
        list.remove(0);
        System.out.print("After Remove " + list.size()+" ");
        jobSeekers.toString();

        System.out.print("Clone " + copy.size()+" ");
        System.out.print("[ ");
        for (JobSeeker j : copy)
        {
            System.out.print(j.getName() + " ");
        }
        System.out.println(" ]");
    }
}
