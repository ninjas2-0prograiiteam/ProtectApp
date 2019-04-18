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
                minlength:9,
                maxlength:9
            },
            
            email: {
                required: true  
            },
            user: "required",
            contra : {
                required: true,
                minlength:5
            },
            contracon: {
                required: true,
                minlength:5,
                equalTo: "#contra"
            },
            departamento: "required"
        },
        messages: {
            nombre: "Por facor ingrese su nombre",
            apellido:"Por favor ingrese su apellido",
            edad: {
                required: "Ingrese su edad por favor",
                min: "Debe tener al menos 18 años para utilizar nuestra aplicación"
            },
            dui:{
                required: "Ingrese su número de DUI",
                minlength: "Ingrese un número de DUI válido",
                maxlength: "Ingrese un número de DUI válido"
            },
            email: "Ingrese su email por favor",
            user: "Ingrese su nombre de usuario",
            contra:{
                required: "Ingrese una contraseña",
                minlength: "Su contraseña debe tener al menos 5 caracteres"
            },
            contracon:{
                required: "Ingrese su contraseña",
                minlength:"Su contraseña debe tener al menos 5 caracteres",
                equalTo: "Las contraseñas no coinciden"
            },
            departamento: "Ingrese el departamento al que pertence"
        }
        });
        
          });
