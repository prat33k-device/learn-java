package POJO_and_Record;

// official part of java JDK16 and higher
// Record purpose is to replace boilerplate code of POJO but to be more restrictive

// these passed parameters are called record headers
// for each component in header, java generates:
//  1. a field with the same name and declared type as record component
//  2. a field declated private and final
//  3. a field is sometimes reffered to as a component field
//  4. toString method
//  5. getters with naming convension: object.name, objce.dateOfBirth.....
//  6 no setters are generated because records goal is to be immutable
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {

}
