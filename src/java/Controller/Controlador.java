/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entidad.Estudiante;
import Entidad.Curso;
import Entidad.Asignacion;
import Entidad.Nota;
import Entidad.Acta;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alejandro Montalvo
 */
@Controller
public class Controlador {
    Conexion con=new Conexion();
    JdbcTemplate jdbcTemplate=new  JdbcTemplate(con.Conectar());
    ModelAndView mav=new ModelAndView();
    int id;
    List datos;
    
       @RequestMapping ("index.htm")
    public ModelAndView Index(){
    mav.setViewName("index");
    return mav;  
    }  
     
    
    @RequestMapping ("estudiantes.htm")
    public ModelAndView Listar(){
        String sql = "select * from estudiante";
       datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("estudiantes");
        return mav;
         
   }
     @RequestMapping ("cursos.htm")
    public ModelAndView Listar_cursos(){
        String sql = "select * from curso";
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("cursos");
        return mav;
         
    }
     @RequestMapping ("asignaciones.htm")
    public ModelAndView Listar_asignaciones(){
        String sql = "select * from asignacion";
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("asignaciones");
        return mav;
         
     }
     @RequestMapping ("notas.htm")
    public ModelAndView Listar_notas(){
        String sql = "select * from nota";
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("notas");
        return mav;
         
     }
     @RequestMapping ("actas.htm")
    public ModelAndView Listar_actas(){
        String sql = "select * from acta";
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("actas");
        return mav;
         
     }
    //Agregar Estudiantes         
    @RequestMapping (value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Estudiante());
        mav.setViewName("agregar");
        return mav;
        
        
    }
    @RequestMapping (value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Estudiante e){
        String sql="insert into estudiante(Nombre, Apellido, Carne, Carrera)values(?,?,?,?)";  
        this.jdbcTemplate.update(sql,e.getNombre(),e.getApellido(),e.getCarne(),e.getCarrera());
        return new ModelAndView("redirect:/estudiantes.htm");
    }
   //Agregar cursos 
    @RequestMapping (value = "agregar_curso.htm", method = RequestMethod.GET)
    public ModelAndView Agregar_cursos(){
        mav.addObject(new Curso());
        mav.setViewName("agregar_curso");
        return mav;
        
        
    }
    @RequestMapping (value = "agregar_curso.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Curso c){
        String sql="insert into curso(Codigo_curso, nombre)values(?,?)";  
        this.jdbcTemplate.update(sql,c.getCodigo_curso(),c.getNombre());
        return new ModelAndView("redirect:/cursos.htm");
        
    }   
     //Agregar Asignaciones 
    @RequestMapping (value = "agregar_asignaciones.htm", method = RequestMethod.GET)
    public ModelAndView Agregar_asignaciones(){
        mav.addObject(new Asignacion());
        mav.setViewName("agregar_asignaciones");
        return mav;
                
    }
    @RequestMapping (value = "agregar_asignaciones.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Asignacion a){
        String sql="insert into asignacion(Nombre_estudiante,Carne,Codigo_curso)values(?,?,?)";  
        this.jdbcTemplate.update(sql,a.getNombre_Estudiante(),a.getCarne(),a.getCodigo_curso());
        return new ModelAndView("redirect:/asignaciones.htm");
    }   
     //Agregar Notas  
        
     @RequestMapping (value = "agregar_notas.htm", method = RequestMethod.GET)
    public ModelAndView Agregar_notas(){
        mav.addObject(new Nota());
        mav.setViewName("agregar_notas");
        return mav;
        
        
    }
    @RequestMapping (value = "agregar_notas.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Nota n){
        String sql="insert into nota(Carne, Codigo_curso, Nota)values(?,?,?)";  
        this.jdbcTemplate.update(sql,n.getCarne(), n.getCodigo_curso(),n.getNota());
        return new ModelAndView("redirect:/notas.htm");
    }
     //Agregar Actas
    @RequestMapping (value = "agregar_acta.htm", method = RequestMethod.GET)
    public ModelAndView Agregar_actas(){
        mav.addObject(new Acta());
        mav.setViewName("agregar_acta");
        return mav;
        
        
    }
    @RequestMapping (value = "agregar_acta.htm", method = RequestMethod.POST)
    public ModelAndView Agregar_actas(Acta ac){
        String sql="insert into acta(Carne, Codigo_curso, Codigo_catedratico, Fecha, Nota)values(?,?,?,?,?)";  
        this.jdbcTemplate.update(sql,ac.getCarne(), ac.getCodigo_curso(),ac.getCodigo_catedratico(),ac.getFecha(),ac.getNota());
        return new ModelAndView("redirect:/actas.htm");
    
    }    
    // Editar Estudiantes 
    
    @RequestMapping (value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        String sql = "select * from estudiante where Id="+id;
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista" ,datos);
        mav.setViewName("editar");
        return mav;
                       
    
    }
    @RequestMapping (value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Estudiante e){
        String sql="update estudiante set Nombre=?, Apellido=?, Carne=?, Carrera=? where Id=?";  
        this.jdbcTemplate.update(sql,e.getNombre(),e.getApellido(),e.getCarne(),e.getCarrera(),id);
        return new ModelAndView("redirect:/estudiantes.htm");
          
    }
    @RequestMapping ("eliminar.htm")
    public ModelAndView eliminar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        String sql="delete  from estudiante where Id="+id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/estudiantes.htm");
        
            
               
    }
 
    
    
}
