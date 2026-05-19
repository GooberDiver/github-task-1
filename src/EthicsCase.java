/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class EthicsCase {
    // Attributes
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    
    // Constructor
    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
    }
    
    //Getters
    public String getCaseTitle() {
        return caseTitle;
    }
    
    public String getCaseDescription() {
        return description;
    }
    
    public String getCategory() {
        return category;
    }
    
    // toString for output
    public String toString() {
        return "";
    }
}
