package com.github.liweijie.eventbusclass.compiler;

import com.github.liweijie.eventbusclass.annotation.EventBusClass;
import com.google.auto.service.AutoService;

import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

/**
 * 作者：黎伟杰 on 2017/12/24.
 * 邮箱：liweijie@qq.com
 * description：注解处理器，负责生成对应的EventBusClass
 * update by:
 */
@AutoService(Processor.class)

public class EventBusClassProcessor extends AbstractProcessor {

    /**
     *  指定处理EventBusClass注解
     * @return
     */
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(EventBusClass.class.getName());
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        return false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_7;
    }
}
