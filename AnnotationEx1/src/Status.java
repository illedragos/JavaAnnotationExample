import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)            //Target specifies where an annotation can be placed          
@Retention(RetentionPolicy.RUNTIME)    //!Retention defines how long the annotation should be kept around

	
/*->RetentionPolicy.SOURCE - discard during the compile step	
example: @Override, @SuppressWarnings                   */

//->RetentionPolicy.CLASS (default option)- discard during the class load

//->RetentionPolicy.RUNTIME - don't discard. Annotation should be available for reflection at runtime

public @interface Status {
	
	String author() default "Vasile";
	int progress() default 0;
}
