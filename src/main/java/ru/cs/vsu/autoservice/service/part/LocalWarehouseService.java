package ru.cs.vsu.autoservice.service.part;

import org.springframework.stereotype.Service;
import ru.cs.vsu.autoservice.repository.part.LocalWarehouseRepository;

@Service
public class LocalWarehouseService {

    private final LocalWarehouseRepository localWarehouseRepository;

    public LocalWarehouseService(LocalWarehouseRepository localWarehouseRepository) {
        this.localWarehouseRepository = localWarehouseRepository;
    }

    public void loadAllSomeObjectsToSearch() {
//        var parts = localWarehouseRepository.findAll();
//        var saveUpdateContent = parts.map { it.toSaveUpdateContent() }
//        var request = SearchActualizationRequest(
//                ActualizationTypeEnum.SAVE_UPDATE,
//                SearchActualizationEntityTypeEnum.SOME_ENTITY,
//                saveUpdateContent
//        ;
//        actualizationSender.send(request);
    }

}
