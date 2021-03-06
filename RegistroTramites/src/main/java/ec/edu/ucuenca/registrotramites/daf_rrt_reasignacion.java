package ec.edu.ucuenca.registrotramites;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class daf_rrt_reasignacion implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "REASIGNACION_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "REASIGNACION_ID_SEQ", name = "REASIGNACION_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Accion a realizar")
   private java.lang.String accionARealizar;

   @org.kie.api.definition.type.Label("Fecha")
   private java.util.Date fecha;

   @org.kie.api.definition.type.Label("Usuario destino")
   private java.lang.String usuarioDestino;

   public daf_rrt_reasignacion()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getAccionARealizar()
   {
      return this.accionARealizar;
   }

   public void setAccionARealizar(java.lang.String accionARealizar)
   {
      this.accionARealizar = accionARealizar;
   }

   public java.util.Date getFecha()
   {
      return this.fecha;
   }

   public void setFecha(java.util.Date fecha)
   {
      this.fecha = fecha;
   }

   public java.lang.String getUsuarioDestino()
   {
      return this.usuarioDestino;
   }

   public void setUsuarioDestino(java.lang.String usuarioDestino)
   {
      this.usuarioDestino = usuarioDestino;
   }

   public daf_rrt_reasignacion(java.lang.Long id,
         java.lang.String accionARealizar, java.util.Date fecha,
         java.lang.String usuarioDestino)
   {
      this.id = id;
      this.accionARealizar = accionARealizar;
      this.fecha = fecha;
      this.usuarioDestino = usuarioDestino;
   }

}