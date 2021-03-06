/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.chsoft.datacollection.entity;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Video extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8826961402958088700L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Video\",\"namespace\":\"com.chsoft.datacollection.entity\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"videoName\",\"type\":\"string\"},{\"name\":\"desc\",\"type\":[\"string\",\"null\"]},{\"name\":\"status\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence videoName;
  @Deprecated public java.lang.CharSequence desc;
  @Deprecated public int status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Video() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param videoName The new value for videoName
   * @param desc The new value for desc
   * @param status The new value for status
   */
  public Video(java.lang.Integer id, java.lang.CharSequence videoName, java.lang.CharSequence desc, java.lang.Integer status) {
    this.id = id;
    this.videoName = videoName;
    this.desc = desc;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return videoName;
    case 2: return desc;
    case 3: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: videoName = (java.lang.CharSequence)value$; break;
    case 2: desc = (java.lang.CharSequence)value$; break;
    case 3: status = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'videoName' field.
   * @return The value of the 'videoName' field.
   */
  public java.lang.CharSequence getVideoName() {
    return videoName;
  }

  /**
   * Sets the value of the 'videoName' field.
   * @param value the value to set.
   */
  public void setVideoName(java.lang.CharSequence value) {
    this.videoName = value;
  }

  /**
   * Gets the value of the 'desc' field.
   * @return The value of the 'desc' field.
   */
  public java.lang.CharSequence getDesc() {
    return desc;
  }

  /**
   * Sets the value of the 'desc' field.
   * @param value the value to set.
   */
  public void setDesc(java.lang.CharSequence value) {
    this.desc = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.Integer value) {
    this.status = value;
  }

  /**
   * Creates a new Video RecordBuilder.
   * @return A new Video RecordBuilder
   */
  public static com.chsoft.datacollection.entity.Video.Builder newBuilder() {
    return new com.chsoft.datacollection.entity.Video.Builder();
  }

  /**
   * Creates a new Video RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Video RecordBuilder
   */
  public static com.chsoft.datacollection.entity.Video.Builder newBuilder(com.chsoft.datacollection.entity.Video.Builder other) {
    return new com.chsoft.datacollection.entity.Video.Builder(other);
  }

  /**
   * Creates a new Video RecordBuilder by copying an existing Video instance.
   * @param other The existing instance to copy.
   * @return A new Video RecordBuilder
   */
  public static com.chsoft.datacollection.entity.Video.Builder newBuilder(com.chsoft.datacollection.entity.Video other) {
    return new com.chsoft.datacollection.entity.Video.Builder(other);
  }

  /**
   * RecordBuilder for Video instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Video>
    implements org.apache.avro.data.RecordBuilder<Video> {

    private int id;
    private java.lang.CharSequence videoName;
    private java.lang.CharSequence desc;
    private int status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.chsoft.datacollection.entity.Video.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.videoName)) {
        this.videoName = data().deepCopy(fields()[1].schema(), other.videoName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.desc)) {
        this.desc = data().deepCopy(fields()[2].schema(), other.desc);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Video instance
     * @param other The existing instance to copy.
     */
    private Builder(com.chsoft.datacollection.entity.Video other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.videoName)) {
        this.videoName = data().deepCopy(fields()[1].schema(), other.videoName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.desc)) {
        this.desc = data().deepCopy(fields()[2].schema(), other.desc);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'videoName' field.
      * @return The value.
      */
    public java.lang.CharSequence getVideoName() {
      return videoName;
    }

    /**
      * Sets the value of the 'videoName' field.
      * @param value The value of 'videoName'.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder setVideoName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.videoName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'videoName' field has been set.
      * @return True if the 'videoName' field has been set, false otherwise.
      */
    public boolean hasVideoName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'videoName' field.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder clearVideoName() {
      videoName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'desc' field.
      * @return The value.
      */
    public java.lang.CharSequence getDesc() {
      return desc;
    }

    /**
      * Sets the value of the 'desc' field.
      * @param value The value of 'desc'.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder setDesc(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.desc = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'desc' field has been set.
      * @return True if the 'desc' field has been set, false otherwise.
      */
    public boolean hasDesc() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'desc' field.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder clearDesc() {
      desc = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.Integer getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder setStatus(int value) {
      validate(fields()[3], value);
      this.status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.chsoft.datacollection.entity.Video.Builder clearStatus() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Video build() {
      try {
        Video record = new Video();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.videoName = fieldSetFlags()[1] ? this.videoName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.desc = fieldSetFlags()[2] ? this.desc : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.status = fieldSetFlags()[3] ? this.status : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
