package com.test1;

public class EdgeLocationDetails {
	private Integer edgeLocationId;
	private Integer edgeLocationCode;
	private String cachingPolicy;
	private String cacheInvalidationMethod;
	private String cacheBehaviour;
	private String albAsOrigin;
	private String ec2AsOrigin;
	private String ecsAsOrigin;
	private String geoRestriction;
	private String signedURL;
	private String cookies;
	private String keyGroups;
	private String realTimeLogging;
	private String logFlow;

	public EdgeLocationDetails() {

	}

	public EdgeLocationDetails(Integer edgeLocationId, Integer edgeLocationCode, String cachingPolicy,
			String cacheInvalidationMethod, String cacheBehaviour, String albAsOrigin, String ec2AsOrigin,
			String ecsAsOrigin, String geoRestriction, String signedURL, String cookies, String keyGroups,
			String realTimeLogging, String logFlow) {
		super();
		this.edgeLocationId = edgeLocationId;
		this.edgeLocationCode = edgeLocationCode;
		this.cachingPolicy = cachingPolicy;
		this.cacheInvalidationMethod = cacheInvalidationMethod;
		this.cacheBehaviour = cacheBehaviour;
		this.albAsOrigin = albAsOrigin;
		this.ec2AsOrigin = ec2AsOrigin;
		this.ecsAsOrigin = ecsAsOrigin;
		this.geoRestriction = geoRestriction;
		this.signedURL = signedURL;
		this.cookies = cookies;
		this.keyGroups = keyGroups;
		this.realTimeLogging = realTimeLogging;
		this.logFlow = logFlow;
	}

	public Integer getEdgeLocationId() {
		return edgeLocationId;
	}

	public void setEdgeLocationId(Integer edgeLocationId) {
		this.edgeLocationId = edgeLocationId;
	}

	public Integer getEdgeLocationCode() {
		return edgeLocationCode;
	}

	public void setEdgeLocationCode(Integer edgeLocationCode) {
		this.edgeLocationCode = edgeLocationCode;
	}

	public String getCachingPolicy() {
		return cachingPolicy;
	}

	public void setCachingPolicy(String cachingPolicy) {
		this.cachingPolicy = cachingPolicy;
	}

	public String getCacheInvalidationMethod() {
		return cacheInvalidationMethod;
	}

	public void setCacheInvalidationMethod(String cacheInvalidationMethod) {
		this.cacheInvalidationMethod = cacheInvalidationMethod;
	}

	public String getCacheBehaviour() {
		return cacheBehaviour;
	}

	public void setCacheBehaviour(String cacheBehaviour) {
		this.cacheBehaviour = cacheBehaviour;
	}

	public String getAlbAsOrigin() {
		return albAsOrigin;
	}

	public void setAlbAsOrigin(String albAsOrigin) {
		this.albAsOrigin = albAsOrigin;
	}

	public String getEc2AsOrigin() {
		return ec2AsOrigin;
	}

	public void setEc2AsOrigin(String ec2AsOrigin) {
		this.ec2AsOrigin = ec2AsOrigin;
	}

	public String getEcsAsOrigin() {
		return ecsAsOrigin;
	}

	public void setEcsAsOrigin(String ecsAsOrigin) {
		this.ecsAsOrigin = ecsAsOrigin;
	}

	public String getGeoRestriction() {
		return geoRestriction;
	}

	public void setGeoRestriction(String geoRestriction) {
		this.geoRestriction = geoRestriction;
	}

	public String getSignedURL() {
		return signedURL;
	}

	public void setSignedURL(String signedURL) {
		this.signedURL = signedURL;
	}

	public String getCookies() {
		return cookies;
	}

	public void setCookies(String cookies) {
		this.cookies = cookies;
	}

	public String getKeyGroups() {
		return keyGroups;
	}

	public void setKeyGroups(String keyGroups) {
		this.keyGroups = keyGroups;
	}

	public String getRealTimeLogging() {
		return realTimeLogging;
	}

	public void setRealTimeLogging(String realTimeLogging) {
		this.realTimeLogging = realTimeLogging;
	}

	public String getLogFlow() {
		return logFlow;
	}

	public void setLogFlow(String logFlow) {
		this.logFlow = logFlow;
	}

}
