<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript">
			$(function() {
				$("#form").validate({
					rules: {
						"usuario.nome": {
							required: true, minlength: 3
						},
						"usuario.login": {
							required: true, minlength: 4
						},
						"usuario.matricula": {
							required: true, matricula: true
						}
					}
				});
			});
		</script>
	</head>
	<body>

		<form id="form"
			action="adiciona" 
			method="post" class="form-horizontal">
			<legend>Cadastro de Usuários</legend>
			<div class="control-group required">
				<label class="control-label">Nome</label>
				<div class="controls">
					<input type="text" class="span4"
						name="usuario.nome" value="${usuario.nome }">
				</div>
			</div>
			<div class="control-group required">
				<label class="control-label">Login</label>
				<div class="controls">
					<input type="text" class="span2"
						name="usuario.login" value="${usuario.login }">
				</div>
			</div>
			<div class="control-group required">
				<label class="control-label">matricula</label>
				<div class="controls">
					<div class="input-prepend">
						<span class="add-on"><i class="icon-envelope"></i></span>
						<input type="text" class="span3"
							name="usuario.matricula" value="${usuario.matricula }">
					</div>
				</div>
			</div>
			<div class="control-group required">
				<label class="control-label">Confirma</label>
				<div class="controls">
					<input type="password" class="span2" name="confirmacaoDeSenha" >
				</div>
			</div>
			<div class="form-actions">
				<div class="pull-right">
					<a href="lista" class="btn">Cancelar</a>
					<button type="submit" class="btn btn-primary">Salvar</button>
				</div>
			</div>
		</form>
		
	</body>
</html>