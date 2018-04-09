# Test for showing difference in one-way mapper between Dozer 6.1.0 and 6.2.0

This is just a small test project written to show different behavior in Dozer
Bean Mapper versions 6.1.0 and 6.2.0 when it comes to one-way mapper defined in
`dozerBeanMapping.xml`.

Per default the test runs against Dozer 6.1.0, which works the same way as the
5.X releases did, namely: if I define a custom one-way mapping from ClassA to
ClassB the mapper still provides a default mapper from ClassB to ClassA.

In version 6.2.0 this behavior was changed: the latter default mapper from
ClassB to ClassA does not exist anymore, leaving an empty ClassA.

## Usage

To run the test against Dozer 6.1.0 just execute:

    mvn clean install

To run the test against Dozer 6.2.0 - which will **fail** - just execute:

    mvn clean install -Ddozer.version=6.2.0

## Code

All the relevant code resides in the only test class, namely
`DozerMappingTest.java` (https://github.com/j-be/dozer-one-way-test/blob/master/src/test/java/org/duckdns/owly/dozerOneWayTest/DozerMappingTest.java).
