package org.beetl.core.exp;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.beetl.core.BasicTestCase;
import org.beetl.core.Template;

public class JsonTest extends BasicTestCase {
	@Test
	public void testAll() throws Exception {
		Template t = gt.getTemplate("/exp/priority_all_template.html");
		String str = t.render();
		AssertJUnit.assertEquals(
				this.getFileContent("/exp/priority_all_expected.html"), str);

		t = gt.getTemplate("/exp/priority_all_template.html");

		str = t.render();
		AssertJUnit.assertEquals(
				this.getFileContent("/exp/priority_all_expected.html"), str);
	}
}
