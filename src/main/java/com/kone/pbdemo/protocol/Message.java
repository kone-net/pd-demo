// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.kone.pbdemo.protocol;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_User_HobbysEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_User_HobbysEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\010protocol\032\nfile.proto\"\250\002" +
      "\n\004User\022\016\n\006userId\030\001 \001(\005\022\020\n\010username\030\002 \001(\t" +
      "\022\017\n\005error\030\003 \001(\tH\000\022\016\n\004code\030\004 \001(\005H\000\022\013\n\003age" +
      "\030\005 \001(\021\022\014\n\004name\030\010 \001(\t\022$\n\010userType\030\t \001(\0162\022" +
      ".protocol.UserType\022\r\n\005roles\030\n \003(\005\022\034\n\004fil" +
      "e\030\013 \001(\0132\016.protocol.File\022*\n\006hobbys\030\014 \003(\0132" +
      "\032.protocol.User.HobbysEntry\032-\n\013HobbysEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\005\n\003ms" +
      "gJ\004\010\006\020\010R\007userId2*4\n\010UserType\022\n\n\006UNKNOW\020\000" +
      "\022\t\n\005ADMIN\020\001\022\021\n\rBUSINESS_USER\020\0022\233\001\n\013UserS" +
      "ervice\022+\n\007getUser\022\016.protocol.User\032\016.prot" +
      "ocol.User\"\000\022.\n\010getUsers\022\016.protocol.User\032" +
      "\016.protocol.User\"\0000\001\022/\n\tsaveUsers\022\016.proto" +
      "col.User\032\016.protocol.User\"\000(\0012:\n\013FileServ" +
      "ice\022+\n\007getFile\022\016.protocol.User\032\016.protoco" +
      "l.File\"\000B&\n\030com.kone.pbdemo.protocolP\001Z\010" +
      "protocolb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.kone.pbdemo.protocol.FileOuterClass.getDescriptor(),
        });
    internal_static_protocol_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_User_descriptor,
        new java.lang.String[] { "UserId", "Username", "Error", "Code", "Age", "Name", "UserType", "Roles", "File", "Hobbys", "Msg", });
    internal_static_protocol_User_HobbysEntry_descriptor =
      internal_static_protocol_User_descriptor.getNestedTypes().get(0);
    internal_static_protocol_User_HobbysEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_User_HobbysEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.kone.pbdemo.protocol.FileOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}