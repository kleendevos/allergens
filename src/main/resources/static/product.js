function search() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("#dropdownmenu");
  filter = input.value.toUpperCase();
  table = document.getElementById("#producttable");
  tr = table.getElementsByTagName("tr");


  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}

var $rows = $('#producttable tr');
$('#searchByName').keyup(function() {
    var val = $.trim($(this).val()).replace(/ +/g, ' ').toLowerCase();

    $rows.show().filter(function() {
        var text = $(this).text().replace(/\s+/g, ' ').toLowerCase();
        return !~text.indexOf(val);
            }).hide();
        });

 var $rows = $('#producttablebody');
    $('#searchByName').keyup(function() {
    var val = $.trim($(this).val()).replace(/ +/g, ' ').toLowerCase().split(' ');

    $rows.hide().filter(function() {
        var text = $(this).text().replace(/\s+/g, ' ').toLowerCase();
        var matchesSearch = true;
        $(val).each(function(index,value){
        matchesSearch = (!matchesSearch) ? false : ~text.indexOf(val);
    });
    return matchesSearch;
    }).show();
    });