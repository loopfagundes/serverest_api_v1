package br.com.dbserver.utils;

public class Endpoint {
    private static String BASE_URI;
    private static String BASE_PATH_USERS;
    private static String ID_USER;
    private static String BASE_PATH_LOGIN;
    private static String BASE_PATH_PRODUCTS;

    protected static String baseUri() {
        BASE_URI = PropertiesData.getPropertiesData("urlServerest", "BASE_URI");
        return BASE_URI;
    }

    protected static String basePathUsers() {
        BASE_PATH_USERS = PropertiesData.getPropertiesData("urlServerest", "BASE_PATH_USERS");
        return BASE_PATH_USERS;
    }

    protected static String idUser() {
        ID_USER = PropertiesData.getPropertiesData("idUser", "ID_USER");
        return ID_USER;
    }

    protected static String basePathLogin() {
        BASE_PATH_LOGIN = PropertiesData.getPropertiesData("urlServerest", "BASE_PATH_LOGIN");
        return BASE_PATH_LOGIN;
    }

    protected static String basePathProducts() {
        BASE_PATH_PRODUCTS = PropertiesData.getPropertiesData("urlServerest", "BASE_PATH_PRODUCTS");
        return BASE_PATH_PRODUCTS;
    }
}