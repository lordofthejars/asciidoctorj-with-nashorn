package org.asciidoctor.internal;

import java.io.File;
import java.util.Map;

import org.asciidoctor.ast.Document;
import org.asciidoctor.extension.ExtensionRegistry;

public interface AsciidoctorJ {

    String convert(String source);
    String convert(String source, Map<String, Object> options);
    String convertFile(File filename);
    String convertFile(File filename, Map<String, Object> options);
    Document load(String content, Map<String, Object> options);
    Document loadFile(File filename, Map<String, Object> options);
    
   <T extends ExtensionRegistry> T createExtensionRegistry(final Class<T> type) throws IllegalArgumentException;
   void unregisterAllExtensions();
   
   void shutdown();
   String asciidoctorVersion();
   
}