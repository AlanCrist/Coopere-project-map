<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp"%>

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
						"usuario.matricula": {
							required: true, minlength: 8
						}
						}
					}
				});
			});
		</script>
</head>
<body>

	<form id="form" action="altera" method="post" class="form-horizontal">

		<input type="hidden" name="usuario.id" value="${usuario.id }">

		<legend>Cadastro de Usuários</legend>
		<div class="control-group required">
			<label class="control-label">Nome: </label>
			<div class="controls">
				<input type="text" class="span4" name="usuario.nome"
					value="${usuario.nome }">
			</div>
		</div>
		<div class="control-group required">
			<label class="control-label">Matricula: </label>
			<div class="controls">
				<input type="text" class="span2" name="usuario.matricula"
					readonly="readonly" value="${usuario.matricula }">
			</div>
			<div class="control-group required">
				<label class="control-label">Confirma</label>
				<div class="controls">
					<input type="password" class="span2" name="confirmacaoDeSenha">
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