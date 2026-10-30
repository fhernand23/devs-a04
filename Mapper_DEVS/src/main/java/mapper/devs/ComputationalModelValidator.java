package mapper.devs;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.pivot.utilities.OCL;

import devsComputationalModel.DevsComputationalModelPackage;
import devsComputationalModel.util.DevsComputationalModelValidator;

public class ComputationalModelValidator {

    public static Diagnostic validate(File xmiFile) throws Exception {

        /*
         * Inicializa el metamodelo computacional.
         */
        DevsComputationalModelPackage.eINSTANCE.eClass();

        /*
         * Registra el validator generado por EMF.
         * Acá están incluidas las restricciones OCL generadas.
         */
        EValidator.Registry.INSTANCE.put(
                DevsComputationalModelPackage.eINSTANCE,
                DevsComputationalModelValidator.INSTANCE
        );

        ResourceSet resourceSet = new ResourceSetImpl();

        /*
         * Inicializa OCL Pivot utilizando este ResourceSet.
         */
        OCL ocl = OCL.newInstance(resourceSet);

        try {

            /*
             * Configuración XMI.
             */
            resourceSet
                .getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put(
                    Resource.Factory.Registry.DEFAULT_EXTENSION,
                    new XMIResourceFactoryImpl()
                );

            /*
             * Registro del metamodelo destino.
             */
            resourceSet
                .getPackageRegistry()
                .put(
                    DevsComputationalModelPackage.eNS_URI,
                    DevsComputationalModelPackage.eINSTANCE
                );

            /*
             * Cargar el XMI generado por ATL.
             */
            Resource resource = resourceSet.getResource(
                    URI.createFileURI(xmiFile.getAbsolutePath()),
                    true
            );

            EcoreUtil.resolveAll(resource);

            BasicDiagnostic diagnostics =
                    new BasicDiagnostic(
                            Diagnostic.OK,
                            "mapper.devs.validation",
                            0,
                            "Validación del modelo computacional",
                            new Object[] { xmiFile }
                    );

            Map<Object, Object> context =
                    new HashMap<>();

            /*
             * Validar todos los objetos raíz.
             */
            for (EObject root : resource.getContents()) {

                Diagnostician.INSTANCE.validate(
                        root,
                        diagnostics,
                        context
                );
            }

            return diagnostics;

        } finally {

            /*
             * Libera los recursos internos utilizados por OCL.
             */
            ocl.dispose();
        }
    }

    private ComputationalModelValidator() {
    }
}