package org.zalando.typemapper.core.fieldMapper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DoubleFieldMapperTest {

    private DoubleFieldMapper doubleFieldMapper;

    @Before
    public void setUp() {
        doubleFieldMapper = new DoubleFieldMapper();
    }

    @Test
    public void testShouldMapNullValuesToNull() {
        assertThat(doubleFieldMapper.mapField(null, Double.class), nullValue());
    }

    @Test
    public void testShouldDoubleStringRepresentationToDouble() {
        assertThat((Double) doubleFieldMapper.mapField("1.23", Double.class), equalTo(1.23));
    }

}
