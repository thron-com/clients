package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUser
import it.newvision.nvp.identity.model.MUsersGroup

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserDetail") 
@XmlType(name="MResponseVUserDetail")
//#SWG#@ApiModel(description = """""")
class MResponseVUserDetail extends MResponseVUser with Serializable  {

	/**
	 * return the vuser detail without the password information, for security reason.
	 */
	//#SWG#@ApiModelProperty(value = """return the vuser detail without the password information, for security reason.""")
	@BeanProperty 
	var user: MVUser =_
	def withuser(p:MVUser):MResponseVUserDetail ={ 	this.user = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedGroups: List[MUsersGroup] = new ArrayList[MUsersGroup]
	def withlinkedGroups(p:List[MUsersGroup]):MResponseVUserDetail ={ 	this.linkedGroups = p; 	this }

	/**
	 * Total number of linkedGroups of the user.
	 */
	//#SWG#@ApiModelProperty(value = """Total number of linkedGroups of the user.""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):MResponseVUserDetail ={ 	this.totalResults = p; 	this }

}