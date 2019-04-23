$(document).ready(function(){
   $("#myform").validate({
      rules:{
          nombre: "required",
          email:"required",
          telefono:"required",
          nit:{
              required: true,
              minlength:14
          },
          username: "required",
          password : {
                required: true,
                minlength:5
            },
        contracon: {
                required: true,
                minlength:5,
                equalTo: "#password"
            },
        nodecuenta:"required"    
      }, 
      messages:{
          nombre: "Por favor ingrese el nombre de su empresa",
          email: "Ingrese el email de su empresa por favor",
          telefono:"Ingrese el número de teléfono de su empresa",
          nit:{
              required:"Ingrese el NIT de su empresa",
              minlength:"Ingrese un NIT válido"
          },
          username:"Ingrese un nombre de usuario",
          password:{
                required: "Ingrese una contraseña",
                minlength: "Su contraseña debe tener al menos 5 caracteres"
            },
        contracon:{
                required: "Ingrese su contraseña",
                minlength:"Su contraseña debe tener al menos 5 caracteres",
                equalTo: "Las contraseñas no coinciden"
            },
        nodecuenta:"Ingrese su número de cuenta bancaria"    
      }
   });
});

