module com.jwebmp.plugins.fontawesome {
	exports com.jwebmp.plugins.fontawesome;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.fontawesome.FontAwesomePageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.fontawesome.implementations.FontAwesomeExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.fontawesome.implementations.FontAwesomeExclusionsModule;

	opens com.jwebmp.plugins.fontawesome to com.fasterxml.jackson.databind, com.jwebmp.core;
}
