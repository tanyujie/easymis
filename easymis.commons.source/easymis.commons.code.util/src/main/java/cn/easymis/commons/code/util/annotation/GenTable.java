/**
 * 
 */
package cn.easymis.commons.code.util.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 代码注解table
 * @author desert
 * @version 1.0 2014/2/01
 */

@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE}) 
public @interface GenTable {
	 public String name() default "";       //对应数据库中列名
	 public String alias() default "";       //对应数据库中列名
}
