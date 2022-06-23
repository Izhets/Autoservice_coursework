package ru.cs.vsu.autoservice.service.part;

import org.springframework.stereotype.Service;
import ru.cs.vsu.autoservice.model.dto.PartDto;
import ru.cs.vsu.autoservice.model.entity.PartEntity;
import ru.cs.vsu.autoservice.model.factories.PartDtoFactory;
import ru.cs.vsu.autoservice.repository.part.PartRepository;

@Service
public class PartService {

    private final PartRepository partRepository;
    private final PartDtoFactory partDtoFactory;

    public PartService(PartRepository partRepository, PartDtoFactory partDtoFactory) {
        this.partRepository = partRepository;
        this.partDtoFactory = partDtoFactory;
    }

    public PartDto addPart(PartDto partDto){

        PartEntity part = partRepository.save(
                PartEntity.builder()
                        .id(partDto.getId())
                        .name(partDto.getName())
                        .catalogNumber(partDto.getCatalogNumber())
                        .type(partDto.getType())
                        .build()
        );

        return partDtoFactory.makePartDto(partRepository.save(part));
    }

    public void deletePart(Long id) {
        partRepository.deleteById(id);
    }

}
