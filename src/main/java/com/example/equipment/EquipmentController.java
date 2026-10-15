package com.example.equipment;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipmentController {
    private final EquipmentRepository repository;
    private final String version;

    public EquipmentController(EquipmentRepository repository,
            @Value("${APP_VERSION:local}") String version) {
        this.repository = repository;
        this.version = version;
    }

    @GetMapping("/api/equipment")
    public List<Equipment> findAll() {
        return repository.findAll(Sort.by("id"));
    }

    @GetMapping("/api/version")
    public Map<String, String> version() {
        return Map.of("version", version);
    }
}
