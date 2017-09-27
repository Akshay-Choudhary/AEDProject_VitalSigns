package business;

/**
 *
 * @author akshay
 */
public class Patient {
    
    private String patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;
    private VitalSignHistory vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }
    
    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
    
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
