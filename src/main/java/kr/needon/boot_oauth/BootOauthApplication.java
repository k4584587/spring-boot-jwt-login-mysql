package kr.needon.boot_oauth;

import kr.needon.boot_oauth.Config.Web.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class BootOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOauthApplication.class, args);
    }

}
