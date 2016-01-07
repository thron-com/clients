package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetContent
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetContentDetail
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetCuePoints
import it.newvision.nvp.webtv.services.model.playlist.MResponsePlayListDescriptor
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetDownloadableContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetRecommendedContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetSimilarContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetPlaylistContents

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is optimized for the delivery, and provide a set of services to
 * get the content detail information necessary for Thron Player.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/delivery/ </li>
 * </ul>
 */
@Path("/delivery")
//#SWG#@Api(value = "/delivery", description = """This service is optimized for the delivery, and provide a set of services to get the content detail information necessary for Thron Player. 
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/delivery/ </li>
//#SWGNL#</ul>""")
trait JDelivery extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Deprecated by "getContentDetail" service.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional.If the user desires to have the content description for a specific locale.
	 * The desired locale is return as first element of the array (if exists).
	 * The service always return all available locales of the content.
	 * @param channelType : String
	 * Optional
	 * @param userAgent : String
	 * Possible values are: mobile/desktop/other. If channelType and userAgent are empty, the default
	 * userAgent is desktop
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @return MResponseDeliveryGetContent
	*/
	@GET
	@Path("/getContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContent", notes = """Deprecated by "getContentDetail" service.""", response = classOf[MResponseDeliveryGetContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def getContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional.If the user desires to have the content description for a specific locale. 
	//#SWGNL#The desired locale is return as first element of the array (if exists).
	//#SWGNL#The service always return all available locales of the content.""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("channelType")
	channelType: String, 
			//#SWG#@ApiParam(value = """Possible values are: mobile/desktop/other. If channelType and userAgent are empty, the default userAgent is desktop""")
	@QueryParam("userAgent")
	userAgent: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetContent*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContent") 
		try{	
			val resp = this.__getContent(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,channelType,userAgent,pkey)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContent)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContent(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, channelType: String, userAgent: String, pkey: String) :MResponseDeliveryGetContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContent: String

	/**
	 * The service is used to return all content's metadata, aggregated with the specific channel details
	 * (like thumbnails url, descriptor urls).
	 * This service is used by THRON player to display name, content's description and to trace the events
	 * for statistics purpose. it supports jsonp callback using the callback queryparam.
	 * <b>
	 * </b><b>Limits:</b>
	 * <ul>
	 * 	<li>It does not return the list of comments associated with the content. </li>
	 * </ul>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getContentDetail</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional.The service accept the xcontentId or xpublisherId as identifier of the content. One of
	 * these parameters is required
	 * @param xpublisherId : String
	 * Optional. The service accept the xcontentId or xpublisherId as identifier of the content. One of
	 * these parameters is required
	 * @param locale : String
	 * Optional.If the user desires to have the content description for a specific locale.
	 * The desired locale is return as first element of the array (if exists).
	 * The service always return all available locales of the content.
	 * @param linkedChannelType : String
	 * Optional. Used to know the number of linekdcontents available on some channels.The list of values
	 * is represented as comma separated value, and the attribute is optional. If the parameter is empty
	 * the service return the number of all linkedcontents.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS

	 * @param linkedUserAgent : String
	 * Optional. Used to know the number linkedcontents available/compliant with a specific userAgent.
	 * 
	 * linkedUserAgent="mobile" falls back in channelypes:
	 * 1. STREAMHTTPIOSHD
	 * 2. STREAMHTTPIOS
	 * 3. WEBIPHONEHD
	 * 4. WEBIPHONE
	 * 
	 * linkedUserAgent="other" used with old mobile devices like Blackberry and Android.It falls back in
	 * channelTypes:
	 * 1. WEBIPHONEHD
	 * 2. WEBIPHONE
	 * 
	 * linkedUserAgent="web" used with desktop device with flash player and it falls back in channelTypes:
	 * 
	 * 1. STREAMHTTPFLASHHD
	 * 2. STREAMHTTPFLASH
	 * 3. WEBHD
	 * 4. WEB

	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return MResponseDeliveryGetContentDetail
	*/
	@GET
	@Path("/getContentDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContentDetail", notes = """The service is used to return all content's metadata, aggregated with the specific channel details (like thumbnails url, descriptor urls). 
	//#SWGNL#This service is used by THRON player to display name, content's description and to trace the events for statistics purpose. it supports jsonp callback using the callback queryparam.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>It does not return the list of comments associated with the content. </li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getContentDetail</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetContentDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional.The service accept the xcontentId or xpublisherId as identifier of the content. One of these parameters is required""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional. The service accept the xcontentId or xpublisherId as identifier of the content. One of these parameters is required""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional.If the user desires to have the content description for a specific locale. 
	//#SWGNL#The desired locale is return as first element of the array (if exists).
	//#SWGNL#The service always return all available locales of the content.""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. Used to know the number of linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional. If the parameter is empty the service return the number of all linkedcontents.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	//#SWGNL#""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Optional. Used to know the number linkedcontents available/compliant with a specific userAgent.
	//#SWGNL#
	//#SWGNL#linkedUserAgent="mobile" falls back in channelypes:
	//#SWGNL#1. STREAMHTTPIOSHD
	//#SWGNL#2. STREAMHTTPIOS
	//#SWGNL#3. WEBIPHONEHD
	//#SWGNL#4. WEBIPHONE
	//#SWGNL#
	//#SWGNL#linkedUserAgent="other" used with old mobile devices like Blackberry and Android.It falls back in channelTypes:
	//#SWGNL#1. WEBIPHONEHD
	//#SWGNL#2. WEBIPHONE
	//#SWGNL#
	//#SWGNL#linkedUserAgent="web" used with desktop device with flash player and it falls back in channelTypes:
	//#SWGNL#1. STREAMHTTPFLASHHD
	//#SWGNL#2. STREAMHTTPFLASH
	//#SWGNL#3. WEBHD
	//#SWGNL#4. WEB
	//#SWGNL#""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Append u/l to get the thumbnail just above/below the limits specified.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the main linked content
	//#SWGNL#This parameter is used to have the descriptor of a linked/recommended content. The ACL of a recommended content are validated on the context of the main content.""")
	@QueryParam("lcid")
	lcid: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetContentDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContentDetail") 
		try{	
			val resp = this.__getContentDetail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,divArea,pkey,lcid)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentDetail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentDetail(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, divArea: String, pkey: String, lcid: String) :MResponseDeliveryGetContentDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentDetail: String

	/**
	 * The service is used to return the thumbnail for a specific content fitting a given area (display
	 * area). Authentication token is not required (X-TOKENID).
	 * The service return HTTP status:
	 * * 400: in case of invalid arguments
	 * * 404: in case of content
	 * * 500: in case of generic errors
	 * * 307: redirect to the resource.
	 * 
	 * The service returns a default thumbnail for contents without specific thumbnails. 
	 * @param tokenId : String
	 * @param clientId : String
	 * @param divArea : String
	 * Define the area where the thumbnail should be displayed. The service will return the thumbnail
	 * whose size will be the closest to the div area, choosing it among those available within the
	 * platform, priority is set to the biggest thumbnail available. Nonetheless, there is a method to
	 * force the lower or the upper thumbnail closest to your <div> size, among those available: you just
	 * have to append "u" (upper) or "l" (lower) next to your divArea.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 * DivArea format 0x0 means the thumbs in the smallest format.

	 * @param id : String
	 * The service accept the xpublisherId or xcontentId of the content. One of these parameters is
	 * required and shold end with ".jpg" label
	 * Example: .../219f61ee-72b6-476a-be17-5cd4f9fa94f1.jpg

	 * @return java.io.File
	*/
	@GET
	@Path("/getThumbnail/{clientId}/{divArea}/{id}")
	@Produces(Array(MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getThumbnail", notes = """The service is used to return the thumbnail for a specific content fitting a given area (display area). Authentication token is not required (X-TOKENID).
	//#SWGNL#The service return HTTP status:
	//#SWGNL#* 400: in case of invalid arguments
	//#SWGNL#* 404: in case of content
	//#SWGNL#* 500: in case of generic errors
	//#SWGNL#* 307: redirect to the resource.
	//#SWGNL#
	//#SWGNL#The service returns a default thumbnail for contents without specific thumbnails. """, response = classOf[java.io.File])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getThumbnail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Define the area where the thumbnail should be displayed. The service will return the thumbnail whose size will be the closest to the div area, choosing it among those available within the platform, priority is set to the biggest thumbnail available. Nonetheless, there is a method to force the lower or the upper thumbnail closest to your <div> size, among those available: you just have to append "u" (upper) or "l" (lower) next to your divArea.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	//#SWGNL#DivArea format 0x0 means the thumbs in the smallest format.
	//#SWGNL#""")
	@PathParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """The service accept the xpublisherId or xcontentId of the content. One of these parameters is required and shold end with ".jpg" label
	//#SWGNL#Example: .../219f61ee-72b6-476a-be17-5cd4f9fa94f1.jpg
	//#SWGNL#""")
	@PathParam("id")
	id: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = java.io.File*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getThumbnail") 
		try{	
			val resp = this.__getThumbnail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,divArea,id)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getThumbnail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getThumbnail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getThumbnail(tokenId: String, clientId: String, divArea: String, id: String) :java.io.File
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getThumbnail: String

	/**
	 * The service is used to return the content cuepoints for a public content.
	 * The REST webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getCuePoints</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param cuePointTypes : String
	 * Optional. List of comma separated values
	 * @param actions : String
	 * Optional. List of commaseparated values
	 * @param startTime : Integer
	 * Optional
	 * @param endTime : Integer
	 * Optional
	 * @param draft : Boolean
	 * Optional
	 * @param username : String
	 * Optional
	 * @param cuePointGroup : String
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the cuepoints of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return MResponseDeliveryGetCuePoints
	*/
	@GET
	@Path("/getCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getCuePoints", notes = """The service is used to return the content cuepoints for a public content.
	//#SWGNL#The REST webservice is enabled for jsonp callback using the callback queryparam
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getCuePoints</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetCuePoints])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getCuePoints(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. List of comma separated values""")
	@QueryParam("cuePointTypes")
	cuePointTypes: String, 
			//#SWG#@ApiParam(value = """Optional. List of commaseparated values""")
	@QueryParam("actions")
	actions: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("startTime")
	startTime: Integer, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("endTime")
	endTime: Integer, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("draft")
	draft: Boolean, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("username")
	username: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("cuePointGroup")
	cuePointGroup: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the main linked content
	//#SWGNL#This parameter is used to have the cuepoints of a linked/recommended content. The ACL of a recommended content are validated on the context of the main content.""")
	@QueryParam("lcid")
	lcid: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetCuePoints*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getCuePoints") 
		try{	
			val resp = this.__getCuePoints(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,cuePointTypes,actions,startTime,endTime,draft,username,cuePointGroup,offset,numberOfResult,pkey,lcid)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getCuePoints)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getCuePoints)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getCuePoints(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, cuePointTypes: String, actions: String, startTime: Integer, endTime: Integer, draft: Boolean, username: String, cuePointGroup: String, offset: Integer, numberOfResult: Integer, pkey: String, lcid: String) :MResponseDeliveryGetCuePoints
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getCuePoints: String

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xpublisherId : String
	 * @param xcontentId : String
	 * @param locale : String
	 * @param withItemMetadatas : Boolean
	 * Optional. Default = false
	 * Used to decide to get the ItemDetail.metadata information or not.
	 * @param categoryIdForAcl : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @param authServiceForCallback : String
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @return MResponsePlayListDescriptor
	*/
	@GET
	@Path("getPlayListDescriptor")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	def getPlayListDescriptor(@HeaderParam("X-TOKENID")
	tokenId: String, 
			@QueryParam("clientId")
	clientId: String, 
			@QueryParam("xpublisherId")
	xpublisherId: String, 
			@QueryParam("xcontentId")
	xcontentId: String, 
			@QueryParam("locale")
	locale: String, 
			@QueryParam("withItemMetadatas")
	withItemMetadatas: Boolean, 
			@QueryParam("categoryIdForAcl")
	categoryIdForAcl: String, 
			@QueryParam("offset")
	offset: Integer, 
			@QueryParam("numberOfResult")
	numberOfResult: Integer, 
			@QueryParam("channelType")
	channelType: String, 
			@HeaderParam("X-CLIENTIPV4")
	clientIPv4: String, 
			@HeaderParam("X-CLIENTIPV6")
	clientIPv6: String, 
			@QueryParam("userAgent")
	userAgent: String, 
			@HeaderParam("X-AUTHSERVICEFORCALLBACK")
	authServiceForCallback: String, 
			@QueryParam("divArea")
	divArea: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponsePlayListDescriptor*/ = { throw new it.newvision.core.dictionary.exceptions.WebApplicationException("service not implemented") }

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_getPlayListDescriptor: String

	/**
	 * The service is used to return only the content subtitles in srt format for a public content and for
	 * a single locale.
	 * Subtitles are archived as cuepoints but this service is used to return the list in the standard srt
	 * format
	 * The REST webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getSubTitles</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. the subtitles locale
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the subtitles of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return String
	*/
	@GET
	@Path("/getSubTitles")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getSubTitles", notes = """The service is used to return only the content subtitles in srt format for a public content and for a single locale.
	//#SWGNL#Subtitles are archived as cuepoints but this service is used to return the list in the standard srt format
	//#SWGNL#The REST webservice is enabled for jsonp callback using the callback queryparam
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getSubTitles</li>
	//#SWGNL#</ul>""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getSubTitles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. the subtitles locale""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the main linked content
	//#SWGNL#This parameter is used to have the subtitles of a linked/recommended content. The ACL of a recommended content are validated on the context of the main content.""")
	@QueryParam("lcid")
	lcid: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = String*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getSubTitles") 
		try{	
			val resp = this.__getSubTitles(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,pkey,lcid)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getSubTitles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getSubTitles)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getSubTitles(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, pkey: String, lcid: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getSubTitles: String

	/**
	 * The service is used to return the list of "Downloadable Contents" linked to a specified content
	 * without "UNLINKABLE" in MContent.properties .
	 * The REST webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.
	 * com/api/xcontents/resources/delivery/getDownloadableContents</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred locale for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * 3) content has one locale
	 * 4) otherwise contents.name, contents.locale,contents.description are empty
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param admin : Boolean
	 * Optional. disable the intrinsic filtering of the service, and return all linked contents:
	 * * downloadable
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param lcid : String
	 * Optional. the xcontentId of the parent linked content
	 * This parameter is used to have the list of downloadable contents. The ACL of a downloadable
	 * contents are validated on the context of the parent content.
	 * example:
	 * A -> has A1, A2 as recommended contents
	 * A1 -> has D1,D2 has downloadable contents
	 * 
	 * To show the list of downloadable contents of A1 (on the context fo A):
	 * xcontentId = A1
	 * lcid = A
	 * pkey = pkey/token of A
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetDownloadableContents
	*/
	@GET
	@Path("/getDownloadableContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getDownloadableContents", notes = """The service is used to return the list of "Downloadable Contents" linked to a specified content without "UNLINKABLE" in MContent.properties . 
	//#SWGNL#The REST webservice is enabled for jsonp callback using the callback queryparam
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getDownloadableContents</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetDownloadableContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getDownloadableContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred locale for the content results. 
	//#SWGNL#Locale fallback logic used in MContentWallMinimal:
	//#SWGNL#1) content has locale == locale (the parameter)
	//#SWGNL#2) content has locale == EN
	//#SWGNL#3) content has one locale
	//#SWGNL#4) otherwise contents.name, contents.locale,contents.description are empty""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. disable the intrinsic filtering of the service, and return all linked contents:
	//#SWGNL#* downloadable
	//#SWGNL#* published or not in cdn2
	//#SWGNL#* with property NOT_LINKABLE or not
	//#SWGNL#
	//#SWGNL#Enabling this parameter, the service can be used in the admin console to show all contents linked even those unmatching the filters.""")
	@QueryParam("admin")
	admin: Boolean, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the parent linked content
	//#SWGNL#This parameter is used to have the list of downloadable contents. The ACL of a downloadable contents are validated on the context of the parent content.
	//#SWGNL#example:
	//#SWGNL#A -> has A1, A2 as recommended contents
	//#SWGNL#A1 -> has D1,D2 has downloadable contents
	//#SWGNL#
	//#SWGNL#To show the list of downloadable contents of A1 (on the context fo A):
	//#SWGNL#xcontentId = A1
	//#SWGNL#lcid = A
	//#SWGNL#pkey = pkey/token of A""")
	@QueryParam("lcid")
	lcid: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Append u/l to get the thumbnail just above/below the limits specified.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetDownloadableContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getDownloadableContents") 
		try{	
			val resp = this.__getDownloadableContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,pkey,admin,lcid,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getDownloadableContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getDownloadableContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getDownloadableContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, pkey: String, admin: Boolean, lcid: String, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetDownloadableContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getDownloadableContents: String

	/**
	 * The service is used to return the list of "Recommended Contents" linked to a specified content. The
	 * REST webservice is enabled for jsonp callback using the callback queryparam
	 * <b>
	 * </b><b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.
	 * com/api/xcontents/resources/delivery/getRecommendedContents</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * 3) content has one locale
	 * 4) otherwise contents.name, contents.locale,contents.description are empty
	 * @param linkedChannelType : String
	 * Used to filter the linekdcontents available on some channels.The list of values is represented as
	 * comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is
	 * optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * @param admin : Boolean
	 * disable the intrinsic filtering of the service, and return all linked contents:
	 * * recommended
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Default and maximum value is 50 items
	 * @return MResponseDeliveryGetRecommendedContents
	*/
	@GET
	@Path("/getRecommendedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getRecommendedContents", notes = """The service is used to return the list of "Recommended Contents" linked to a specified content. The REST webservice is enabled for jsonp callback using the callback queryparam
	//#SWGNL#<b>
	//#SWGNL#</b><b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getRecommendedContents</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetRecommendedContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getRecommendedContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred local for the content results. 
	//#SWGNL#Locale fallback logic used in MContentWallMinimal:
	//#SWGNL#1) content has locale == locale (the parameter)
	//#SWGNL#2) content has locale == EN
	//#SWGNL#3) content has one locale
	//#SWGNL#4) otherwise contents.name, contents.locale,contents.description are empty""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Used to filter the linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is optional.
	//#SWGNL#Possible values are: mobile/desktop/other""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """disable the intrinsic filtering of the service, and return all linked contents:
	//#SWGNL#* recommended
	//#SWGNL#* published or not in cdn2
	//#SWGNL#* with property NOT_LINKABLE or not
	//#SWGNL#
	//#SWGNL#Enabling this parameter, the service can be used in the admin console to show all contents linked even those unmatching the filters.""")
	@QueryParam("admin")
	admin: Boolean, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Append u/l to get the thumbnail just above/below the limits specified.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetRecommendedContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getRecommendedContents") 
		try{	
			val resp = this.__getRecommendedContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,pkey,admin,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getRecommendedContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getRecommendedContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getRecommendedContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, pkey: String, admin: Boolean, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetRecommendedContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getRecommendedContents: String

	/**
	 * DEPRECATED. Only for clients with 3.x release.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * @param linkedChannelType : String
	 * Optional. Used to filter the linekdcontents available on some channels.The list of values is
	 * represented as comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The
	 * attribute is optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetSimilarContents
	*/
	@GET
	@Path("/getSimilarContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getSimilarContents", notes = """DEPRECATED. Only for clients with 3.x release.""", response = classOf[MResponseDeliveryGetSimilarContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getSimilarContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred local for the content results. 
	//#SWGNL#Locale fallback logic used in MContentWallMinimal:
	//#SWGNL#1) content has locale == locale (the parameter)
	//#SWGNL#2) content has locale == EN""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. Used to filter the linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is optional.
	//#SWGNL#Possible values are: mobile/desktop/other""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Append u/l to get the thumbnail just above/below the limits specified.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetSimilarContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getSimilarContents") 
		try{	
			val resp = this.__getSimilarContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,pkey,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getSimilarContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getSimilarContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getSimilarContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, pkey: String, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetSimilarContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getSimilarContents: String

	/**
	 * The service is used to return the list of "Playlist items" linked to a specified Playlist. The REST
	 * webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * <b>
	 * </b><b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.
	 * com/api/xcontents/resources/delivery/getPlaylistContents</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * 3) content has one locale
	 * 4) otherwise contents.name, contents.locale,contents.description are empty
	 * @param linkedChannelType : String
	 * Optional. Used to filter the linekdcontents available on some channels.The list of values is
	 * represented as comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The
	 * attribute is optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * Optional.
	 * @param admin : Boolean
	 * Optional. disable the intrinsic filtering of the service, and return all linked contents:
	 * * recommended
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetPlaylistContents
	*/
	@GET
	@Path("/getPlaylistContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getPlaylistContents", notes = """The service is used to return the list of "Playlist items" linked to a specified Playlist. The REST webservice is enabled for jsonp callback using the callback queryparam
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>
	//#SWGNL#<b>
	//#SWGNL#</b><b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getPlaylistContents</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetPlaylistContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPlaylistContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred local for the content results. 
	//#SWGNL#Locale fallback logic used in MContentWallMinimal:
	//#SWGNL#1) content has locale == locale (the parameter)
	//#SWGNL#2) content has locale == EN
	//#SWGNL#3) content has one locale
	//#SWGNL#4) otherwise contents.name, contents.locale,contents.description are empty""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. Used to filter the linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is optional.
	//#SWGNL#Possible values are: mobile/desktop/other""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. disable the intrinsic filtering of the service, and return all linked contents:
	//#SWGNL#* recommended
	//#SWGNL#* published or not in cdn2
	//#SWGNL#* with property NOT_LINKABLE or not
	//#SWGNL#
	//#SWGNL#Enabling this parameter, the service can be used in the admin console to show all contents linked even those unmatching the filters.""")
	@QueryParam("admin")
	admin: Boolean, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Append u/l to get the thumbnail just above/below the limits specified.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetPlaylistContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getPlaylistContents") 
		try{	
			val resp = this.__getPlaylistContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,pkey,admin,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getPlaylistContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPlaylistContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPlaylistContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, pkey: String, admin: Boolean, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetPlaylistContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPlaylistContents: String

}