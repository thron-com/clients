package it.newvision.nvp.webtv.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.sync.MSyncCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JSync.contents
 */
@XmlRootElement(name="MSynccontentsReq")
@XmlType(name="MSynccontentsReq")
//#SWG#@ApiModel(description = "Request message for service JSync.contents")
class MSynccontentsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MSynccontentsReq ={ 	this.clientId = p; 	this }

	/**
	 * Required
	 */
	//#SWG#@ApiModelProperty(value = """Required""", required = true)
	@BeanProperty
	var fromDate: Date =_
	def withfromDate(p:Date):MSynccontentsReq ={ 	this.fromDate = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var toDate: Date =_
	def withtoDate(p:Date):MSynccontentsReq ={ 	this.toDate = p; 	this }

	/**
	 * filter options
	 */
	//#SWG#@ApiModelProperty(value = """filter options""", required = true)
	@BeanProperty
	var criteria: MSyncCriteria =_
	def withcriteria(p:MSyncCriteria):MSynccontentsReq ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MSynccontentsReq ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):MSynccontentsReq ={ 	this.numberOfResults = p; 	this }

}