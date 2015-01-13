package client.jms.core;

public interface Endpoints {

	public String AUTH_SERVICE = "http://localhost:8080/yelp/services/AuthService?wsdl";
	public String CAT_ENDPOINT = "http://localhost:8080/yelp/services/addCatService?wsdl";
	public String DELETE_CAT_ENDPOINT = "http://localhost:8080/yelp/services/deleteCatService?wsdl";
	public String UPDATE_CAT_ENDPOINT = "http://localhost:8080/yelp/services/updateCatService?wsdl";
}
