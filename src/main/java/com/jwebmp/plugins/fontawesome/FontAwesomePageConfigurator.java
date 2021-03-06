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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 15 Feb 2017
 */
@PluginInformation(pluginName = "Font Awesome 4.7",
		pluginUniqueName = "font-awesome",
		pluginDescription = "Font Awesome gives you scalable vector icons that can instantly be customized — size, color, drop shadow, " +
		                    "and" + " anything that can be done with the power of CSS. ",
		pluginVersion = "4.7",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "In a single collection, Font Awesome is a pictographic language of web-related actions. ",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-FontAwesomePlugin",
		pluginSourceUrl = "",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-FontAwesomePlugin/wiki",
		pluginOriginalHomepage = "http://fontawesome.io/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/FontAwesomePlugin.jar/download",
		pluginIconUrl = "bower_components/font-awesome/icon.png",
		pluginIconImageUrl = "bower_components/font-awesome/icon.png",
		pluginLastUpdatedDate = "2017/03/04")
public class FontAwesomePageConfigurator
		implements IPageConfigurator<FontAwesomePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public FontAwesomePageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return FontAwesomePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		FontAwesomePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .getCssReferences()
			    .add(FontAwesomeReferencePool.FontAwesomeReference.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return FontAwesomePageConfigurator.enabled;
	}
}
