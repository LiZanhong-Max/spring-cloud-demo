package com.zztr.hmilystock.service;

import com.zztr.hmilystock.dto.InventoryDTO;
import com.zztr.hmilystock.mapper.InventoryMapper;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService implements IInventoryService{
    @Autowired
    private InventoryMapper inventoryMapper;

    /**
     * 扣减库存
     * @param inventoryDTO
     * @return
     */
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    @Override
    public Boolean decrease(InventoryDTO inventoryDTO){
        //总库存-支出，冻结库存+支出
        System.out.println("扣减库存预处理：总库存-支出，冻结库存+支出");
        inventoryMapper.decrease(inventoryDTO);
        return true;
    }

    public Boolean confirm(InventoryDTO inventoryDTO){
        //冻结库存-支出
        System.out.println("扣减库存成功");
        return inventoryMapper.confirm(inventoryDTO) > 0;
    }

    public Boolean cancel(InventoryDTO inventoryDTO){
        //总库存+支出，冻结库存-支出
        System.out.println("扣减库存失败");
        return inventoryMapper.cancel(inventoryDTO) > 0;
    }
}
