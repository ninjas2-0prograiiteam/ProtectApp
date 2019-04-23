$(document).ready(function(){
   $("#myform").validate({
      rules:{
          empresa: {
              required:true,
              min:1
          },
          categoria: {
              required: true,
              min:1
          },
          departamento:{
              required:true,
              min:1
          },
          horadesalida: "required",
          fecha:"required",
          horaderetorno:"required",
          puntodeencuentro:"required",
          precio:"required",
          cupo:"required"
      },
      messages:{
          empresa:{
              required:"Ingrese el nombre de su empresa",
              min:"Ingrese el nombre de su empresa"
          },
          categoria: {
              required: "Ingrese la categoría del viaje",
              min:"Ingrese la categoría del viaje"
          },
          departamento:{
              required: "Ingrese el departamento de donde saldrá el viaje",
              min:"Ingrese el departamento de donde saldrá el viaje"
          },
          horadesalida: "Ingrese la hora de salida",
          fecha:"Ingrese la fecha del viaje",
          horaderetorno:"Ingrese la hora de retorno",
          puntodeencuentro:"Ingrese el punto de encuentro",
          precio:"Ingrese el precio del viaje",
          cupo: "Ingrese el cupo total del viaje"
      }
   }); 
});

