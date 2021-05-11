package L15HW14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface FinanceReportAnotation {

    String[] tags() default "";
    String updatedBy() default "creator";
    String lastUpdated() default "12/12/2020";
    String maxSum() default "1000000";
    String  minSum() default "0.01";}








