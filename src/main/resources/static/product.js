var datainject = new Spry.Data.JSONDataSet ("/api/product/all"), {path: "product", subPaths: "categorie", ["allergens"]});

<div class="liveSample" spry:region="datainject">
	<table class="dataTable">
		<tr>
			<th spry:sort="EAN-number">id</th>
			<th spry:sort="Naam">type</th>
			<th spry:sort="Merk">name</th>
			<th spry:sort="batters.batter.type">batter</th>
			<th spry:sort="topping.type">topping</th>
		</tr>
		<tr spry:repeat="datainject">
			<td>{eanNumber}</td>
			<td>{name}</td>
			<td>{brand}</td>
			<td>{categorie.categorie}</td>
			<td>{allergens.name}</td>
		</tr>
	</table>
</div>
