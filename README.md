# gethostname4j
Simple JNA library to get the current machine's hostname from Java

I was frustrated to find that the common-ish Java idiom of `InetAddress.getLocalHost().getHostName()` was returning localhost in some cases that only seemed solved by tinkering with `/etc/hosts`. This library uses JNA to directly call the C library's gethostname method (or `Kernel32Util.getComputerName()` on Windows), and gives you back the hostname it got.

You can get it from maven central with a dependency like this...

```
    <dependency>
        <groupId>com.kstruct</groupId>
        <artifactId>gethostname4j</artifactId>
        <version>1.0.0</version>
    </dependency>
```
or
```gradle
compile 'com.kstruct:gethostname4j:1.0.0'
```
in Gradle

...and then use it in your code to get the hostname with something like...

```
    import com.kstruct.gethostname4j.Hostname;
    
    ...
    
    String hostname = Hostname.getHostname();
```

## See also

- http://stackoverflow.com/questions/7348711/recommended-way-to-get-hostname-in-java
- http://stackoverflow.com/questions/10542664/getting-hostname-with-java-fails-in-latest-jdk7
- http://stackoverflow.com/questions/6050011/how-do-i-get-the-local-hostname-if-unresolvable-through-dns-in-java
- http://stackoverflow.com/questions/36130908/bad-behavior-with-inetaddress-getlocalhost-gethostname-in-java-8

## Build/Test

[![Linux Java 11 CI](https://github.com/mattsheppard/gethostname4j/actions/workflows/linux-jdk11.yml/badge.svg)](https://github.com/mattsheppard/gethostname4j/actions/workflows/linux-jdk11.yml)
[![Mac Java 11 CI](https://github.com/mattsheppard/gethostname4j/actions/workflows/macos-jdk11.yml/badge.svg)](https://github.com/mattsheppard/gethostname4j/actions/workflows/macos-jdk11.yml)
[![Windows Java 11 CI](https://github.com/mattsheppard/gethostname4j/actions/workflows/windows-jdk11.yml/badge.svg)](https://github.com/mattsheppard/gethostname4j/actions/workflows/windows-jdk11.yml)
[![Linux Java 8 CI](https://github.com/mattsheppard/gethostname4j/actions/workflows/linux-jdk8.yml/badge.svg)](https://github.com/mattsheppard/gethostname4j/actions/workflows/linux-jdk8.yml)
