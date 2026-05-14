/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343084331
 */
public class IntellectualPropertyCase extends EthicsCase{
    private String ipType;
    public IntellectualPropertyCase(String caseTitle, String description, String ipType){
        super(caseTitle, description, "IntellectualProperty");
        this.ipType = ipType;
    }
    public String getIpType(){
    return ipType;
}
    public String toString(){
        return super.getCaseTitle();
    }
}
