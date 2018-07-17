package main.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.StringJoiner;

public class HttpUtil {

    //Used to parse InputStream into a JsonNode, can just use one global instance for all parsing
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @param connection A connection object from the connect() function
     * @param headers    An alternating key value list of the connection headers and their values
     *
     * @return An InputStream object that contains the data returned from the GET request
     * @throws IOException any exception generated by the request
     */
    public static InputStream get(HttpURLConnection connection, String... headers) throws IOException {
        if (connection == null)
            return null;

        if (headers.length % 2 != 0)
            return null;

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type",
                                      "application/json");

        for (int i = 0; i < headers.length; i += 2) {
            connection.setRequestProperty(headers[i], headers[i + 1]);
        }

        connection.setDoOutput(true);
        connection.setUseCaches(false);


        return connection.getInputStream();
    }

    /**
     * @param connection A connection object from the connect() function
     * @param payload    A string object representing the payload to POST to the open connection
     * @param headers    An alternating key value list of the connection headers and their values
     *
     * @return An InputStream object that contains the data returned from the POST request
     * @throws IOException any exception generated by the request
     */
    public static InputStream post(HttpURLConnection connection, String payload, String... headers) throws IOException {
        if (connection == null)
            return null;
        if (payload == null)
            return null;
        if (headers.length % 2 != 0)
            return null;

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type",
                                      "application/json");
        for (int i = 0; i < headers.length; i += 2) {
            connection.setRequestProperty(headers[i], headers[i + 1]);
        }

        connection.setDoOutput(true);
        connection.setUseCaches(false);

        DataOutputStream wr = new DataOutputStream(
                connection.getOutputStream());
        wr.writeBytes(payload);
        wr.close();

        return connection.getInputStream();
    }

    /**
     * @param url           The url you want to connect to
     * @param parameterList An alternating key value list of the parameters for the connection
     *
     * @return The final url string used in connections
     */
    static String buildUrl(String url, String... parameterList) {
        StringJoiner parametersStringJoiner = new StringJoiner("&");

        try {
            //Loops through the parameterList two at a time, as to grab each pair together
            for (int i = 0; i < parameterList.length; i += 2) {
                parametersStringJoiner.add(URLEncoder.encode(parameterList[i],
                                                             "UTF-8") + // Adds a string to the joiner in format "key=value"
                                                   "=" + URLEncoder.encode(parameterList[i + 1], "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
        return url + "?" + parametersStringJoiner.toString(); //Returns the url with all the concatenated parameters after it
    }

    /**
     * Checks a given string to determine if it is a valid url
     *
     * @param url The string you want to test
     *
     * @return A boolean that states whether or not the string is a valid url
     */
    static boolean isValidUrl(String url) {
        try {
            new URL(url);
            return true;  // If it creates the URL object with no errors, then it is a valid url
        } catch (MalformedURLException e) {
            return false; // It could not create a url object
        }
    }


    /**
     * @param url        URL String to be passed into buildUrl
     * @param parameters Parameter list to be passed into buildUrl
     *
     * @return The HttpURLConnection object, or null if openConnection() fails
     */
    public static HttpURLConnection connect(String url, String... parameters) {
        if (parameters.length % 2 != 0)
            return null;

        if (url == null || url.isEmpty() || !isValidUrl(url))
            return null;

        HttpURLConnection connection;
        try {
            connection = (HttpURLConnection) new URL(buildUrl(url, parameters)).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return connection;

    }

    /**
     * @param input The InputStream object returned from a http request function
     *
     * @return A JsonNode object with the inputStream data
     */
    public static JsonNode parse(InputStream input) {
        if (input == null)
            return null;


        try {
            //Parses the JSON from the given input stream
            return objectMapper.readTree(input);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}