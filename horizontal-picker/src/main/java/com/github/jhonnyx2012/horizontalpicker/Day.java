package com.github.jhonnyx2012.horizontalpicker;

import org.joda.time.DateTime;

import java.util.Locale;

/**
 * Created by jhonn on 28/02/2017.
 */
public class Day {
    private DateTime date;
    private boolean selected;

    public Day(DateTime date) {
        this.date = date;
    }

    public String getDay() {
        return String.valueOf(date.getDayOfMonth());
    }

    public String getWeekDay() {
        return date
                .toString("EEE", Locale.getDefault())
                .toUpperCase();
    }

    public String getMonth() {
        return date.toString("MMMM YYYY", Locale.getDefault());
    }

    public DateTime getDate() {
        return date.withTime(0, 0, 0, 0);
    }

    public boolean isToday() {
        DateTime today = new DateTime().withTime(0, 0, 0, 0);
        return getDate().getMillis() == today.getMillis();
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
