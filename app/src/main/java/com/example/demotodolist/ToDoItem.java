package com.example.demotodolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ToDoItem {
    private String title;
    private Calendar date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;

    }
    private String getDay(int day) {
        switch (day) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return "";
        }
    }

    public String getDatetoString(){
        Date dateA = this.date.getTime();
        SimpleDateFormat formatA = new SimpleDateFormat(("dd/MM/yy"));
        String dateStr = formatA.format(dateA);
        return dateStr;

    }
    public String getDaytoString(){
        String dateA = this.getDaytoString();
        return dateA;

    }



    }
