package com.porfolio.asm.Controller;

import com.porfolio.asm.Entity.Persona;
import com.porfolio.asm.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/per/")
@RestController
/**@CrossOrigin(origins = "https://pintegradorarc.web.app/edu/")**/
@CrossOrigin(origins = "http://localhost:8080")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

  
    @PostMapping("/create")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "El usuario fue creado correctamente";
    }

 
    @DeleteMapping("/delete/{id}")
    public String deletePersona(@PathVariable Integer id) {
        ipersonaService.deletePersona(id);
        return "El usuario fue eliminado correctamente";
    }

    
    @PutMapping("/update/{id}")
    public Persona editPersona(@PathVariable Integer id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("descripcion") String nuevoDescripcion,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("img") String nuevoImg) {
        Persona persona = ipersonaService.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setDescripcion(nuevoDescripcion);
        persona.setTitulo(nuevoTitulo);

        ipersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((Integer) 1);
    }

}
