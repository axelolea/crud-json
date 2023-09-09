package com.axelolea.crudjson.driver;

import com.axelolea.crudjson.bean.CustomerJson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.File;
import java.io.IOException;

public class JsonDriver {

    private File file;
    private CustomerJson jsonData;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonDriver(String filename) {

        try {

            this.file = new File(filename);

            if (this.file.createNewFile()) {
                this.jsonData = fillDefault();
                writeFile(jsonData);
            } else {
                jsonData = readFile();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private CustomerJson fillDefault () {
        return new CustomerJson(1);
    }

    private CustomerJson readFile () {
        CustomerJson result;
        try {
            result = objectMapper.readValue(this.file, CustomerJson.class);
        } catch (MismatchedInputException e){
            result = fillDefault();
            writeFile(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public void writeFile(CustomerJson data) {

        try {
            objectMapper.writeValue(this.file, data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public CustomerJson getJsonData() {
        return jsonData.clone();
    }

    public void setJsonData(CustomerJson buffer){

        writeFile(buffer);
        this.jsonData = buffer;

    }

}
