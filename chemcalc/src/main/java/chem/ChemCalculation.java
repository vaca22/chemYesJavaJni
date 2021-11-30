package chem;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class ChemCalculation {
    static {
      /*  File libx2 = new File("cygwin1.dll");
        System.load(libx2.getAbsolutePath());*/
        File libx = new File("chem.so");
        System.load(libx.getAbsolutePath());
    }
    public static native String calcChem(byte[] chem);

    public static void main(String[] args) {
        String ga="H2+Ca(CN)2+NaAlF4+FeSO4+MgSiO3+KI+H3PO4+PbCrO4+BrCl+CF2Cl2+SO2=PbBr2+CrCl3+MgCO3+KAl(OH)4+Fe(SCN)3+PI3+Na2SiO3+CaF2+H2O";
        String chemResult=calcChem(ga.getBytes(StandardCharsets.US_ASCII));
        System.out.println(chemResult);

    }
}
