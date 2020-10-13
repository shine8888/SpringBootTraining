$('document').ready(function() {
	$('table #editButton').on('click', function(event) {
		event.preventDefault();
		var href = $(this).attr('href');

		$.get(href, function(country, status) {
			$('#idEdit').val(country.id);
			$('#capitalEdit').val(country.capital);
			$('#codeEdit').val(country.code);
			$('#continentEdit').val(country.continent);
			$('#descriptionEdit').val(country.description);
			$('#nationalityEdit').val(country.nationality);
		});
		$('#editModal').modal();
	});

	$('table #deleteButton').on('click', function(event) {
		event.preventDefault();
		$('#deleteModal').modal();
	});
});