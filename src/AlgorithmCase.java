/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class AlgorithmCase  extends EthicsCase{
    // Attributes
    private String biasType;
    
    /**
     * Algorithm case object constructor
     * @param caseTitle title of the case
     * @param description description of the case
     * @param biasType type of algorithm bias/fairness for the case
     */
    public AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "Algorithmic bias and fairness");
        this.biasType = biasType;
    }
    /**
     * Getter method for bias type
     * @return The bias type of the case is returned
     */
    public String getBiasType(){
       return biasType; 
    }
    
    @Override
    /**
     * toString method to print out info
     * @return The case info from parent class is returned along with the bias type of case
     */
    public String toString(){
        return super.toString() + " | Bias type: " + biasType;
    }
}
