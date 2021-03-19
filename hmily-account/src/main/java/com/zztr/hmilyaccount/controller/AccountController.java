package com.zztr.hmilyaccount.controller;

import com.zztr.hmilyaccount.dto.AccountDTO;
import com.zztr.hmilyaccount.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AccountController {
    @Autowired
    private IAccountService accountService;

    /**
     * 支付
     * @param
     * @return
     */
    @GetMapping("/payment")
    public Boolean payment(String userId, Double amount){
        System.out.println("userId:" + userId);
        System.out.println("amount:" + amount);
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setUserId(userId);
        accountDTO.setAmount(new BigDecimal(amount));
        return accountService.payment(accountDTO);
    }
}
