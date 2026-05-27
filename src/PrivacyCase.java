/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class PrivacyCase extends EthicsCase{
    // Attributes
    private String dataType;
    
    /**
     * Privacy case object is created
     * @param caseTitle title of the case
     * @param description description of the case
     * @param dataType type of data for the case
     */
    public PrivacyCase(String caseTitle, String description, String dataType){
        super(caseTitle, description, "Privacy and data protection");
        this.dataType = dataType;
    }
    /**
     * Getter for data type
     * @return Data type of case is returned
     */
    public String getDataType(){
        return dataType;
    }
    @Override
    /**
     * toString method to display text
     * @return the info of the case from the parent class and the data issue type are returned
     */
    public String toString(){
        return super.toString() + " | Data issue type: " + dataType;
    }
}

