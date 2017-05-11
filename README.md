### Build instructions
Create a maven profile with the appropriate paths for the liferay server, e.g.:

	<profile>
		<id>liferay-625</id>
		<properties>
			<liferay.version>6.2.5</liferay.version>
			<liferay.maven.plugin.version>6.2.10.13</liferay.maven.plugin.version>
			<liferay.auto.deploy.dir>/opt/liferay-portal-6.2-ce-ga6/deploy</liferay.auto.deploy.dir>
			<liferay.app.server.deploy.dir>/opt/liferay-portal-6.2-ce-ga6/tomcat-7.0.62/webapps</liferay.app.server.deploy.dir>
			<liferay.app.server.lib.global.dir>/opt/liferay-portal-6.2-ce-ga6/tomcat-7.0.62/lib/ext</liferay.app.server.lib.global.dir>
			<liferay.app.server.portal.dir>/opt/liferay-portal-6.2-ce-ga6/tomcat-7.0.62/webapps/ROOT</liferay.app.server.portal.dir>
		</properties>
	</profile>


Build by using the above profile, e.g.:

	mvn clean install -Pliferay-625
