        $(document).ready(function(){

                $("#uses").one('focus', function(){
                        $(this).attr('value', '');
                });


                $("#strain").change(function () {
                        var str = "";
                        str += $(this).val();
                        $("#strainDetails").slideUp(300).load("strain.html", { 'strain' : str} ).slideDown('slow');
                });
                $("#strainDetails").load("strain.html", { 'strain' : $("#strain option:selected").val() } );

                $("#uses").keyup(function () {
                        var str = "";
                        str += $(this).val();
                        $("#usesDetails").load("uses.html", { 'uses' : str} );
                        $("#usesDetails ul li:odd").css("background-color", "#ddd");
                        $("#usesDetails ul li:even").css("background-color", "#eee");
                });
                $("#usesDetails").load("uses.html", { 'uses' : $("#uses").val() } );

                $(".box300 ul li:odd").css("background-color", "#ddd");
                $(".box300 ul li:even").css("background-color", "#eee");

});
