package com.zoloo.multidatasource.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "teacherEntityManagerFactory",
    transactionManagerRef = "teacherTransactionManager", 
    basePackages = {"com.zoloo.multidatasource.teacher.TeacherRepository"})
public class TeacherDBConfig {

  @Bean(name = "teacherDataSource")
  @ConfigurationProperties(prefix = "teacher.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create()
    .driverClassName("org.postgresql.Driver")
    .url("jdbc:postgresql://localhost:5432/studentsystem?currentSchema=public")
    .username("postgres")
    .password("admin123")
    .build();
  }

  @Bean(name = "teacherEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
      EntityManagerFactoryBuilder builder, @Qualifier("teacherDataSource") DataSource dataSource) {
    return builder.dataSource(dataSource).packages("com.zoloo.multidatasource.teacher.model").persistenceUnit("teacher")
        .build();
  }

  @Bean(name = "teacherTransactionManager")
  public PlatformTransactionManager barTransactionManager(
      @Qualifier("teacherEntityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
    return new JpaTransactionManager(barEntityManagerFactory);
  }

}
