package ac.simons.keycloakdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Basic property class that wraps up basic properties relevant
 * to one Keycloak realm.
 */
@ConfigurationProperties(prefix = "keycloak-client")
class KeycloakClientProperties {

	private String serverUrl;

	private String realm;

	public String getServerUrl() {
		return this.serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getRealm() {
		return this.realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

}
