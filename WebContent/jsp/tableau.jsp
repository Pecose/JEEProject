<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<table class="table table-striped">
	<thead class="thead-dark">
		<tr>
			<th>Immatriculation</th>
			<th>Marque</th>
			<th>Roues</th>
			<th>Model</th>
			<th>Puissance</th>
			<th>Couleur</th>
			<th>Année</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach var="v" items="${ list }">
			<tr>
				<td><c:out value="${v.getImmat()}"></c:out></td>
				<td><c:out value="${v.getMarque()}"></c:out></td>
				<td><c:out value="${v.getNbRoues()}"></c:out></td>
				<td><c:out value="${v.getModel()}"></c:out></td>
				<td><c:out value="${v.getPuissance()}"></c:out></td>
				<td><c:out value="${v.getCouleur()}"></c:out></td>
				<td><c:out value="${v.getAnnee()}"></c:out></td>
			</tr>
		</c:forEach>
		
		<form method="post" action="/TestJEE/jsp/index/remove">
			<tr>
				<td></td>
				<td>Supprimer véhicule immatriculé: </td>
				<td><input name="supImmat"></td>
				<td><input type="submit"></td>
			</tr>
		</form>
		
		
			
	</tbody>
</table>