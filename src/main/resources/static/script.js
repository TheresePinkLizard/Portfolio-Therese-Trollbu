function registrerRadius(){
    const radius = $("#radius").val();
    $("#radiusCircle").html(radius);

    $.post("/leggTilRadius", radius, function (data){
        $("#resultat").html(data);
    })
}