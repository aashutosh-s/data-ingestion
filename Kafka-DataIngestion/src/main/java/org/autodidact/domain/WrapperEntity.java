package org.autodidact.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrapperEntity {

	private List<DomainEntity> listDomainEnity ;

	@JsonProperty("records")
	public List<DomainEntity> getListDomainEnity() {
		return listDomainEnity;
	}

	public void setListDomainEnity(List<DomainEntity> listDomainEnity) {
		this.listDomainEnity = listDomainEnity;
	}
}
