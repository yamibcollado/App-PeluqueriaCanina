package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-01-18T12:51:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, Duenio> duenio;
    public static volatile SingularAttribute<Mascota, String> nombreMascota;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, String> atencion_especial;

}