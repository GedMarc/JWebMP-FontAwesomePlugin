import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.fontawesome.FontAwesomePageConfigurator;
import com.jwebmp.plugins.fontawesome.implementations.FontAwesomeExclusionsModule;

module com.jwebmp.plugins.fontawesome {
	exports com.jwebmp.plugins.fontawesome;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with FontAwesomePageConfigurator;

	provides IGuiceScanJarExclusions with FontAwesomeExclusionsModule;
	provides IGuiceScanModuleExclusions with FontAwesomeExclusionsModule;

	opens com.jwebmp.plugins.fontawesome to com.fasterxml.jackson.databind, com.jwebmp.core;
}
