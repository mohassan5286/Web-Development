package com.example.Email.Controller;

import com.example.Email.Services.IMail;
import com.example.Email.Services.MailDTO;
import com.example.Email.Services.MailFactory;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class ShowMails {

    @Autowired
    MailFactory mailFactory;

    @PostMapping("showMails")
    public List<JsonNode> showMails(@RequestBody MailDTO data) throws IOException {

        String type = data.getType() ;

        IMail mail = mailFactory.getMail(type, data) ;

        List<JsonNode> mailList = mail.showMails() ;

        return mailList ;

    }

}
