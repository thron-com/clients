package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMetadata
import it.newvision.nvp.xadmin.model.MAppDisguiseData
import it.newvision.nvp.xadmin.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * App update class
 */
@XmlRootElement(name="MAppUpdateData") 
@XmlType(name="MAppUpdateData")
//#SWG#@ApiModel(description = """App update class""")
class MAppUpdateData extends MUpdater with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):MAppUpdateData ={ 	this.active = p; 	this }

	/**
	 * prettyId for the APP
	 */
	//#SWG#@ApiModelProperty(value = """prettyId for the APP""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):MAppUpdateData ={ 	this.prettyId = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var urlThumbnail: String =_
	def withurlThumbnail(p:String):MAppUpdateData ={ 	this.urlThumbnail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):MAppUpdateData ={ 	this.displayName = p; 	this }

	/**
	 * custom description of the app
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the app""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MAppUpdateData ={ 	this.description = p; 	this }

	/**
	 * the white list of the allowed domain where the app can run.
	 * The domain check is applied on JApp.loginSnippet
	 */
	//#SWG#@ApiModelProperty(value = """the white list of the allowed domain where the app can run.
	//#SWGNL#The domain check is applied on JApp.loginSnippet""")
	@BeanProperty 
	var domainsWhiteList: List[String] =_
	def withdomainsWhiteList(p:List[String]):MAppUpdateData ={ 	this.domainsWhiteList = p; 	this }

	/**
	 * generic metadata linked to the app
	 */
	//#SWG#@ApiModelProperty(value = """generic metadata linked to the app""")
	@BeanProperty 
	var metadata: List[MMetadata] =_
	def withmetadata(p:List[MMetadata]):MAppUpdateData ={ 	this.metadata = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):MAppUpdateData ={ 	this.url = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var canDisguise: Boolean =_
	def withcanDisguise(p:Boolean):MAppUpdateData ={ 	this.canDisguise = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var disguiseData: MAppDisguiseData =_
	def withdisguiseData(p:MAppDisguiseData):MAppUpdateData ={ 	this.disguiseData = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(prettyId).forall(s => s.length<=50 && s.matches("""^[\w\-]*$"""))
	}

}