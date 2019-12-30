package me.choi;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

public class MagicMojaProcessor extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        //Magic이라는 annotation을 가지고 있는 element들을 처리하겠다.
        //element : source code의 구성요소 ex) pakage element, method element
        return Set.of(Magic.class.getName());
    }

    /*어떠한 소스버전을 지원하는지*/
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }


    //RoundEnvironment : annotation processor는 round 개념으로 동작한다.
    /*
    * 여러 라운드에 걸쳐서 처리.
    * */


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(Magic.class);

        for(Element element : elements) {
            Name elementName = element.getSimpleName();
            if(element.getKind() != ElementKind.INTERFACE) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Magic annotation can not be used on"+elementName);
            } else {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Processing" + elementName);
            }
        }
        return true;
    }
}
