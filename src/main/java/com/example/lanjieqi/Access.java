package com.example.lanjieqi;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Access {

    String[] value() default {};

    String[] authorities() default {};

    String[] roles() default {};

}

