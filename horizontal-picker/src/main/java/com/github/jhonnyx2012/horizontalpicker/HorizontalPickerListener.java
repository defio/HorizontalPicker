package com.github.jhonnyx2012.horizontalpicker;

import org.joda.time.DateTime;

/**
 * Created by jhonn on 02/03/2017.
 */
public interface HorizontalPickerListener {
    void onStopDraggingPicker();

    void onDraggingPicker();

    void onDateSelected(DateTime item);
}