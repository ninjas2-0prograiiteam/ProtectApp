$(document).ready(function(){
    $("#myform").validate({
        rules:{
            nombre: "required",
            apellido: "required",
            edad: {
                required: true,
                min: 18
            },
            dui: {
                required: true,
                min:100000000,
                max:999999999
            },
            nit:{
                required: true,
                min:10000000000000,
                max:19999999999999   
            },
            
            email: {
                required: true  
            },
            user: "required",
            contra : "required",
            contracon: "required",
            departamento: "required"
        }
        });
        
          });
/*$(document).ready(function ValidateEmail(email) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/)
  {
    return (true);
  }
    alert("Has ingresado un email invalido");
    return (false);
});*/

$(document).ready(function allLetter(name)
  {
   var letters = /^[A-Za-z]+$/;
   if(name.value.match(letters))
     {
      return true;
     }
   else
     {
     alert("Por favor ingresa un nombre valido");
     return false;
     }
  });
  
$(document).ready(function allLetter(apellido)
  {
   var letters = /^[A-Za-z]+$/;
   if(apellido.value.match(letters))
     {
      return true;
     }
   else
     {
     alert("Por favor ingresa un apellido valido");
     return false;
     }
  });
  
$(document).ready(function ValidateSamePassword(contracon)
  {
      var contra = document.getElementById("contra");
   if(contracon.value.match(contra))
     {
      return true;
     }
   else
     {
     alert("Las contraseñas no coinciden");
     return false;
     }
  });
  
$(document).ready(function CheckPassword(contra) 
{ 
var passw=  /^[A-Za-z]\w{7,14}$/;
if(contra.value.match(passw)) 
{ 
return true;
}
else
{ 
alert("Ingrese una contraseña valida");
return false;
}
});

$(document).ready(function validarEmail(email) {
  if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3,4})+$/.test(email)){
return true;
  } else {
   alert("La dirección de email es incorrecta.");
  }
});
      

