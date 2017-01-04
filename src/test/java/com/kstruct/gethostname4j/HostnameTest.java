package com.kstruct.gethostname4j;

import org.junit.Test;

public class HostnameTest {
    @Test
    public void test() {
        String hostname = Hostname.getHostname();
        System.out.println("Dear human - does this look like the right hostname? " + hostname);
    }
}
