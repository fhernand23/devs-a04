package mapper.devs;

import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;

import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;

import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import booleanExpressionModel.BooleanExpressionModelPackage;
import devsComputationalModel.DevsComputationalModelPackage;
import devsModel.DevsModelPackage;
import mathExpressionModel.MathExpressionModelPackage;
import setTheoryModel.SetTheoryModelPackage;

public class AtlTransformationRunner {

    /**
     * Ruta del ASM dentro del classpath.
     *
     * El archivo debe estar ubicado en:
     *
     * src/main/resources/atl/DevsModel2Computational.asm
     */
    private static final String ATL_ASM_RESOURCE =
            "/atl/DevsModel2Computational.asm";


    /**
     * Ejecuta la transformación:
     *
     * devsModel.xmi
     *      ↓
     * DevsModel2Computational.asm
     *      ↓
     * devsComputationalModel.xmi
     */
    public static void transform(
            File inputXmi,
            File outputXmi) throws Exception {

        System.out.println(
                "Inicializando transformación ATL..."
        );


        // =========================================================
        // 1. Verificar modelo de entrada
        // =========================================================

        if (inputXmi == null || !inputXmi.exists()) {

            throw new IllegalStateException(
                    "No se encontró el modelo de entrada: "
                    + (inputXmi == null
                            ? "null"
                            : inputXmi.getAbsolutePath())
            );
        }


        System.out.println(
                "Modelo de entrada: "
                + inputXmi.getAbsolutePath()
        );

        System.out.println(
                "Transformación ATL: classpath:"
                + ATL_ASM_RESOURCE
        );

        System.out.println(
                "Modelo de salida: "
                + outputXmi.getAbsolutePath()
        );


        // =========================================================
        // 2. Inicializar metamodelos EMF
        // =========================================================

        DevsModelPackage.eINSTANCE.eClass();

        SetTheoryModelPackage.eINSTANCE.eClass();

        MathExpressionModelPackage.eINSTANCE.eClass();

        BooleanExpressionModelPackage.eINSTANCE.eClass();

        DevsComputationalModelPackage.eINSTANCE.eClass();


        // =========================================================
        // 3. Registrar paquetes en EMF
        // =========================================================

        EPackage.Registry.INSTANCE.put(
                DevsModelPackage.eNS_URI,
                DevsModelPackage.eINSTANCE
        );

        EPackage.Registry.INSTANCE.put(
                SetTheoryModelPackage.eNS_URI,
                SetTheoryModelPackage.eINSTANCE
        );

        EPackage.Registry.INSTANCE.put(
                MathExpressionModelPackage.eNS_URI,
                MathExpressionModelPackage.eINSTANCE
        );

        EPackage.Registry.INSTANCE.put(
                BooleanExpressionModelPackage.eNS_URI,
                BooleanExpressionModelPackage.eINSTANCE
        );

        EPackage.Registry.INSTANCE.put(
                DevsComputationalModelPackage.eNS_URI,
                DevsComputationalModelPackage.eINSTANCE
        );


        // =========================================================
        // 4. Crear infraestructura ATL / EMF
        // =========================================================

        ModelFactory modelFactory =
                new EMFModelFactory();

        EMFInjector injector =
                new EMFInjector();

        IExtractor extractor =
                new EMFExtractor();


        // =========================================================
        // 5. Cargar metamodelo origen
        // =========================================================

        IReferenceModel sourceMetamodel =
                modelFactory.newReferenceModel();

        /*
         * Como DevsModelPackage está registrado en
         * EPackage.Registry, ATL puede recuperarlo mediante
         * su nsURI.
         */
        injector.inject(
                sourceMetamodel,
                DevsModelPackage.eNS_URI
        );


        // =========================================================
        // 6. Cargar metamodelo destino
        // =========================================================

        IReferenceModel targetMetamodel =
                modelFactory.newReferenceModel();

        injector.inject(
                targetMetamodel,
                DevsComputationalModelPackage.eNS_URI
        );


        // =========================================================
        // 7. Cargar modelo de entrada
        // =========================================================

        IModel inputModel =
                modelFactory.newModel(
                        sourceMetamodel
                );

        injector.inject(
                inputModel,
                inputXmi.toURI().toString()
        );


        // =========================================================
        // 8. Crear modelo de salida
        // =========================================================

        IModel outputModel =
                modelFactory.newModel(
                        targetMetamodel
                );

        outputModel.setIsTarget(true);


        // =========================================================
        // 9. Configurar launcher ATL
        // =========================================================

        ILauncher launcher =
                new EMFVMLauncher();

        Map<String, Object> launcherOptions =
                new HashMap<String, Object>();

        launcher.initialize(
                launcherOptions
        );


        /*
         * IMPORTANTE:
         *
         * Estos nombres deben coincidir con el encabezado ATL:
         *
         * create OUT : DEVSOUT
         * from IN : DEVSIN;
         *
         * IN      -> nombre del modelo origen
         * DEVSIN  -> nombre del metamodelo origen
         *
         * OUT     -> nombre del modelo destino
         * DEVSOUT -> nombre del metamodelo destino
         */

        launcher.addInModel(
                inputModel,
                "IN",
                "DEVSIN"
        );

        launcher.addOutModel(
                outputModel,
                "OUT",
                "DEVSOUT"
        );


        // =========================================================
        // 10. Ejecutar transformación ATL
        // =========================================================

        System.out.println(
                "Ejecutando DevsModel2Computational..."
        );

        try (
                InputStream asm =
                        AtlTransformationRunner.class
                                .getResourceAsStream(
                                        ATL_ASM_RESOURCE
                                )
        ) {

            if (asm == null) {

                throw new IllegalStateException(
                        "No se encontró la transformación ATL en el classpath: "
                        + ATL_ASM_RESOURCE
                        + ". Verificar que el archivo exista en "
                        + "src/main/resources/atl/"
                );
            }

            launcher.launch(
                    ILauncher.RUN_MODE,
                    new NullProgressMonitor(),
                    Collections
                            .<String, Object>emptyMap(),
                    asm
            );
        }


        // =========================================================
        // 11. Guardar modelo resultante
        // =========================================================

        /*
         * Si ya existe una ejecución anterior, se reemplaza.
         */
        if (outputXmi.exists()) {

            boolean deleted =
                    outputXmi.delete();

            if (!deleted) {

                throw new IllegalStateException(
                        "No se pudo reemplazar el archivo de salida: "
                        + outputXmi.getAbsolutePath()
                );
            }
        }


        File parent =
                outputXmi.getAbsoluteFile()
                        .getParentFile();

        if (parent != null
                && !parent.exists()) {

            parent.mkdirs();
        }


        extractor.extract(
                outputModel,
                outputXmi.toURI().toString()
        );


        // =========================================================
        // 12. Verificación final
        // =========================================================

        if (!outputXmi.exists()) {

            throw new IllegalStateException(
                    "ATL finalizó pero no se generó el archivo: "
                    + outputXmi.getAbsolutePath()
            );
        }


        System.out.println(
                "Transformación ATL finalizada correctamente."
        );

        System.out.println(
                "Archivo generado: "
                + outputXmi.getAbsolutePath()
        );
    }


    /**
     * Evitamos instanciar esta clase porque solamente
     * contiene métodos estáticos.
     */
    private AtlTransformationRunner() {
    }
}