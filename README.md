# webapp-spring-mvc

# http://localhost:8080/

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
