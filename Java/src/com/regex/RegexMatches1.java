package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Capturing Groups:
Capturing groups are a way to treat multiple characters as a single unit. 
They are created by placing the characters to be grouped inside a set of 
parentheses. For example, the regular expression (dog) creates a single 
group containing the letters "d", "o", and "g".

Capturing groups are numbered by counting their opening parentheses 
from left to right. In the expression ((A)(B(C))), 
for example, there are four such groups:

((A)(B(C)))

(A)

(B(C))

(C)

To find out how many groups are present in the expression, 
call the groupCount method on a matcher object. The groupCount method returns 
an int showing the number of capturing groups present in the matcher's pattern.

There is also a special group, group 0, which always 
represents the entire expression. This group is not included in the 
total reported by groupCount. 
  
 */

public class RegexMatches1
{
    public static void main( String args[] ){

      // String to be scanned to find the pattern.
      String line = "This order was placed for QT 3456! OK?";
      String pattern = "(.*)(\\d)(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) );
         System.out.println("Group count: " + m.groupCount());
      } else {
         System.out.println("NO MATCH");
      }
   }
}