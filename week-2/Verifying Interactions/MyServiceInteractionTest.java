package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceInteractionTest {
	@Test
	public void testVerifyInteraction() {
		ExternalApi mockApi=mock(ExternalApi.class);
		MyService s =new MyService(mockApi);
		s.fetchData();
		verify(mockApi).getData();
	}
}
