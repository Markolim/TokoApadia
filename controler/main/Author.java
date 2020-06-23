package lambdasinaction.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String name();

}

/* This is the beginning of a
multi-line comment
this is the end */
@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {

    Author[] value();

}




  /* The Beginning
   This is my first computer program
   written entirely in Java. I am so
   proud of myself
  The End */
