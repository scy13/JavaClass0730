/**
	Date : 2021.07.12
	Author : chayeon
	Description : 검색 필드
	Version : 1.0
 */
package vo;

public class SearchData {
	private String searchCondition;	// 검색조건
	private String searchValue;		// 검색값
	
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
}
