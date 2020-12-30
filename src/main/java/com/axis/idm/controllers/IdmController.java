package com.axis.idm.controllers;

import reactor.core.publisher.Mono;
import com.axis.idm.response.IdmResponse;
import com.axis.idm.exception.IdmException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class IdmController {

    @RequestMapping(value = "/idmPost", method = RequestMethod.POST)
    public Mono<? extends Object> getIdmResponse(@RequestBody String request) throws IdmException {

        if (checkFailure() || request == null) {
            throw new IdmException("Internal Server Error", "Internal Server Error in Idm");
        } else {
            try {
                Thread.sleep(5000);
                IdmResponse response = new IdmResponse("Idm Success", "200", "1000");
                return Mono.just(response.toString()).log();
            } catch (InterruptedException e) {

            }
        }
        return Mono.empty();
    }

    private Boolean checkFailure() {
        Random random = new Random();
        int value = random.nextInt(100);
        if (value % 11 == 0) {
            return true;
        }
        return false;
    }
}
