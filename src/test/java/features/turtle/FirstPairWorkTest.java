package features.turtle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstPairWorkTest {
	@Test
	public void �ӋC����() {
		FirstPairWork fpw = new FirstPairWork();
		assertEquals("Just do it.", fpw.getIkigomi());
	}

	@Test
	public void ���O() {
		FirstPairWork fpw = new FirstPairWork();
		assertEquals("cozykaz and urimaro", fpw.getMembers());
	}
}
