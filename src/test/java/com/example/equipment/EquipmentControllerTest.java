package com.example.equipment;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class EquipmentControllerTest {
    @Test
    void apiReturnsDatabaseRecordsAsJson() throws Exception {
        EquipmentRepository repository = mock(EquipmentRepository.class);
        when(repository.findAll(Sort.by("id"))).thenReturn(
            List.of(new Equipment(1L, "Projector", "A101", 2)));
        var mvc = MockMvcBuilders.standaloneSetup(
            new EquipmentController(repository, "practice-test")).build();
        mvc.perform(get("/api/equipment"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].name").value("Projector"))
            .andExpect(jsonPath("$[0].quantity").value(2));
    }

    @Test
    void apiReportsConfiguredVersion() throws Exception {
        var mvc = MockMvcBuilders.standaloneSetup(new EquipmentController(
            mock(EquipmentRepository.class), "commit-123")).build();
        mvc.perform(get("/api/version"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.version").value("commit-123"));
    }
}
