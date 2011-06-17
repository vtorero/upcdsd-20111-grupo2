<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="pe.edu.upc.dsd.ws.bean.Producto"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Sistema de Ventas RTM</title>
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
.Estilo40 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; }
.Estilo44 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; }
.Estilo46 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; font-weight: bold; }
.Estilo75 {color: #FFFFFF; font-weight: bold; font-size: 11px; }
.Estilo76 {font-size: 11px}
-->
</style>

<script type="text/javascript">

	function buscar()
	{
		document.formularioProducto.accion.value = 'buscar';
		document.formularioProducto.submit();
	}
	
	function siguiente()
	{
		var seleccion = "";
		
		for(var i=0; i < document.formularioProducto.chkProducto.length; i++)
		{
			if(document.formularioProducto.chkProducto[i].checked)
			{
				seleccion += document.formularioProducto.chkProducto[i].value + "\n";
			}
		}
				
		if(seleccion == "")
		{
			alert("Debe seleccionar al menos un producto para continuar.");
			return;
		}else
		{
			document.formularioProducto.accion.value = 'siguiente';
			document.formularioProducto.submit();		
		}
	}

	function atras()
	{
		document.formularioProducto.accion.value = 'atras';
		document.formularioProducto.submit();
	}
	
	function displayInput(selectedValue)
	{
		if(selectedValue == '1')
		{
			document.formularioProducto.codigoProducto.style.display = 'inline';
			document.formularioProducto.categoriaProducto.style.display = 'none';
		}
		else
		{
			document.formularioProducto.codigoProducto.style.display = 'none';
			document.formularioProducto.categoriaProducto.style.display = 'inline';
		}
	}

</script>

</head>
<body>
<form name="formularioProducto" method="get" action="<%=request.getContextPath()%>/buscarProducto.do">
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
          <td bgcolor="#FFFFCC"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td bgcolor="#FFFFCC"><a href="<%=request.getContextPath() %>/buscarCliente.do"><span class="Estilo18">Registro de Pedido </span></a></td>
        </tr>
        <tr>
          <td height="26"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="<%=request.getContextPath() %>/buscarStock.do"><span class="Estilo18">Consulta de Existencias</span></a></td>
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
              <th width="3%" scope="row"><span class="Estilo27"></span></th>
              <td colspan="5"><span class="Estilo44">CONSULTA DE PRODUCTOS </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td width="25%"><span class="Estilo27"></span></td>
              <td width="28%"><span class="Estilo27"></span></td>
              <td width="19%"><span class="Estilo27"></span></td>
              <td width="25%">&nbsp;</td>
              <td width="25%"><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo40"><strong>Criterio </strong>: </span></td>
              <td><label>
                <select name="criterioBusqueda" id="criterioBusqueda" onchange="javascript:displayInput(this.value);">
                  <option value="1">Codigo</option>
                  <option value="2">Categoria</option>
                </select>
              </label></td>
              <td>
              	<span class="Estilo46">Ingrese Datos : </span>
              </td>
              <td>
              	<input style="display: inline;" id="codigoProducto" name="codigoProducto" type="text" >
              	<select style="display: none;" id="categoriaProducto" name="categoriaProducto">
              		<option value="01">Motos</option>
              		<option value="02">Repuestos</option>
              		<option value="03">Llantas</option>
              	</select>
              </td>
              <td><span class="Estilo27">
                <input name="btnAgregarProductos22" type="submit" id="btnBuscar" onclick="javascript:buscar();" value="Buscar">
              </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo40"><strong>Linea Disponible:</strong>: </span></td>
               <td><span class="Estilo53"><input name="txtDisponible" type="text" id="txtDisponible" disabled="disabled" value="${model.lineaDisponible}"></span></td>
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
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td colspan="5" rowspan="5">
              <table width="100%" border="1">
                  <tr>
                    <th width="6%" bgcolor="#CC0000" class="Estilo27" scope="row"><span class="Estilo75">N°</span></th>
                    <td width="34%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Descripcion</span></td>
                    <td width="23%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Precio </span></td>
                    <td width="12%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Cantidad</span></td>
                    <td width="12%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Tipo</span></td>
                    <td width="13%" bgcolor="#CC0000" align="center" class="Estilo27"><span class="Estilo75">Seleccionar</span></td>
                  </tr>
                  <c:forEach items="${model.productos}" var="producto">
	                  <tr>
	                    <th class="Estilo27" scope="row">${producto.codigo}</th>
	                    <td class="Estilo27">${producto.descripcion}</td>
	                    <td class="Estilo27">${producto.precio}</td>
	                    <td class="Estilo27">
	                    	<select id="cantidad${producto.codigo}" name="cantidad${producto.codigo}">
	                    		<option value="1">1</option>
	                    		<option value="2">2</option>
	                    		<option value="3">3</option>
	                    		<option value="4">4</option>
	                    		<option value="5">5</option>
	                    		<option value="6">6</option>
	                    		<option value="7">7</option>
	                    		<option value="8">8</option>
	                    		<option value="9">9</option>
	                    		<option value="10">10</option>
	                    	</select>
	                    <td class="Estilo27">${producto.tipo}</td>
	                    <td class="Estilo27" align="center"><input type="checkbox" name="chkProducto" value="${producto.codigo}"></td>
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
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td colspan="2" align="right">&nbsp;</td>
              </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span><a href="javascript:atras();"><img src="img/flechaAtras.jpg" width="43" height="37" border="0"></a></td>
              <td><span class="Estilo27"></span></td>
              <td align="center"><span class="Estilo27"></span><a href="index.jsp"><img src="img/cancelar.jpg" width="38" height="37" border="0"></a></td>
              <td align="right">&nbsp;</td>
              <td align="right"><a href="javascript:siguiente();"><img src="img/flechaSiguiente.jpg" width="40" height="37" border="0"></a></td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td><span class="Estilo76 Estilo27 Estilo54"><strong>Retroceder </strong></span></td>
              <td>&nbsp;</td>
              <td align="center"><span class="Estilo76 Estilo27 Estilo54"><strong>Cancelar</strong></span></td>
              <td>&nbsp;</td>
              <td align="right"><span class="Estilo76 Estilo27 Estilo54"><strong>Siguiente: </strong></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
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