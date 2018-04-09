package org.duckdns.owly.dozerOneWayTest;

import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.junit.Assert;
import org.junit.Test;

public class DozerMappingTest {
    @Test
    public void testDozerMapping() {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        Dest d = mapper.map(new Source(2L), Dest.class);
        Assert.assertEquals(Long.valueOf(2L), d.id);
    }
}
