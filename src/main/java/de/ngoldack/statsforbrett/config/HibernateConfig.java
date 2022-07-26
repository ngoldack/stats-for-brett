package de.ngoldack.statsforbrett.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class HibernateConfig {

    private Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.PostgreSQLDialect");
        return hibernateProperties;
    }

    @Bean
    public DataSource getDataSource() {
        var url = System.getenv("DATABASE_URL");
        if (!System.getenv("DATABASE_URL").contains("jdbc")) {
            url = "jdbc:" + url.replace("postgres", "postgresql");
        }

        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url(url)
                .build();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        sessionFactory.setPackagesToScan("de.ngoldack.statsforbrett.models");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }
}
