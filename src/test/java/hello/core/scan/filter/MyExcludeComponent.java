package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
// MyExcludeComponent -> 요거 붙은 놈은 ComponentScan 에서 제외할거야!