package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentVerifyExternalId") 
@XmlType(name="MResponseContentVerifyExternalId")
//#SWG#@ApiModel(description = """""")
class MResponseContentVerifyExternalId extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var defined: Boolean =_
	def withdefined(p:Boolean):this.type ={ 	this.defined = p; 	this }

}