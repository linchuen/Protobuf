// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.cooba.proto;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  java.util.List<Person>
      getPeopleList();
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  Person getPeople(int index);
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  java.util.List<? extends PersonOrBuilder>
      getPeopleOrBuilderList();
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  PersonOrBuilder getPeopleOrBuilder(
      int index);
}