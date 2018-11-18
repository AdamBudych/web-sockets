package com.websockets;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SampleControlerTest {

    @Test
    public void hallo() {
        SampleControler sampleControler = new SampleControler();
        String result = sampleControler.hallo();
        assertThat(result).isEqualTo("Hallo");
    }
}