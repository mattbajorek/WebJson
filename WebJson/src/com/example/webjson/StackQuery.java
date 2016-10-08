package com.example.webjson;

public class StackQuery {
	// Make query string constants
	private static final String BASE_URL = "https://api.stackexchange.com/2.2/search?";
	private static final String PARAM_SITE = "site=";
	private static final String PARAM_PAGE_SIZE = "&pagesize=";
	private static final String PARAM_ORDER = "&order=";
	private static final String PARAM_SORT = "&sort";
	private static final String PARAM_TAG = "&tagged=";
	private static final String PARAM_FILTER = "&filter=";
	private static final String PARAM_SEARCH_TERM = "&intitle=";
	
	// Initialize variables
	private String site = "stackoverflow";
	private int pageSize = 5;
	private SortOrder sortOrder = SortOrder.ASCENDING;
	private SortBy sortBy = SortBy.RELEVANCE;
	private String tag = "java";
	private String searchTerm = "";
	
	public enum SortOrder {
		// Constants with only 1 variable each (also like objects)
		ASCENDING   ("asc"), // object (key)
		DESCENDING  ("desc");
		
		// Declare variable
		private final String key;
		
		SortOrder(String key) { // key here is just a parameter
			this.key = key;
		}
		
		// Declare method
		public String toString() { // returns a string
			return key;
		}
	}
	
	public enum SortBy {
		RELEVANCE	("relevance"), 
		VOTES		("votes"), 
		CREATION	("creation"), 
		ACTIVITY	("activity");
		
		private final String key;
		
		SortBy(String key) {
			this.key = key;
		}
		
		public String toString() {
			return key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
