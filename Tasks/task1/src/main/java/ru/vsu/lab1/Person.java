package ru.vsu.lab1;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;

import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * Created by 1 on 21.11.2017.
 */
public class Person {

    protected String name;
    protected int id;
    protected Date db;

    public Person() {
    }

    public Person(String n, int id, Date db) {
        this.name = n;
        this.id = id;
        this.db = db;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setDb(String d) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        try {
            this.db = format.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date setDb2(String d) throws ParseException {
        setDb(d);
        return db;
    }

    public String getDb() {
        DateFormat df = new SimpleDateFormat("MM.dd.yyyy");
        return df.format(db);
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(db);
        return Years.yearsBetween(new LocalDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)), new LocalDate()).getYears();
    }
}
