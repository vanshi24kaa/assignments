/*
 * package com.company.springsecurity.configure;
 *
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.authentication.configurers.
 * provisioning.InMemoryUserDetailsManagerConfigurer; import
 * org.springframework.security.config.annotation.authentication.configurers.
 * provisioning.UserDetailsManagerConfigurer; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 *
 * @EnableWebSecurity public class SpringSecurityConfiguration extends
 * WebSecurityConfigurerAdapter{
 *
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { // TODO Auto-generated method stub auth.inMemoryAuthentication()
 * .withUser("sreeja") .password("sreeja123") .roles("USER") .and()
 * .withUser("sreeya") .password("sreeya123") .roles("ADMIN");
 *
 * }
 *
 * private UserDetailsManagerConfigurer<AuthenticationManagerBuilder,
 * InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>> and() {
 * // TODO Auto-generated method stub return null; }
 *
 * @Bean public PasswordEncoder getPasswordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 *
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests() .antMatchers("/**") .hasRole("ADMIN")
 * .and().formLogin(); }
 *
 * }
 */