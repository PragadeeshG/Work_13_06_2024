package com.test1;

public class EdgeLocationWatch {
	private Integer logFlowId;
	private String trailSystems;
	private String xRayEnabled;
	private String logsAgent;
	private Integer filters;
	private Integer metricFilters;
	private Integer cloudWatchAlarms;
	private String synthetics;
	private String eventBridges;
	private String multiAccountAggregation;
	private String xRayWithBeanstalk;
	private String xRayWithECS;
	private String cloudTrial;
	private String cloudTrialSecurity;

	public EdgeLocationWatch() {

	}

	public EdgeLocationWatch(Integer logFlowId, String trailSystems, String xRayEnabled, String logsAgent,
			Integer filters, Integer metricFilters, Integer cloudWatchAlarms, String synthetics, String eventBridges,
			String multiAccountAggregation, String xRayWithBeanstalk, String xRayWithECS, String cloudTrial,
			String cloudTrialSecurity) {
		super();
		this.logFlowId = logFlowId;
		this.trailSystems = trailSystems;
		this.xRayEnabled = xRayEnabled;
		this.logsAgent = logsAgent;
		this.filters = filters;
		this.metricFilters = metricFilters;
		this.cloudWatchAlarms = cloudWatchAlarms;
		this.synthetics = synthetics;
		this.eventBridges = eventBridges;
		this.multiAccountAggregation = multiAccountAggregation;
		this.xRayWithBeanstalk = xRayWithBeanstalk;
		this.xRayWithECS = xRayWithECS;
		this.cloudTrial = cloudTrial;
		this.cloudTrialSecurity = cloudTrialSecurity;
	}

	public Integer getLogFlowId() {
		return logFlowId;
	}

	public void setLogFlowId(Integer logFlowId) {
		this.logFlowId = logFlowId;
	}

	public String getTrailSystems() {
		return trailSystems;
	}

	public void setTrailSystems(String trailSystems) {
		this.trailSystems = trailSystems;
	}

	public String getxRayEnabled() {
		return xRayEnabled;
	}

	public void setxRayEnabled(String xRayEnabled) {
		this.xRayEnabled = xRayEnabled;
	}

	public String getLogsAgent() {
		return logsAgent;
	}

	public void setLogsAgent(String logsAgent) {
		this.logsAgent = logsAgent;
	}

	public Integer getFilters() {
		return filters;
	}

	public void setFilters(Integer filters) {
		this.filters = filters;
	}

	public Integer getMetricFilters() {
		return metricFilters;
	}

	public void setMetricFilters(Integer metricFilters) {
		this.metricFilters = metricFilters;
	}

	public Integer getCloudWatchAlarms() {
		return cloudWatchAlarms;
	}

	public void setCloudWatchAlarms(Integer cloudWatchAlarms) {
		this.cloudWatchAlarms = cloudWatchAlarms;
	}

	public String getSynthetics() {
		return synthetics;
	}

	public void setSynthetics(String synthetics) {
		this.synthetics = synthetics;
	}

	public String getEventBridges() {
		return eventBridges;
	}

	public void setEventBridges(String eventBridges) {
		this.eventBridges = eventBridges;
	}

	public String getMultiAccountAggregation() {
		return multiAccountAggregation;
	}

	public void setMultiAccountAggregation(String multiAccountAggregation) {
		this.multiAccountAggregation = multiAccountAggregation;
	}

	public String getxRayWithBeanstalk() {
		return xRayWithBeanstalk;
	}

	public void setxRayWithBeanstalk(String xRayWithBeanstalk) {
		this.xRayWithBeanstalk = xRayWithBeanstalk;
	}

	public String getxRayWithECS() {
		return xRayWithECS;
	}

	public void setxRayWithECS(String xRayWithECS) {
		this.xRayWithECS = xRayWithECS;
	}

	public String getCloudTrial() {
		return cloudTrial;
	}

	public void setCloudTrial(String cloudTrial) {
		this.cloudTrial = cloudTrial;
	}

	public String getCloudTrialSecurity() {
		return cloudTrialSecurity;
	}

	public void setCloudTrialSecurity(String cloudTrialSecurity) {
		this.cloudTrialSecurity = cloudTrialSecurity;
	}

}
