package com.kstruct.gethostname4j;

import junit.framework.TestCase;

public class HostnameTest extends TestCase {
    public void test() {
        String hostname = Hostname.getHostname();
        System.out.println("Dear human - does this look like the right hostname? " + hostname);
    }
}
