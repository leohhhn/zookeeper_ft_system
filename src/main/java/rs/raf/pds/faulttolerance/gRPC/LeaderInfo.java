// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account_service.proto

package rs.raf.pds.faulttolerance.gRPC;

/**
 * Protobuf type {@code LeaderInfo}
 */
public final class LeaderInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LeaderInfo)
    LeaderInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeaderInfo.newBuilder() to construct.
  private LeaderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeaderInfo() {
    hostnamePort_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeaderInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rs.raf.pds.faulttolerance.gRPC.AccountServiceOuterClass.internal_static_LeaderInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rs.raf.pds.faulttolerance.gRPC.AccountServiceOuterClass.internal_static_LeaderInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rs.raf.pds.faulttolerance.gRPC.LeaderInfo.class, rs.raf.pds.faulttolerance.gRPC.LeaderInfo.Builder.class);
  }

  public static final int IMLEADER_FIELD_NUMBER = 1;
  private boolean imLeader_ = false;
  /**
   * <code>bool imLeader = 1;</code>
   * @return The imLeader.
   */
  @java.lang.Override
  public boolean getImLeader() {
    return imLeader_;
  }

  public static final int HOSTNAMEPORT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostnamePort_ = "";
  /**
   * <code>string hostnamePort = 2;</code>
   * @return The hostnamePort.
   */
  @java.lang.Override
  public java.lang.String getHostnamePort() {
    java.lang.Object ref = hostnamePort_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostnamePort_ = s;
      return s;
    }
  }
  /**
   * <code>string hostnamePort = 2;</code>
   * @return The bytes for hostnamePort.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostnamePortBytes() {
    java.lang.Object ref = hostnamePort_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostnamePort_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (imLeader_ != false) {
      output.writeBool(1, imLeader_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostnamePort_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hostnamePort_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (imLeader_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, imLeader_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostnamePort_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hostnamePort_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof rs.raf.pds.faulttolerance.gRPC.LeaderInfo)) {
      return super.equals(obj);
    }
    rs.raf.pds.faulttolerance.gRPC.LeaderInfo other = (rs.raf.pds.faulttolerance.gRPC.LeaderInfo) obj;

    if (getImLeader()
        != other.getImLeader()) return false;
    if (!getHostnamePort()
        .equals(other.getHostnamePort())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IMLEADER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getImLeader());
    hash = (37 * hash) + HOSTNAMEPORT_FIELD_NUMBER;
    hash = (53 * hash) + getHostnamePort().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(rs.raf.pds.faulttolerance.gRPC.LeaderInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LeaderInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LeaderInfo)
      rs.raf.pds.faulttolerance.gRPC.LeaderInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rs.raf.pds.faulttolerance.gRPC.AccountServiceOuterClass.internal_static_LeaderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rs.raf.pds.faulttolerance.gRPC.AccountServiceOuterClass.internal_static_LeaderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rs.raf.pds.faulttolerance.gRPC.LeaderInfo.class, rs.raf.pds.faulttolerance.gRPC.LeaderInfo.Builder.class);
    }

    // Construct using rs.raf.pds.faulttolerance.gRPC.LeaderInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      imLeader_ = false;
      hostnamePort_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rs.raf.pds.faulttolerance.gRPC.AccountServiceOuterClass.internal_static_LeaderInfo_descriptor;
    }

    @java.lang.Override
    public rs.raf.pds.faulttolerance.gRPC.LeaderInfo getDefaultInstanceForType() {
      return rs.raf.pds.faulttolerance.gRPC.LeaderInfo.getDefaultInstance();
    }

    @java.lang.Override
    public rs.raf.pds.faulttolerance.gRPC.LeaderInfo build() {
      rs.raf.pds.faulttolerance.gRPC.LeaderInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rs.raf.pds.faulttolerance.gRPC.LeaderInfo buildPartial() {
      rs.raf.pds.faulttolerance.gRPC.LeaderInfo result = new rs.raf.pds.faulttolerance.gRPC.LeaderInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(rs.raf.pds.faulttolerance.gRPC.LeaderInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.imLeader_ = imLeader_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hostnamePort_ = hostnamePort_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rs.raf.pds.faulttolerance.gRPC.LeaderInfo) {
        return mergeFrom((rs.raf.pds.faulttolerance.gRPC.LeaderInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rs.raf.pds.faulttolerance.gRPC.LeaderInfo other) {
      if (other == rs.raf.pds.faulttolerance.gRPC.LeaderInfo.getDefaultInstance()) return this;
      if (other.getImLeader() != false) {
        setImLeader(other.getImLeader());
      }
      if (!other.getHostnamePort().isEmpty()) {
        hostnamePort_ = other.hostnamePort_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              imLeader_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              hostnamePort_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean imLeader_ ;
    /**
     * <code>bool imLeader = 1;</code>
     * @return The imLeader.
     */
    @java.lang.Override
    public boolean getImLeader() {
      return imLeader_;
    }
    /**
     * <code>bool imLeader = 1;</code>
     * @param value The imLeader to set.
     * @return This builder for chaining.
     */
    public Builder setImLeader(boolean value) {

      imLeader_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool imLeader = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImLeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      imLeader_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object hostnamePort_ = "";
    /**
     * <code>string hostnamePort = 2;</code>
     * @return The hostnamePort.
     */
    public java.lang.String getHostnamePort() {
      java.lang.Object ref = hostnamePort_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostnamePort_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hostnamePort = 2;</code>
     * @return The bytes for hostnamePort.
     */
    public com.google.protobuf.ByteString
        getHostnamePortBytes() {
      java.lang.Object ref = hostnamePort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostnamePort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hostnamePort = 2;</code>
     * @param value The hostnamePort to set.
     * @return This builder for chaining.
     */
    public Builder setHostnamePort(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostnamePort_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string hostnamePort = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostnamePort() {
      hostnamePort_ = getDefaultInstance().getHostnamePort();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string hostnamePort = 2;</code>
     * @param value The bytes for hostnamePort to set.
     * @return This builder for chaining.
     */
    public Builder setHostnamePortBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostnamePort_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LeaderInfo)
  }

  // @@protoc_insertion_point(class_scope:LeaderInfo)
  private static final rs.raf.pds.faulttolerance.gRPC.LeaderInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rs.raf.pds.faulttolerance.gRPC.LeaderInfo();
  }

  public static rs.raf.pds.faulttolerance.gRPC.LeaderInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeaderInfo>
      PARSER = new com.google.protobuf.AbstractParser<LeaderInfo>() {
    @java.lang.Override
    public LeaderInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LeaderInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeaderInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rs.raf.pds.faulttolerance.gRPC.LeaderInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

