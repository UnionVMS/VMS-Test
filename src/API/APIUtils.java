package API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class APIUtils {

    public static String GetNodeValue(String json, String node) {
        JsonNode parent= null;
        try {
            parent = new ObjectMapper().readTree(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String content = parent.get(node).asText();
        return content;
    }

    public static String SetNodeValue(String json, String node, String value) {
        JsonNode parent= null;
        try {
            parent = new ObjectMapper().readTree(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String result = (((ObjectNode) parent).put(node, value)).toString();
        return result;
    }
}
