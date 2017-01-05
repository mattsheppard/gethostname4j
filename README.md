# gethostname4j
Simple JNA library to get the current machine's hostname from Java

I was frustrated to find that the common-ish Java idiom of `InetAddress.getLocalHost().getHostName()` was returning localhost in some cases that only seemd solved by tinkering with `/etc/hosts`. This library uses JNA to directly call the C library's gethostname method (or `Kernel32Util.getComputerName()` on Windows), and gives you back the hostname it got.

You can get it from maven central with a dependency like this...

```
    <dependency>
        <groupId>com.kstruct</groupId>
        <artifactId>gethostname4j</artifactId>
        <version>0.0.1</version>
    </dependency>
```

...and then use it in your code to get the hostname with something like...

```
    import com.kstruct.gethostname4j.Hostname;
    # gethostname4j
Simple JNA library to get the current machine's hostname from Java

I was frustrated to find that the common-ish Java idiom of `InetAddress.getLocalHost().getHostName()` was returning localhost in some cases that only seemed solved by tinkering with `/etc/hosts`. This library uses JNA to directly call the C library's gethostname method (or `Kernel32Util.getComputerName()` on Windows), and gives you back the hostname it got.

You can get it from maven central with a dependency like this...

```
    <dependency>
        <groupId>com.kstruct</groupId>
        <artifactId>gethostname4j</artifactId>
        <version>0.0.1</version>
    </dependency>
```

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

## Builds

Travis CI (Linux and Mac) build: [![Linux and Mac Build Status](https://travis-ci.org/mattsheppard/gethostname4j.svg?branch=master)](https://travis-ci.org/mattsheppard/gethostname4j)

Appveyor (Windows) build: [![Windows Build Status](https://ci.appveyor.com/api/projects/status/github/mattsheppard/gethostname4j?branch=master&svg=true)](https://ci.appveyor.com/project/mattsheppard/gethostname4j)

    ...
    
    String hostname = Hostname.getHostname();
```

## See also

- http://stackoverflow.com/questions/7348711/recommended-way-to-get-hostname-in-java
- http://stackoverflow.com/questions/10542664/getting-hostname-with-java-fails-in-latest-jdk7
- http://stackoverflow.com/questions/6050011/how-do-i-get-the-local-hostname-if-unresolvable-through-dns-in-java
- http://stackoverflow.com/questions/36130908/bad-behavior-with-inetaddress-getlocalhost-gethostname-in-java-8

## Builds

Travis CI (Linux and Mac) build: [![Linux and Mac Build Status](https://travis-ci.org/mattsheppard/gethostname4j.svg?branch=master)](https://travis-ci.org/mattsheppard/gethostname4j)

Appveyor (Windows) build: [![Windows Build Status](https://ci.appveyor.com/api/projects/status/github/mattsheppard/gethostname4j?branch=master&svg=true)](https://ci.appveyor.com/project/mattsheppard/gethostname4j)
