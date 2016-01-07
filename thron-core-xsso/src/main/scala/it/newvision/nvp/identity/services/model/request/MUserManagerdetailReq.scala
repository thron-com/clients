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
 * Request message for service JUserManager.detail
 */
@XmlRootElement(name="MUserManagerdetailReq")
@XmlType(name="MUserManagerdetailReq")
//#SWG#@ApiModel(description = "Request message for service JUserManager.detail")
class MUserManagerdetailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MUserManagerdetailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MUserManagerdetailReq ={ 	this.username = p; 	this }

	/**
	 * Optional. Used to filer the user capabilities by solution (PLAY,VIEW,TALK,MOVE)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to filer the user capabilities by solution (PLAY,VIEW,TALK,MOVE)""", required = true)
	@BeanProperty
	var solutionId: String =_
	def withsolutionId(p:String):MUserManagerdetailReq ={ 	this.solutionId = p; 	this }

}