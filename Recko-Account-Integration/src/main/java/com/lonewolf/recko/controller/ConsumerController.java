package com.lonewolf.recko.controller;

import com.lonewolf.recko.entity.Consumer;
import com.lonewolf.recko.model.PartnerNameRepository;
import com.lonewolf.recko.model.exception.ReckoException;
import com.lonewolf.recko.service.ConsumerService;
import com.lonewolf.recko.util.ResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin
public class ConsumerController {

    private final ConsumerService service;

    @Autowired
    public ConsumerController(ConsumerService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public List<Consumer> controlGetConsumers(@PathVariable("id") String companyId) {
        return service.getConsumers(companyId);
    }

    @GetMapping("/{id}/{partner}")
    public List<Consumer> controlGetPartnerConsumers(@PathVariable("partner") PartnerNameRepository nameRepository,
                                                     @PathVariable("id") String companyId) {
        return service.getPartnerConsumers(nameRepository, companyId);
    }

    @GetMapping("/{partner}/types")
    public List<String> controlGetAccountTypes(@PathVariable("partner") PartnerNameRepository nameRepository) {
        return service.getAccountTypes(nameRepository);
    }

    @PostMapping("/create")
    public Consumer controlAddConsumer(@RequestBody Consumer consumer) {
        return service.addConsumer(consumer);
    }

    @PatchMapping("/update")
    public Consumer controlUpdateConsumer(@RequestBody Consumer consumer) {
        return service.updateConsumer(consumer);
    }

    @PatchMapping("/delete")
    public ResponseEntity<Map<String, String>> controlDeleteConsumer(@RequestBody Consumer consumer) {
        boolean isDeleted = service.deleteConsumer(consumer);
        if (!isDeleted) {
            throw new ReckoException("account couldn't be deleted", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseGenerator.generateResponse("account deleted successfully", HttpStatus.OK, false);
    }
}
