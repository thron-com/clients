package it.newvision.nvp.xcontents.services.model.provider
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MEProvider
import it.newvision.nvp.xcontents.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseProvider") 
@XmlType(name="MResponseProvider")
//#SWG#@ApiModel(description = """""")
class MResponseProvider extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEProvider =_
	def withresultCode(p:MEProvider):MResponseProvider ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):MResponseProvider ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):MResponseProvider ={ 	this.errorDescription = p; 	this }

}