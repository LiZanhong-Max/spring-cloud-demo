package com.zztr.hmilyaccount.service;

import com.zztr.hmilyaccount.dto.AccountDTO;

public interface IAccountService {
    public Boolean payment(final AccountDTO accountDTO);
}
