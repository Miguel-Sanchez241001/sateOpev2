package pe.bn.com.sate.ope.transversal.configuration;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement(proxyTargetClass=true)
public class PersistenciaConfig {

	public static final String DATA_SOURCE_SATE_1 = "jdbc/db_sate";
	
	public static final String DATA_SOURCE_SATE_2 = "jdbc/db_sate_tablas";

	public static final String SQL_SESSION_FACTORY_SATE_1 = "sqlSessionFactory1";
	
	public static final String SQL_SESSION_FACTORY_SATE_2 = "sqlSessionFactory2";

	public static final String MAPPERS_PACKAGE_SATE_1 = "pe.bn.com.sate.ope.persistence.mapper.internal";
	
	public static final String MAPPERS_PACKAGE_SATE_2 = "pe.bn.com.sate.ope.persistence.mapper.external";

	@Value("classpath:pe/bn/com/sate/ope/persistence/mapper/internal/*.xml")
	private Resource[] mapperLocationSate;
	
	@Value("classpath:pe/bn/com/sate/ope/persistence/mapper/external/*.xml")
	private Resource[] mapperLocationTablas;

	@Bean
	public DataSource dataSourceSate1() throws NamingException {
		JndiObjectFactoryBean dataSource = new JndiObjectFactoryBean();
		dataSource.setExpectedType(DataSource.class);
		dataSource.setJndiName(DATA_SOURCE_SATE_1);
		dataSource.setLookupOnStartup(true);
		dataSource.setProxyInterface(DataSource.class);

		try {
			dataSource.afterPropertiesSet();
		} catch (NamingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return (DataSource) dataSource.getObject();
	}

	@Bean
	public DataSource dataSourceSate2() throws NamingException {
		JndiObjectFactoryBean dataSource = new JndiObjectFactoryBean();
		dataSource.setExpectedType(DataSource.class);
		dataSource.setJndiName(DATA_SOURCE_SATE_2);
		dataSource.setLookupOnStartup(true);
		dataSource.setProxyInterface(DataSource.class);

		try {
			dataSource.afterPropertiesSet();
		} catch (NamingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return (DataSource) dataSource.getObject();
	}

	@Bean(name = SQL_SESSION_FACTORY_SATE_1)
	public SqlSessionFactory sqlSessionFactorySate() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSourceSate1());
		sessionFactory.setMapperLocations(mapperLocationSate);
		sessionFactory.setTypeAliasesPackage("pe.bn.com.sate.ope.transversal.dto.sate");
		SqlSessionFactory sqlSessionFactory = sessionFactory.getObject();
		sqlSessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
		return sqlSessionFactory;
	}
	
	@Bean(name = SQL_SESSION_FACTORY_SATE_2)
	public SqlSessionFactory sqlSessionFactorySarasign() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSourceSate2());
		sessionFactory.setMapperLocations(mapperLocationTablas);
		sessionFactory.setTypeAliasesPackage("pe.bn.com.sate.ope.transversal.dto.tablas");
		SqlSessionFactory sqlSessionFactory = sessionFactory.getObject();
		sqlSessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
		return sqlSessionFactory;
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurerSate1() {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage(MAPPERS_PACKAGE_SATE_1);
		configurer.setSqlSessionFactoryBeanName(SQL_SESSION_FACTORY_SATE_1);
		return configurer;
	}
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurerSate2() {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage(MAPPERS_PACKAGE_SATE_2);
		configurer.setSqlSessionFactoryBeanName(SQL_SESSION_FACTORY_SATE_2);
		return configurer;
	}
	
	@Bean
	public PlatformTransactionManager transactionManagerSate1() throws NamingException{
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSourceSate1());
		return dataSourceTransactionManager;
	}
}
