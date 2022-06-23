package ru.cs.vsu.autoservice.controllers.part;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cs.vsu.autoservice.service.part.LocalWarehouseService;

@RestController
@RequestMapping("/localWarehouse")
public class LocalWarehouseController {

    private final LocalWarehouseService localWarehouseService;

    public LocalWarehouseController(LocalWarehouseService localWarehouseService) {
        this.localWarehouseService = localWarehouseService;
    }

    @GetMapping
    @Operation(summary = "Loads all SomeObjects and send to Search service")
    public void loadAllSomeObjectsToSearch() {
        localWarehouseService.loadAllSomeObjectsToSearch();
    }

}
