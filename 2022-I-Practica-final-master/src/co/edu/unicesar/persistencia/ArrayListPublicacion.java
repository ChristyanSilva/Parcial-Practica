package co.edu.unicesar.persistencia;

import Excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.Publicacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPublicacion implements IPublicacionDao {
    private List<Publicacion> listaPublicacion;

    public ArrayListPublicacion() {
        this.listaPublicacion = new ArrayList();
    }
    
    
    @Override
    public void insertarPublicacion(Publicacion p) {
        this.listaPublicacion.add(p);
    }

    public List<Publicacion> leerPublicaciones() {
       List<Publicacion> lista = new ArrayList(this.listaPublicacion);
       return lista;
    }

    @Override
    public Publicacion buscarPublicacion(Publicacion p) {
        Publicacion buscar=null;
        for(Publicacion i: this.listaPublicacion){
            if(i.getIdbn().equalsIgnoreCase(p.getIdbn())){
                buscar = i;
                break;
            }
        }
        return buscar;
        
    }

    @Override
    public Publicacion eliminarPublicacion(Publicacion p) {
        Iterator<Publicacion> i = this.listaPublicacion.iterator();
        Publicacion eliminado=null;
        while(i.hasNext()){
            Publicacion aux = i.next();
            if(aux.getIdbn().equalsIgnoreCase(p.getIdbn())){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }

    @Override
    public List<Publicacion> leerPublicacion() throws ExcepcionArchivo {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
