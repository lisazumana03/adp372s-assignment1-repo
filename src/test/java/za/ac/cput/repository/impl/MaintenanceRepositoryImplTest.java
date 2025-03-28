package za.ac.cput.repository.impl;
/*
 * Sibulele Gift Nohamba (220374686)
 * Date: 25/03/2025
 * */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Maintenance;
import za.ac.cput.factory.MaintenanceFactory;
import za.ac.cput.repository.MaintenanceRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class MaintenanceRepositoryImplTest {
    private MaintenanceRepository repository;
    private Maintenance maintenance;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @BeforeEach
     void setUpRepository() throws ParseException {
        Date serviceDate = dateFormat.parse("2025-3-12");
        repository = MaintenanceRepositoryImpl.getRepository();
        maintenance = MaintenanceFactory.createMaintenance(24, 54, serviceDate, "Minor service", 350.00, "In the workshop", "Alvin Lewis");
        repository.create(maintenance);
    }
       @Test
       void create() throws ParseException{
        Date serviceDate = dateFormat.parse("2025-3-12");

        Maintenance newMaintenance = MaintenanceFactory.createMaintenance(14, 46, serviceDate, "Major service", 750.00, "Done", "Scott Roman");
        Maintenance createdMaintenance = repository.create(newMaintenance);
        assertNotNull(createdMaintenance);
        assertEquals(2, createdMaintenance.getMaintenanceId());
    }
    @Test
    void read() {
        Maintenance readMaintenance = repository.read(maintenance.getMaintenanceId());
        assertNotNull(readMaintenance);
        assertEquals(maintenance.getMaintenanceId(), readMaintenance.getMaintenanceId());
    }
        @Test
    void update() {
        Maintenance updatedMaintenance = new Maintenance.Builder()
                .setMaintenanceID(maintenance.getMaintenanceId())
                .setCarID(67)
                .setServiceDate(maintenance.getServiceDate())
                .setDescription(maintenance.getDescription())
                .setCost(maintenance.getCost())
                .setStatus(maintenance.getStatus())
                .setMechanic(maintenance.getMechanic())
                .build();
        Maintenance result = repository.update(updatedMaintenance);
        assertNotNull(result);
        assertEquals(67, result.getCarID());
    }
    @Test
    void delete() {
        repository.delete(maintenance.getMaintenanceId());
        Maintenance deletedMaintenance = repository.read(maintenance.getMaintenanceId());
        assertNull(deletedMaintenance);
   }


}