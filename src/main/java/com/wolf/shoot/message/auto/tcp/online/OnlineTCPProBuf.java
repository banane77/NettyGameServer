// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcponline.proto

package com.wolf.shoot.message.auto.tcp.online;

public final class OnlineTCPProBuf {
  private OnlineTCPProBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OnlineHeartTCPProBufOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OnlineHeartTCPProBuf)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();
  }
  /**
   * Protobuf type {@code OnlineHeartTCPProBuf}
   */
  public  static final class OnlineHeartTCPProBuf extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OnlineHeartTCPProBuf)
      OnlineHeartTCPProBufOrBuilder {
    // Use OnlineHeartTCPProBuf.newBuilder() to construct.
    private OnlineHeartTCPProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OnlineHeartTCPProBuf() {
      id_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OnlineHeartTCPProBuf(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.internal_static_OnlineHeartTCPProBuf_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.internal_static_OnlineHeartTCPProBuf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.class, com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf)) {
        return super.equals(obj);
      }
      com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf other = (com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf) obj;

      boolean result = true;
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && (getId()
            == other.getId());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code OnlineHeartTCPProBuf}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OnlineHeartTCPProBuf)
        com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBufOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.internal_static_OnlineHeartTCPProBuf_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.internal_static_OnlineHeartTCPProBuf_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.class, com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.Builder.class);
      }

      // Construct using com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.internal_static_OnlineHeartTCPProBuf_descriptor;
      }

      public com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf getDefaultInstanceForType() {
        return com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.getDefaultInstance();
      }

      public com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf build() {
        com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf buildPartial() {
        com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf result = new com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf) {
          return mergeFrom((com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf other) {
        if (other == com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:OnlineHeartTCPProBuf)
    }

    // @@protoc_insertion_point(class_scope:OnlineHeartTCPProBuf)
    private static final com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf();
    }

    public static com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<OnlineHeartTCPProBuf>
        PARSER = new com.google.protobuf.AbstractParser<OnlineHeartTCPProBuf>() {
      public OnlineHeartTCPProBuf parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new OnlineHeartTCPProBuf(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OnlineHeartTCPProBuf> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OnlineHeartTCPProBuf> getParserForType() {
      return PARSER;
    }

    public com.wolf.shoot.message.auto.tcp.online.OnlineTCPProBuf.OnlineHeartTCPProBuf getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OnlineHeartTCPProBuf_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OnlineHeartTCPProBuf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017tcponline.proto\"\"\n\024OnlineHeartTCPProBu" +
      "f\022\n\n\002id\030\001 \002(\005B9\n&com.wolf.shoot.message." +
      "auto.tcp.onlineB\017OnlineTCPProBuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_OnlineHeartTCPProBuf_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OnlineHeartTCPProBuf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OnlineHeartTCPProBuf_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
