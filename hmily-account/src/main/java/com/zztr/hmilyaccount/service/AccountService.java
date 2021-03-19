package com.zztr.hmilyaccount.service;

import com.zztr.hmilyaccount.dto.AccountDTO;
import com.zztr.hmilyaccount.mapper.AccountMapper;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService{
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 支付
     * @param accountDTO
     * @return
     */
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    @Override
    public Boolean payment(final AccountDTO accountDTO){
        //账户余额-消耗，冻结余额+消耗
        System.out.println("支付预处理：账户余额-消耗，冻结余额+消耗");
        accountMapper.update(accountDTO);
        //如果要做支付失败的测试，抛出HmilyRuntimeException即可
        //throw new HmilyRuntimeException("支付出错");
        return Boolean.TRUE;
    }

    public Boolean confirm(final AccountDTO accountDTO){
        //冻结余额-消耗
        System.out.println("支付成功");
        return accountMapper.confirm(accountDTO) > 0;
    }

    public Boolean cancel(final AccountDTO accountDTO){
        //账户余额+消耗，冻结余额-消耗
        System.out.println("支付失败");
        return accountMapper.cancel(accountDTO) > 0;
    }
}
