$(document).ready(function(){
   $("#myform").validate({
    
        rules:{
            idusuario: "required",
            nodetarjeta:{
                required:true,
                minlength:16,
                maxlength:16
            },
            cvv:{
               required:true,
               minlength:3,
               maxlength:3
            },
            fechadevencimiento:{
               required:true,
               minlength:4,
               maxlength:4
            }
        }
   });
 });

