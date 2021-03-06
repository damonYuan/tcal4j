/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.damonyuan.tcal;

import com.damonyuan.tcal.calendar.UnitedStates;
import com.damonyuan.tcal.time.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class tcalTest {
    @Test
    public void someLibraryMethodReturnsTrue() {
        assertEquals("1.0.0", Tcal.getVersion());

        Date startDate = new Date(15, 1, 2005);
        Date endDate = new Date(15, 1, 2006);
        Period period = new Period(Frequency.Monthly);
        Calendar calendar = new UnitedStates();
        BusinessDayConvention businessDayConvention = BusinessDayConvention.Following;
        BusinessDayConvention endDayConvention = BusinessDayConvention.Following;
        DateGeneration.Rule dateGeneration = DateGeneration.Rule.Backward;
        Boolean monthEnd = Boolean.TRUE;
        Schedule schedule = new Schedule(startDate, endDate, period, calendar, businessDayConvention, endDayConvention, dateGeneration, monthEnd);
        System.out.println(schedule.dates());
    }
}
