package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionDetail
import com.thron.intelligence.services.model.request.MIMetadataDefinitioninsertReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinition
import com.thron.intelligence.services.model.request.MIMetadataDefinitionlinkITagReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionList
import com.thron.intelligence.services.model.request.MIMetadataDefinitionlistReq
import com.thron.intelligence.services.model.metadata.MEMetadataDefinitionOrderBy
import com.thron.intelligence.services.model.request.MIMetadataDefinitionupdateReq
import com.thron.intelligence.services.model.request.MIMetadataDefinitionchangeTypeReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataVerifyIfUsed

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Services used to handle custom Metadata Definition for a specific
 * classification
 * 
 * <b>Role Validation:</b>
 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/imetadatadefinition/       </li>
 * </ul>
 */
@Path("/imetadatadefinition")
//#SWG#@Api(value = "/imetadatadefinition", description = """Services used to handle custom Metadata Definition for a specific classification
//#SWGNL#
//#SWGNL#<b>Role Validation:</b>
//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xintelligence/resources/imetadatadefinition/       </li>
//#SWGNL#</ul>""")
trait JIMetadataDefinition extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * @return MResponseMetadataDefinitionDetail
	*/
	@GET
	@Path("/detail/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,classificationId,id)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, classificationId: String, id: String) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Create a new IMetadataDefinition for a given classification. The metadata definition can be linked
	 * automatically to a specific tag of the same classification
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataDefinitioninsertReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	@POST
	@Path("/insert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Create a new IMetadataDefinition for a given classification. The metadata definition can be linked automatically to a specific tag of the same classification
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MIMetadataDefinitioninsertReq):Response /*returnType = MResponseMetadataDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insert(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insert)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insert)
	    }
	} 

	@GET
	@Path("/insert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insert_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadataDefinitioninsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, classificationId: String, param: MIMetadataDefinitioninsertReq) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Used to link a IMetadataDefinition to a specific ITagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the metadata definition of type KEY can be linked to one single ITagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id, prettyId or externalKey
	 * @param metadataId : String
	 * Metadata Definition id
	 * @param param : MIMetadataDefinitionlinkITagReq
	 * @return MResponseMetadataDefinition
	*/
	@POST
	@Path("/linkITag/{clientId}/{classificationId}/{itagId}/{metadataId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/linkITag", notes = """Used to link a IMetadataDefinition to a specific ITagDefinition.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the metadata definition of type KEY can be linked to one single ITagDefinition.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinition])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def linkITag(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id, prettyId or externalKey""")
	@PathParam("itagId")
	itagId: String, 
			//#SWG#@ApiParam(value = """Metadata Definition id""")
	@PathParam("metadataId")
	metadataId: String, 
			param: MIMetadataDefinitionlinkITagReq):Response /*returnType = MResponseMetadataDefinition*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__linkITag(tokenId,clientId,classificationId,itagId,metadataId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_linkITag)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_linkITag)
	    }
	} 

	@GET
	@Path("/linkITag/{clientId}/{classificationId}/{itagId}/{metadataId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def linkITag_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id, prettyId or externalKey""")
	@PathParam("itagId")
	itagId: String,
			//#SWG#@ApiParam(value = """Metadata Definition id""")
	@PathParam("metadataId")
	metadataId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinition*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__linkITag(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,metadataId,PRestHelper.bindRequest[MIMetadataDefinitionlinkITagReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_linkITag)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_linkITag)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __linkITag(tokenId: String, clientId: String, classificationId: String, itagId: String, metadataId: String, param: MIMetadataDefinitionlinkITagReq) :MResponseMetadataDefinition
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_linkITag: String

	/**
	 * Lists the client's IMetadataDefinition for a specific classification. This method return the
	 * IMetadataDefinition matching the given search criteria.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataDefinitionlistReq
	 * @return MResponseMetadataDefinitionList
	*/
	@POST
	@Path("/list/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """Lists the client's IMetadataDefinition for a specific classification. This method return the IMetadataDefinition matching the given search criteria.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseMetadataDefinitionList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MIMetadataDefinitionlistReq):Response /*returnType = MResponseMetadataDefinitionList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__list(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_list)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_list)
	    }
	} 

	@GET
	@Path("/list/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def list_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadataDefinitionlistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, classificationId: String, param: MIMetadataDefinitionlistReq) :MResponseMetadataDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Lists the client's IMetadataDefinition for a specific classification.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param text : String
	 * Optional
	 * Search criteria
	 * @param lang : String
	 * Optional.

	 * @param ids : String
	 * Optional. csv list of Attribute.id
	 * Search criteria
	 * @param itagIds : String
	 * Optional. csv list of Tag.id
	 * Search criteria
	 * @param orderBy : MEMetadataDefinitionOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseMetadataDefinitionList
	*/
	@GET
	@Path("/listGet/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/listGet", notes = """Lists the client's IMetadataDefinition for a specific classification.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseMetadataDefinitionList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listGet(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Optional
	//#SWGNL#Search criteria""")
	@QueryParam("text")
	text: String, 
			//#SWG#@ApiParam(value = """Optional.
	//#SWGNL#""")
	@QueryParam("lang")
	lang: String, 
			//#SWG#@ApiParam(value = """Optional. csv list of Attribute.id
	//#SWGNL#Search criteria""")
	@QueryParam("ids")
	ids: String, 
			//#SWG#@ApiParam(value = """Optional. csv list of Tag.id
	//#SWGNL#Search criteria""")
	@QueryParam("itagIds")
	itagIds: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("orderBy")
	orderBy: MEMetadataDefinitionOrderBy, 
			//#SWG#@ApiParam(value = """Optional.
	//#SWGNL#Default value is 0""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default value is 50""")
	@QueryParam("limit")
	limit: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseMetadataDefinitionList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("listGet") 
		try{	
			val resp = this.__listGet(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,classificationId,text,lang,ids,itagIds,orderBy,offset,limit)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listGet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listGet)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listGet(tokenId: String, clientId: String, classificationId: String, text: String, lang: String, ids: String, itagIds: String, orderBy: MEMetadataDefinitionOrderBy, offset: Integer, limit: Integer) :MResponseMetadataDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listGet: String

	/**
	 * move to trash. This operation unlink the IMetadataDefinition from all linked ITagDefinition.
	 * This operation does not remove the instances of metadata linked to a specific entity
	 * (content/user/contact...), so it's possible to restore the metadata using the untrash service.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Metadata definition id
	 * @return MResponseMetadataDefinition
	*/
	@POST
	@Path("/trash/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/trash", notes = """move to trash. This operation unlink the IMetadataDefinition from all linked ITagDefinition.
	//#SWGNL#This operation does not remove the instances of metadata linked to a specific entity (content/user/contact...), so it's possible to restore the metadata using the untrash service.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinition])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def trash(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Metadata definition id""")
	@PathParam("id")
	id: String):Response /*returnType = MResponseMetadataDefinition*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__trash(tokenId,clientId,classificationId,id)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_trash)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_trash)
	    }
	} 

	@GET
	@Path("/trash/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def trash_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Metadata definition id""")
	@PathParam("id")
	id: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinition*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__trash(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_trash)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_trash)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __trash(tokenId: String, clientId: String, classificationId: String, id: String) :MResponseMetadataDefinition
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_trash: String

	/**
	 * Unlink a given IMetadataDefinition from a ITagDefition inside a classification.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param metadataId : String
	 * Metadata definition id
	 * @return MResponseMetadataDefinition
	*/
	@POST
	@Path("/unlinkITag/{clientId}/{classificationId}/{itagId}/{metadataId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/unlinkITag", notes = """Unlink a given IMetadataDefinition from a ITagDefition inside a classification.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinition])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unlinkITag(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("itagId")
	itagId: String, 
			//#SWG#@ApiParam(value = """Metadata definition id""")
	@PathParam("metadataId")
	metadataId: String):Response /*returnType = MResponseMetadataDefinition*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unlinkITag(tokenId,clientId,classificationId,itagId,metadataId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unlinkITag)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unlinkITag)
	    }
	} 

	@GET
	@Path("/unlinkITag/{clientId}/{classificationId}/{itagId}/{metadataId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unlinkITag_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("itagId")
	itagId: String,
			//#SWG#@ApiParam(value = """Metadata definition id""")
	@PathParam("metadataId")
	metadataId: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinition*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__unlinkITag(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,metadataId	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_unlinkITag)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unlinkITag)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unlinkITag(tokenId: String, clientId: String, classificationId: String, itagId: String, metadataId: String) :MResponseMetadataDefinition
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unlinkITag: String

	/**
	 * Restore a IMetadataDefinition from the trash
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Metadata Definition id
	 * @return MResponseMetadataDefinition
	*/
	@POST
	@Path("/untrash/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/untrash", notes = """Restore a IMetadataDefinition from the trash
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinition])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def untrash(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Metadata Definition id""")
	@PathParam("id")
	id: String):Response /*returnType = MResponseMetadataDefinition*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__untrash(tokenId,clientId,classificationId,id)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_untrash)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_untrash)
	    }
	} 

	@GET
	@Path("/untrash/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def untrash_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Metadata Definition id""")
	@PathParam("id")
	id: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinition*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__untrash(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_untrash)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_untrash)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __untrash(tokenId: String, clientId: String, classificationId: String, id: String) :MResponseMetadataDefinition
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_untrash: String

	/**
	 * The service is used to change:
	 * <ul>
	 * 	<li>names definition</li>
	 * 	<li>visibility option</li>
	 * 	<li>constraints, and options</li>
	 * 	<li>metadataType</li>
	 * 	<li>metadata key</li>
	 * </ul>
	 * 
	 * Changing the properties of a IMetadataDefinition like options, metadataType and key, does not imply
	 * any changes on metada added to entities (contents, users or categories). This means that the
	 * inserted value should be updated by the client.
	 * 
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Metadata definition id
	 * @param param : MIMetadataDefinitionupdateReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	@POST
	@Path("/update/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """The service is used to change:
	//#SWGNL#<ul>
	//#SWGNL#	<li>names definition</li>
	//#SWGNL#	<li>visibility option</li>
	//#SWGNL#	<li>constraints, and options</li>
	//#SWGNL#	<li>metadataType</li>
	//#SWGNL#	<li>metadata key</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Changing the properties of a IMetadataDefinition like options, metadataType and key, does not imply any changes on metada added to entities (contents, users or categories). This means that the inserted value should be updated by the client.
	//#SWGNL#
	//#SWGNL#The "update" field of this web service works in “patch" mode: it means that each and everyone of the "update" attributes you want to change must be included in the body of the request, those not included will not be updated.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Metadata definition id""")
	@PathParam("id")
	id: String, 
			param: MIMetadataDefinitionupdateReq):Response /*returnType = MResponseMetadataDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,classificationId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Metadata definition id""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MIMetadataDefinitionupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, classificationId: String, id: String, param: MIMetadataDefinitionupdateReq) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Change a given iMetadataDefinition in a different metadataType.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's possible to change the metadataType if the metadataDefinition is not used in any entity.
	 * </li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataDefinitionchangeTypeReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	@POST
	@Path("/changeType/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeType", notes = """Change a given iMetadataDefinition in a different metadataType.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>it's possible to change the metadataType if the metadataDefinition is not used in any entity.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeType(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MIMetadataDefinitionchangeTypeReq):Response /*returnType = MResponseMetadataDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeType(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeType)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeType)
	    }
	} 

	@GET
	@Path("/changeType/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeType_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changeType(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadataDefinitionchangeTypeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changeType)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeType)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeType(tokenId: String, clientId: String, classificationId: String, param: MIMetadataDefinitionchangeTypeReq) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeType: String

	/**
	 * Verify if the given iMetadataDefinition is used in the platform. Only iMetadataDefinition not used
	 * can be removed or changed the metadataDefinitioType
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param key : String
	 * @return MResponseMetadataVerifyIfUsed
	*/
	@POST
	@Path("/verifyIfUsed/{clientId}/{classificationId}/{key}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verifyIfUsed", notes = """Verify if the given iMetadataDefinition is used in the platform. Only iMetadataDefinition not used can be removed or changed the metadataDefinitioType
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseMetadataVerifyIfUsed])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyIfUsed(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("key")
	key: String):Response /*returnType = MResponseMetadataVerifyIfUsed*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verifyIfUsed(tokenId,clientId,classificationId,key)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verifyIfUsed)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verifyIfUsed)
	    }
	} 

	@GET
	@Path("/verifyIfUsed/{clientId}/{classificationId}/{key}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verifyIfUsed_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("key")
	key: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataVerifyIfUsed*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__verifyIfUsed(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,key	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_verifyIfUsed)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyIfUsed)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyIfUsed(tokenId: String, clientId: String, classificationId: String, key: String) :MResponseMetadataVerifyIfUsed
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyIfUsed: String

}