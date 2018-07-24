package com.nk.developer.nkcartcore;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NkcartCoreApplication.class)
public class NkcartCoreApplicationTests
{
    @Autowired DataSource dataSource;

    @Test
    public void testDummy() throws SQLException
    {
        String schema = dataSource.getConnection().getCatalog();
        assertTrue("jcart".equalsIgnoreCase(schema));
    }
}
