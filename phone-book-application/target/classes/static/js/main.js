$(document).ready(function(){
	$('#phoneBookTable .editBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		console.log(href);
		$.get(href, function(data,status){
			$('.editPhoneBook #id').val(data.id);
			$('.editPhoneBook #name').val(data.name);
			$('.editPhoneBook #description').val(data.description);
			$('.editPhoneBook #created').val(data.created);
		});
		$('.editPhoneBook #addPhoneBook').modal();
		
	});
	
	$('#phoneBookTable .addBtn').on('click', function(event){
		
		$('.addPhoneBook #addPhoneBook').modal();
		
	});

	$('.entryTable .editEntryBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');

		$.get(href, function(data,status){
			$('.editEntry #id').val(data.id);
			$('.editEntry #name').val(data.name);
			$('.editEntry #phoneNumber').val(data.phoneNumber);
			$('.editEntry #created').val(data.created);
			$('.editEntry #phoneBookId').val(data.phoneBookId);
		});
		$('.editEntry #addEntry').modal();

	});

	$('.entryTable .addEntryBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function (data,status) {
			$('.myEntry #phoneBookId').val(data.id);
		});
		$('.addEntry #addEntry').modal();
	});
	
	
});