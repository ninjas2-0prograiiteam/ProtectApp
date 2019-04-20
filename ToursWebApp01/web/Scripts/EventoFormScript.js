$(document).ready(function(){
   $("#myform").validate({
      rules:{
          empresa: "required",
          categoria: "required",
          departamento:"required",
          horadesalida: "required",
          fecha:"required",
          horaderetorno:"required",
          puntodeencuentro:"required",
          precio:"required"
      } 
   }); 
});

