<#include "/include/header.ftl">

<p>Liste des biens : 

<#list ${biens} as bien>
	<li> Ville : ${bien.ville}, Pieces : ${bien.nbPieces}, surface : ${bien.surface}</li>
</#list>

</p>

<#include "/include/footer.ftl">
