package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MIdentityKey

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContact.addKey
 */
@XmlRootElement(name="MContactaddKeyReq")
@XmlType(name="MContactaddKeyReq")
//#SWG#@ApiModel(description = "Request message for service JContact.addKey")
class MContactaddKeyReq extends Serializable {

	/**
	 * tmpId used to identify the task
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contactId: String =_
	def withcontactId(p:String):MContactaddKeyReq ={ 	this.contactId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var ik: MIdentityKey =_
	def withik(p:MIdentityKey):MContactaddKeyReq ={ 	this.ik = p; 	this }

}