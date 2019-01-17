/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.fontawesome;

import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.interfaces.children.BodyChildren;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.base.html.interfaces.children.PageChildren;
import com.jwebmp.core.base.html.interfaces.children.generics.ParagraphChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * The FontAwesome project.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 21 May 2016
 */
@ComponentInformation(name = "Font Awesome 4.7",
		description = "The font awesome tag",
		url = "www.fontawesome.com")
public class FontAwesome<J extends FontAwesome<J>>
		extends Italic<J>
		implements ListItemChildren<IComponentHierarchyBase, J>, ParagraphChildren<IComponentHierarchyBase, J>, BodyChildren<IComponentHierarchyBase, J>, PageChildren
{


	/**
	 * Construct a new instant of a font awesome icon
	 *
	 * @param icon
	 */
	public FontAwesome(FontAwesomeIcons icon)
	{
		this(icon, (FontAwesomeProperties) null);
	}

	/**
	 * Construct a new instance of the font awesome
	 *
	 * @param icon
	 * @param size
	 */
	public FontAwesome(FontAwesomeIcons icon, FontAwesomeProperties... size)
	{
		setTiny(true);
		if (icon != null)
		{
			addClass(icon.toString());
		}

		if (size != null)
		{
			for (FontAwesomeProperties fontAwesomeProperties : size)
			{
				if (fontAwesomeProperties != null)
				{
					addClass(fontAwesomeProperties.toString());
				}
			}
		}
	}

	/**
	 * Creates a new FontAwesome Icon with the given icon and size
	 *
	 * @param icon
	 * 		The icon to use
	 * @param size
	 * 		The size to have
	 *
	 * @return
	 */
	public static FontAwesome<?> icon(FontAwesomeIcons icon, FontAwesomeProperties... size)
	{
		return new FontAwesome(icon, size);
	}

	/**
	 * Creates a new FontAwesome Icon with the given icon and size
	 *
	 * @param icon
	 * 		The icon to use
	 *
	 * @return
	 */
	public static FontAwesome<?> icon(FontAwesomeIcons icon)
	{
		return new FontAwesome(icon, (FontAwesomeProperties) null);
	}

	/**
	 * Sets the size of this icon
	 *
	 * @param size
	 *
	 * @return
	 */
	public FontAwesome<?> setSize(FontAwesomeProperties size)
	{
		if (size != null)
		{
			addClass(size.toString());
		}
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return false;
	}
}
