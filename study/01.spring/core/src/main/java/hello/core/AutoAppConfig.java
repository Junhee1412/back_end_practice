package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //지정하지 않으면 @ComponentScan이 붙은 설정정보 클래스 패키지가 시작위치가 된다.
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes=Configuration.class)
)
public class AutoAppConfig {

}
