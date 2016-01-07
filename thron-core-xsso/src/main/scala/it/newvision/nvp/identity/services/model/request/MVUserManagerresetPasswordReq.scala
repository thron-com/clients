package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.resetPassword
 */
@XmlRootElement(name="MVUserManagerresetPasswordReq")
@XmlType(name="MVUserManagerresetPasswordReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.resetPassword")
class MVUserManagerresetPasswordReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MVUserManagerresetPasswordReq ={ 	this.clientId = p; 	this }

	/**
	 * Optional. the username
	 */
	//#SWG#@ApiModelProperty(value = """Optional. the username""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MVUserManagerresetPasswordReq ={ 	this.username = p; 	this }

}