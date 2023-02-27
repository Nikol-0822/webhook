package com.m4g.webhook.Controller;

import com.m4g.webhook.Models.MessageWebhook;
import com.m4g.webhook.Models.Request;
import com.m4g.webhook.Repository.MessageWebhookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class MessageWebhookController {

    @Autowired
    MessageWebhookRepository messageWebhookRepository;


    @Value("${VERIFY_TOKEN}")
    private String token;

    @Value("${TOKEN}")
    private String tokenwsp;

    @GetMapping("/webhook")
    @ResponseBody
    public ResponseEntity<?> verify(@RequestParam("hub.mode") String mode,@RequestParam("hub.verify_token") String verify_token,
                                    @RequestParam("hub.challenge") String challenge){
        if (mode!=null && verify_token!=null){
            if (mode.equals("subscribe") && verify_token.equals(token)){
                System.out.println("OK");
                return ResponseEntity.ok(challenge);
            }
        }
        return ResponseEntity.status(403).body(null);
    }

    @PostMapping("/webhook")
    public String webhook(@RequestBody Request request) throws Exception{

        String uri = "https://graph.facebook.com/v15.0/106967018968001/messages ";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + tokenwsp);
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestJson = "{\"messaging_product\": \"whatsapp\", \"to\": \"" + request.getEntry()[0].getChanges()[0].getValue().getMessages()[0].getFrom()
                + "\", \"text\": { \"body\": \"" + request.getEntry()[0].getChanges()[0].getValue().getMessages()[0].getText().getBody()
                + "\" }}";

        // Create HttpEntity Using JSON body and Authentication (Bearer Token) Header
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);

        // Call the WhatsAPP API

        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);

        return response.getBody();
    }
}
