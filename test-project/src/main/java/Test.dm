import Test2
domain-model Test {
  node-mongo-options {

  }

  entity B extends Test2.A{
    String b
  }
  entity C extends Test2.A{
    String c
  }
  entity Item {
    String id
    String desc
    key (id)
  }
  entity Line {
    Id id
    String desc
    key (id)
  }
  enum Enum {
    a="1"
  }
  entity R {
  	Integer id
  	key(id)
  }
  type TT {
    String aa!
  }
  type T {
    String a!
    String b?
    TT tt?
    TT tts*
  }
  entity WithId {
   Id id unique
   key(id)
  }
  entity Simple {
    String a
  }
  entity All{
    Amount a?
    Any a2?
    Boolean b?
    Count c?
    Date d?
    enum Enum ^e?
    GeoLocation g ?
    Id i
    Integer i2?
    Numeric n?
    Price p?
    ref R r?
    ShortId s? "1234567890" 1000000
    String s2?
    T t
    T twt?
    T ts*
    T moreTs*
  }
  entity Ref {
    String a
    ref Simple i
  }

  enum Values {
    One="One"
  }
  entity Validation {
    String hidden pattern "[aA-zZ]{6}" obscured
    String patterned pattern "^pattern$"
    Numeric ranged1 [1.0 .. 2.0]
    Numeric ranged2 [1.0 .. 2.0]
    Integer ranged3 [3 .. 4]
    Integer ranged4 [3 .. 4]
    String lengthed [1 ..2]
    String patterndLength1 pattern "[a-z]*" [1 ..2]
    String patterndLength2 pattern "[a-z]*" [1 ..2]
    String required!
    T t!
    T ts*
    enum Values valued!
  }
  entity Validation2 {
    TT tt!
    TT tt2?
  }

  association l2i {
    Line line+
    <--> Item items?
  }
}
