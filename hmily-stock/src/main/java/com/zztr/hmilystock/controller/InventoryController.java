package com.zztr.hmilystock.controller;

import com.zztr.hmilystock.dto.InventoryDTO;
import com.zztr.hmilystock.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    /**
     * 扣减库存
     * @param
     * @return
     */
    @GetMapping("/decrease")
    public Boolean decrease(@RequestParam("productId") String productId,
                            @RequestParam("count") Integer count){
        System.out.println(productId);
        System.out.println(count);
        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setProductId(productId);
        inventoryDTO.setCount(count);
        return inventoryService.decrease(inventoryDTO);
    }
}
