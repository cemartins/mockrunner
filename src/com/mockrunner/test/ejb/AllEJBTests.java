package com.mockrunner.test.ejb;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllEJBTests
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test for com.mockrunner.test.ejb");
        //$JUnit-BEGIN$
        suite.addTest(new TestSuite(EJBTestModuleTest.class));
        suite.addTest(new TestSuite(EJBMockObjectFactoryTest.class));
        //$JUnit-END$
        return suite;
    }
}
