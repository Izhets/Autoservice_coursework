package ru.cs.vsu.autoservice.controllers.part;

import org.springframework.web.bind.annotation.*;
import ru.cs.vsu.autoservice.model.dto.PartDto;
import ru.cs.vsu.autoservice.service.part.PartService;


@RestController
@RequestMapping("/part")
public class PartController {

    private final PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @PostMapping
    public PartDto addPart(@RequestBody PartDto partDto){
        return partService.addPart(partDto);
    }

    @DeleteMapping("/{id}")
    public void deletePart(@PathVariable Long id){
        partService.deletePart(id);
    }


}
