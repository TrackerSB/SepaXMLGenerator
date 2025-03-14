package bayern.steinbrecher.sepaxmlgenerator.internalUtility;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class XSDToJavaGenerator {
    public static void main(String[] args) throws IOException {
        SchemaCompiler schemaCompiler = XJC.createSchemaCompiler();
        schemaCompiler.setDefaultPackageName(XSDToJavaGenerator.class.getPackageName() + ".generated");
        InputSource xsdSource = new InputSource(
                new FileReader("E:/Downloads/pain.008.001.11.xsd")
        );
        xsdSource.setSystemId("ensureItsNonNull");
        schemaCompiler.parseSchema(xsdSource);
        S2JJAXBModel model = schemaCompiler.bind();
        JCodeModel code = model.generateCode(null, null);
        File outputDir = Paths.get("generated")
                .toFile();
        outputDir.mkdirs();
        code.build(outputDir);
        System.out.printf("Generated files are in %s%n", outputDir.getAbsolutePath());
    }
}
