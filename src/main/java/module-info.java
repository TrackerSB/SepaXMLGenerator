module bayern.steinbrecher.SepaXMLGenerator {
    exports bayern.steinbrecher.sepaxmlgenerator;

    requires com.sun.tools.xjc;
    requires com.sun.xml.bind;
    requires io.soabase.recordbuilder.core;

    requires java.compiler;
    requires java.logging;
    requires java.xml;

    opens bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109 to com.sun.xml.bind;
}