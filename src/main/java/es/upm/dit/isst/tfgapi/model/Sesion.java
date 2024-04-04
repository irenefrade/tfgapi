package es.upm.dit.isst.tfgapi.model;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Sesion {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Future private Date fecha;
    private String lugar;
    @Size(min = 3, max = 3)
    private List<@Email @NotEmpty String> tribunal;
    @JsonIgnore @OneToMany(mappedBy = "sesion")
    List<@Valid TFG> tfgs;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public List<String> getTribunal() {
        return tribunal;
    }
    public void setTribunal(List<String> tribunal) {
        this.tribunal = tribunal;
    }
    public List<TFG> getTfgs() {
        return tfgs;
    }
    public void setTfgs(List<TFG> tfgs) {
        this.tfgs = tfgs;
    }
    // En lugar de tfgs.hashCode():
    tfgs.stream().map(TFG::getAlumno).collect(Collectors.toList()).hashCode()
    // En lugar de !tfgs.equals(other.tfgs)
    !tfgs.stream().map(TFG::getAlumno).collect(Collectors.toList())
    .equals(other.tfgs.stream().map(TFG::getAlumno).collect(Collectors.toList()))
    // En lugar de tfgs.toString():
    (tfgs != null ? tfgs.stream().map(TFG::getAlumno).collect(Collectors.toList())
    : "")
 
    


}
