    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class Verdict {
    // Attributes
    private String caseTitle;
    private String studentVerdict;
    private String reason;
    
    /**
     * Verdict object is created using empty values
     */
    public Verdict(){
        caseTitle = "";
        studentVerdict = "";
        reason = "";
    }
    
    /**
     * Verdict object is created using user values
     * @param caseTitle TItle for the case
     * @param verdict User's opinion on the case
     * @param reason User's reasoning for the case
     */
    public Verdict (String caseTitle, String verdict, String reason) {
        this.caseTitle = caseTitle;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    /**
     * Method sets a value to the title of the case
     * @param title The title of the case is used as a parameter
     */
    public void setCaseTitle(String title) {
        caseTitle = title;
    }
    
    /**
     * Method returns name of case
     * @return title of case is returned
     */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /**
     * Methods sets a string to the reasoning for user verdict
     * @param reason The reasoning the user gave for their verdict is used as a parameter
     */
    public void setReason (String reason) {
        this.reason = reason;
    }
    
    /**
     * Method gets value entered for reason
     * @return The value of reason is returned
     */
    public String getReason () {
        return reason;
    }
    
    /**
     * Method sets a value to the user's verdict
     * @param verdict The answer the user gives is used as the parameter
     */
    public void setStudentVerdict(String verdict) {
        studentVerdict = verdict;
    }
    
    /**
     * Methods returns the user's verdict
     * @return The value of the user's verdict is returned
     */
    public String getStudentVerdict () {
        return studentVerdict;
    }
    
    @Override
    /**
     * Method changes the output of program when printing out a verdict object
     */
    public String toString(){
        return caseTitle + "," + studentVerdict + "," + reason;
    }
}
