/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class IntellectualPropertyCase extends EthicsCase{
    // Attributes
    private String ipType;
    
    /**
     * Constructor for intellectual property case
     * @param caseTitle title of the case
     * @param description description of case
     * @param ipType type of intellectual property for the case
     */
    public IntellectualPropertyCase(String caseTitle, String description, String ipType){
        super(caseTitle, description, "Intellectual Property and digital ownership");
        this.ipType = ipType;
    }
    
    /**
     * Getter for property type
     * @return the intellectual property type of the case is returned
     */
    public String getIpType(){
    return ipType;
}

    @Override
    /**
     * toString method to print out case info
     * @return The case info is printed out along with the type of intellectual property
     */
    public String toString(){
        return super.toString() + " | Intellectual property issue: " + ipType;
    }
}
