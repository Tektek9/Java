package core.module;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;


class DensityInput {
    double mass;
    double volume;

    public DensityInput(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }

}

public class DensityModule extends BaseModule<DensityInput> {

    public DensityModule(InputStream in, PrintStream out) {
        super(in, out);
    }

    @Override
    protected DensityInput readInput() throws IOException {

        super.writer.print("Berat (kg): ");
        double mass = Double.parseDouble(super.reader.readLine());
        super.writer.print("Volume (m3): ");
        double volume = Double.parseDouble(super.reader.readLine());

        return new DensityInput(mass, volume);

    }


    @Override
    protected void core(DensityInput input) throws IOException {
        double density = input.mass / input.volume;
        super.writer.println("Massa Jenis Air: " + density + " kg/m3");
    }


    @Override
    public String getModuleName() {
        return "Modul 4. Menghitung massa jenis air";
    }
}
