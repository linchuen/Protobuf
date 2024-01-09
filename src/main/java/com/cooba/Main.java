package com.cooba;

import com.cooba.proto.AddressBook;
import com.cooba.proto.Person;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        Person john = Person.newBuilder()
                .setId(1234)
                .setName("John Doe")
                .setEmail("jdoe@example.com")
                .addPhones(Person.PhoneNumber.newBuilder()
                        .setNumber("555-4321")
                        .setType(Person.PhoneType.PHONE_TYPE_HOME))
                .build();
        System.out.println("Tom raw data" + Arrays.toString(john.toByteArray()));

        Person tom = Person.newBuilder()
                .setId(2345).setName("Tom Doe")
                .setEmail("jdoe@example.com")
                .addPhones(Person.PhoneNumber.newBuilder()
                        .setNumber("555-4321")
                        .setType(Person.PhoneType.PHONE_TYPE_HOME))
                .build();

        AddressBook addressBook = AddressBook.newBuilder().addPeople(john).addPeople(tom).build();

        String addressBookJson = JsonFormat.printer().print(addressBook);
        System.out.println("Address Book Json: " + addressBookJson);
        String json = """
                {
                    "name": "Aiden Pearce",
                    "id": 1234,
                    "email": "jdoe@example.com",
                    "phones": [{
                      "number": "555-4321",
                      "type": "PHONE_TYPE_HOME"
                    }]
                  }""";

        Person.Builder newBuilder = Person.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, newBuilder);
        System.out.println("新的Person " + newBuilder.build());
    }
}
