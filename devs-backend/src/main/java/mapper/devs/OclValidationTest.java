package mapper.devs;

import java.io.File;

import org.eclipse.emf.common.util.Diagnostic;

public class OclValidationTest {

    public static void main(String[] args) throws Exception {

        File computationalModelFile =
                new File("devsComputationalModel.xmi");

        System.out.println(
                "===== PRUEBA VALIDACIÓN OCL ====="
        );

        Diagnostic diagnostic =
                ComputationalModelValidator.validate(
                        computationalModelFile
                );

        printDiagnostic(
                diagnostic,
                ""
        );

        System.out.println(
                "\nSeveridad obtenida: "
                + diagnostic.getSeverity()
        );

        if (diagnostic.getSeverity() != Diagnostic.OK) {

            System.out.println(
                    "\nPRUEBA OK: OCL detectó la violación."
            );

        } else {

            System.out.println(
                    "\nATENCIÓN: OCL NO detectó la violación."
            );
        }
    }

    private static void printDiagnostic(
            Diagnostic diagnostic,
            String indent) {

        if (diagnostic.getMessage() != null) {

            System.out.println(
                    indent
                    + diagnostic.getMessage()
            );
        }

        for (Diagnostic child
                : diagnostic.getChildren()) {

            printDiagnostic(
                    child,
                    indent + "  "
            );
        }
    }
}