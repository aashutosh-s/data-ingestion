package org.autodidact.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("field")
public class DomainEntity {

	private String state;
	private String district;
	private String market;
	private String commodity;
	private String variety;
	private String arrival_date;
	private String min_price;
	private String max_price;
	private String modal_price;
	
	@JsonProperty("state")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@JsonProperty("district")
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@JsonProperty("market")
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	@JsonProperty("commodity")
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	@JsonProperty("variety")
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	@JsonProperty("arrival_date")
	public String getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(String arrival_date) {
		this.arrival_date = arrival_date;
	}
	@JsonProperty("min_price")
	public String getMin_price() {
		return min_price;
	}
	public void setMin_price(String min_price) {
		this.min_price = min_price;
	}
	@JsonProperty("max_price")
	public String getMax_price() {
		return max_price;
	}
	public void setMax_price(String max_price) {
		this.max_price = max_price;
	}
	@JsonProperty("modal_price")
	public String getModal_price() {
		return modal_price;
	}
	public void setModal_price(String modal_price) {
		this.modal_price = modal_price;
	}
	
	@Override
	public String toString() {
		return state + "|" + district + "|"
				+ market + "|" + commodity + "|" + variety + "|" + arrival_date
				+ "|" + min_price + "|" + max_price + "|" + modal_price ;
	}
	
}
