<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<form class="form" method="post" action="/TestJEE/jsp/index/add">
	<div class="container-fluid">
		<div class="row">
			<label class="col-lg-6">
				<input class="radio" type="radio" name="vehicule" value="voiture" checked>
				Voiture
			</label>
			
			<label class="col-lg-6">
				<input class="radio" type="radio" name="vehicule" value="moto">
				Moto
			</label>
			
		</div>
		
		<label class="row">Immatriculation : </label>
		<input class="row col-lg-12" name="immatriculation">
		
		<label class="row">Marque : </label> 
		<input class="row col-lg-12" name="marque">
		
		<label class="row">Roues : </label> 
		<input class="row col-lg-12" name="roues">
		
		<label class="row">Model : </label> 
		<input class="row col-lg-12" name="model">
		
		<!-- <label>Caracteristiques Moto:</label>  -->
		<label class="row moto">Puissance : </label> 
		<input class="row col-lg-12 moto" name="puissance">
		
		<!-- <label>Caracteristiques Voiture:</label>  -->
		<label class="row voiture">Année : </label> 
		<input class="row col-lg-12 voiture" name="annee">
		
		<label class="row voiture">Couleur : </label> 
		<input class="row col-lg-12 voiture" name="couleur">
		
		<input class="row col-lg-12" value="Envoyer" type="submit">
			
	</div>
	
	
</form>