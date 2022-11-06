package core.module;

import java.io.*;

public abstract class BaseModule<Input> {

    protected final PrintStream writer;
    protected final BufferedReader reader;

    public BaseModule(InputStream in, PrintStream out) {
        writer = out;
        reader = new BufferedReader(new InputStreamReader(in));
    }

    protected abstract Input readInput() throws IOException;

    protected abstract void core(Input input) throws IOException;

    public abstract String getModuleName();

    public void run() throws Exception {

        final Input input = this.readInput();
        this.core(input);

    }
}
