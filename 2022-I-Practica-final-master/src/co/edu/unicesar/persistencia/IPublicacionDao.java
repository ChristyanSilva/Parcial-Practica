package co.edu.unicesar.persistencia;

import Excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.Publicacion;
import java.util.List;

public interface IPublicacionDao {
    void insertarPublicacion(Publicacion p) throws ExcepcionArchivo;
    List<Publicacion> leerPublicacion()throws ExcepcionArchivo;
    Publicacion buscarPublicacion(Publicacion p)throws ExcepcionArchivo;
    Publicacion eliminarPublicacion(Publicacion p)throws ExcepcionArchivo;

    public List<Publicacion> leerPublicaciones();
    
}
