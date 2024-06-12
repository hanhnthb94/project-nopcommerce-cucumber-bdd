package utilities;


import org.aeonbits.owner.Config;

@Config.Sources({"file:environmentConfig/${server}.properties"})
public interface EnvironmentConfig extends Config {

    @Key("App.Url")
    String appUrl();
    @Key("App.User")
    String appName();
    @Key("App.Password")
    String appPassword();
    @Key("db.Url")
    String dbUrl();

}
