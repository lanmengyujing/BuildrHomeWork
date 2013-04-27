repositories.remote << "http://repository.springsource.com/maven/bundles/release/"
repositories.remote << "http://repository.springsource.com/maven/bundles/external/"
repositories.remote << 'http://www.ibiblio.org/maven2'
repositories.remote << 'http://download.java.net/maven/2'
repositories.remote << 'http://repo1.maven.org/maven2'
repositories.remote << 'https://repository.jboss.org/nexus/content/groups/public-jboss'



MVC = transitive("org.springframework:spring-webmvc:jar:3.1.0.RELEASE")

define 'my-webapp' do
  project.version = '0.1.0'
  compile.with MVC
  package :jar
end