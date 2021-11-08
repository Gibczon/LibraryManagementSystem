package com.example.librarymanagementsystem;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class DBConnector {
    MongoClient client = MongoClients.create("mongodb+srv://TestUser:qweasd@cluster0.rpukm.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");

}
