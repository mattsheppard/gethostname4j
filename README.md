# gethostname4j
Simple JNA library to get the current machine's hostname from Java

I was frustrated to find that the common-ish Java idiom of `InetAddress.getLocalHost().getHostName()` was returning localhost in some cases that only seemd solved by tinkering with `/etc/hosts`. This library uses JNA to directly call the C library's gethostname method (or Kernel32Util.getComputerName() on Windows), and gives you back the hostname it got.

If it seems useful, perhaps I'll organise to get it into Maven central.

See also:
- http://stackoverflow.com/questions/7348711/recommended-way-to-get-hostname-in-java
- http://stackoverflow.com/questions/10542664/getting-hostname-with-java-fails-in-latest-jdk7
- http://stackoverflow.com/questions/6050011/how-do-i-get-the-local-hostname-if-unresolvable-through-dns-in-java
- http://stackoverflow.com/questions/36130908/bad-behavior-with-inetaddress-getlocalhost-gethostname-in-java-8
