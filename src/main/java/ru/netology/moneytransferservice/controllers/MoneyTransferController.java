package ru.netology.moneytransferservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.moneytransferservice.Services.MoneyTransferService;
import ru.netology.moneytransferservice.models.Response;

@RestController
public class MoneyTransferController {
    final MoneyTransferService service;

    public MoneyTransferController(MoneyTransferService service) {
        this.service = service;
    }

    @GetMapping("/transfer")
    public Response callTransfer() {
        Response response = new Response();
        return response;
    }

    @GetMapping("/confirmOperation")
    public Response confirmTransfer() {
        Response response = new Response();
        return response;
    }
}
