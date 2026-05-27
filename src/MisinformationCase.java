/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class MisinformationCase extends EthicsCase{
    // Attributes
    private String mediaType;
    
    /**
     * Constructor for misinformation case
     * @param caseTitle title of case
     * @param description description of case
     * @param mediaType type of media for the case
     */
    public MisinformationCase(String caseTitle, String description, String mediaType){
        super(caseTitle, description, "Misinformation and digital deception");
        this.mediaType = mediaType;
    }
    
    /**
     * getter for media type
     * @return the type of media for the case is returned
     */
    public String getMediaType(){
    return mediaType;
}

    
    @Override
    /**
     * toString method to print out info about the case
     * @return the case info is returned along with the media type of the case
     */
    public String toString(){
    return super.toString() + " | Media type: " + mediaType;
}
}