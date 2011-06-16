<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="pe.edu.upc.dsd.ws.bean.Cliente"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Untitled</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="img/stylesheet.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	background-color: #000000;
}
.Estilo2 {
	font-size: 18px;
	color: #FFFFFF;
}
.Estilo3 {
	font-size: 16px;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	color: #B8B8B8;
}
.Estilo4 {
	font-size: 36px;
	color: #FFFFFF;
	font-weight: bold;
	font-family: Arial, Helvetica, sans-serif;
}
.Estilo7 {color: #B8B8B8}
.Estilo13 {color: #000000; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 18px; }
.Estilo17 {color: #000000}
.Estilo18 {color: #000000; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 12px; }
.Estilo27 {font-family: Arial, Helvetica, sans-serif}
.Estilo44 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; }
.Estilo54 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; font-weight: bold; }
.Estilo56 {font-weight: bold; font-size: 11px; color: #FFFFFF; }
.Estilo58 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; }
--> 
</style> 

<script type="text/javascript">

	function buscar()
	{
		document.formularioCliente.accion.value = 'buscar';
		document.formularioCliente.submit();
	}
	
	function siguiente(selectedValue)
	{
		document.formularioCliente.accion.value = 'siguiente';
		document.formularioCliente.submit();
	}

</script>


</head>
<body>
<form name="formularioCliente" method="get" action="<%=request.getContextPath()%>/buscarCliente.do">
<input type="hidden" name="accion" value=""/>
 
<table width="100%" bgcolor="#000000">
<tr>
<td height="587" valign="top">
<table cellpadding="0" cellspacing="0" border="0" class="main" align="center" width="70%">
	<tr>
	  <td height="78" colspan="3" align="center"><img src="img/logo.JPG" width="832" height="141"></td>
	</tr>
	<tr>
	  <td height="83" colspan="3" align="center"><p class="Estilo4 Estilo7">BIENVENIDOS A RTM</p>
	    <p class="Estilo2 Estilo3">EMPRESA LIDER EN VENTA DE REPUESTOS </p></td>
	  </tr>
	<tr>
	  <td height="4" colspan="2" valign="middle"><img src="../free_osCommerce_template/sources/html/images/spacer.gif" width="1" height="1"></td>
	  </tr>
	<tr>
	  <td width="20%" height="144" valign="top" bgcolor="#FFFFCC" class="footer"><table width="100%" border="0">
        <tr>
          <td bgcolor="#FFFFCC">&nbsp;</td>
          <td bgcolor="#FFFFCC"><span class="Estilo13">VENDEDOR</span></td>
        </tr>
        <tr>
          <td bgcolor="#FFFFCC">&nbsp;</td>
          <td bgcolor="#FFFFCC"><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td height="23"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="ConsultarCliente.jsp"><span class="Estilo18">Registro de Pedidos</span></a></td>
        </tr>
        <tr>
          <td height="26"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="ConsultaExistencias.html"><span class="Estilo18">Consulta de Existencias</span></a></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
      </table></td>
	  <td width="80%" valign="top" bgcolor="#FFFFCC" class="footer"><table width="100%" border="0" bgcolor="#FFFFCC">
        <tr>
          <td width="2%"><table width="100%" border="0">
            <tr>
              <th width="2%" scope="row"><span class="Estilo27"></span></th>
              <td colspan="5"><span class="Estilo44">CONSULTA CLIENTE </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td width="16%"><span class="Estilo27"></span></td>
              <td width="26%"><span class="Estilo27"></span></td>
              <td width="14%"><span class="Estilo27"></span></td>
              <td width="22%">&nbsp;</td>
              <td width="20%"><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo54">Criterio : </span></td>
              <td><label>
                <select name="select">
                  <option>- Seleccione -</option>
                  <option>Codigo</option>
                </select>
              </label></td>
              <td><span class="Estilo54">Ingrese Datos: </span></td>
              <td><input id="codigoCliente" name="codigoCliente" type="text" ></td>
              <td><span class="Estilo27">
                <input name="btnBuscar" type="submit" id="btnBuscar" onclick="javascript:buscar();" value="Buscar">
              </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td colspan="5" rowspan="5"><table width="100%" border="1">
                  <tr>
                    <th width="4%" bgcolor="#CC0000" class="Estilo27" scope="row"><span class="Estilo56">N°</span></th>
                    <td width="18%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Nombre / Rz Social </span></td>
                    <td width="30%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Apellidos </span></td>
                    <td width="14%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">D.O.I</span></td>
                    <td width="13%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Telefono </span></td>
                    <td width="10%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Tipo</span></td>
                    <td width="11%" bgcolor="#CC0000" align="center" class="Estilo27"><span class="Estilo56">Seleccionar</span></td>
                  </tr>
                  <c:forEach items="${model.clientes}" var="cliente">
	                  <tr>
	                    <th class="Estilo27" scope="row">${cliente.codigo}</th>
	                    <td class="Estilo27">${cliente.nombre}</td>
	                    <td class="Estilo27">${cliente.apellidoPaterno} ${cliente.apellidoMaterno}</td>
	                    <td class="Estilo27">${cliente.documentoIdentidad}</td>
	                    <td class="Estilo27">${cliente.telefono}</td>
	                    <td class="Estilo27">${cliente.tipoPersona}</td>
	                    <td class="Estilo27" align="center"><input name="chkCliente" type="radio" value="${cliente.codigo}"></td>
	                  </tr>                  	
                  </c:forEach>
              </table></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td align="left"><a href="index.jsp"><img src="img/flechaAtras.jpg" width="48" height="39" border="0"></a></td>
              <td><span class="Estilo27"></span></td>
              <td align="center"><span class="Estilo27"></span><a href="index.jsp"><img src="img/cancelar.jpg" width="34" height="34" border="0"></a></td>
              <td align="right">&nbsp;</td>
              <td align="right"><a href="ConsultaDocumentosPago.html"><img src="img/flechaSiguiente.jpg" width="44" height="39" border="0"></a></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo54">Retroceder </span></td>
              <td><span class="Estilo27"></span></td>
              <td align="center"><span class="Estilo54">Cancelar</span></td>
              <td>&nbsp;</td>
              <td align="right"><span class="Estilo54">Siguiente: </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td><span class="Estilo27"></span></td>
            </tr>
          </table></td>
        </tr>
      </table></td>
	</tr>
</table>
</td>
</tr>
</table>
</form>
</body>
</html>