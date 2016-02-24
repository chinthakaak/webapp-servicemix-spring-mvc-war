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
