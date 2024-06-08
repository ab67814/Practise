package com.healthIpass.practise.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ritesht
 *
 */
public class MemberDetails {

	private String memberName;
	private String memberLoc;
	private List<MemberDetails> memberDetailsList;

	public MemberDetails(String memberName, String memberLoc, int no) {
		this.memberName = memberName;
		this.memberLoc = memberLoc;
		this.memberDetailsList = new ArrayList<>();

	}

	/**
	 * @return memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return memberLoc
	 */
	public String getMemberLoc() {
		return memberLoc;
	}

	/**
	 * @param memberLoc
	 */
	public void setMemberLoc(String memberLoc) {
		this.memberLoc = memberLoc;
	}

	public List<MemberDetails> getMemberDetailsList() {
		return memberDetailsList;
	}

	public void setMemberDetailsList(List<MemberDetails> memberDetailsList) {
		this.memberDetailsList = memberDetailsList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberDetailsList == null) ? 0 : memberDetailsList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDetails other = (MemberDetails) obj;
		if (memberDetailsList == null) {
			if (other.memberDetailsList != null)
				return false;
		} else if (!memberDetailsList.equals(other.memberDetailsList))
			return false;
		return true;
	}

}
