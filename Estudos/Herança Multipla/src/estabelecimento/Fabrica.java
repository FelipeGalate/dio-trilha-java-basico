package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.MultiFuncional;

public class Fabrica {
    public static void main(String[] args) throws Exception {
        Scanner em = new Scanner();
        MultiFuncional multi = new MultiFuncional();


        Impressora impressora = multi;
        Copiadora copiadora = multi;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
