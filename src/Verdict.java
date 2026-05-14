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
    
    // Constructor
    public Verdict(){
        
    }
    
    // Filled constructor
    public Verdict (String caseTitle, String verdict, String reason) {
        this.caseTitle = caseTitle;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    // Setters and getters
    public void setCaseTitle(String title) {
        caseTitle = title;
    }
    
    public String getCaseTitle() {
        return caseTitle;
    }
    
    public void setReason (String reason) {
        this.reason = reason;
    }
    
    public String getReason () {
        return reason;
    }
    
    public void setStudentVerdict(String verdict) {
        studentVerdict = verdict;
    }
    
    public String getStudentVerdict () {
        return studentVerdict;
    }
    
    // toString
    public String toString(){
        return "";
    }
}
