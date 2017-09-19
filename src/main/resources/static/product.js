function allproducts (){
$.getJSON ('/api/product/all'), function(products){
var $tbody = $("#producttable").empty();

for (var product of products) {
    var $row = $('<tr>')
    .append($('<td>').text(product.id))
    .append($('<td>').text(product.EanNumber))
    .append($('<td>').text(product.brand))
    .append($('<td>').text(product.name));
    $tbody.append($row);
}
}
}


function allproducts () {
                $.getJSON('/api/product/all', function (passengers) {
                    let $row = $('<tr>')
                            .append($('<td>').text(product.id))
                            .append($('<td>').text(product.EanNumber))
                            .append($('<td>').text(product.name))
                            .append($('<td>').text(product.brand));
                        $tbody.append($row);
                    }
                });
            }