import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.fontawesome.FontAwesomePageConfigurator;

module com.jwebmp.plugins.fontawesome {
	exports com.jwebmp.plugins.fontawesome;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires commons.lang3;

	provides IPageConfigurator with FontAwesomePageConfigurator;

}
