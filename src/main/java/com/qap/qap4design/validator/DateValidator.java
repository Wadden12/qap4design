package com.qap.qap4design.validator;

import java.time.LocalDate;

public interface DateValidator {

    int startDateBeforeEndDateCheck(LocalDate startDate, LocalDate endDate);
}
