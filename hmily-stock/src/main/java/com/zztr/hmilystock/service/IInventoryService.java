package com.zztr.hmilystock.service;

import com.zztr.hmilystock.dto.InventoryDTO;

public interface IInventoryService {
    public Boolean decrease(InventoryDTO inventoryDTO);
}
