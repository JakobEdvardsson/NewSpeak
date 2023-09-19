package NewSpeak;

import NewSpeak.grammar.NewSpeakLexer;
import NewSpeak.grammar.NewSpeakParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RunCompiler {
    public static void main(String[] args) throws IOException {
        String sourceFile;
        String outFile;

        if (args.length > 0) {
            sourceFile = args[0];
        }
        else {
            System.out.println("Vilken fil vill du köra?");
            Scanner scanner = new Scanner(System.in);
            sourceFile = scanner.nextLine();
        }

        if (args.length > 1) {
            outFile = args[1];
        }
        else {
            System.out.println("Vad ska den kompilerade filen heta?");
            Scanner scanner = new Scanner(System.in);
            outFile = scanner.nextLine();
        }

        CompileNewSpeak compiler = new CompileNewSpeak();

        // Läs in källkoden
        CharStream inputStream = CharStreams.fromFileName(sourceFile);

        // Här tar vi källkoden och tar ut en ström av tokens
        NewSpeakLexer lexer = new NewSpeakLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Här skapar vi en parser och parsar våra tokens
        NewSpeakParser parser = new NewSpeakParser(tokens);

        // Hämta ut noden som matchar den första regeln. I Xpres-fallet heter den "code"
        ParseTree tree = parser.file();

        // Skapa en tree walker och kasta in den till kompilatorn
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);

        // Skriv det kompilerade programmet till en fil
        System.out.println(compiler.getCompiled());
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outFile), StandardCharsets.US_ASCII)) {
            writer.write(compiler.getCompiled());
        }

        new Translator(outFile, outFile+"_translated.vm").translateAndSave();

    }
}