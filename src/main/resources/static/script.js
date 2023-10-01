function registrerRadius(){

    const radius = $("#radius").val();
    $("#radiusCircle").html(radius);
    console.log(radius);
    $.post("/leggTilRadius", radius, function (data){
        hent();
    })
    function hent(){
    $.get("/hentdiameter", function (data){
        $("#resultat").html(data);
    })
    }

}