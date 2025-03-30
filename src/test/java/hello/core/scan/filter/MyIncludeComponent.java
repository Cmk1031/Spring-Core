package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
// MyIncludeComponent -> 요거 붙은 놈은 ComponentScan 에 추가할거야!