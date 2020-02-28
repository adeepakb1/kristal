package Pojo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class KristalsItem{

	@SerializedName("requiredBroker")
	private Object requiredBroker;

	@SerializedName("available")
	private boolean available;

	@SerializedName("areTradesPending")
	private boolean areTradesPending;

	@SerializedName("ownerId")
	private int ownerId;

	@SerializedName("investors")
	private int investors;

	@SerializedName("kristalRank")
	private int kristalRank;

	@SerializedName("unitNav")
	private double unitNav;

	@SerializedName("state")
	private String state;

	@SerializedName("navWithoutAccrued")
	private double navWithoutAccrued;

	@SerializedName("oneYearReturn")
	private double oneYearReturn;

	@SerializedName("kristalVisibility")
	private String kristalVisibility;

	@SerializedName("kristalRiskRating")
	private String kristalRiskRating;

	@SerializedName("advisoryRole")
	private String advisoryRole;

	@SerializedName("tagRankList")
	private List<TagRankListItem> tagRankList;

	@SerializedName("additional_info")
	private String additionalInfo;

	@SerializedName("name")
	private String name;

	@SerializedName("returns")
	private Returns returns;

	@SerializedName("searchFilters")
	private List<String> searchFilters;

	@SerializedName("lastOneMonthReturn")
	private double lastOneMonthReturn;

	@SerializedName("assetClasses")
	private List<String> assetClasses;

	@SerializedName("onPlatformReturn")
	private double onPlatformReturn;

	@SerializedName("startDate")
	private long startDate;

	@SerializedName("totalVisits")
	private int totalVisits;

	@SerializedName("isBackTest")
	private boolean isBackTest;

	@SerializedName("totalNoOfSubscribedUnits")
	private int totalNoOfSubscribedUnits;

	@SerializedName("brokers")
	private List<BrokersItem> brokers;

	@SerializedName("sophistication")
	private int sophistication;

	@SerializedName("fixedFees")
	private Object fixedFees;

	@SerializedName("hurdleFees")
	private Object hurdleFees;

	@SerializedName("isSatellitePortfolio")
	private boolean isSatellitePortfolio;

	@SerializedName("strategyType")
	private String strategyType;

	@SerializedName("isAutoApprove")
	private boolean isAutoApprove;

	@SerializedName("ownerName")
	private String ownerName;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("currency")
	private String currency;

	@SerializedName("lastUpdatedTime")
	private long lastUpdatedTime;

	@SerializedName("maxRecommendedSatelliteValue")
	private int maxRecommendedSatelliteValue;

	@SerializedName("summary")
	private String summary;

	@SerializedName("netAccrued")
	private float netAccrued;

	@SerializedName("commonGoals")
	private List<Object> commonGoals;

	@SerializedName("cagr")
	private Cagr cagr;

	@SerializedName("totalNav")
	private double totalNav;

	@SerializedName("residualCashMultiplier")
	private float residualCashMultiplier;

	@SerializedName("horizon")
	private String horizon;

	@SerializedName("periodReturns")
	private PeriodReturns periodReturns;

	@SerializedName("kristalRating")
	private int kristalRating;

	@SerializedName("minInvestment")
	private double minInvestment;

	@SerializedName("traderBlogUrl")
	private Object traderBlogUrl;

	@SerializedName("kristalId")
	private int kristalId;

	@SerializedName("minimumStepFactor")
	private double minimumStepFactor;

	@SerializedName("valueProposition")
	private Object valueProposition;

	@SerializedName("inceptionDayNav")
	private double inceptionDayNav;

	@SerializedName("totalUniqueVisitors")
	private int totalUniqueVisitors;

	@SerializedName("risk")
	private String risk;

	@SerializedName("performanceFees")
	private Object performanceFees;

	@SerializedName("requiredBrokers")
	private List<String> requiredBrokers;

	@SerializedName("kristalType")
	private String kristalType;

	public void setRequiredBroker(Object requiredBroker){
		this.requiredBroker = requiredBroker;
	}

	public Object getRequiredBroker(){
		return requiredBroker;
	}

	public void setAvailable(boolean available){
		this.available = available;
	}

	public boolean isAvailable(){
		return available;
	}

	public void setAreTradesPending(boolean areTradesPending){
		this.areTradesPending = areTradesPending;
	}

	public boolean isAreTradesPending(){
		return areTradesPending;
	}

	public void setOwnerId(int ownerId){
		this.ownerId = ownerId;
	}

	public int getOwnerId(){
		return ownerId;
	}

	public void setInvestors(int investors){
		this.investors = investors;
	}

	public int getInvestors(){
		return investors;
	}

	public void setKristalRank(int kristalRank){
		this.kristalRank = kristalRank;
	}

	public int getKristalRank(){
		return kristalRank;
	}

	public void setUnitNav(double unitNav){
		this.unitNav = unitNav;
	}

	public double getUnitNav(){
		return unitNav;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setNavWithoutAccrued(double navWithoutAccrued){
		this.navWithoutAccrued = navWithoutAccrued;
	}

	public double getNavWithoutAccrued(){
		return navWithoutAccrued;
	}

	public void setOneYearReturn(double oneYearReturn){
		this.oneYearReturn = oneYearReturn;
	}

	public double getOneYearReturn(){
		return oneYearReturn;
	}

	public void setKristalVisibility(String kristalVisibility){
		this.kristalVisibility = kristalVisibility;
	}

	public String getKristalVisibility(){
		return kristalVisibility;
	}

	public void setKristalRiskRating(String kristalRiskRating){
		this.kristalRiskRating = kristalRiskRating;
	}

	public String getKristalRiskRating(){
		return kristalRiskRating;
	}

	public void setAdvisoryRole(String advisoryRole){
		this.advisoryRole = advisoryRole;
	}

	public String getAdvisoryRole(){
		return advisoryRole;
	}

	public void setTagRankList(List<TagRankListItem> tagRankList){
		this.tagRankList = tagRankList;
	}

	public List<TagRankListItem> getTagRankList(){
		return tagRankList;
	}

	public void setAdditionalInfo(String additionalInfo){
		this.additionalInfo = additionalInfo;
	}

	public String getAdditionalInfo(){
		return additionalInfo;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setReturns(Returns returns){
		this.returns = returns;
	}

	public Returns getReturns(){
		return returns;
	}

	public void setSearchFilters(List<String> searchFilters){
		this.searchFilters = searchFilters;
	}

	public List<String> getSearchFilters(){
		return searchFilters;
	}

	public void setLastOneMonthReturn(double lastOneMonthReturn){
		this.lastOneMonthReturn = lastOneMonthReturn;
	}

	public double getLastOneMonthReturn(){
		return lastOneMonthReturn;
	}

	public void setAssetClasses(List<String> assetClasses){
		this.assetClasses = assetClasses;
	}

	public List<String> getAssetClasses(){
		return assetClasses;
	}

	public void setOnPlatformReturn(double onPlatformReturn){
		this.onPlatformReturn = onPlatformReturn;
	}

	public double getOnPlatformReturn(){
		return onPlatformReturn;
	}

	public void setStartDate(long startDate){
		this.startDate = startDate;
	}

	public long getStartDate(){
		return startDate;
	}

	public void setTotalVisits(int totalVisits){
		this.totalVisits = totalVisits;
	}

	public int getTotalVisits(){
		return totalVisits;
	}

	public void setIsBackTest(boolean isBackTest){
		this.isBackTest = isBackTest;
	}

	public boolean isIsBackTest(){
		return isBackTest;
	}

	public void setTotalNoOfSubscribedUnits(int totalNoOfSubscribedUnits){
		this.totalNoOfSubscribedUnits = totalNoOfSubscribedUnits;
	}

	public int getTotalNoOfSubscribedUnits(){
		return totalNoOfSubscribedUnits;
	}

	public void setBrokers(List<BrokersItem> brokers){
		this.brokers = brokers;
	}

	public List<BrokersItem> getBrokers(){
		return brokers;
	}

	public void setSophistication(int sophistication){
		this.sophistication = sophistication;
	}

	public int getSophistication(){
		return sophistication;
	}

	public void setFixedFees(Object fixedFees){
		this.fixedFees = fixedFees;
	}

	public Object getFixedFees(){
		return fixedFees;
	}

	public void setHurdleFees(Object hurdleFees){
		this.hurdleFees = hurdleFees;
	}

	public Object getHurdleFees(){
		return hurdleFees;
	}

	public void setIsSatellitePortfolio(boolean isSatellitePortfolio){
		this.isSatellitePortfolio = isSatellitePortfolio;
	}

	public boolean isIsSatellitePortfolio(){
		return isSatellitePortfolio;
	}

	public void setStrategyType(String strategyType){
		this.strategyType = strategyType;
	}

	public String getStrategyType(){
		return strategyType;
	}

	public void setIsAutoApprove(boolean isAutoApprove){
		this.isAutoApprove = isAutoApprove;
	}

	public boolean isIsAutoApprove(){
		return isAutoApprove;
	}

	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	public String getOwnerName(){
		return ownerName;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setLastUpdatedTime(long lastUpdatedTime){
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public long getLastUpdatedTime(){
		return lastUpdatedTime;
	}

	public void setMaxRecommendedSatelliteValue(int maxRecommendedSatelliteValue){
		this.maxRecommendedSatelliteValue = maxRecommendedSatelliteValue;
	}

	public int getMaxRecommendedSatelliteValue(){
		return maxRecommendedSatelliteValue;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setNetAccrued(float netAccrued){
		this.netAccrued = netAccrued;
	}

	public float getNetAccrued(){
		return netAccrued;
	}

	public void setCommonGoals(List<Object> commonGoals){
		this.commonGoals = commonGoals;
	}

	public List<Object> getCommonGoals(){
		return commonGoals;
	}

	public void setCagr(Cagr cagr){
		this.cagr = cagr;
	}

	public Cagr getCagr(){
		return cagr;
	}

	public void setTotalNav(double totalNav){
		this.totalNav = totalNav;
	}

	public double getTotalNav(){
		return totalNav;
	}

	public void setResidualCashMultiplier(int residualCashMultiplier){
		this.residualCashMultiplier = residualCashMultiplier;
	}

	public float getResidualCashMultiplier(){
		return residualCashMultiplier;
	}

	public void setHorizon(String horizon){
		this.horizon = horizon;
	}

	public String getHorizon(){
		return horizon;
	}

	public void setPeriodReturns(PeriodReturns periodReturns){
		this.periodReturns = periodReturns;
	}

	public PeriodReturns getPeriodReturns(){
		return periodReturns;
	}

	public void setKristalRating(int kristalRating){
		this.kristalRating = kristalRating;
	}

	public int getKristalRating(){
		return kristalRating;
	}

	public void setMinInvestment(double minInvestment){
		this.minInvestment = minInvestment;
	}

	public double getMinInvestment(){
		return minInvestment;
	}

	public void setTraderBlogUrl(Object traderBlogUrl){
		this.traderBlogUrl = traderBlogUrl;
	}

	public Object getTraderBlogUrl(){
		return traderBlogUrl;
	}

	public void setKristalId(int kristalId){
		this.kristalId = kristalId;
	}

	public int getKristalId(){
		return kristalId;
	}

	public void setMinimumStepFactor(double minimumStepFactor){
		this.minimumStepFactor = minimumStepFactor;
	}

	public double getMinimumStepFactor(){
		return minimumStepFactor;
	}

	public void setValueProposition(Object valueProposition){
		this.valueProposition = valueProposition;
	}

	public Object getValueProposition(){
		return valueProposition;
	}

	public void setInceptionDayNav(double inceptionDayNav){
		this.inceptionDayNav = inceptionDayNav;
	}

	public double getInceptionDayNav(){
		return inceptionDayNav;
	}

	public void setTotalUniqueVisitors(int totalUniqueVisitors){
		this.totalUniqueVisitors = totalUniqueVisitors;
	}

	public int getTotalUniqueVisitors(){
		return totalUniqueVisitors;
	}

	public void setRisk(String risk){
		this.risk = risk;
	}

	public String getRisk(){
		return risk;
	}

	public void setPerformanceFees(Object performanceFees){
		this.performanceFees = performanceFees;
	}

	public Object getPerformanceFees(){
		return performanceFees;
	}

	public void setRequiredBrokers(List<String> requiredBrokers){
		this.requiredBrokers = requiredBrokers;
	}

	public List<String> getRequiredBrokers(){
		return requiredBrokers;
	}

	public void setKristalType(String kristalType){
		this.kristalType = kristalType;
	}

	public String getKristalType(){
		return kristalType;
	}

	@Override
 	public String toString(){
		return 
			"KristalsItem{" + 
			"requiredBroker = '" + requiredBroker + '\'' + 
			",available = '" + available + '\'' + 
			",areTradesPending = '" + areTradesPending + '\'' + 
			",ownerId = '" + ownerId + '\'' + 
			",investors = '" + investors + '\'' + 
			",kristalRank = '" + kristalRank + '\'' + 
			",unitNav = '" + unitNav + '\'' + 
			",state = '" + state + '\'' + 
			",navWithoutAccrued = '" + navWithoutAccrued + '\'' + 
			",oneYearReturn = '" + oneYearReturn + '\'' + 
			",kristalVisibility = '" + kristalVisibility + '\'' + 
			",kristalRiskRating = '" + kristalRiskRating + '\'' + 
			",advisoryRole = '" + advisoryRole + '\'' + 
			",tagRankList = '" + tagRankList + '\'' + 
			",additional_info = '" + additionalInfo + '\'' + 
			",name = '" + name + '\'' + 
			",returns = '" + returns + '\'' + 
			",searchFilters = '" + searchFilters + '\'' + 
			",lastOneMonthReturn = '" + lastOneMonthReturn + '\'' + 
			",assetClasses = '" + assetClasses + '\'' + 
			",onPlatformReturn = '" + onPlatformReturn + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",totalVisits = '" + totalVisits + '\'' + 
			",isBackTest = '" + isBackTest + '\'' + 
			",totalNoOfSubscribedUnits = '" + totalNoOfSubscribedUnits + '\'' + 
			",brokers = '" + brokers + '\'' + 
			",sophistication = '" + sophistication + '\'' + 
			",fixedFees = '" + fixedFees + '\'' + 
			",hurdleFees = '" + hurdleFees + '\'' + 
			",isSatellitePortfolio = '" + isSatellitePortfolio + '\'' + 
			",strategyType = '" + strategyType + '\'' + 
			",isAutoApprove = '" + isAutoApprove + '\'' + 
			",ownerName = '" + ownerName + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",currency = '" + currency + '\'' + 
			",lastUpdatedTime = '" + lastUpdatedTime + '\'' + 
			",maxRecommendedSatelliteValue = '" + maxRecommendedSatelliteValue + '\'' + 
			",summary = '" + summary + '\'' + 
			",netAccrued = '" + netAccrued + '\'' + 
			",commonGoals = '" + commonGoals + '\'' + 
			",cagr = '" + cagr + '\'' + 
			",totalNav = '" + totalNav + '\'' + 
			",residualCashMultiplier = '" + residualCashMultiplier + '\'' + 
			",horizon = '" + horizon + '\'' + 
			",periodReturns = '" + periodReturns + '\'' + 
			",kristalRating = '" + kristalRating + '\'' + 
			",minInvestment = '" + minInvestment + '\'' + 
			",traderBlogUrl = '" + traderBlogUrl + '\'' + 
			",kristalId = '" + kristalId + '\'' + 
			",minimumStepFactor = '" + minimumStepFactor + '\'' + 
			",valueProposition = '" + valueProposition + '\'' + 
			",inceptionDayNav = '" + inceptionDayNav + '\'' + 
			",totalUniqueVisitors = '" + totalUniqueVisitors + '\'' + 
			",risk = '" + risk + '\'' + 
			",performanceFees = '" + performanceFees + '\'' + 
			",requiredBrokers = '" + requiredBrokers + '\'' + 
			",kristalType = '" + kristalType + '\'' + 
			"}";
		}
}
