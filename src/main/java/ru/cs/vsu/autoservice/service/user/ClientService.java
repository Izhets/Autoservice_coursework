package ru.cs.vsu.autoservice.service.user;

import org.springframework.stereotype.Service;
import ru.cs.vsu.autoservice.model.dto.request.user.ClientCreateRequest;
import ru.cs.vsu.autoservice.model.entity.ClientEntity;
import ru.cs.vsu.autoservice.model.entity.UserEntity;
import ru.cs.vsu.autoservice.model.factories.ClientCreateRequestFactory;
import ru.cs.vsu.autoservice.repository.user.ClientRepository;
import ru.cs.vsu.autoservice.repository.user.UserRepository;


@Service
public class ClientService {

    private final UserRepository userRepository;
    private final ClientRepository clientRepository;
    private final ClientCreateRequestFactory clientCreateRequestFactory;

    public ClientService(UserRepository userRepository, ClientRepository clientRepository, ClientCreateRequestFactory clientCreateRequestFactory) {
        this.userRepository = userRepository;
        this.clientRepository = clientRepository;
        this.clientCreateRequestFactory = clientCreateRequestFactory;
    }

    public ClientCreateRequest createClient(ClientCreateRequest clientCreateDto){

        UserEntity user = userRepository.save(
                UserEntity.builder()
                        .firstName(clientCreateDto.getFirstName())
                        .lastName(clientCreateDto.getLastName())
                        .email(clientCreateDto.getEmail())
                        .password(clientCreateDto.getPassword())
                        .build()
        );

        ClientEntity client = clientRepository.save(
                ClientEntity.builder()
                        .userId(user.getId())
                        .phoneNumber(clientCreateDto.getPhoneNumber())
                        .build()
        );

        return clientCreateRequestFactory.makeClientDto(client, user);
    }

}
