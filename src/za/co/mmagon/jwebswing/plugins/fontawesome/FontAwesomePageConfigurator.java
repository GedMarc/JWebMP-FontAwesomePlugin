/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.plugins.fontawesome;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 15 Feb 2017
 *
 */
@PluginInformation(pluginName = "Font Awesome 4.7",
                   pluginUniqueName = "font-awesome",
                   pluginDescription = "Font Awesome gives you scalable vector icons that can instantly be customized — size, color, drop shadow, and anything that can be done with the power of CSS. ",
                   pluginVersion = "4.7",
                   pluginDependancyUniqueIDs = "", pluginCategories = "fonts, icons",
                   pluginSubtitle = "In a single collection, Font Awesome is a pictographic language of web-related actions. ",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-FontAwesomePlugin", pluginSourceUrl = "",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-FontAwesomePlugin/wiki",
                   pluginOriginalHomepage = "http://fontawesome.io/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/FontAwesomePlugin.jar/download",
                   pluginIconUrl = "bower_components/font-awesome/icon.png",
                   pluginIconImageUrl = "bower_components/font-awesome/icon.png",
                   pluginLastUpdatedDate = "2017/03/04")
public class FontAwesomePageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;
    private static final Logger log = LogFactory.getInstance().getLogger("FontAwesome");
    public static final String FontAwesome4Enabled = "font-awesome-4-enabled";

    public FontAwesomePageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            page.getBody().getCssReferences().add(FontAwesomeReferencePool.FontAwesomeReference.getCssReference());

        }
        return page;
    }

    /**
     * Sets the component as font awesome required to build
     *
     * @param component
     * @param required
     */
    public static void setRequired(Component component, boolean required)
    {
        component.getProperties().put(FontAwesome4Enabled, required);
    }
}
