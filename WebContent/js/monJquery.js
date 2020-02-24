$(document).ready(function(){
	$('.moto').hide();
	$('.voiture').show();
	$('.form').on('change', function() {
		   $s = $('input[name=vehicule]:checked', '.form').val();
		   if($s == 'moto'){
			   $('.voiture').hide();
			   $('.moto').show();
		   }else if($s == 'voiture'){
			   $('.moto').hide();
			   $('.voiture').show();
		   }
	});
	
});