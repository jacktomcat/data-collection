package com.chsoft.datacollection.entity.thrift;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-28")
public class Users implements org.apache.thrift.TBase<Users, Users._Fields>, java.io.Serializable, Cloneable, Comparable<Users> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Users");

  private static final org.apache.thrift.protocol.TField USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("users", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UsersStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UsersTupleSchemeFactory();

  public java.util.List<User> users; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERS((short)1, "users");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USERS
          return USERS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERS, new org.apache.thrift.meta_data.FieldMetaData("users", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, User.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Users.class, metaDataMap);
  }

  public Users() {
  }

  public Users(
    java.util.List<User> users)
  {
    this();
    this.users = users;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Users(Users other) {
    if (other.isSetUsers()) {
      java.util.List<User> __this__users = new java.util.ArrayList<User>(other.users.size());
      for (User other_element : other.users) {
        __this__users.add(new User(other_element));
      }
      this.users = __this__users;
    }
  }

  public Users deepCopy() {
    return new Users(this);
  }

  @Override
  public void clear() {
    this.users = null;
  }

  public int getUsersSize() {
    return (this.users == null) ? 0 : this.users.size();
  }

  public java.util.Iterator<User> getUsersIterator() {
    return (this.users == null) ? null : this.users.iterator();
  }

  public void addToUsers(User elem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<User>();
    }
    this.users.add(elem);
  }

  public java.util.List<User> getUsers() {
    return this.users;
  }

  public Users setUsers(java.util.List<User> users) {
    this.users = users;
    return this;
  }

  public void unsetUsers() {
    this.users = null;
  }

  /** Returns true if field users is set (has been assigned a value) and false otherwise */
  public boolean isSetUsers() {
    return this.users != null;
  }

  public void setUsersIsSet(boolean value) {
    if (!value) {
      this.users = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USERS:
      if (value == null) {
        unsetUsers();
      } else {
        setUsers((java.util.List<User>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USERS:
      return getUsers();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USERS:
      return isSetUsers();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Users)
      return this.equals((Users)that);
    return false;
  }

  public boolean equals(Users that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_users = true && this.isSetUsers();
    boolean that_present_users = true && that.isSetUsers();
    if (this_present_users || that_present_users) {
      if (!(this_present_users && that_present_users))
        return false;
      if (!this.users.equals(that.users))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsers()) ? 131071 : 524287);
    if (isSetUsers())
      hashCode = hashCode * 8191 + users.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Users other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsers()).compareTo(other.isSetUsers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.users, other.users);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Users(");
    boolean first = true;

    sb.append("users:");
    if (this.users == null) {
      sb.append("null");
    } else {
      sb.append(this.users);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (users == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'users' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UsersStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UsersStandardScheme getScheme() {
      return new UsersStandardScheme();
    }
  }

  private static class UsersStandardScheme extends org.apache.thrift.scheme.StandardScheme<Users> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Users struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.users = new java.util.ArrayList<User>(_list0.size);
                User _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new User();
                  _elem1.read(iprot);
                  struct.users.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setUsersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Users struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.users != null) {
        oprot.writeFieldBegin(USERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.users.size()));
          for (User _iter3 : struct.users)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UsersTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UsersTupleScheme getScheme() {
      return new UsersTupleScheme();
    }
  }

  private static class UsersTupleScheme extends org.apache.thrift.scheme.TupleScheme<Users> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Users struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.users.size());
        for (User _iter4 : struct.users)
        {
          _iter4.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Users struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.users = new java.util.ArrayList<User>(_list5.size);
        User _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new User();
          _elem6.read(iprot);
          struct.users.add(_elem6);
        }
      }
      struct.setUsersIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

