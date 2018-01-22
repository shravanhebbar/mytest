

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


 
public class java8fun3 {
    public static void main(String[] args) {
       
        Predicate<String> emailFilter = Pattern
                                        .compile("^(.+)@example.com$")
                                        .asPredicate();
 
        
        List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com",
                            "cat@google.com", "david@example.com");
 
        
        List<String> desiredEmails = emails
                                    .stream()
                                    .filter(emailFilter)
                                    .collect(Collectors.toList());
 
        
        desiredEmails.forEach(System.out::println);
        Pattern pattern = Pattern.compile("^(.+)@example.com$");
        
        
          
        for(String email : emails)
        {
            java.util.regex.Matcher matcher = pattern.matcher(email);
             
            if(matcher.matches())
            {
                System.out.println(email);
            }
        }
    }
}