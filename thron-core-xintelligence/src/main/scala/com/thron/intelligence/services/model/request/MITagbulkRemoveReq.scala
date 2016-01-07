package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.MITagBulkValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITag.bulkRemove
 */
@XmlRootElement(name="MITagbulkRemoveReq")
@XmlType(name="MITagbulkRemoveReq")
//#SWG#@ApiModel(description = "Request message for service JITag.bulkRemove")
class MITagbulkRemoveReq extends Serializable {

	/**
	 * An existing targetId for a specific classification
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MITagBulkValue =_
	def withvalue(p:MITagBulkValue):MITagbulkRemoveReq ={ 	this.value = p; 	this }

}