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
        }
        });
        
          });
