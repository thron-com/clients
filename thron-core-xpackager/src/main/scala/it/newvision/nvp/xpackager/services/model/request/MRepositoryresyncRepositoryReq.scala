package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRepositoryresyncRepositoryReq") 
 @XmlType(name="MRepositoryresyncRepositoryReq")
class MRepositoryresyncRepositoryReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MRepositoryresyncRepositoryReq ={ 	this.clientId = p; 	this }

}