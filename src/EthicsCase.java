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
    
    /**
     * Constructor for ethics cases
     * @param caseTitle title of case
     * @param description description of case
     * @param category category of case
     */
    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict(); // Empty verdict created
    }
    
    /**
     * Getter for case title
     * @return the case title is returned
     */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /**
     * Getter for description
     * @return the case description is returned
     */
    public String getCaseDescription() {
        return description;
    }
    
    /**
     * Getter for category
     * @return the case category is returned
     */
    public String getCategory() {
        return category;
    }
    
    @Override
    /**
     * toString method to print out the values set in the case
     * @return The case's title, category, and verdict and printed out in a formatted sentence
     */
    public String toString() {
        return "Case title: " + caseTitle + " | Category: " + category + "| Your verdict was: " + verdict.getStudentVerdict();
    }
}
