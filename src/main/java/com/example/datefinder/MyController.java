package com.example.datefinder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
    @GetMapping("/")
    public String getdate(){
        LocalDate todate= (LocalDate.now()).plusDays(100);
        DateTimeFormatter fomaterrr=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String result=todate.format(fomaterrr);
        return result;
    }
}
