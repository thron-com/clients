package it.newvision.nvp.xcontents.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindContentByMetadata") 
@XmlType(name="MResponseFindContentByMetadata")
//#SWG#@ApiModel(description = """""")
class MResponseFindContentByMetadata extends MResponseMetadata with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContent] = new ArrayList[MContent]
	def withcontents(p:List[MContent]):MResponseFindContentByMetadata ={ 	this.contents = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):MResponseFindContentByMetadata ={ 	this.totalResults = p; 	this }

}