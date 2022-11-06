package core.module;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class VoconsModule extends BaseModule<String> {
    public VoconsModule(InputStream in, PrintStream out) {
        super(in, out);
    }

    @Override
    protected String readInput() throws IOException {
        super.writer.print("Kalimat: ");
        String input = super.reader.readLine();
        return input;
    }

    @Override
    protected void core(String s) throws IOException {
        int vocal = 0;
        int consonant = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (isVocal(c)) {
                super.writer.println("'" + c + "' : vocal");
                vocal++;
            } else {
                super.writer.println("'" + c + "' : consonant");
                consonant++;
            }
        }
        System.out.println("Total Vocal: " + vocal);
        System.out.println("Total Consonant: " + consonant);
    }

    private boolean isVocal(char c) {
        switch (c) {
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':
                return true;
        }
        return false;
    }

    @Override
    public String getModuleName() {
        return "Modul 3. Menghitung huruf vocal dan consonant";
    }
}
