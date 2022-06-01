Generics: provides compile-time (static) type safety for collections and eliminates the need for most typecasts (type conversion) (specified by JSR 14)
Metadata: also called annotations; allows language constructs such as classes and methods to be tagged with additional data, which can then be processed by metadata-aware utilities (specified by JSR 175)
Autoboxing/unboxing: automatic conversions between primitive types (such as int) and primitive wrapper classes (such as Integer) (specified by JSR 201)
Enumerations: the enum keyword creates a typesafe, ordered list of values (such as Day.MONDAY, Day.TUESDAY, etc.); previously this could only be achieved by non-typesafe constant integers or manually constructed classes (typesafe enum pattern) (specified by JSR 201)
Varargs: the last parameter of a method can now be declared using a type name followed by three dots (e.g. void drawtext(String... lines)); in the calling code any number of parameters of that type can be used and they are then placed in an array to be passed to the method, or alternatively the calling code can pass an array of that type
Enhanced for each loop: the for loop syntax is extended with special syntax for iterating over each member of either an array or any Iterable, such as the standard Collection classes (specified by JSR 201)
Improved semantics of execution for multi-threaded Java programs; the new Java memory model addresses issues of complexity, effectiveness, and performance of previous specifications[29]
Static imports
There were also the following improvements to the standard libraries:

Automatic stub generation for RMI objects
Swing: New skinnable look and feel, called synth
The concurrency utilities in package java.util.concurrent[30]
Scanner class for parsing data from various input streams and buffers