package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.msg.MEPublishWeebo
import it.newvision.nvp.xadmin.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePublishWeebo") 
@XmlType(name="MResponsePublishWeebo")
//#SWG#@ApiModel(description = """""")
class MResponsePublishWeebo extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEPublishWeebo  = MEPublishWeebo.OK
	def withresultCode(p:MEPublishWeebo):MResponsePublishWeebo ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO  = MESSO.OK
	def withssoCode(p:MESSO):MResponsePublishWeebo ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):MResponsePublishWeebo ={ 	this.errorDescription = p; 	this }

}