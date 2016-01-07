package it.newvision.nvp.xpublisher.services.model.request
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
 * Request message for service JWeeboPublisherAdmin.publishTextFile
 */
@XmlRootElement(name="MWeeboPublisherAdminpublishTextFileReq")
@XmlType(name="MWeeboPublisherAdminpublishTextFileReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.publishTextFile")
class MWeeboPublisherAdminpublishTextFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdminpublishTextFileReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdminpublishTextFileReq ={ 	this.pContentId = p; 	this }

	/**
	 * desired fileName with extension.
	 */
	//#SWG#@ApiModelProperty(value = """desired fileName with extension.""", required = true)
	@BeanProperty
	var fileName: String =_
	def withfileName(p:String):MWeeboPublisherAdminpublishTextFileReq ={ 	this.fileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var fileContent: String =_
	def withfileContent(p:String):MWeeboPublisherAdminpublishTextFileReq ={ 	this.fileContent = p; 	this }

}