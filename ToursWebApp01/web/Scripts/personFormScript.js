
$(document).ready(function(){
    $("#myform").validate({
        rules:{
            name: "required",
            age: {
                required:true,
                min:18
            },
            salary:{
                required:true,
                min:100,
                max:2000
            }
        }
    });
});

