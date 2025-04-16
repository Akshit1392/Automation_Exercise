package automation.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.io.FileUtils;

public class JsonDataProvider {

    // Reads a JSON file and returns a list of HashMaps for test data
    public List<HashMap<String, String>> getUserData(String jsonFilePath) throws IOException {
        // Read the JSON file as a String
        String jsonContent = FileUtils.readFileToString(
            new File(jsonFilePath), StandardCharsets.UTF_8
        );

        // Convert JSON string into List<HashMap<String, String>>
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {});
    }
}
