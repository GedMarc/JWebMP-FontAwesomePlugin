/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.fontawesome;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 * @author GedMarc
 */
public class FontAwesomeTest extends BaseTestClass
{
	
	public FontAwesomeTest()
	{
	}
	
	@Test
	public void testIcon_FontAwesomeIcons_FontAwesomePropertiesArr()
	{
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void testIcon_FontAwesomeIcons()
	{
		FontAwesome fa = new FontAwesome(FontAwesomeIcons.cog);
		System.out.println(fa.toString(true));
		
		Page p = getInstance();
		p.getBody().add(fa);
		System.out.println(p.toString(true));
	}
	
	@Test
	public void testSetSize()
	{
	}
	
}
