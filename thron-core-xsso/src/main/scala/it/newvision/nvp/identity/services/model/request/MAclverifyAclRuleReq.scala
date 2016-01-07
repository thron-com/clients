package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.acl.MAclRuleItem

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAcl.verifyAclRule
 */
@XmlRootElement(name="MAclverifyAclRuleReq")
@XmlType(name="MAclverifyAclRuleReq")
//#SWG#@ApiModel(description = "Request message for service JAcl.verifyAclRule")
class MAclverifyAclRuleReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAclverifyAclRuleReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var rule: MAclRuleItem =_
	def withrule(p:MAclRuleItem):MAclverifyAclRuleReq ={ 	this.rule = p; 	this }

}