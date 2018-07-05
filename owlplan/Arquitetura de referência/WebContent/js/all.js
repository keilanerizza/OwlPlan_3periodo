$(document).ready(function() {
	
	$(".dropdown-trigger").dropdown();
	
	$('.modal').modal();

	$(".dropdown-trigger").dropdown();

	$('select').formSelect();
	
	$('.tooltipped').tooltip();
	
	$('.tabs').tabs();

	$('.sidenav').sidenav({
		edge : 'right'
	});
	
	$('#apelidoTurma').blur(function() {
		var cont = 0;
		var disabled = true;
		var disabledCriar = true;
		
		$('.apelidoTurma').each(function () {
			if($(this).text() === $('#apelidoTurma').val()) {
				cont++;
			} 
		});
		
		if(cont == 0) {
			disabled = true;
			disabledCriar = false;
			$("#divNovoApelido").slideUp();
		} else {
			disabled = false;
			disabledCriar = true;
			$("#divNovoApelido").slideDown();
		}
		
		$('.btnDisable').prop("disabled", disabled);
		$('#btnDisable').prop("disabled", disabledCriar);
		return false;
	});
		
});

document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems, {});
});

