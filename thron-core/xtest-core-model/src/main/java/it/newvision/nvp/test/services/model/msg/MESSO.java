package it.newvision.nvp.test.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESSO") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESSO {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AUTHENTICATION_ERROR") AUTHENTICATION_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SESSION_EXPIRED") SESSION_EXPIRED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALID_TOKENID") INVALID_TOKENID,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CAPABILITY_NOT_ALLOWED") CAPABILITY_NOT_ALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("POLICY_NOT_ALLOWED") POLICY_NOT_ALLOWED
}