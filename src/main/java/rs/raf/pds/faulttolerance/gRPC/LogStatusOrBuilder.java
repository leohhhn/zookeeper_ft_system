// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account_service.proto

package rs.raf.pds.faulttolerance.gRPC;

public interface LogStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LogStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>string status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>uint64 entryAtIndex = 3;</code>
   * @return The entryAtIndex.
   */
  long getEntryAtIndex();

  /**
   * <code>uint64 lastEntryIndex = 4;</code>
   * @return The lastEntryIndex.
   */
  long getLastEntryIndex();
}