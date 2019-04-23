$(document).ready(function(){
   $("#myform").validate({
    
        rules:{
            IdUsuario: "required",
            NodeTarjeta:{
                required:true,
                minlength:16,
                maxlength:16
            },
            Cvv:{
               required:true,
               minlength:3,
               maxlength:3
            },
            FechadeVencimiento:{
               required:true,
               minlength:4,
               maxlength:4
            }
        }
   });
 });