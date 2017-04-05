this application is an Example for  Spring 2.5 circulardependency injection.
I used maven for building the project(it also loads dependencies).
I used ApplicationContext,ClassPathXmlApplicationContext for loading the dependencies.

maven commands 
navigate to application directory on command promt 
mvn clean install it will download the dependencies in m2 repository(C:\Users\Srinivas\.m2\repository). it will remove the content in target folder in side the application(it contains jar  or war file) and creates war  or jar with latest code
mvn eclipse:eclipse it will load the dependencies to application class path(project build path) from m2 repository