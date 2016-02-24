# webapp-spring-mvc

### http://localhost:8080/

Home controller resolves the logical view name only.

This only uses internal view resolver.
RESOLVING INTERNAL VIEWS
This embraces convention over configuration
InternalResourceViewResolver is one such convention-oriented element.
It
resolves a logical view name into a View object
that delegates rendering responsibility to a tem-
plate (usually a JSP) located in the web applica-
Logical view name
tion’s context.
prefix        logical view name   suffix
              ----
WEB-INF/views/home.jsp


# Deployment Steps
1. Install ServiceMix 5.5.0
Download: https://servicemix.apache.org/downloads/servicemix-5.5.0.html

2. karaf@root> install -s webbundle:file:/data/git_projects/webapp-servicemix-spring-mvc-war/target/spring-mvc-1.0-SNAPSHOT.war?Bundle-SymbolicName=web-spring-mvc&Web-ContextPath=home

3. In browser, go to http://localhost:8181/home/

Important Note:
following issue exists for felix for non osgi spring bundles
http://stackoverflow.com/questions/9215544/spring-felix-war-filenotfoundexception. The following solution works on servicemix5.5
1. uninstall spring from servicemix
2. Intead of component scan use following
    <context:annotation-config/>
    <!--<context:component-scan base-package="com.examples.controllers" />-->
    <bean id="homeController" class="com.examples.controllers.HomeController" />
    in sprinx-xxx-servlet.xml
    
karaf@root> features:uninstall spring

this would solve
2016-02-24 06:42:23,201 | ERROR | pool-8-thread-2  | DispatcherServlet                | 237 - org.springframework.web.servlet - 3.1.4.RELEASE | Context initialization failed
org.springframework.beans.factory.BeanDefinitionStoreException: Unexpected exception parsing XML document from ServletContext resource [/WEB-INF/spring-mvc-servlet.xml]; nested exception is org.springframework.beans.FatalBeanException: Class [org.springframework.context.config.ContextNamespaceHandler] for namespace [http://www.springframework.org/schema/context] does not implement the [org.springframework.beans.factory.xml.NamespaceHandler] interface
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadBeanDefinitions(XmlBeanDefinitionReader.java:412)[232:org.springframework.beans:3.1.4.RELEASE]


karaf@root> install -s webbundle:file:/data/git_projects/webapp-spring-mvc/target/spring-mvc-1.0-SNAPSHOT.war?Bundle-SymbolicName=web-mvc&Web-ContextPath=home

