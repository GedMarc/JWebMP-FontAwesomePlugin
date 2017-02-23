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
@PluginInformation(pluginName = "Font Awesome", pluginUniqueName = "font-awesome", pluginDescription = "Font Awesome gives you scalable vector icons that can instantly be customized — size, color, drop shadow, and anything that can be done with the power of CSS. ", pluginVersion = "4.7",
        pluginDependancyUniqueIDs = "", pluginCategories = "fonts, icons", pluginSubtitle = "In a single collection, Font Awesome is a pictographic language of web-related actions. ",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-FontAwesomePlugin", pluginSourceUrl = "",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-FontAwesomePlugin/wiki",
        pluginOriginalHomepage = "http://fontawesome.io/")
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
            if (page.getBody().readChildrenPropertyFirstResult(FontAwesome4Enabled, true))
            {
                page.getBody().getCssReferences().add(FontAwesomeReferencePool.FontAwesomeReference.getJavaScriptReference());
            }
        }
        return page;
    }

    /**
     * Sets the component as font awesome required to build
     *
     * @param component
     * @param required
     */
    public static void setFontAwesomeRequired(Component component, boolean required)
    {
        component.getProperties().put(FontAwesome4Enabled, required);
    }
}
