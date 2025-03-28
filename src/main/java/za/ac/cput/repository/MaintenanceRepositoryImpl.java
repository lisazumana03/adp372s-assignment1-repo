package za.ac.cput.repository;
/*
 * Sibulele Gift Nohamba (220374686)
 * Date: 27/03/2025
 * */
import za.ac.cput.domain.Maintenance;
import java.util.HashMap;
        
        
public class MaintenanceRepositoryImpl implements MaintenanceRepository {
  private static MaintenanceRepositoryImpl repository = null;
    private HashMap<Integer, Maintenance> maintenanceDB;
    private MaintenanceRepositoryImpl() {
        this.maintenanceDB = new HashMap<>();
        }

    public static MaintenanceRepository getRepository() {
        if (repository == null){
            repository = new MaintenanceRepositoryImpl();
        }
        return repository;
         }
     @Override
    public Maintenance create(Maintenance maintenance) {
        if(maintenance == null || maintenanceDB.containsKey(maintenance.getMaintenanceId())) {
            return null;
        }
        maintenanceDB.put(maintenance.getMaintenanceId(), maintenance);
            return maintenance;
    }
    @Override
    public Maintenance read(Integer maintenanceId) {
        return maintenanceDB.get(maintenanceId);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        if(maintenanceDB.containsKey(maintenance.getMaintenanceId())) {
        maintenanceDB.put(maintenance.getMaintenanceId(), maintenance);
        return maintenance;
        }
        return null;
    }

    @Override
    public void delete(Integer maintenanceID) {
        maintenanceDB.remove(maintenanceID);
    }
    
}