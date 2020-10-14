$('document').ready(function(){
	$('table #editButton').on('click', function(event) {
		event.preventDefault();
		var href = $(this).attr('href');

		$.get(href, function(state, status) {
			$('#idEdit').val(state.id);
			$('#capitalEdit').val(state.name);
			$('#codeEdit').val(state.capital);
			$('#continentEdit').val(state.code);
			$('#descriptionEdit').val(state.countryid);
			$('#nationalityEdit').val(state.details);
		});
		$('#editModal').modal();
	});

	$('table #deleteButton').on('click', function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#confirmDeleteButton').attr('href', href);
		$('#deleteModal').modal();
	});
	
})